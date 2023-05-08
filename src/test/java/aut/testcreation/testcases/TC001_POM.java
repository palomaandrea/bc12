package aut.testcreation.testcases;

import aut.testcreation.pages.trenes.RumboHomePage;
import framework.engine.selenium.DriverFactory;
import framework.engine.selenium.SeleniumTestBase;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class TC001_POM extends SeleniumTestBase {

    RumboHomePage rumboHomePage;

    @Test
    @Tag("Funcional")
    void registroVuelo(){

        rumboHomePage = new RumboHomePage(DriverFactory.getDriver());
        rumboHomePage.navegarAlHome();
        rumboHomePage.aceptarCoockies();
        rumboHomePage.elegirVueloIdaYVuelta();
        rumboHomePage.ingresarOrigen("Santiago SCL");
        rumboHomePage.ingresarDestino("Buenos Aires (BUE)");
        rumboHomePage.elegirFechas();
        rumboHomePage.clicNumPasajero();
        rumboHomePage.realizarBusqueda();

    }
}
