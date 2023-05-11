package aut.TrabajoGrupalGNV.test;

import aut.TrabajoGrupalGNV.Pages.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.support.PageFactory;

public class TestdeVuelos {
    WebDriver driver;

    HomePage homepage;
    PageVuelos pageVuelos;

    @BeforeAll
    static void setupClass() {
        WebDriverManager.chromedriver().setup();
    }

    @BeforeEach
    void setupTest() {
        driver = new ChromeDriver();
        PageFactory.initElements(driver, this);
        driver.get("https://www.rumbo.es/");
        driver.manage().window().maximize();
    }


    @AfterEach
    void teardown() throws InterruptedException {
        driver.quit();
    }

    @Test
    void testbusquedadeboletosida() throws InterruptedException {

        homepage = new HomePage(driver);
        pageVuelos = new PageVuelos(driver);

        homepage.ApretarbtnAceptartodo();
        homepage.ApretarbtnIda();
        homepage.ColocarOrigen();
        homepage.ColocarDestino();
        homepage.ColocarFechaIda();
        homepage.ApretarBotonBusqueda();
        pageVuelos.presionarVueloSinEscalas();
    }

    @Test
    void testbusquedadeboletosconfechadelmismodia() throws InterruptedException {

        homepage = new HomePage(driver);
        pageVuelos = new PageVuelos(driver);

        homepage.ApretarbtnAceptartodo();
        homepage.ApretarbtnIda();
        homepage.ColocarOrigen();
        homepage.ColocarDestino();
        homepage.ColocarFechaIda();
        homepage.ApretarBotonBusqueda();
    }

    @Test
    void testbusquedavacia() throws InterruptedException {

        homepage = new HomePage(driver);
        pageVuelos = new PageVuelos(driver);

        homepage.ApretarbtnAceptartodo();
        homepage.ApretarbtnIda();
        homepage.ApretarBotonBusqueda();
        homepage.seVisualizaElError();
    }

    @Test
    void testbusquedavuelosinescala() throws InterruptedException {

        homepage = new HomePage(driver);
        pageVuelos = new PageVuelos(driver);

        homepage.ApretarbtnAceptartodo();
        homepage.ApretarbtnIda();
        homepage.ColocarOrigen();
        homepage.ColocarDestino();
        homepage.ColocarFechaIda();
        homepage.ApretarBotonBusqueda();

    }
    @Test
    void testbusquedadeboletomasbaratos() throws InterruptedException {

        homepage = new HomePage(driver);
        pageVuelos = new PageVuelos(driver);

        homepage.ApretarbtnAceptartodo();
        homepage.ApretarbtnIda();
        homepage.ColocarOrigen();
        homepage.ColocarDestino();
        homepage.ColocarFechaIda();
        homepage.ApretarBotonBusqueda();
        pageVuelos.PresionarMasBarato();
    }

    @Test
    void testbusquedadeboletomejoropcion() throws InterruptedException {

        homepage = new HomePage(driver);
        pageVuelos = new PageVuelos(driver);

        homepage.ApretarbtnAceptartodo();
        homepage.ApretarbtnIda();
        homepage.ColocarOrigen();
        homepage.ColocarDestino();
        homepage.ColocarFechaIda();
        homepage.ApretarBotonBusqueda();
        pageVuelos.PresionarElMejor();
    }


}
