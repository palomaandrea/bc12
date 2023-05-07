package aut.testcreation.testcases;

import aut.testcreation.pages.vuelos.MultidestinoPage;
import aut.testcreation.pages.vuelos.RumboHomePage;
import framework.engine.selenium.DriverFactory;
import framework.engine.selenium.SeleniumTestBase;
import org.junit.jupiter.api.Test;

public class TC006_POM extends SeleniumTestBase {

    RumboHomePage rumboHomePage;
    MultidestinoPage multidestinoPage;

    @Test
    void botonBorrarTodos() throws InterruptedException {
        rumboHomePage = new RumboHomePage(DriverFactory.getDriver());
        multidestinoPage = new MultidestinoPage(DriverFactory.getDriver());
        rumboHomePage.opcionMultidestino();
        multidestinoPage.borrarPreIngresados(true);
    }
}