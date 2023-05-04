package aut.testcreation.testcases.rumboesbracamontequezadapino;

import aut.testcreation.pages.rumboesbracamontequezadapino.HomePage;
import aut.testcreation.pages.rumboesbracamontequezadapino.TrenesPages.TrenesPage;
import framework.engine.selenium.DriverFactory;
import framework.engine.selenium.SeleniumTestBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import static framework.engine.utils.Constants.BASE_URL_AUT;

public class TestBusquedaTren extends SeleniumTestBase {

    WebDriver driver;

    TrenesPage trenesPage;

    HomePage homePage;

    @Test
    public void TestBusquedaTren() throws InterruptedException{
        driver = DriverFactory.getDriver();
        homePage= new HomePage(DriverFactory.getDriver());
        trenesPage=new TrenesPage(DriverFactory.getDriver());
        driver.navigate().to("https://www.rumbo.es/");
        Thread.sleep(5000);
        homePage.cerrarCookis();
        homePage.irATrenes();
        trenesPage.soloIda();
        trenesPage.escribirOrigen("Madrid");
        trenesPage.marcarDestino();
        Thread.sleep(3000);
        trenesPage.fechaIda();
        Thread.sleep(3000);
        //trenesPage.marcarDia();
        trenesPage.sendKeys(Keys.ENTER);
        trenesPage.clickEnBuscar();
        Thread.sleep(5000);
    }

}
