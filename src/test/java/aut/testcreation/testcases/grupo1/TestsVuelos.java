package aut.testcreation.testcases.grupo1;

import aut.testcreation.base.TestBase;
import aut.testcreation.pages.grupo1.HomePage;
import aut.testcreation.pages.grupo1.TrenesPage;
import aut.testcreation.pages.grupo1.VuelosPage;
import aut.testcreation.utilities.ManejoEncodingUFT8;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestsVuelos extends TestBase {
    HomePage homePage;
    VuelosPage vuelosPage;

    @Test
    public void CP001_TC001_OK () throws InterruptedException{
        homePage = new HomePage(super.driver);
        vuelosPage = new VuelosPage(super.driver);
        homePage.navegarAPagina("https://www.rumbo.es/");
        homePage.aceptarCookies();
        homePage.clickVuelos();
        Thread.sleep(1000);
        vuelosPage.ClickSoloIda();
        vuelosPage.EscribirOrigen();
        vuelosPage.EscribirDestino();
        vuelosPage.ClickDia();
        vuelosPage.ClickPasajeros();
        vuelosPage.ClickBuscar();
        Assertions.assertEquals(vuelosPage.obtenerTextoBusqueda(), ManejoEncodingUFT8.fixEncoding("mar. 9 may."));
    }
    @Test
    public void CP001_TC002_OK () throws InterruptedException{
        homePage = new HomePage(super.driver);
        vuelosPage = new VuelosPage(super.driver);
        homePage.navegarAPagina("https://www.rumbo.es/");
        homePage.aceptarCookies();
        homePage.clickVuelos();
        Thread.sleep(1000);
        vuelosPage.ClickSoloIda();
        vuelosPage.EscribirOrigen();
        vuelosPage.EscribirDestino();
        vuelosPage.ClickDia();
        vuelosPage.ClickPasajeros();
        vuelosPage.AgregarPasajero();
        vuelosPage.AgregarPasajeros();
        Thread.sleep(1000);
        vuelosPage.AgregarPasajeros();
        Thread.sleep(1000);
        vuelosPage.AgregarPasajeros();
        Thread.sleep(1000);
        vuelosPage.AgregarPasajeros();
        vuelosPage.ClickBuscar();
        Assertions.assertEquals(vuelosPage.obtenerTextoBusqueda(), ManejoEncodingUFT8.fixEncoding("mar. 9 may."));
    }
    @Test
    public void CP001_TC003_NOOK () throws InterruptedException{
        homePage = new HomePage(super.driver);
        vuelosPage = new VuelosPage(super.driver);
        homePage.navegarAPagina("https://www.rumbo.es/");
        homePage.aceptarCookies();
        homePage.clickVuelos();
        Thread.sleep(1000);
        vuelosPage.ClickSoloIda();
        vuelosPage.EscribirOrigen();
        vuelosPage.EscribirDestino();
        vuelosPage.ClickDia();
        vuelosPage.ClickPasajeros();
        vuelosPage.AgregarPasajero();
        vuelosPage.ClickBuscar();
        vuelosPage.CambiarPestaniaResultados();
        Assertions.assertEquals(vuelosPage.obtenerTextoBusquedaPestania(), ManejoEncodingUFT8.fixEncoding("mar. 9 may."));
    }
}
