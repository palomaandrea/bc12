package aut.testcreation.testcases;

import aut.testcreation.pages.vuelos.*;
import framework.engine.selenium.DriverFactory;
import framework.engine.selenium.SeleniumTestBase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class TC001_POM extends SeleniumTestBase {

    RumboHomePage rumboHomePage;
    OfertasVuelosPage ofertasVuelosPage;
    TarifaVueloPage tarifaVueloPage;
    FormularioVuelosPage formularioVuelosPage;
    ServiciosAdicionalesPage serviciosAdicionalesPage;
    VerificacionPagoPage verificacionPagoPage;

    @Test
    void registroVuelo() throws InterruptedException {

        rumboHomePage = new RumboHomePage(DriverFactory.getDriver());
        ofertasVuelosPage = new OfertasVuelosPage(DriverFactory.getDriver());
        tarifaVueloPage = new TarifaVueloPage(DriverFactory.getDriver());
        formularioVuelosPage = new FormularioVuelosPage(DriverFactory.getDriver());
        serviciosAdicionalesPage = new ServiciosAdicionalesPage(DriverFactory.getDriver());
        verificacionPagoPage = new VerificacionPagoPage(DriverFactory.getDriver());
        rumboHomePage.formularioHomeIdaYVuelta(true, "Santiago (SCL)", "Buenos Aires (BUE)");
        ofertasVuelosPage.elegirPrimerOfertaQueAparezca();
        tarifaVueloPage.elegirTarifa();
        formularioVuelosPage.llenarFormulario("Francisca", "Benavides", "Holamundo2222@gmail.com", "9255874", false, true, "08", "1993");
        serviciosAdicionalesPage.presionarSiguiente();
        verificacionPagoPage.mensajeVerificarEncontrado();
        Assertions.assertEquals(verificacionPagoPage.mensajeVerificarEncontrado(), ("Verifica tus datos"));
    }
}
