package aut.testcreation.pages.rumboesabbaro.vuelosPages;

import framework.engine.selenium.SeleniumWrapper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class VuelosPage extends SeleniumWrapper {
    public VuelosPage(WebDriver driver) {
        super(driver);
    }

    By locatorSelectorSentidoViaje = By.xpath("//div[contains(text(),'Ida y vuelta')]");
    By locatorInputOrigen = By.xpath("//input[@label= 'Origen']");
    By locatorInputDestino = By.xpath("//input[@label= 'Destino']");
    By locatorSelectorFecha = By.xpath("//input[@class='d-aziqil']");
    By locatorSelectMes = By.xpath("");
    By locatorSelectIda = By.xpath("");
    By locatorSelectVuelta = By.xpath("");
    By locatorSelectorPasajeros = By.xpath("//span[@class='d-5n2gua']");
    By locatorSelectorMetodoPago = By.xpath("//span[@class='d-ocxq5f']");
    By locatorBtnBuscar = By.xpath("//button[@type='submit']");
    By locatorTxtEuropa = By.xpath("//h4[contains(text(),'Vuela a Europa')]");
}
