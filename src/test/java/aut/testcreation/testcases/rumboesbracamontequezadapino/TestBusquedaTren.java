package aut.testcreation.testcases.rumboesbracamontequezadapino;

import aut.testcreation.pages.rumboesbracamontequezadapino.HomePage;
import aut.testcreation.pages.rumboesbracamontequezadapino.TrenesPages.TrenesPage;
import framework.engine.selenium.DriverFactory;
import framework.engine.selenium.SeleniumTestBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

import static framework.engine.utils.Constants.BASE_URL_AUT;

public class TestBusquedaTren extends SeleniumTestBase {

    WebDriver driver;

    TrenesPage trenesPage;

    HomePage homePage;

    @Test
    public void TestBusquedaTren() throws InterruptedException{
        homePage= new HomePage(driver);
        trenesPage=new TrenesPage(driver);
        driver = DriverFactory.getDriver();
        driver.navigate().to("https://www.rumbo.es/");
        Thread.sleep(5000);
        homePage.irATrenes();
        trenesPage.soloIda();
        trenesPage.escribirOrigen("Madrid");
        trenesPage.escribirDestino("Barcelona");
        trenesPage.fechaIda();
        trenesPage.clickEnBuscar();
    }

}
