package aut.testcreation.testcases;

import aut.testcreation.pages.RumboHomePage;
import framework.engine.selenium.DriverFactory;
import framework.engine.selenium.SeleniumTestBase;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class TC002_POM extends SeleniumTestBase {

    RumboHomePage rumboHomePage;

    @Test
    @Tag("Funcional")
    void registroVueloNoOk(){

        rumboHomePage = new RumboHomePage(DriverFactory.getDriver());
        rumboHomePage.navegarAlHome();
        rumboHomePage.aceptarCoockies();
        rumboHomePage.elegirVueloIdaYVuelta();
        rumboHomePage.ingresarOrigen("Santiago SCL");
        rumboHomePage.ingresarDestino("Buenos Aires (BUE)");
        rumboHomePage.elegirFechas();
        rumboHomePage.clicNumPasajero();
        //rumboHomePage.realizarBusqueda();

    }
}
