package aut.testcreation.testcases;

import aut.testcreation.pages.vuelos.OfertasVuelosPage;
import aut.testcreation.pages.vuelos.RumboHomePage;
import framework.engine.selenium.DriverFactory;
import framework.engine.selenium.SeleniumTestBase;
import org.junit.jupiter.api.Test;

import java.util.concurrent.TimeUnit;

public class TC001_POM extends SeleniumTestBase {

    RumboHomePage rumboHomePage;
    OfertasVuelosPage ofertasVuelosPage;

    @Test
    void registroVuelo() throws InterruptedException {

        rumboHomePage = new RumboHomePage(DriverFactory.getDriver());
        ofertasVuelosPage = new OfertasVuelosPage(DriverFactory.getDriver());
        rumboHomePage.navegarAlHome();
        rumboHomePage.aceptarCoockies();
        rumboHomePage.elegirVueloIdaYVuelta();
        rumboHomePage.ingresarOrigen("Santiago (SCL)");
        rumboHomePage.ingresarDestino("Buenos Aires (BUE)");
        rumboHomePage.elegirFechas();
        rumboHomePage.clicNumPasajero();
        rumboHomePage.realizarBusqueda();
        ofertasVuelosPage.elegirPrimerVueloQueAparezca();

    }
}
