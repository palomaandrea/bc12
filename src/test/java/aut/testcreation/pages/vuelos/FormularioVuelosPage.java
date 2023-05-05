package aut.testcreation.pages.vuelos;

import framework.engine.selenium.SeleniumWrapper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

import static framework.engine.utils.Constants.BASE_URL_AUT;
import static org.openqa.selenium.Keys.TAB;

public class FormularioVuelosPage extends SeleniumWrapper {
    public FormularioVuelosPage(WebDriver driver) {
        super(driver);
    }

    By locatorNombreContacto = By.xpath("//input[@name='name']");
    By locatorApellidoContacto = By.xpath("//input[@name='surname']");
    By locatorEmailContacto = By.xpath("//input[@id='contact-email']");
    //By locatorCodAreaContacto = By.xpath("//div[@class='selected-dial-code']");
    By locatorTelefonoContacto = By.xpath("//input[@name='phone']");
    By checkBox = By.xpath("//div[@class='radio-group-choices traveller-info__title-choices']");
    By locatorDiaNacimientoPasajero = By.xpath("//input[@class='form-control text-input date__field date_day ']");
    By locatorMesNacimientoPasajero = By.xpath("//select[@class='form-control select-input date__field']");
    By locatorAnioNacimientoContacto = By.xpath("//input[@data-test='input-groups.1.travellers.1.dateOfBirth-year']");
    By btnSiguiente = By.xpath("//button[@data-test='lead-generation-submit-btn']");

    //borrar de aqui
    By btnAceptarCoockies = By.xpath("//button[@class='iubenda-cs-accept-btn iubenda-cs-btn-primary']");
    By elegirTarifaClassic = By.xpath("//button[@class='Button-sc-1bbve8d-0 gzlNtv']");
    //hasta aqui

    public void llenarFormulario(String nombreContacto, String apellidoContacto, String emailContacto, String telefonoContacto, boolean sr, boolean sra, String dia, String annio) {
        //borrar de aqui
        navigateTo("https://secure.rumbo.es/hdp/checkout/carts/B954FF19B4EFEFCB6B04F6A606D21CB8064DA804");
        click(btnAceptarCoockies);
        scrolling(elegirTarifaClassic);
        click(elegirTarifaClassic);
        //hasta aqui

        click(locatorNombreContacto);
        write(nombreContacto, locatorNombreContacto);
        sendKeys(TAB, locatorNombreContacto);
        write(apellidoContacto, locatorApellidoContacto);
        sendKeys(TAB, locatorApellidoContacto);
        write(emailContacto, locatorEmailContacto);
        click(locatorTelefonoContacto);
        write(telefonoContacto, locatorTelefonoContacto);
        List <WebElement> checks = findElements(checkBox);
        if (sr){
            checks.get(0).click();
        }
        if (sra){
            checks.get(1).click();
        }
        scrolling(locatorDiaNacimientoPasajero);
        click(locatorDiaNacimientoPasajero);
        write(dia,locatorDiaNacimientoPasajero);
        seleccionarComboBoxPorTextoVisible(locatorMesNacimientoPasajero,"Marzo");
        write(annio, locatorAnioNacimientoContacto);
        scrolling(btnSiguiente);
        click(btnSiguiente);
    }

}
