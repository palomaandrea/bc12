package aut.testcreation.testcases;

import aut.testcreation.pages.trenes.RumboHomePageTrenes;
import framework.engine.selenium.DriverFactory;
import framework.engine.selenium.SeleniumTestBase;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

public class TC007_POM extends SeleniumTestBase {

    RumboHomePageTrenes rumboHomePageTrenes;

    @Test
    @Tag("funcional")
    void registroTrenes(){

      rumboHomePageTrenes = new RumboHomePageTrenes(DriverFactory.getDriver());







    }



}
