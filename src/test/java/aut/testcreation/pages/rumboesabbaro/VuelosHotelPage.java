package aut.testcreation.pages.rumboesabbaro;

import framework.engine.selenium.SeleniumWrapper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class VuelosHotelPage extends SeleniumWrapper {
    public VuelosHotelPage(WebDriver driver) {
        super(driver);
    }

    By locatorInputOrigen = By.xpath("");
    By locatorIncrementViajerosAdultos = By.xpath("");
    By locatorCBClase = By.xpath("");
    By locatorSelectFecha = By.xpath("");
    By locatorSelectFechaIda = By.xpath("");
    By locatorSelectFechaVuelta = By.xpath("");
    By locatorBtnBuscar = By.xpath("");
    By olcatorTxtServicios = By.xpath("");
    By locatorTxtMapa = By.xpath("");
    By locatorBtnSalir = By.xpath("");
    By locatorTxtComentarios = By.xpath("");
    By locatorTxtServiciosIncluidos = By.xpath("");
    By locatorBtnContinuar = By.xpath("");
}
