package aut.testcreation.testcases.clases;

import aut.testcreation.pages.clases.GoogleHomePage;
import framework.engine.selenium.DriverFactory;
import framework.engine.selenium.SeleniumTestBase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class atc01_POM extends SeleniumTestBase {

    GoogleHomePage googleHomePage;

    @Test
    @Tag("regresion")
    void busquedaGoogle(){
        googleHomePage = new GoogleHomePage(DriverFactory.getDriver());
        googleHomePage.navegarAlHome();
        googleHomePage.buscarConBotonBuscar("Tsoft");
        Assertions.assertEquals("Tsoft - Buscar con Google",googleHomePage.getUrlTitle());
    }
}
