package aut.testcreation.pages.rumboesbracamontequezadapino.vuelosPages;

import framework.engine.selenium.SeleniumWrapper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

import static org.openqa.selenium.Keys.DOWN;
import static org.openqa.selenium.Keys.ENTER;

public class VuelosHotelPage extends SeleniumWrapper {
    public VuelosHotelPage(WebDriver driver) {
        super(driver);
    }

    By locatorClear = By.xpath("//button[@aria-label='Clear']");
    By locatorInputOrigen = By.xpath("//input[@aria-label='Origen']");
    By locatorDecrementViajerosAdultos = By.xpath("//button[@aria-label='Reducir el número de adultos']");
    By locatorIncrementViajerosAdultos = By.xpath("//button[@aria-label='Aumentar el número de adultos']");
    By locatorCBClase = By.xpath("//span[contains(text(),'Cualquier clase')]");
    By locatorCBBusiness = By.xpath("//div[@role='option')]");
    By locatorSelectFecha = By.xpath("//button[@aria-label='Fecha de ida']");
    By locatorSelectFechaIda = By.xpath("//button[contains(text(),'17')]");
    By locatorSelectFechaVuelta = By.xpath("//button[contains(text(),'24')]");
    By locatorBtnBuscar = By.xpath("//button[@type='submit']");
    By olcatorTxtServicios = By.xpath("//span[contains(text(),'Ver todos los servicios')]");
    By locatorTxtMapa = By.xpath("//button[contains(text(),'Ver mapa')]");
    By locatorBtnSalir = By.xpath("//svg[@role='button']");
    By locatorTxtComentarios = By.xpath("//span[contains(text(),'Ver todos los comentarios')]");
    By locatorBtnTodoIncluido = By.xpath("//button[contains(text(),'Todo incluido')]");
    By locatorTxtConTraslado = By.xpath("//span[contains(text(),'Traslado Incluido')]");
    By locatorBtnContinuar = By.xpath("//span[contains(text(),'Continuar')]");

    public void ingresarorigen(String origen) throws InterruptedException {
        if (isEnabled(locatorClear)) {
            click(locatorClear);
            Thread.sleep(2000);
            write(origen, locatorInputOrigen);
            Thread.sleep(1000);
            sendKeys(DOWN, locatorInputOrigen);
            Thread.sleep(1000);
            sendKeys(ENTER, locatorInputOrigen);
        }
    }
    public void seleccionarFechaIdaYVuelta() throws InterruptedException{
        click(locatorSelectFecha);
        Thread.sleep(1000);
        click(locatorSelectFechaIda);
        Thread.sleep(1000);
        click(locatorSelectFechaVuelta);
    }
    public void numeroDeAdultos() throws InterruptedException{
        Thread.sleep(1000);
        click(locatorDecrementViajerosAdultos);
        Thread.sleep(1000);
        click(locatorIncrementViajerosAdultos);
    }

    public void claseBusiness(){
        click(locatorCBClase);
        List<WebElement> clases = findElements(locatorCBBusiness);
        click(clases.get(3));
        click(locatorBtnBuscar);
    }
}


