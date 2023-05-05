package aut.testcreation.testcases.rumboesbracamontequezadapino;
import aut.testcreation.pages.rumboesbracamontequezadapino.CheckoutPage;
import aut.testcreation.pages.rumboesbracamontequezadapino.HomePage;
import aut.testcreation.pages.rumboesbracamontequezadapino.TrenesPages.TrenesPage;
import aut.testcreation.pages.rumboesbracamontequezadapino.vuelosPages.*;
import framework.engine.selenium.DriverFactory;
import framework.engine.selenium.SeleniumTestBase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

public class VuelosTest extends SeleniumTestBase {
    HomePage homePage;
    VuelosPage vuelosPage;
    VuelosBusquedaPage vuelosBusquedaPage;
    VuelosEuropaPage vuelosEuropaPage;
    VuelosNoResult vuelosNoResult;
    VuelosCheckoutCartPage vuelosCheckoutCartPage;
    CheckoutPage checkoutPage;

    @Test
    public void CP001_BusquedaVuelo_IdaYVuelta_MasBarato_OK() throws InterruptedException {
        homePage = new HomePage(DriverFactory.getDriver());
        vuelosPage= new VuelosPage(DriverFactory.getDriver());
        homePage.navigateTo("https://www.rumbo.es/");
        homePage.cerrarCookis();
        homePage.irAVuelos();
        vuelosPage.seleccionarSentidoViajeIdaYVuelta();
        vuelosPage.ingresarOrigen("Madrid (MAD) - Adolfo Suárez Barajas, España");
        vuelosPage.ingresarDestino("Tokio (TYO) - Todos los aeropuertos, Japón");
        vuelosPage.seleccionarFecha();
        vuelosPage.seleccionarAnadirPasajerosAdultos();
        vuelosPage.buscarVuelo();
    }

    @Test
    public void CP002_BusquedaVuelo_DestinosUrbanos_NOOK() throws InterruptedException {
        homePage = new HomePage(DriverFactory.getDriver());
        vuelosPage = new VuelosPage(DriverFactory.getDriver());
        vuelosEuropaPage = new VuelosEuropaPage(DriverFactory.getDriver());
        vuelosNoResult = new VuelosNoResult(DriverFactory.getDriver());
        homePage.navigateTo("https://www.rumbo.es/");
        homePage.cerrarCookis();
        homePage.irAVuelos();
        vuelosPage.vuelaAEuropa();
        vuelosPage.moverseALaSegundaPestana();
        vuelosEuropaPage.vuelaALisboa();
        vuelosEuropaPage.moverseALaTerceraPestana();
        Assertions.assertEquals(vuelosNoResult.mensajeSinVuelos(),"No hemos encontrado ninguna oferta que se ajuste a los criterios de búsqueda, probablemente por falta de disponibilidad en fechas o destino. Por favor, vuelve a intentarlo seleccionando una fecha diferente.");
    }

    @Test
    public void CP003_BusquedaVueloInternacional_IdaYVuelta_Mastercard_MasRapido_Conescalas() throws InterruptedException {
        homePage = new HomePage(DriverFactory.getDriver());
        vuelosPage = new VuelosPage(DriverFactory.getDriver());
        vuelosBusquedaPage = new VuelosBusquedaPage(DriverFactory.getDriver());
        vuelosCheckoutCartPage = new VuelosCheckoutCartPage(DriverFactory.getDriver());
        checkoutPage = new CheckoutPage(DriverFactory.getDriver());
        homePage.navigateTo("https://www.rumbo.es/");
        homePage.cerrarCookis();
        homePage.irAVuelos();
        vuelosPage.seleccionarSentidoViajeIdaYVuelta();
        vuelosPage.seleccionarMetodoPagoMastercard();
        vuelosPage.ingresarOrigen("Madrid (MAD) - Adolfo Suárez Barajas, España");
        vuelosPage.ingresarDestino("Nueva York (JFK) - John F. Kennedy, Estados Unidos");
        vuelosPage.seleccionarFecha();
        vuelosPage.seleccionarAnadirPasajerosAdultos();
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

}
