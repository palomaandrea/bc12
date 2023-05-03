package aut.testcreation.pages.rumboesabbaro;

import framework.engine.selenium.SeleniumWrapper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class VuelosPage extends SeleniumWrapper {
    public VuelosPage(WebDriver driver) {
        super(driver);
    }

    By locatorSelectorSentidoViaje = By.xpath("");
    By locatorTxtIda = By.xpath("");
    By locatorTxtvuelta = By.xpath("");
    By locatorSelectorFechaIda = By.xpath("");
    By locatorSelectorFechaVuelta = By.xpath("");
    By locatorSelectorPasajeros = By.xpath("");
    By locatorSelectorMetodoPago = By.xpath("");
    By locatorBtnBuscar = By.xpath("");
    By locatorTxtEuropa = By.xpath("");
}
