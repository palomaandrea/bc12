package aut.testcreation.testcases.rumboesbracamontequezadapino;

import aut.testcreation.pages.rumboesbracamontequezadapino.HomePage;
import aut.testcreation.pages.rumboesbracamontequezadapino.HotelesPage.HotelesPage;
import framework.engine.selenium.DriverFactory;
import framework.engine.selenium.SeleniumTestBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

public class HotelesTest extends SeleniumTestBase {
    HotelesPage hotelesPage;
    HomePage homePage;
    WebDriver driver;

    //Test complejidad baja
    @Test
    public void CP001_HotelMV_OK() throws InterruptedException{
        driver = DriverFactory.getDriver();
        homePage = new HomePage(DriverFactory.getDriver());
        hotelesPage = new HotelesPage(DriverFactory.getDriver());
        driver.navigate().to("https://www.rumbo.es/");
        Thread.sleep(2000);
        homePage.cerrarCookis();
        homePage.irAHoteles();
        hotelesPage.ubicacionHotel("Barcelona, España"/*, "lun,22 may", "vie,26 may"*/);
        hotelesPage.Buscar();
        hotelesPage.precioMasAltoPrimero();
    }

    @Test
    public void CP002_HotelEYRP_Error() throws InterruptedException{
        driver = DriverFactory.getDriver();
        homePage = new HomePage(DriverFactory.getDriver());
        hotelesPage = new HotelesPage(DriverFactory.getDriver());
        driver.navigate().to("https://www.rumbo.es/");
        Thread.sleep(1000);
        homePage.cerrarCookis();
        homePage.irAHoteles();
        hotelesPage.ubicacionHotel("Madrid, España"/*, "lun, 15 may","mié, 17 may"*/);
        hotelesPage.Buscar();
    }

    //Test complejidad media
    @Test
    public void CP003_HotelFDSA_() throws InterruptedException{
        driver = DriverFactory.getDriver();
        homePage = new HomePage(DriverFactory.getDriver());
        hotelesPage = new HotelesPage(DriverFactory.getDriver());
        driver.navigate().to("https://www.rumbo.es/");
        Thread.sleep(1000);
        homePage.cerrarCookis();
        homePage.irAHoteles();
        hotelesPage.ubicacionHotel("Barcelona");
    }

    @Test
    public void CP004_HotelAM_() throws InterruptedException{
        driver = DriverFactory.getDriver();
        homePage = new HomePage(DriverFactory.getDriver());
        hotelesPage = new HotelesPage(DriverFactory.getDriver());
        driver.navigate().to("https://www.rumbo.es/");
        Thread.sleep(1000);
        homePage.cerrarCookis();
        homePage.irAHoteles();
    }

    //Test complejidad alta
    @Test
    public void CP005_HotelYVueloCF_() throws InterruptedException{
        driver = DriverFactory.getDriver();
        homePage = new HomePage(DriverFactory.getDriver());
        hotelesPage = new HotelesPage(DriverFactory.getDriver());
        driver.navigate().to("https://www.rumbo.es/");
        Thread.sleep(1000);
        homePage.cerrarCookis();
        homePage.irAHoteles();
    }

    @Test
    public void CP006_HotelCF_() throws InterruptedException{
        driver = DriverFactory.getDriver();
        homePage = new HomePage(DriverFactory.getDriver());
        hotelesPage = new HotelesPage(DriverFactory.getDriver());
        driver.navigate().to("https://www.rumbo.es/");
        Thread.sleep(1000);
        homePage.cerrarCookis();
        homePage.irAHoteles();
    }
}