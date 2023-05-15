package aut.grupo5.pages.vuelos;

import framework.engine.selenium.SeleniumWrapper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;
import static org.openqa.selenium.Keys.*;

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
    By locatorNombreSegundoPasajero = By.xpath("//input[@name='groups.1.travellers.2.name']");
    By locatorApellidoSegundoPasajero = By.xpath("//input[@data-test='input-groups.1.travellers.2.surname']");
    By locatorDiaNacSegundoPasajero = By.xpath("//input[@data-test='input-groups.1.travellers.2.dateOfBirth-day']");
    By locatorAnnioNacSegundoPasajero = By.xpath("//input[@data-test='input-groups.1.travellers.2.dateOfBirth-year']");

    public void datosPrincipalesContacto(String nombreContacto, String apellidoContacto, String emailContacto, String telefonoContacto) {
        click(locatorNombreContacto);
        write(nombreContacto, locatorNombreContacto);
        sendKeys(TAB, locatorNombreContacto);
        write(apellidoContacto, locatorApellidoContacto);
        sendKeys(TAB, locatorApellidoContacto);
        write(emailContacto, locatorEmailContacto);
        click(locatorTelefonoContacto);
        write(telefonoContacto, locatorTelefonoContacto);
    }

    public void preguntarSaludoAContacto(boolean deseaSerLlamadoSr) {
        scrolling(locatorPasajero);
        List<WebElement> checks = findElements(checkBox);
        if (deseaSerLlamadoSr) {
            checks.get(1).click();
        } else {
            checks.get(2).click();
        }
    }

    public void fechaNacimientoContacto(String dia, String annio) {
        scrolling(locatorDiaNacimientoPasajero);
        click(locatorDiaNacimientoPasajero);
        write(dia, locatorDiaNacimientoPasajero);
        seleccionarComboBoxPorTextoVisible(locatorMesNacimientoPasajero, "julio");
        write(annio, locatorAnioNacimientoContacto);
    }

    public void preguntarSaludoASgdoPasajero(boolean sgdoPasajeroDeseaSerLlamadoSr) {
        List<WebElement> checks = findElements(checkBox);
        if (sgdoPasajeroDeseaSerLlamadoSr) {
            checks.get(3).click();
        } else {
            checks.get(4).click();
        }
    }

    public void datosSegundoPasajero(String nombreSgdoPasajero, String apellidoSgdoPasajero, String diaNacimientoSgdoPasajero, String annioNacimientoSgdoPasajero) throws InterruptedException {
        click(locatorNombreSegundoPasajero);
        write(nombreSgdoPasajero, locatorNombreSegundoPasajero);
        click(locatorApellidoSegundoPasajero);
        write(apellidoSgdoPasajero, locatorApellidoSegundoPasajero);
        Thread.sleep(5000);
        click(locatorDiaNacSegundoPasajero);
        write(diaNacimientoSgdoPasajero, locatorDiaNacSegundoPasajero);
        List<WebElement> mesNacimientoPasajero = findElements(locatorMesNacimientoPasajero);
        WebElement pasajero2 = mesNacimientoPasajero.get(1); //Se que esta muy mal esta parte, pero seguire averiguando como mejorarla
        pasajero2.click();
        pasajero2.sendKeys(DOWN);
        pasajero2.sendKeys(DOWN);
        pasajero2.sendKeys(ENTER);
        click(locatorAnnioNacSegundoPasajero);
        write(annioNacimientoSgdoPasajero, locatorAnnioNacSegundoPasajero);
    }

    public void checksFinales(boolean deseaProtegerSuEquipaje, boolean deseaAsistenciaEspecial) {
        List<WebElement> checks = findElements(checkBox);
        scrolling(btnSiguiente);
        if (deseaProtegerSuEquipaje) {
            checks.get(3).click();
        }
        if (deseaAsistenciaEspecial) {
            checks.get(4).click();
        }
    }

    public void checksFormularioLatam(boolean deseaLaMejorOfertaEquipaje, boolean deseaProtegerSuEquipaje, boolean deseaAsistenciaEspecial) {
        scrolling(locatorBoxEquipaje);
        List<WebElement> checks = findElements(checkBox);
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
    }

    public void bajarYPresionarEnSgte() {
        scrolling(locatorEquipaje);
        click(btnSiguiente);
    }

    public String mensajeErrorAnnioEncontrado() {
        return getText(locatorMsjeErrorAnnio);
    }
}




