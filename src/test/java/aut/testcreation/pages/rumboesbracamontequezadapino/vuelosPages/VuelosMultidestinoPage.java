package aut.testcreation.pages.rumboesbracamontequezadapino.vuelosPages;

import framework.engine.selenium.SeleniumWrapper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class VuelosMultidestinoPage extends SeleniumWrapper {
    public VuelosMultidestinoPage(WebDriver driver) {
        super(driver);
    }

    By locatorInputPrimerDestino = By.xpath("");
    By locatorInputPrimerOrigen = By.xpath("");
    By locatorInputSegundoDestino = By.xpath("");
    By locatorInputSegundoOrigen = By.xpath("");
    By locatorInputTercerDestino = By.xpath("");
    By locatorSelectPrimeraSalida = By.xpath("");
    By locatorSelectSegundaSalida = By.xpath("");
    By locatorSelectTerceraSalida = By.xpath("");
    By locatorSelectTramosFechas = By.xpath("");
    By locatorBtnBuscar = By.xpath("");
    By locatorTxtPasajeros = By.xpath("");
    By locatorSelectAdultos = By.xpath("");
    By locatorSelectEquipajeMano = By.xpath("");
    By locatorSelectEquipajeFacturado = By.xpath("");
    By locatorBtnConfirmar = By.xpath("");
    By locatorTxtFiltros = By.xpath("");
    By locatorCBEscalas = By.xpath("");
    By locatorBtnReservar = By.xpath("");
}
