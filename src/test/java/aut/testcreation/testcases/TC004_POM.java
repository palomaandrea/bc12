package aut.testcreation.testcases;

import aut.testcreation.pages.vuelos.RumboHomePage;
import framework.engine.selenium.DriverFactory;
import framework.engine.selenium.SeleniumTestBase;
import org.junit.jupiter.api.Test;

public class TC004_POM extends SeleniumTestBase {

    RumboHomePage rumboHomePage;

    @Test
    void buscarVueloMultidestino(){

        rumboHomePage = new RumboHomePage(DriverFactory.getDriver());
        rumboHomePage.opcionMultidestino();

    }
}
