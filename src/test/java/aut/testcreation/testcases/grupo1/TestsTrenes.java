package aut.testcreation.testcases.grupo1;

import aut.testcreation.base.TestBase;
import aut.testcreation.pages.grupo1.HomePage;
import aut.testcreation.pages.grupo1.TrenesPage;
import aut.testcreation.utilities.ManejoEncodingUFT8;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestsTrenes extends TestBase {
    HomePage homePage;
    TrenesPage trenesPage;

    @Test
    public void CP001_TC001_NOOK() throws InterruptedException {
        homePage = new HomePage(super.driver);
        trenesPage = new TrenesPage(super.driver);
        homePage.navegarAPagina("https://www.rumbo.es/");
        homePage.aceptarCookies();
        homePage.clickTrenes();
        Thread.sleep(3000);
        trenesPage.EscribirOrigen();
        trenesPage.EscribirDestino();
        trenesPage.ClickDia();
        trenesPage.ClickVuelta();
        trenesPage.ClickPasajeros();
        trenesPage.ClickBuscar();
        Assertions.assertEquals(trenesPage.obtenerTextoBusqueda(), ManejoEncodingUFT8.fixEncoding("mar. 9 may."));

    }
    @Test
    public void CP001_TC002_NOOK() throws InterruptedException {
        homePage = new HomePage(super.driver);
        trenesPage = new TrenesPage(super.driver);
        homePage.navegarAPagina("https://www.rumbo.es/");
        homePage.aceptarCookies();
        homePage.clickTrenes();
        Thread.sleep(3000);
        trenesPage.ClickSoloIda();
        trenesPage.EscribirOrigen();
        trenesPage.EscribirDestino();
        trenesPage.ClickDia();
        trenesPage.ClickPasajeros();
        trenesPage.AgregarPasajeros();
        trenesPage.ClickBuscar();
        Assertions.assertEquals(trenesPage.obtenerTextoBusqueda(), ManejoEncodingUFT8.fixEncoding("mar. 9 may."));
    }
}
