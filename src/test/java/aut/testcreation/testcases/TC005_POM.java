package aut.testcreation.testcases;

import aut.testcreation.pages.vuelos.RumboHomePage;
import framework.engine.selenium.DriverFactory;
import framework.engine.selenium.SeleniumTestBase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class TC005_POM extends SeleniumTestBase {

    RumboHomePage rumboHomePage;

    @Test
    @Tag("Funcional")
    void buscarVueloIdaNoOk() {

        rumboHomePage = new RumboHomePage(DriverFactory.getDriver());
        rumboHomePage.formularioIdaSinOrigen("Buenos Aires (BUE)");
        Assertions.assertEquals(rumboHomePage.mensajeErrorOrigen(), ("Introduce ciudad o aeropuerto de origen"));

    }
}