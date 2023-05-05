package aut.testcreation.testcases.rumboesbracamontequezadapino;

import aut.testcreation.pages.rumboesbracamontequezadapino.HomePage;
import aut.testcreation.pages.rumboesbracamontequezadapino.TrenesPages.TrenesPage;
import framework.engine.selenium.DriverFactory;
import framework.engine.selenium.SeleniumTestBase;
import framework.engine.selenium.SeleniumWrapper;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import static framework.engine.utils.Constants.BASE_URL_AUT;

public class TestBusquedaTren extends SeleniumTestBase {

    WebDriver driver;

    TrenesPage trenesPage;

    HomePage homePage;

    @Test
    public void CP013_ViajeTren_Oferta_SinDisponibilidad() throws InterruptedException{
        driver = DriverFactory.getDriver();
        homePage= new HomePage(DriverFactory.getDriver());
        trenesPage=new TrenesPage(DriverFactory.getDriver());
        driver.navigate().to("https://www.rumbo.es/");
        Thread.sleep(3000);
        homePage.cerrarCookis();
        homePage.irATrenes();
        trenesPage.bajarAOfertas();
        trenesPage.ofertaMadridSevilla();
        Thread.sleep(3000);
        trenesPage.moverseALaSegundaPestaña();
        Assertions.assertEquals(trenesPage.obtenerMensajeSinDispo(), "No hemos encontrado ninguna oferta que se ajuste a los criterios de búsqueda, probablemente por falta de disponibilidad en fechas o destino. Por favor, vuelve a intentarlo seleccionando una fecha diferente.");
        Thread.sleep(3000);
    }
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
        trenesPage.escribirDestino("Barcelona");
        trenesPage.fechaIda();
        trenesPage.sendKeys(Keys.ENTER);
        trenesPage.clickEnBuscar();
        Thread.sleep(5000);
    }

}
