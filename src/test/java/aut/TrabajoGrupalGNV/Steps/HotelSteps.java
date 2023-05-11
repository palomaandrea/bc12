package aut.TrabajoGrupalGNV.Steps;
import aut.TrabajoGrupalGNV.Pages.*;
import io.cucumber.java8.En;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HotelSteps implements En {
    WebDriver driver;

    public HotelSteps(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        PageHotel paginaHotel = new PageHotel(driver);
        HomePage rumbohome = new HomePage(driver);

        Given("se realizo la busqueda de hoteles", () -> {
            rumbohome.irapagina();
            paginaHotel.aceptar();
            paginaHotel.SeleccionarOpcionHoteles();
            paginaHotel.ingresDestino();
            paginaHotel.primeraOpcion();
            paginaHotel.seleccionFechaEntrada();
            paginaHotel.seleccionFechaSalida();
            paginaHotel.cantidadHuesped();
            paginaHotel.lupa();
            Thread.sleep(5000);
        });
        When("^se completa el formulario de busqueda h$", () -> {
            paginaHotel.ingresDestino();
            paginaHotel.primeraOpcion();
            paginaHotel.seleccionFechaEntrada();
            paginaHotel.seleccionFechaSalida();
            paginaHotel.cantidadHuesped();
        });
        And("^se presiona el boton de buscar h$", () -> {
            paginaHotel.lupa();
        });
        When("^no se completa el formulario de busqueda h$", () -> {
        });
        Then("^no se lleva a cabo la busqueda de hoteles$", () -> {
        });
        When("^se muestra la pagina de resultadosh$", () -> {

        });
        And("^se selecciona el filtro max de estrellas$", () -> {
            Thread.sleep(5000);
            paginaHotel.todosLosFiltros();
            Thread.sleep(5000);
            paginaHotel.cerrarfiltros();
        });
        And("^se selecciona el filtro min de estrellas$", () -> {
            Thread.sleep(5000);
            paginaHotel.todosLosFiltros();
            Thread.sleep(5000);
            paginaHotel.cerrarx2();
        });
        Given("^se selecciona un hotel$", () -> {
           rumbohome.irapagina();
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
        });
        When("^se muestra la pagina de pagos$", () -> {
          //  paginaHotel.seleccionreserva();
           // Thread.sleep(2000);
            paginaHotel.seleccionarbtncontinuar();
            Thread.sleep(2000);
        });
        Then("^no se puede llevar a cabo la compraf$", () -> {
            paginaHotel.seleccionarbtnreservaf();
            Thread.sleep(2000);
        });
        Given("^se encuentra en la seccion de hotel en la pagina Rumbo\\.es$", () -> {
           rumbohome.irapagina();
            paginaHotel.aceptar();
            paginaHotel.SeleccionarOpcionHoteles();
        });
        Then("^se selecciona un hotel h$", () -> {
            paginaHotel.seleccionhotel();
        });


    }




}
