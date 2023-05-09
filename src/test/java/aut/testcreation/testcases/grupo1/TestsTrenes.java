package aut.testcreation.testcases.grupo1;

import aut.testcreation.base.TestBase;
import aut.testcreation.pages.grupo1.HomePage;
import aut.testcreation.pages.grupo1.TrenesPage;
import aut.testcreation.utilities.ManejoEncodingUFT8;
import gherkin.lexer.Th;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestsTrenes extends TestBase {
    HomePage homePage;
    TrenesPage trenesPage;

    @Test  //1
    public void CP001_TC001_OK() throws InterruptedException {
        homePage = new HomePage(super.driver);
        trenesPage = new TrenesPage(super.driver);
        homePage.navegarAPagina("https://www.rumbo.es/");
        homePage.aceptarCookies();
        homePage.clickTrenes();
        Thread.sleep(1000);
        trenesPage.EscribirOrigen();
        trenesPage.EscribirDestino();
        trenesPage.ClickDia();
        trenesPage.ClickVuelta();
        trenesPage.ClickPasajeros();
        trenesPage.ClickBuscar();
        Assertions.assertEquals(trenesPage.obtenerTextoBusqueda(), ManejoEncodingUFT8.fixEncoding("mar. 9 may."));

    }

    @Test  //2
    public void CP001_TC002_OK() throws InterruptedException {
        homePage = new HomePage(super.driver);
        trenesPage = new TrenesPage(super.driver);
        homePage.navegarAPagina("https://www.rumbo.es/");
        homePage.aceptarCookies();
        homePage.clickTrenes();
        Thread.sleep(1000);
        trenesPage.ClickSoloIda();
        trenesPage.EscribirOrigen();
        trenesPage.EscribirDestino();
        trenesPage.ClickDia();
        trenesPage.ClickPasajeros();
        trenesPage.AgregarPasajero();
        trenesPage.ClickBuscar();
        Assertions.assertEquals(trenesPage.obtenerTextoBusqueda(), ManejoEncodingUFT8.fixEncoding("mar. 9 may."));
    }

    @Test  //3
    public void CP001_TC003_BORDE() throws InterruptedException {
        homePage = new HomePage(super.driver);
        trenesPage = new TrenesPage(super.driver);
        homePage.navegarAPagina("https://www.rumbo.es/");
        homePage.aceptarCookies();
        homePage.clickTrenes();
        Thread.sleep(1000);
        trenesPage.EscribirOrigen();
        trenesPage.EscribirDestino();
        trenesPage.ClickDia();
        trenesPage.ClickVuelta();
        trenesPage.ClickPasajeros();
        trenesPage.AgregarPasajero();
        trenesPage.AgregarPasajeros();
        Thread.sleep(1000);
        trenesPage.AgregarPasajeros();
        Thread.sleep(1000);
        trenesPage.AgregarPasajeros();
        Thread.sleep(1000);
        trenesPage.AgregarPasajeros();
        trenesPage.ClickBuscar();
        Assertions.assertEquals(trenesPage.obtenerTextoBusqueda(), ManejoEncodingUFT8.fixEncoding("mar. 9 may."));
    }
    @Test  //4
    public void CP001_TC004_BORDE() throws InterruptedException {
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
        trenesPage.AgregarPasajero();
        trenesPage.AgregarPasajeros();
        Thread.sleep(1000);
        trenesPage.AgregarPasajeros();
        Thread.sleep(1000);
        trenesPage.AgregarPasajeros();
        Thread.sleep(1000);
        trenesPage.AgregarNinio10Anios();
        trenesPage.ClickBuscar();
        Assertions.assertEquals(trenesPage.obtenerTextoBusqueda(), ManejoEncodingUFT8.fixEncoding("mar. 9 may."));
    }
    @Test  //5
    public void CP001_TC005_OK() throws InterruptedException {
        homePage = new HomePage(super.driver);
        trenesPage = new TrenesPage(super.driver);
        homePage.navegarAPagina("https://www.rumbo.es/");
        homePage.aceptarCookies();
        homePage.clickTrenes();
        Thread.sleep(1000);
        trenesPage.ClickSoloIda();
        trenesPage.EscribirOrigen();
        trenesPage.EscribirDestino();
        trenesPage.ClickDia();
        trenesPage.ClickPasajeros();
        trenesPage.AgregarPasajero();
        Thread.sleep(1000);
        trenesPage.AgregarBebe12A23Meses();
        trenesPage.ClickBuscar();
        Assertions.assertEquals(trenesPage.obtenerTextoBusqueda(), ManejoEncodingUFT8.fixEncoding("mar. 9 may."));
    }
}
