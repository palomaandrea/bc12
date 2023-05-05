package aut.testcreation.testcases;

import aut.testcreation.pages.vuelos.FormularioVuelosPage;
import aut.testcreation.pages.vuelos.OfertasVuelosPage;
import aut.testcreation.pages.vuelos.RumboHomePage;
import aut.testcreation.pages.vuelos.TarifaVueloPage;
import framework.engine.selenium.DriverFactory;
import framework.engine.selenium.SeleniumTestBase;
import org.junit.jupiter.api.Test;

import java.util.concurrent.TimeUnit;

public class TC001_POM extends SeleniumTestBase {

    RumboHomePage rumboHomePage;
    OfertasVuelosPage ofertasVuelosPage;
    TarifaVueloPage tarifaVueloPage;
    FormularioVuelosPage formularioVuelosPage;

    @Test
    void registroVuelo() throws InterruptedException {

        //rumboHomePage = new RumboHomePage(DriverFactory.getDriver());
        //ofertasVuelosPage = new OfertasVuelosPage(DriverFactory.getDriver());
        formularioVuelosPage = new FormularioVuelosPage(DriverFactory.getDriver());
        //tarifaVueloPage = new TarifaVueloPage(DriverFactory.getDriver());
        //rumboHomePage.formularioHomeIdaYVuelta("Santiago (SCL)", "Buenos Aires (BUE)");
        //ofertasVuelosPage.elegirPrimerVueloQueAparezca();
        //tarifaVueloPage.elegirTarifa();
        formularioVuelosPage.llenarFormulario("Francisca", "Benavides", "Holamundo2222@gmail.com", "9255874", false, true, "08", "1993");

    }
}
