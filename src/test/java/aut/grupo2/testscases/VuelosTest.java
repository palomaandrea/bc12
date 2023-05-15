package aut.grupo2.testscases;

import aut.grupo2.pages.CheckoutPage;
import aut.grupo2.pages.FlashSalesPage;
import aut.grupo2.pages.HomePage;
import aut.grupo2.pages.vuelosPages.*;
import framework.engine.selenium.DriverFactory;
import framework.engine.selenium.SeleniumTestBase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
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
    public void CP001_BusquedaVuelo_IdaYVuelta_MasBarato() throws InterruptedException {
        driver = DriverFactory.getDriver();
        homePage = new HomePage(driver);
        vuelosPage = new VuelosPage(driver);
        homePage.navigateTo("https://www.rumbo.es/");
        homePage.irAVuelos();
        vuelosPage.viajeiIdaYVuelta("Madrid (MAD) - Adolfo Suárez Barajas, España", "Tokio (TYO) - Todos los aeropuertos, Japón");
        vuelosPage.buscarVuelo();
    }

    @Test
    @Tag("baja")
    public void CP002_BV_DestinosUrbanos() throws InterruptedException {
        driver = DriverFactory.getDriver();
        homePage = new HomePage(driver);
        vuelosPage = new VuelosPage(driver);
        vuelosEuropaPage = new VuelosEuropaPage(driver);
        vuelosNoResult = new VuelosNoResult(driver);
        homePage.navigateTo("https://www.rumbo.es/");
        homePage.irAVuelos();
        vuelosPage.vuelaAEuropa();
        vuelosPage.moverseAOtraPestana(1);
        vuelosEuropaPage.vuelaALisboa();
        vuelosEuropaPage.moverseAOtraPestana(2);
        Assertions.assertEquals(vuelosNoResult.mensajeSinVuelos(), "La fecha de la búsqueda ha cambiado");
    }

    @Test
    @Tag("media")
    public void CP003_BVI_Mastercard_MasRapido_CEscalas() throws InterruptedException {
        driver = DriverFactory.getDriver();
        homePage = new HomePage(driver);
        vuelosPage = new VuelosPage(driver);
        vuelosBusquedaPage = new VuelosBusquedaPage(driver);
        vuelosCheckoutCartPage = new VuelosCheckoutCartPage(driver);
        checkoutPage = new CheckoutPage(driver);
        homePage.navigateTo("https://www.rumbo.es/");
        homePage.irAVuelos();
        vuelosPage.seleccionarMetodoPagoMastercard();
        vuelosPage.viajeiIdaYVuelta("Madrid (MAD) - Adolfo Suárez Barajas, España", "París (PAR) - Todos los aeropuertos, Francia");
        vuelosPage.buscarVuelo();
        Thread.sleep(11000);
        vuelosBusquedaPage.filtrarPorMasRapido();
        Thread.sleep(9000);
        vuelosBusquedaPage.filtrarPorUnaEscala();
        Thread.sleep(9000);
        vuelosBusquedaPage.seleccionarVuelo();
        vuelosCheckoutCartPage.elegirClassic();
        checkoutPage.verDetallesViaje();
        Assertions.assertEquals(checkoutPage.mensajeDetalleVuelo(), "Detalles del viaje");

    }

    @Test
    public void CP004_BV_IdaYVuelta_Ofertas() throws InterruptedException {
        driver = DriverFactory.getDriver();
        homePage = new HomePage(driver);
        vuelosPage = new VuelosPage(driver);
        vuelosALondresPage = new VuelosALondresPage(driver);
        vuelosBusquedaPage = new VuelosBusquedaPage(driver);
        vuelosCheckoutCartPage = new VuelosCheckoutCartPage(driver);
        checkoutPage = new CheckoutPage(driver);
        homePage.navigateTo("https://www.rumbo.es/");
        homePage.irAVuelos();
        vuelosPage.ofertaLondres();
        vuelosPage.moverseAOtraPestana(1);
        vuelosALondresPage.viajeALondres("Madrid (MAD) Adolfo Suárez Barajas, España");
        Thread.sleep(11000);
        vuelosBusquedaPage.filtrarPorMasBarato();
        Thread.sleep(9000);
        vuelosBusquedaPage.filtrarPorUnaEscala();
        Thread.sleep(9000);
        vuelosBusquedaPage.seleccionarVuelo();
        if (vuelosBusquedaPage.noHayVuelos()) {
            Assertions.assertEquals(vuelosBusquedaPage.noHayVuelosTxt(), "Lo sentimos, el viaje seleccionado ya no está disponible, pero tenemos muchas otras opciones. ¡Échales un vistazo!");
        }else{
            vuelosCheckoutCartPage.elegirClassic();
            checkoutPage.verDetallesViaje();
            checkoutPage.mensajeDetalleVuelo();
        }
    }

    @Test
    public void CP005_BV_Multidestinos() throws InterruptedException {
        driver = DriverFactory.getDriver();
        homePage = new HomePage(driver);
        vuelosPage = new VuelosPage(driver);
        vuelosMultidestinoPage = new VuelosMultidestinoPage(driver);
        homePage.navigateTo("https://www.rumbo.es/");
        homePage.cerrarCookis();
        vuelosPage.IrAMultidestino();
        vuelosPage.moverseAOtraPestana(1);
        vuelosMultidestinoPage.escogerDestinos(true, "Santiago de Chile", "Nueva York", "Miami", "Santiago de Chile");
        vuelosMultidestinoPage.viajeMultiDestino();
        if (vuelosMultidestinoPage.noHayVuelos()) {
            Assertions.assertEquals(vuelosMultidestinoPage.noHayVuelosTxt(), "No hay resultados para esta búsqueda");
        }

    }
    @Test
    public void CP006_BV_UR_OfertasHotel() throws InterruptedException {
        driver = DriverFactory.getDriver();
        homePage = new HomePage(driver);
        flashSalesPage = new FlashSalesPage(driver);
        vuelosHotelPage = new VuelosHotelPage(driver);
        homePage.navigateTo("https://www.rumbo.es/");
        homePage.cerrarCookis();
        homePage.irAFlashSales();
        flashSalesPage.ofertaVuelo();
        flashSalesPage.moverseAOtraPestana(1);
        vuelosHotelPage.datosHotel();
    }
}
