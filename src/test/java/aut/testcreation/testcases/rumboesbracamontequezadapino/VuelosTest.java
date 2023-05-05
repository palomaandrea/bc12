package aut.testcreation.testcases.rumboesbracamontequezadapino;
import aut.testcreation.pages.rumboesbracamontequezadapino.HomePage;
import aut.testcreation.pages.rumboesbracamontequezadapino.TrenesPages.TrenesPage;
import aut.testcreation.pages.rumboesbracamontequezadapino.vuelosPages.VuelosBusquedaPage;
import aut.testcreation.pages.rumboesbracamontequezadapino.vuelosPages.VuelosEuropaPage;
import aut.testcreation.pages.rumboesbracamontequezadapino.vuelosPages.VuelosNoResult;
import aut.testcreation.pages.rumboesbracamontequezadapino.vuelosPages.VuelosPage;
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
        vuelosEuropaPage.vuelaALisboa();
        Assertions.assertEquals(vuelosNoResult.mensajeSinVuelos(),"No hemos encontrado ninguna oferta que se ajuste a los criterios de búsqueda, probablemente por falta de disponibilidad en fechas o destino. Por favor, vuelve a intentarlo seleccionando una fecha diferente.");
    }

}
