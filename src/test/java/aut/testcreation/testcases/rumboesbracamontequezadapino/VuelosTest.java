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

public class VuelosTest extends SeleniumTestBase {
    HomePage homePage;
    VuelosPage vuelosPage;
    VuelosBusquedaPage vuelosBusquedaPage;
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
        vuelosPage.seleccionarSentidoViajeIdaYVuelta();
        vuelosPage.ingresarOrigen("Madrid (MAD) - Adolfo Suárez Barajas, España");
        vuelosPage.ingresarDestino("Tokio (TYO) - Todos los aeropuertos, Japón");
        vuelosPage.seleccionarFecha();
        vuelosPage.seleccionarAnadirPasajerosAdultos();
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
        vuelosPage.moverseALaSegundaPestana();
        vuelosEuropaPage.vuelaALisboa();
        vuelosEuropaPage.moverseALaTerceraPestana();
        Assertions.assertEquals(vuelosNoResult.mensajeSinVuelos(),"No hemos encontrado ninguna oferta que se ajuste a los criterios de búsqueda, probablemente por falta de disponibilidad en fechas o destino. Por favor, vuelve a intentarlo seleccionando una fecha diferente.");
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
    @Test
    public void CP004_BV_IdaYVuelta_Ofertas_ClaseTurista_MasEconomico() throws InterruptedException{
        homePage = new HomePage(DriverFactory.getDriver());
        vuelosPage = new VuelosPage(DriverFactory.getDriver());
        vuelosALondresPage = new VuelosALondresPage(DriverFactory.getDriver());
        vuelosBusquedaPage = new VuelosBusquedaPage(DriverFactory.getDriver());
        vuelosCheckoutCartPage = new VuelosCheckoutCartPage(DriverFactory.getDriver());
        checkoutPage = new CheckoutPage(DriverFactory.getDriver());
        homePage.navigateTo("https://www.rumbo.es/");
        homePage.cerrarCookis();
        homePage.irAVuelos();
        vuelosPage.ofertaLondres();
        //vuelosALondresPage.viajeALondres("Madrid (MAD) Adolfo Suárez Barajas, España");
    }

    @Test
    public void CP006_BV_UR_OfertasHotel() throws InterruptedException{
        homePage = new HomePage(DriverFactory.getDriver());
        flashSalesPage = new FlashSalesPage(DriverFactory.getDriver());
        vuelosHotelPage = new VuelosHotelPage(DriverFactory.getDriver());
        homePage.navigateTo("https://www.rumbo.es/");
        homePage.cerrarCookis();
        homePage.irAFlashSales();
        flashSalesPage.ofertaVuelo();
        flashSalesPage.moverseALaSegundaPestana();
        vuelosHotelPage.ingresarorigen("Madrid (MAD) - Adolfo Suárez Barajas, España");
        vuelosHotelPage.seleccionarFechaIdaYVuelta();
        vuelosHotelPage.numeroDeAdultos();
        vuelosHotelPage.claseBusiness();
    }
}
