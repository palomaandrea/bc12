package aut.testcreation.testcases.rumboesbracamontequezadapino;

import aut.testcreation.pages.rumboesbracamontequezadapino.HomePage;
import aut.testcreation.pages.rumboesbracamontequezadapino.TrenesPages.BusquedaTrenNormal;
import aut.testcreation.pages.rumboesbracamontequezadapino.TrenesPages.BusquedaTrenOferta;
import aut.testcreation.pages.rumboesbracamontequezadapino.TrenesPages.ResultadoBusquedaTrenOferta;
import aut.testcreation.pages.rumboesbracamontequezadapino.TrenesPages.TrenesPage;
import framework.engine.selenium.DriverFactory;
import framework.engine.selenium.SeleniumTestBase;
import framework.engine.selenium.SeleniumWrapper;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import static framework.engine.utils.Constants.BASE_URL_AUT;

public class TestBusquedaTren extends SeleniumTestBase {

    WebDriver driver;

    TrenesPage trenesPage;

    HomePage homePage;

    ResultadoBusquedaTrenOferta resultadoBusquedaTrenOferta;
    BusquedaTrenOferta busquedaTrenOferta;

    BusquedaTrenNormal busquedaTrenNormal;

    @Test
    public void CP013_ViajeTren_Oferta_SinDisponibilidad() throws InterruptedException{
        driver = DriverFactory.getDriver();
        homePage= new HomePage(DriverFactory.getDriver());
        trenesPage=new TrenesPage(DriverFactory.getDriver());
        busquedaTrenOferta=new BusquedaTrenOferta(DriverFactory.getDriver());
        driver.navigate().to("https://www.rumbo.es/");
        Thread.sleep(3000);
        homePage.cerrarCookis();
        homePage.irATrenes();
        trenesPage.bajarAOfertas();
        trenesPage.ofertaMadridSevilla();
        if(busquedaTrenOferta.noHayOferta()){
            Thread.sleep(3000);
            trenesPage.moverseAOtraPestana(1);
            Assertions.assertEquals(trenesPage.obtenerMensajeSinDispo(), "No hemos encontrado ninguna oferta que se ajuste a los criterios de búsqueda, probablemente por falta de disponibilidad en fechas o destino. Por favor, vuelve a intentarlo seleccionando una fecha diferente.");
        }if(busquedaTrenOferta.noHayFecha()){
            Thread.sleep(3000);
            trenesPage.moverseAOtraPestana(1);
            Assertions.assertEquals(busquedaTrenOferta.sinFechas(), "Realizar una nueva búsqueda");
        }
        Thread.sleep(3000);
        trenesPage.moverseAOtraPestana(1);
        System.out.println("Ya hay ofertas disponibles o cambió algo en la página");

    }

    @Test
    public void CP014_ViajeTren_IdaYVuelta_SinDisponibilidad() throws InterruptedException{
        driver = DriverFactory.getDriver();
        homePage= new HomePage(DriverFactory.getDriver());
        trenesPage=new TrenesPage(DriverFactory.getDriver());
        driver.navigate().to("https://www.rumbo.es/");
        Thread.sleep(5000);
        homePage.cerrarCookis();
        homePage.irATrenes();
        trenesPage.idaYVuelta();
        trenesPage.escribirOrigen("Agde");
        trenesPage.escribirDestino("Girona");
        trenesPage.fechasIdaYVuelta15al22();
        trenesPage.sendKeys(Keys.ENTER);
        trenesPage.clickEnBuscar();
        Thread.sleep(5000);
        Assertions.assertEquals(trenesPage.sinDisponibilidad(), "No hemos encontrado ningún resultado con tus criterios de búsqueda.");

    }
    @Test
    public void CP015_ViajeTren_Oferta_MasEconomico_SeleccionEstacionSalida() throws InterruptedException{
        driver = DriverFactory.getDriver();
        homePage= new HomePage(DriverFactory.getDriver());
        trenesPage=new TrenesPage(DriverFactory.getDriver());
        busquedaTrenOferta=new BusquedaTrenOferta(DriverFactory.getDriver());
        resultadoBusquedaTrenOferta=new ResultadoBusquedaTrenOferta(DriverFactory.getDriver());
        driver.navigate().to("https://www.rumbo.es/");
        homePage.esperarAQueLaPaginaCargue();
        homePage.cerrarCookis();
        homePage.irATrenes();
        trenesPage.bajarAOfertas();
        Thread.sleep(1000);
        trenesPage.ofertaMadridBarcelona();
        trenesPage.esperarAQueLaPaginaCargue();
        trenesPage.moverseAOtraPestana(1);
        busquedaTrenOferta.esperarAQueLaPaginaCargue();
        if(busquedaTrenOferta.noHayOferta() || busquedaTrenOferta.noHayFecha()){
            System.out.println("No hay ofertas disponibles en este momento en sl sitio web");
        }else{
          System.out.println("Implementar metodo");
          busquedaTrenOferta.masBarato();
          Thread.sleep(3000);
          busquedaTrenOferta.estacionAtocha();
          Thread.sleep(5000);
          busquedaTrenOferta.seleccionaTicketMasBarato();
        };
        Thread.sleep(5000);
    }

    @Test
    public void CP016_ViajeTren_IdaYVuelta_SinDisponibilidad_MasNuevaBusqueda() throws InterruptedException{
        driver = DriverFactory.getDriver();
        homePage= new HomePage(DriverFactory.getDriver());
        trenesPage=new TrenesPage(DriverFactory.getDriver());
        busquedaTrenNormal=new BusquedaTrenNormal(DriverFactory.getDriver());
        driver.navigate().to("https://www.rumbo.es/");
        homePage.esperarAQueLaPaginaCargue();
        homePage.cerrarCookis();
        homePage.irATrenes();
        trenesPage.idaYVuelta();
        trenesPage.escribirOrigen("Almeria");
        trenesPage.escribirDestino("Madrid");
        trenesPage.fechasIdaYVuelta08al13();
        trenesPage.clickEnBuscar();
        Thread.sleep(2000);
        busquedaTrenNormal.buscarDeNuevo();
        Thread.sleep(2000);
        trenesPage.idaYVuelta();
        trenesPage.fechasIdaYVuelta15al25();
        trenesPage.sendKeys(Keys.ENTER);
        trenesPage.clickEnBuscar();
        //busquedaTrenNormal.esperarAQueLaPaginaCargue();
        //busquedaTrenNormal.masBarato();
        //Thread.sleep(10000);
        //busquedaTrenNormal.estacionAlmeria();
        //Thread.sleep(10000);
        //busquedaTrenNormal.seleccionaTicketMasBarato();
        Thread.sleep(10000);
    }

    @Test
    public void CP018_ViajeTren_Oferta_MasEconomico_ConDesayuno_IdaYVuelta() throws InterruptedException{
        driver = DriverFactory.getDriver();
        homePage= new HomePage(DriverFactory.getDriver());
        trenesPage=new TrenesPage(DriverFactory.getDriver());
        busquedaTrenOferta=new BusquedaTrenOferta(DriverFactory.getDriver());
        resultadoBusquedaTrenOferta=new ResultadoBusquedaTrenOferta(DriverFactory.getDriver());
        driver.navigate().to("https://www.rumbo.es/");
        homePage.esperarAQueLaPaginaCargue();
        homePage.cerrarCookis();
        homePage.irATrenes();
        trenesPage.bajarAOfertas();
        Thread.sleep(1000);
        trenesPage.ofertaTrenHotelMadridBarcelona();
        trenesPage.esperarAQueLaPaginaCargue();
        trenesPage.moverseAOtraPestana(1);
        busquedaTrenOferta.esperarAQueLaPaginaCargue();
        if(busquedaTrenOferta.noHayOferta()){
            System.out.println("No hay ofertas en este momento");

        }else {
            busquedaTrenOferta.bajarAOfertas();
            Thread.sleep(1000);
            busquedaTrenOferta.seleccionarHotel();
            Thread.sleep(5000);
            busquedaTrenOferta.moverseALaTerceraPestana();
            resultadoBusquedaTrenOferta.esperarAQueLaPaginaCargue();
            Thread.sleep(5000);
            resultadoBusquedaTrenOferta.seleccionaHotel();
            resultadoBusquedaTrenOferta.moverseALaCuartaPestana();
            Thread.sleep(5000);
        }

    }
    @Test
    public void TestBusquedaTren() throws InterruptedException{
        driver = DriverFactory.getDriver();
        homePage= new HomePage(DriverFactory.getDriver());
        trenesPage=new TrenesPage(DriverFactory.getDriver());
        driver.navigate().to("https://www.rumbo.es/");
        Thread.sleep(5000);
        homePage.cerrarCookis();
        homePage.irATrenes();
        trenesPage.soloIda();
        trenesPage.escribirOrigen("Madrid");
        trenesPage.escribirDestino("Barcelona");
        trenesPage.fechaIda();
        trenesPage.sendKeys(Keys.ENTER);
        trenesPage.clickEnBuscar();
        Thread.sleep(5000);
    }

}
