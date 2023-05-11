package aut.testcreation.testcases;

import aut.TrabajoGrupalGNV.Pages.HomePage;
import aut.TrabajoGrupalGNV.Pages.PageHotel;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class TestdeHotel {

    WebDriver driver;

    HomePage homepage;
    PageHotel pageHotel;

    protected PageHotel paginaHotel;

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
    public void Test() throws InterruptedException {
        paginaHotel = new PageHotel(driver);


        homepage = new HomePage(driver);

        paginaHotel.aceptar();
        paginaHotel.SeleccionarOpcionHoteles();
        paginaHotel.ingresDestino();
        paginaHotel.primeraOpcion();
        paginaHotel.seleccionFechaEntrada();
        paginaHotel.seleccionFechaSalida();
        paginaHotel.cantidadHuesped();
        paginaHotel.lupa();
        Thread.sleep(5000);
        paginaHotel.todosLosFiltros();
        Thread.sleep(5000);
        paginaHotel.cerrarfiltros();


    }

    //2 BusquedaHotel
    @Test
    public void tc_001_hoteles() throws InterruptedException {
        paginaHotel = new PageHotel(driver);


        homepage = new HomePage(driver);

        paginaHotel.aceptar();
        paginaHotel.SeleccionarOpcionHoteles();
        paginaHotel.ingresDestino();
        paginaHotel.primeraOpcion();
        paginaHotel.seleccionFechaEntrada();
        paginaHotel.seleccionFechaSalida();
        paginaHotel.cantidadHuesped();
        paginaHotel.lupa();
        Thread.sleep(5000);


    }

    //3 SeleccionHotel
    @Test
    public void tc_002_hoteles() throws InterruptedException {
        paginaHotel = new PageHotel(driver);
        homepage = new HomePage(driver);
        paginaHotel.aceptar();
        paginaHotel.SeleccionarOpcionHoteles();
        paginaHotel.ingresDestino();
        paginaHotel.primeraOpcion();
        paginaHotel.seleccionFechaEntrada();
        paginaHotel.seleccionFechaSalida();
        paginaHotel.cantidadHuesped();
        paginaHotel.lupa();
        Thread.sleep(5000);

        paginaHotel.seleccionhotel();

    }

    //4 FallaEnBusquedaHotel
    @Test
    public void tc_003_hoteles() throws InterruptedException {
        paginaHotel = new PageHotel(driver);
        homepage = new HomePage(driver);

        paginaHotel.aceptar();
        paginaHotel.SeleccionarOpcionHoteles();
        paginaHotel.errorBusqueda();
        paginaHotel.lupa();

    }

    // reserva
    @Test
    public void tc_004_hoteles() throws InterruptedException {
        paginaHotel = new PageHotel(driver);
        homepage = new HomePage(driver);

        paginaHotel.aceptar();
        paginaHotel.SeleccionarOpcionHoteles();
        paginaHotel.ingresDestino();
        paginaHotel.primeraOpcion();
        paginaHotel.seleccionFechaEntrada();
        paginaHotel.seleccionFechaSalida();
        paginaHotel.cantidadHuesped();
        paginaHotel.lupa();
        Thread.sleep(2000);
        paginaHotel.todosLosFiltros();
        Thread.sleep(2000);
        paginaHotel.cerrarfiltros();
        paginaHotel.seleccionhotel();
        Thread.sleep(2000);

        //paginaHotel.seleccionreserva();
        //Thread.sleep(2000);
        paginaHotel.seleccionarbtncontinuar();
        Thread.sleep(2000);
        paginaHotel.seleccionarbtnreservaf();
        Thread.sleep(2000);



    }

    //6 CantidadMaxima
    @Test
    public void tc_005_hoteles() throws InterruptedException {
        paginaHotel = new PageHotel(driver);
        homepage = new HomePage(driver);

        paginaHotel.aceptar();
        paginaHotel.SeleccionarOpcionHoteles();
        paginaHotel.ingresDestino();
        paginaHotel.primeraOpcion();
        paginaHotel.seleccionFechaEntrada();
        paginaHotel.seleccionFechaSalida();
        paginaHotel.cantidadHuesped();
        paginaHotel.lupa();
        Thread.sleep(5000);
        paginaHotel.todosLosFiltros();
        Thread.sleep(5000);
        paginaHotel.cerrarfiltros();


    }

    //7 CantidadMinima
    @Test
    public void tc_006_hoteles() throws InterruptedException {
        paginaHotel = new PageHotel(driver);
        homepage = new HomePage(driver);

        paginaHotel.aceptar();
        paginaHotel.SeleccionarOpcionHoteles();
        paginaHotel.ingresDestino();
        paginaHotel.primeraOpcion();
        paginaHotel.seleccionFechaEntrada();
        paginaHotel.seleccionFechaSalida();
        paginaHotel.cantidadHuesped();
        paginaHotel.lupa();
        Thread.sleep(5000);
        paginaHotel.todosLosFiltros();
        Thread.sleep(5000);
        paginaHotel.cerrarx2();



    }
}
