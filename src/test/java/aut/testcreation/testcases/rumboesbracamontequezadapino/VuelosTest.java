package aut.testcreation.testcases.rumboesbracamontequezadapino;
import aut.testcreation.pages.rumboesbracamontequezadapino.CheckoutPage;
import aut.testcreation.pages.rumboesbracamontequezadapino.FlashSalesPage;
import aut.testcreation.pages.rumboesbracamontequezadapino.HomePage;
import aut.testcreation.pages.rumboesbracamontequezadapino.vuelosPages.*;
import framework.engine.selenium.DriverFactory;
import framework.engine.selenium.SeleniumTestBase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class VuelosTest extends SeleniumTestBase {
    WebDriver driver;
    HomePage homePage;
    VuelosPage vuelosPage;
    VuelosBusquedaPage vuelosBusquedaPage;
    VuelosMultidestinoPage vuelosMultidestinoPage;
    VuelosEuropaPage vuelosEuropaPage;
    VuelosALondresPage vuelosALondresPage;
    VuelosNoResult vuelosNoResult;
    VuelosCheckoutCartPage vuelosCheckoutCartPage;
    VuelosHotelPage vuelosHotelPage;
    CheckoutPage checkoutPage;
    FlashSalesPage flashSalesPage;

    @Test
    @Tag("baja")
    public void CP001_BusquedaVuelo_IdaYVuelta_MasBarato_OK() throws InterruptedException {
        homePage = new HomePage(DriverFactory.getDriver());
        vuelosPage= new VuelosPage(DriverFactory.getDriver());
        homePage.navigateTo("https://www.rumbo.es/");
        homePage.cerrarCookis();
        homePage.irAVuelos();
        vuelosPage.viajeiIdaYVuelta("Madrid (MAD) - Adolfo Suárez Barajas, España","Tokio (TYO) - Todos los aeropuertos, Japón");
        vuelosPage.buscarVuelo();
    }

    @Test
    @Tag("baja")
    public void CP002_BusquedaVuelo_DestinosUrbanos_NOOK() throws InterruptedException {
        homePage = new HomePage(DriverFactory.getDriver());
        vuelosPage = new VuelosPage(DriverFactory.getDriver());
        vuelosEuropaPage = new VuelosEuropaPage(DriverFactory.getDriver());
        vuelosNoResult = new VuelosNoResult(DriverFactory.getDriver());
        homePage.navigateTo("https://www.rumbo.es/");
        homePage.cerrarCookis();
        homePage.irAVuelos();
        vuelosPage.vuelaAEuropa();
        vuelosPage.moverseAOtraPestana(1);
        vuelosEuropaPage.vuelaALisboa();
        vuelosEuropaPage.moverseAOtraPestana(2);
        Assertions.assertEquals(vuelosNoResult.mensajeSinVuelos(),"La fecha de la búsqueda ha cambiado");
    }

    @Test
    @Tag("media")
    public void CP003_BVI_Mastercard_MasRapido_CEscalas() throws InterruptedException {
        homePage = new HomePage(DriverFactory.getDriver());
        vuelosPage = new VuelosPage(DriverFactory.getDriver());
        vuelosBusquedaPage = new VuelosBusquedaPage(DriverFactory.getDriver());
        vuelosCheckoutCartPage = new VuelosCheckoutCartPage(DriverFactory.getDriver());
        checkoutPage = new CheckoutPage(DriverFactory.getDriver());
        homePage.navigateTo("https://www.rumbo.es/");
        homePage.cerrarCookis();
        homePage.irAVuelos();
        vuelosPage.seleccionarMetodoPagoMastercard();
        vuelosPage.viajeiIdaYVuelta("Madrid (MAD) - Adolfo Suárez Barajas, España","París (PAR) - Todos los aeropuertos, Francia");
        vuelosPage.buscarVuelo();
        Thread.sleep(10000);
        vuelosBusquedaPage.filtrarPorMasRapido();
        Thread.sleep(9000);
        vuelosBusquedaPage.filtrarPorUnaEscala();
        Thread.sleep(9000);
        vuelosBusquedaPage.seleccionarVuelo();
        vuelosCheckoutCartPage.elegirClassic();
        checkoutPage.verDetallesViaje();
        Assertions.assertEquals(checkoutPage.mensajeDetalleVuelo(),"Detalles del viaje");

    }
    @Test
    public void CP004_BV_IdaYVuelta_Ofertas_ClaseTurista_MasEconomico() throws InterruptedException{
        driver = DriverFactory.getDriver();
        homePage = new HomePage(driver);
        vuelosPage = new VuelosPage(driver);
        vuelosALondresPage = new VuelosALondresPage(driver);
        vuelosBusquedaPage = new VuelosBusquedaPage(driver);
        vuelosCheckoutCartPage = new VuelosCheckoutCartPage(driver);
        checkoutPage = new CheckoutPage(driver);
        homePage.navigateTo("https://www.rumbo.es/");
        homePage.cerrarCookis();
        homePage.irAVuelos();
        vuelosPage.ofertaLondres();
        //vuelosALondresPage.viajeALondres("Madrid (MAD) Adolfo Suárez Barajas, España");
    }

    @Test
    public void  CP005_BV_Multidestinos() throws InterruptedException{
        driver = DriverFactory.getDriver();
        homePage = new HomePage(driver);
        vuelosPage = new VuelosPage(driver);
        vuelosMultidestinoPage = new VuelosMultidestinoPage(driver);
        homePage.navigateTo("https://www.rumbo.es/");
        homePage.cerrarCookis();
        homePage.irAVuelos();
        vuelosPage.IrAMultidestino();
        vuelosPage.moverseAOtraPestana(1);
        vuelosMultidestinoPage.viajeMultidestino(true,"Santiago de Chile","Nueva York","Miami","Santiago de Chile");
    }


    @Test
    public void CP006_BV_UR_OfertasHotel() throws InterruptedException{
        driver = DriverFactory.getDriver();
        homePage = new HomePage(driver);
        flashSalesPage = new FlashSalesPage(driver);
        vuelosHotelPage = new VuelosHotelPage(driver);
        homePage.navigateTo("https://www.rumbo.es/");
        homePage.cerrarCookis();
        homePage.irAFlashSales();
        flashSalesPage.ofertaVuelo();
        flashSalesPage.moverseAOtraPestana(1);
        vuelosHotelPage.seleccionarFechaIdaYVuelta();
        vuelosHotelPage.numeroDeAdultos();
        vuelosHotelPage.corroborarInfo();
        System.out.println(driver.getCurrentUrl());

        //vuelosHotelPage.claseBusiness();
        vuelosHotelPage.buscar();
    }
}
