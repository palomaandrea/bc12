package aut.testcreation.testcases;


import aut.testcreation.pages.vuelos.RumboHomePage;

import aut.testcreation.pages.vuelos.OfertasVuelosPage;

import framework.engine.selenium.DriverFactory;
import framework.engine.selenium.SeleniumTestBase;
import org.junit.jupiter.api.Test;

public class TC004_POM extends SeleniumTestBase {
    RumboHomePage rumboHomePage;
    OfertasVuelosPage ofertasVuelosPage;

    @Test
    void buscarVueloIda() throws InterruptedException {
        rumboHomePage = new RumboHomePage(DriverFactory.getDriver());
        ofertasVuelosPage = new OfertasVuelosPage(DriverFactory.getDriver());
        rumboHomePage.formularioSoloIda( "Santiago (SCL)", "Buenos Aires (BUE)");
        ofertasVuelosPage.contarNumOfertas();
    }
}