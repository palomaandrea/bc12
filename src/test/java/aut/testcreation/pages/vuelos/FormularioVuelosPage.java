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
    By locatorTelefonoContacto = By.xpath("//input[@name='phone']");
    By checkBox = By.xpath("//span[@class= 'check']");
    By locatorPasajero = By.xpath("//span[@class= 'traveller-info__traveller-label-title']");
    By locatorDiaNacimientoPasajero = By.xpath("//input[@class='form-control text-input date__field date_day ']");
    By locatorMesNacimientoPasajero = By.xpath("//select[@class='form-control select-input date__field']");
    By locatorAnioNacimientoContacto = By.xpath("//input[@data-test='input-groups.1.travellers.1.dateOfBirth-year']");
    By locatorEquipaje = By.xpath("//div[@class= 'brb-main-title']");
    By btnSiguiente = By.xpath("//button[@data-test='lead-generation-submit-btn']");
    By locatorMsjeErrorAnnio = By.xpath("//div[contains(text(),'El adulto debe tener más de 12 años')]");
    By locatorBoxEquipaje = By.xpath("//div[@class='css-1akh2al']");


    public void llenarFormulario(String nombreContacto, String apellidoContacto, String emailContacto, String telefonoContacto, boolean deseaSerLlamadoSr, String dia, String annio) {
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
        if (deseaSerLlamadoSr) {
            checks.get(0).click();
        } else {
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

    public void formularioLatam(String nombreContacto, String apellidoContacto, String emailContacto, String telefonoContacto, boolean deseaSerLlamadoSr, boolean deseaLaMejorOfertaEquipaje, boolean deseaProtegerSuEquipaje, boolean deseaAsistenciaEspecial, String dia, String annio) {
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
        if (deseaSerLlamadoSr) {
            checks.get(1).click();
        } else {
            checks.get(2).click();
        }
        scrolling(locatorBoxEquipaje);
        if (deseaLaMejorOfertaEquipaje) {
            checks.get(3).click();
        } else {
            checks.get(4).click();
        }
        scrolling(btnSiguiente);
        if (deseaProtegerSuEquipaje) {
            checks.get(5).click();
        }
        if (deseaAsistenciaEspecial) {
            checks.get(6).click();
        }
        scrolling(locatorDiaNacimientoPasajero);
        click(locatorDiaNacimientoPasajero);
        write(dia, locatorDiaNacimientoPasajero);
        seleccionarComboBoxPorTextoVisible(locatorMesNacimientoPasajero, "enero");
        write(annio, locatorAnioNacimientoContacto);
        scrolling(btnSiguiente);
        click(btnSiguiente);
    }

    public String mensajeErrorAnnioEncontrado() {
        return getText(locatorMsjeErrorAnnio);
    }

}




