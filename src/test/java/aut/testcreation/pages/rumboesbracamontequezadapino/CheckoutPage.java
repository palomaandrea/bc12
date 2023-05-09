package aut.testcreation.pages.rumboesbracamontequezadapino;

import framework.engine.selenium.SeleniumWrapper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

import static org.openqa.selenium.Keys.DOWN;

public class CheckoutPage extends SeleniumWrapper {
    public CheckoutPage(WebDriver driver) {
        super(driver);
    }

    By locatorTxtDetallesViaje = By.xpath("//button[@data-test='journey-details-link']");
    By locatorTxtAside = By.xpath("//div[@class='panel-footer journey__details-footer']");
    By locatorTxtDetallesMensaje = By.xpath("//span[contains(text(),'Detalles del viaje')]");
    By locatorNombreContacto= By.xpath("//input[@data-test='input-name']");
    By locatorApellidoContacto= By.xpath("//input[@data-test='input-surname']");
    By locatorEmailContacto= By.xpath("//input[@data-test='input-email']");
    By locatorMensajeEmailValido= By.xpath("//label[contains(text(),'Introduce un email válido')]");
    By locatorTelefonoContacto= By.xpath("//input[@data-test='input-phone']");
    By locatorPaisTelefonoContacto= By.xpath("//div[@class='selected-dial-code']");
    By locatorCheckBoxSrSra= By.xpath("//span[@class='check']"); //1 sr, 2sra, 3 sr, 4 sra, coche 5, sin seguro 8, enviame ofertas 10,
    By locatorNombreP1= By.xpath("//input[@data-test='input-groups.1.travellers.1.name']");
    By locatorApellidoP1= By.xpath("//input[@data-test='input-groups.1.travellers.1.surname']");
    By locatorDiaNAcP1= By.xpath("//input[@data-test='input-groups.1.travellers.1.dateOfBirth-day']");
    By locatorMesNAcP1= By.xpath("//select[@aria-label='Selecciona el mes']");
    By locatorAnnioNAcP1= By.xpath("//input[@data-test='input-groups.1.travellers.1.dateOfBirth-year']");
    By locatorTipoDocP1= By.xpath("//input[@aria-label='groups.1.travellers.1.documentType']");
    By locatorSelectTipoDocP1= By.xpath("//select[@aria-label='groups.1.travellers.1.documentType']");
    By locatorNroDocP1= By.xpath("//input[@data-test='input-groups.1.travellers.1.documentNumber']");

    By locatorNombreP2= By.xpath("//input[@data-test='input-groups.1.travellers.2.name']");
    By locatorApellidoP2= By.xpath("//input[@data-test='input-groups.1.travellers.2.surname']");
    By locatorDiaNAcP2= By.xpath("//input[@data-test='input-groups.1.travellers.2.dateOfBirth-day']");
    By locatorMesNAcP2= By.xpath("//select[@aria-label='Selecciona el mes']");
    By locatorAnnioNAcP2= By.xpath("//input[@data-test='input-groups.1.travellers.2.dateOfBirth-year']");
    By locatorTipoDocP2= By.xpath("//input[@aria-label='groups.1.travellers.2.documentType']");
    By locatorSelectTipoDocP2= By.xpath("//select[@aria-label='groups.1.travellers.2.documentType']");
    By locatorNroDocP2= By.xpath("//input[@data-test='input-groups.1.travellers.2.documentNumber']");
    By locatorAlquilerAuto= By.xpath("");
    By locatorSinSeguro= By.xpath("");
    By locatorRecibirOfertas=  By.xpath("");
    By locatorBtnSiguiente= By.xpath("//button[contains(text(),'Siguiente')]");
    By locatorError = By.xpath("//div[@class='CheckoutError___StyledDiv4-sc-vrmdfh-4 jIcyeg']");


    public void verDetallesViaje() throws InterruptedException {
        Thread.sleep(10000);
        scroll(findElement(locatorTxtAside));
        Thread.sleep(2000);
        click(locatorTxtDetallesViaje);
    }

    public String mensajeDetalleVuelo(){
        return getText(locatorTxtDetallesMensaje);
    }

    public void ingresaDatosContacto(String nombre, String apellido, String email, String numero){
        click(findElement(locatorNombreContacto));
        write(nombre, locatorNombreContacto);
        click(findElement(locatorApellidoContacto));
        write(apellido, locatorApellidoContacto);
        click(findElement(locatorEmailContacto));
        write(email, locatorEmailContacto);
        click(findElement(locatorTelefonoContacto));
        write(nombre, locatorTelefonoContacto);

    }
    public void seleccionaPaisTelefono(String codigo){
        click(findElement(locatorTelefonoContacto));
        write(codigo, locatorTelefonoContacto);

    }
    public void marcaCheckbox(int posicion) throws InterruptedException{
        List<WebElement> check =findElements(locatorCheckBoxSrSra);
        Thread.sleep(2000);
        scrolling(check.get(posicion));
        click(check.get(posicion));
    }

    public void datosPersona1(String nombre, String apellido, String dia, String mes, String annio){
        click(findElement(locatorNombreP1));
        write(nombre, locatorNombreP1);
        click(findElement(locatorApellidoP1));
        write(apellido, locatorApellidoP1);
        scrolling(findElement(locatorDiaNAcP1));
        click(findElement(locatorDiaNAcP1));
        write(dia, locatorDiaNAcP1);
        click(findElement(locatorAnnioNAcP1));
        write(annio, locatorAnnioNAcP1);
        click(findElement(locatorMesNAcP1));
        Select selectorMes = new Select(findElements(locatorMesNAcP1).get(0));
        selectorMes.selectByValue(mes);
    }

    public void datosDocumentoP1(String numeroDoc, String value) throws InterruptedException{
        click(findElement(locatorTipoDocP1));
        Thread.sleep(2000);
        write(value, locatorTipoDocP1);
        sendKeys (DOWN, locatorTipoDocP1);
        //Select selectorTipoDoc = new Select(findElement(locatorSelectTipoDocP1));
        //selectorTipoDoc.selectByValue(value);
        click(findElement(locatorNroDocP1));
        write(numeroDoc, locatorNroDocP1);
    }
    public void datosPersona2(String nombre, String apellido, String dia, String mes, String annio){
        scrolling(findElement(locatorNombreP2));
        click(findElement(locatorNombreP2));
        write(nombre, locatorNombreP2);
        click(findElement(locatorApellidoP2));
        write(apellido, locatorApellidoP2);
        scrolling(findElement(locatorDiaNAcP2));
        click(findElement(locatorDiaNAcP2));
        write(dia, locatorDiaNAcP2);
        click(findElement(locatorAnnioNAcP2));
        write(annio, locatorAnnioNAcP2);
        click(findElement(locatorMesNAcP2));
        Select selectorMes = new Select(findElements(locatorMesNAcP1).get(1));
        selectorMes.selectByValue(mes);
    }
    public void datosDocumentoP2(String numeroDoc, String value){
        scrolling(findElement(locatorTipoDocP2));
        click(findElement(locatorTipoDocP2));
        sendKeys (DOWN, locatorTipoDocP2);
        Select selectorTipoDoc = new Select(findElement(locatorSelectTipoDocP2));
        selectorTipoDoc.selectByValue(value);
        click(findElement(locatorNroDocP2));
        write(numeroDoc, locatorNroDocP2);
    }
    public void clickBtnSiguiente(){
        scrolling(findElement(locatorBtnSiguiente));
        click(findElement(locatorBtnSiguiente));
    }

    public String obtenerErrorCorreo(){
        return getText(locatorMensajeEmailValido);
    }

    public Boolean obtenerError(){
        findElements(locatorError);
        return isDisplayed(locatorError);
    }
    public String imprimirError() throws InterruptedException{
        scrolling(findElement(locatorError));
        Thread.sleep(3000);
        return getText(locatorError);
    }


}
