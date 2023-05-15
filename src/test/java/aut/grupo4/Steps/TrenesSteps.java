package aut.grupo4.Steps;
import aut.grupo4.Pages.*;
import io.cucumber.java8.En;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class TrenesSteps implements En{
    WebDriver driver;
    public TrenesSteps(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        HomePage RumboHomePage=new HomePage(driver);
        PageTrenes pagetrenes = new PageTrenes(driver);
        PagePasajes pagepasajes = new PagePasajes(driver);
        PageDatos pagedatos = new PageDatos(driver);



        Given("^se encuentra en la seccion de trenes en la pagina Rumbo\\.es$", () -> {
            RumboHomePage.irapagina();
            RumboHomePage.ApretarbtnAceptartodo();
            RumboHomePage.SeleccionarOpcionTrenes();
        });
        When("^se presiona el boton de solo ida$", () -> {
            pagetrenes.SeleccionarbtnIda();
        });
        And("^se completa el formulario de busqueda$", () -> {
            pagetrenes.escribirorigen();
            pagetrenes.seleccionardestino();
            pagetrenes.seleccionarFechadeIda();
        });
        And("^se presiona el boton de buscar$", () -> {
            pagetrenes.buscar();
        });
        When("^se presiona el boton de solo ida y vuelta$", () -> {
            pagetrenes.SeleccionarbtnIdayVuelta();
        });
        Then("^se muestra la pagina de resultados$", () -> {
            //se muestran los resultados
        });
        Given("^se realizo la busqueda de pasajes de tren$", () -> {
            RumboHomePage.irapagina();
            RumboHomePage.ApretarbtnAceptartodo();
            RumboHomePage.SeleccionarOpcionTrenes();
            pagetrenes.SeleccionarbtnIda();
            pagetrenes.escribirorigen();
            pagetrenes.seleccionardestino();
            pagetrenes.seleccionarFechadeIda();
            pagetrenes.buscar();
        });
        When("^se muestran las opciones$", () -> {
            //se muestran las opciones
        });
        And("^se presiona el boton de mas barato$", () -> {
            pagepasajes.seleccionarMasBarato();
        });
        And("^se presiona el boton de mas rapido$", () -> {
            pagepasajes.seleccionarMasRapido();
        });
        Given("^se selecciono un pasaje$", () -> {
            RumboHomePage.irapagina();
            RumboHomePage.ApretarbtnAceptartodo();
            RumboHomePage.SeleccionarOpcionTrenes();
            pagetrenes.SeleccionarbtnIda();
            pagetrenes.escribirorigen();
            pagetrenes.seleccionardestino();
            pagetrenes.seleccionarFechadeIda();
            pagetrenes.buscar();
            pagepasajes.seleccionarPasaje();
        });
        When("^se muestra la pagina de pago$", () -> {
            //se muestra la page pago
        });
        And("^se completan incorrectamente los datos$", () -> {
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
        });
        Then("^no se puede llevar a cabo la compra$", () -> {
            pagedatos.Siguiente();
        });
        When("se completan incorrectamente los datos de pago", () -> {
            //no se completa el formulario
        });
        And("^se completan incorrectamente los datos del pasajero$", () -> {
        });
        And("^se completa el formulario de busquedad$", () -> {
            pagetrenes.escribirorigen();
            pagetrenes.seleccionardestino();
            pagetrenes.seleccionarFechadeIda();
            pagetrenes.seleccionarFechaVuelta();
        });
    }
}
