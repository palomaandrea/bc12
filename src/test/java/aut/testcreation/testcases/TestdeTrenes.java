package aut.testcreation.testcases;

import aut.TrabajoGrupalGNV.Pages.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;


public class TestdeTrenes {
    WebDriver driver;

    HomePage homepage;
    PagePasajes pagepasajes;
    PageTrenes pagetrenes;
    PageDatos pagedatos;
    PageCompra pagecompra;

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
        // driver.quit();
    }

    @Test
    void testbusquedadeboletosida() throws InterruptedException {

        homepage= new HomePage(driver);
        pagepasajes= new PagePasajes(driver);
        pagetrenes= new PageTrenes(driver);
        pagedatos= new PageDatos(driver);
        pagecompra= new PageCompra(driver);

        homepage.ApretarbtnAceptartodo();
        homepage.SeleccionarOpcionTrenes();
        pagetrenes.SeleccionarbtnIda();
        pagetrenes.escribirorigen();
        pagetrenes.seleccionardestino();
        pagetrenes.seleccionarFechadeIda();
        pagetrenes.buscar();

    }
    @Test
    void testbusquedadeboletosidayvuelta() throws InterruptedException {

        homepage= new HomePage(driver);
        pagepasajes= new PagePasajes(driver);
        pagetrenes= new PageTrenes(driver);
        pagedatos= new PageDatos(driver);
        pagecompra= new PageCompra(driver);

        homepage.ApretarbtnAceptartodo();
        homepage.SeleccionarOpcionTrenes();
        pagetrenes.SeleccionarbtnIdayVuelta();
        pagetrenes.escribirorigen();
        pagetrenes.seleccionardestino();
        pagetrenes.seleccionarFechadeIda();
        pagetrenes.seleccionarFechaVuelta();
        pagetrenes.buscar();

    }
    @Test
    void testbusquedadeboletosmasbaratos() throws InterruptedException {

        homepage= new HomePage(driver);
        pagepasajes= new PagePasajes(driver);
        pagetrenes= new PageTrenes(driver);
        pagedatos= new PageDatos(driver);
        pagecompra= new PageCompra(driver);

        homepage.ApretarbtnAceptartodo();
        homepage.SeleccionarOpcionTrenes();
        pagetrenes.SeleccionarbtnIda();
        pagetrenes.escribirorigen();
        pagetrenes.seleccionardestino();
        pagetrenes.seleccionarFechadeIda();
        pagetrenes.buscar();
        pagepasajes.seleccionarMasBarato();


    }
    @Test
    void testbusquedadeboletosmasrapidos() throws InterruptedException {

        homepage= new HomePage(driver);
        pagepasajes= new PagePasajes(driver);
        pagetrenes= new PageTrenes(driver);
        pagedatos= new PageDatos(driver);
        pagecompra= new PageCompra(driver);

        homepage.ApretarbtnAceptartodo();
        homepage.SeleccionarOpcionTrenes();
        pagetrenes.SeleccionarbtnIda();
        pagetrenes.escribirorigen();
        pagetrenes.seleccionardestino();
        pagetrenes.seleccionarFechadeIda();
        pagetrenes.buscar();
        pagepasajes.seleccionarMasRapido();


    }
    @Test
    void testerrordepago() throws InterruptedException {

        homepage= new HomePage(driver);
        pagepasajes= new PagePasajes(driver);
        pagetrenes= new PageTrenes(driver);
        pagedatos= new PageDatos(driver);
        pagecompra= new PageCompra(driver);

        homepage.ApretarbtnAceptartodo();
        homepage.SeleccionarOpcionTrenes();
        pagetrenes.SeleccionarbtnIda();
        pagetrenes.escribirorigen();
        pagetrenes.seleccionardestino();
        pagetrenes.seleccionarFechadeIda();
        pagetrenes.buscar();
        pagepasajes.seleccionarPasaje();
        pagedatos.datoNombre();
        pagedatos.datoApellido();
        pagedatos.datoMail();
        pagedatos.datoTelefono();
        pagedatos.seleccionarGenero();
        pagedatos.datoNombrePasajero();
        pagedatos.datoApellidoPasajero();
        pagedatos.datoDiaNacimiento();
        pagedatos.datoMesNacimiento();
        pagedatos.datoAnioNacimiento();
        pagedatos.datoPasaporte();
        pagedatos.Siguiente();

    }
    @Test
    void testbusquedafallidadeboletos() throws InterruptedException {

        homepage= new HomePage(driver);
        pagepasajes= new PagePasajes(driver);
        pagetrenes= new PageTrenes(driver);
        pagedatos= new PageDatos(driver);
        pagecompra= new PageCompra(driver);

        homepage.ApretarbtnAceptartodo();
        homepage.SeleccionarOpcionTrenes();
        pagetrenes.SeleccionarbtnIda();
        pagetrenes.buscar();



    }



}
