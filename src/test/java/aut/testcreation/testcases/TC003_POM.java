package aut.testcreation.testcases;

import aut.testcreation.pages.vuelos.RumboHomePage;
import framework.engine.selenium.DriverFactory;
import framework.engine.selenium.SeleniumTestBase;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class TC003_POM extends SeleniumTestBase {

    RumboHomePage rumboHomePage;

    @Test
    @Tag("Funcional")
    void buscarVueloIda(){

        rumboHomePage = new RumboHomePage(DriverFactory.getDriver());
        rumboHomePage.formularioSoloIda("Santiago (SCL)", "Buenos Aires (BUE)");

    }
}