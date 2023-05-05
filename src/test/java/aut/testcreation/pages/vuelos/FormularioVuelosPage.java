package aut.testcreation.pages.vuelos;

import framework.engine.selenium.SeleniumWrapper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

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
    By checkBox = By.xpath("//span[@class= 'check']");
    By locatorPasajero = By.xpath("//span[@class= 'traveller-info__traveller-label-title']");
    By locatorDiaNacimientoPasajero = By.xpath("//input[@class='form-control text-input date__field date_day ']");
    By locatorMesNacimientoPasajero = By.xpath("//select[@class='form-control select-input date__field']");
    By locatorAnioNacimientoContacto = By.xpath("//input[@data-test='input-groups.1.travellers.1.dateOfBirth-year']");
    By locatorEquipaje = By.xpath("//div[@class= 'brb-main-title']");
    By btnSiguiente = By.xpath("//button[@data-test='lead-generation-submit-btn']");
    By locatorMsjeErrorAnnio = By.xpath("//div[contains(text(),'El adulto debe tener más de 12 años')]");

    public void llenarFormulario(String nombreContacto, String apellidoContacto, String emailContacto, String telefonoContacto, boolean sr, boolean sra, String dia, String annio) {

        click(locatorNombreContacto);
        write(nombreContacto, locatorNombreContacto);
        sendKeys(TAB, locatorNombreContacto);
        write(apellidoContacto, locatorApellidoContacto);
        sendKeys(TAB, locatorApellidoContacto);
        write(emailContacto, locatorEmailContacto);
        click(locatorTelefonoContacto);
        write(telefonoContacto, locatorTelefonoContacto);
        scrolling(locatorPasajero);
        List<WebElement> checks = findElements(checkBox);
        if (sr) {
            checks.get(0).click();
        }
        if (sra) {
            checks.get(1).click();
        }
        scrolling(locatorDiaNacimientoPasajero);
        click(locatorDiaNacimientoPasajero);
        write(dia, locatorDiaNacimientoPasajero);
        seleccionarComboBoxPorTextoVisible(locatorMesNacimientoPasajero, "enero");
        write(annio, locatorAnioNacimientoContacto);
        scrolling(locatorEquipaje);
        click(btnSiguiente);

    }

    public String mensajeErrorAnnioEncontrado() {
        return getText(locatorMsjeErrorAnnio);
    }
}


