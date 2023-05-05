package aut.testcreation.testcases.rumboesbracamontequezadapino;

import aut.testcreation.pages.rumboesbracamontequezadapino.HomePage;
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

    @Test
    public void CP013_ViajeTren_Oferta_SinDisponibilidad() throws InterruptedException{
        driver = DriverFactory.getDriver();
        homePage= new HomePage(DriverFactory.getDriver());
        trenesPage=new TrenesPage(DriverFactory.getDriver());
        driver.navigate().to("https://www.rumbo.es/");
        Thread.sleep(3000);
        homePage.cerrarCookis();
        homePage.irATrenes();
        trenesPage.bajarAOfertas();
        trenesPage.ofertaMadridSevilla();
        Thread.sleep(3000);
        trenesPage.moverseALaSegundaPestaña();
        Assertions.assertEquals(trenesPage.obtenerMensajeSinDispo(), "No hemos encontrado ninguna oferta que se ajuste a los criterios de búsqueda, probablemente por falta de disponibilidad en fechas o destino. Por favor, vuelve a intentarlo seleccionando una fecha diferente.");
        Thread.sleep(3000);
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
        trenesPage.fechasIdaYVuelta();
        trenesPage.sendKeys(Keys.ENTER);
        trenesPage.clickEnBuscar();
        Thread.sleep(5000);
        Assertions.assertEquals(trenesPage.sinDisponibilidad(), "No hemos encontrado ningún resultado con tus criterios de búsqueda.");

    }

    @Test
    public void CP015_ViajeTren_Oferta_MasEconomico_EstacionSalida() throws InterruptedException{
        driver = DriverFactory.getDriver();
        homePage= new HomePage(DriverFactory.getDriver());
        trenesPage=new TrenesPage(DriverFactory.getDriver());
        busquedaTrenOferta=new BusquedaTrenOferta(DriverFactory.getDriver());
        resultadoBusquedaTrenOferta=new ResultadoBusquedaTrenOferta(DriverFactory.getDriver());
        driver.navigate().to("https://www.rumbo.es/");
        Thread.sleep(3000);
        homePage.cerrarCookis();
        homePage.irATrenes();
        trenesPage.bajarAOfertas();
        trenesPage.ofertaABarcelona();
        Thread.sleep(3000);
        trenesPage.moverseALaSegundaPestaña();
        busquedaTrenOferta.seleccionarHotel();
        //Assertions.assertEquals(trenesPage.obtenerMensajeSinDispo(), "No hemos encontrado ninguna oferta que se ajuste a los criterios de búsqueda, probablemente por falta de disponibilidad en fechas o destino. Por favor, vuelve a intentarlo seleccionando una fecha diferente.");
        Thread.sleep(3000);
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
