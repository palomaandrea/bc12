package aut.testcreation.testcases;

import aut.testcreation.pages.vuelos.FormularioVuelosPage;
import aut.testcreation.pages.vuelos.OfertasVuelosPage;
import aut.testcreation.pages.vuelos.RumboHomePage;
import aut.testcreation.pages.vuelos.TarifaVueloPage;
import framework.engine.selenium.DriverFactory;
import framework.engine.selenium.SeleniumTestBase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class TC002_POM extends SeleniumTestBase {

    RumboHomePage rumboHomePage;
    OfertasVuelosPage ofertasVuelosPage;
    TarifaVueloPage tarifaVueloPage;
    FormularioVuelosPage formularioVuelosPage;

    @Test
    void registroVueloNoOk() throws InterruptedException {

        rumboHomePage = new RumboHomePage(DriverFactory.getDriver());
        ofertasVuelosPage = new OfertasVuelosPage(DriverFactory.getDriver());
        tarifaVueloPage = new TarifaVueloPage(DriverFactory.getDriver());
        formularioVuelosPage = new FormularioVuelosPage(DriverFactory.getDriver());
        rumboHomePage.formularioHomeIdaYVuelta(true, "Santiago (SCL)", "Buenos Aires (BUE)");
        ofertasVuelosPage.elegirPrimerOfertaQueAparezca();
        tarifaVueloPage.elegirTarifa();
        formularioVuelosPage.llenarFormulario("Francisca", "Benavides", "Holamundo2222@gmail.com", "9255874", false, true, "08", "2022");
        Assertions.assertEquals(formularioVuelosPage.mensajeErrorAnnioEncontrado(), ("El adulto debe tener más de 12 años"));
    }


}
