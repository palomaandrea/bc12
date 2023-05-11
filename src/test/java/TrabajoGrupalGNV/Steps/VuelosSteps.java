package TrabajoGrupalGNV.Steps;
import TrabajoGrupalGNV.Pages.*;
import io.cucumber.java8.En;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VuelosSteps implements En {
    WebDriver driver;

    public VuelosSteps() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();

    HomePage RumboHomePage=new HomePage(driver);
    PageVuelos pagevuelos= new PageVuelos(driver);

    Given("se encuentra en la seccion de vuelos en la pagina Rumbo.es", () -> {
        RumboHomePage.irapagina();
        RumboHomePage.ApretarbtnAceptartodo();

    });
        And("^se completa el formulario de busqueda con la fecha actual$", () -> {
            RumboHomePage.ColocarOrigen();
            RumboHomePage.ColocarDestino();
            RumboHomePage.ColocarFechaIda();
        });
        And("^no se completa el formulario de busqueda$", () -> {
            //no se completa el formulario
        });
        Then("^no se lleva a cabo la busqueda de pasajes$", () -> {
            //no se lleva a cabo la buqueda
        });
        Given("^se realizo la busqueda de pasajes avion$", () -> {
            RumboHomePage.irapagina();
            RumboHomePage.ApretarbtnAceptartodo();
            RumboHomePage.ApretarbtnIda();
            RumboHomePage.ColocarOrigen();
            RumboHomePage.ColocarDestino();
            RumboHomePage.ColocarFechaIda();
            RumboHomePage.ApretarBotonBusqueda();
        });
        And("^se presiona el boton de mejor opcion$", () -> {
            pagevuelos.PresionarElMejor();
        });
        And("^se presiona el boton de sin escalas$", () -> {
            pagevuelos.presionarVueloSinEscalas();
        });
        When("^se presiona el boton de solo ida vuelos$", () -> {
           RumboHomePage.ApretarbtnIda();
        });
        And("^se completa el formulario de busqueda vuelo$", () -> {
            RumboHomePage.ColocarOrigen();
            RumboHomePage.ColocarDestino();
            RumboHomePage.ColocarFechaIda();
        });
        And("^se presiona el boton de buscar vuelo$", () -> {
            RumboHomePage.ApretarBotonBusqueda();
        });
        And("^se presiona el boton de mas barato vuelo$", () -> {
            pagevuelos.PresionarMasBarato();
        });


    }}
