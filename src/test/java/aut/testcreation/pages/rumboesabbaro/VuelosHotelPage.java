package aut.testcreation.pages.rumboesabbaro;

import framework.engine.selenium.SeleniumWrapper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class VuelosHotelPage extends SeleniumWrapper {
    public VuelosHotelPage(WebDriver driver) {
        super(driver);
    }

    By locatorInputOrigen = By.xpath("//input[@label= 'Origen']");
    By locatorSelectorViajeros = By.xpath("//button[@class='css-1ug1iap-Dropdown-styled']");
    By locatorIncrementViajerosAdultos = By.xpath("//button[@label='Aumentar el número de adultos']");
    By locatorCBClase = By.xpath("//span[contains(text(),'Cualquier clase')]");
    By locatorSelectFecha = By.xpath("//button[@label='Fecha de ida']");
    By locatorSelectFechaIda = By.xpath("");
    By locatorSelectFechaVuelta = By.xpath("");
    By locatorBtnBuscar = By.xpath("//button[@type='submit']");
    By olcatorTxtServicios = By.xpath("//span[contains(text(),'Ver todos los servicios')]");
    By locatorTxtMapa = By.xpath("//button[contains(text(),'Ver mapa')]");
    By locatorBtnSalir = By.xpath("//svg[@role='button']");
    By locatorTxtComentarios = By.xpath("//span[contains(text(),'Ver todos los comentarios')]");
    By locatorBtnTodoIncluido = By.xpath("//button[contains(text(),'Todo incluido')]");
    By locatorTxtConTraslado = By.xpath("//span[contains(text(),'Traslado Incluido')]");
    By locatorBtnContinuar = By.xpath("//span[contains(text(),'Continuar')]");
}
