package aut.testcreation.testcases.rumboesbracamontequezadapino;
import aut.testcreation.pages.rumboesbracamontequezadapino.HomePage;
import aut.testcreation.pages.rumboesbracamontequezadapino.TrenesPages.TrenesPage;
import aut.testcreation.pages.rumboesbracamontequezadapino.vuelosPages.VuelosBusquedaPage;
import aut.testcreation.pages.rumboesbracamontequezadapino.vuelosPages.VuelosPage;
import framework.engine.selenium.DriverFactory;
import framework.engine.selenium.SeleniumTestBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

public class VuelosTest extends SeleniumTestBase {
    WebDriver driver;
    HomePage homepage;
    VuelosPage vuelosPage;
    VuelosBusquedaPage vuelosBusquedaPage;

    @Test
    public void CP001_BusquedaVuelo_IdaYVuelta_MasBarato_OK(){
        homepage = new HomePage(DriverFactory.getDriver());
        vuelosPage= new VuelosPage(DriverFactory.getDriver());
        homepage.navigateTo("https://www.rumbo.es/");

    }


}
