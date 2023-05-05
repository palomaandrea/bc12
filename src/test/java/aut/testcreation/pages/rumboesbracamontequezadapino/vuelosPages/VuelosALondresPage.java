package aut.testcreation.pages.rumboesbracamontequezadapino.vuelosPages;

import framework.engine.selenium.SeleniumWrapper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.openqa.selenium.Keys.DOWN;
import static org.openqa.selenium.Keys.ENTER;

public class VuelosALondresPage extends SeleniumWrapper {
    public VuelosALondresPage(WebDriver driver) {
        super(driver);
    }
    By locatorSelectorSentidoViaje = By.xpath("//div[contains(text(),'Ida y vuelta')]");
    By locatorInputOrigen = By.xpath("//input[@value placeholder= 'Ciudad o aeropuerto']");
    By locatorTxtCalendario = By.xpath("//span[@class='lmn-sw-form-responsive--no-right-icon']");
    By locatorSelectIda = By.xpath("//div[@data-date='17-4-2023']");
    By locatorSelectVuelta = By.xpath("//div[@data-date='24-4-2023']");
    By locatorTxtPasajeros = By.xpath("//span[@class='icon icon-adult icon--filled']");
    By locatorSelectorAnadirPasajero = By.xpath("//div[@class='lmn-sw-selectionControls__control lmn-sw-selectionControls__control-plus']");
    By locatorSelectClase = By.xpath("//span[@class='icon icon-seat icon--filled']");
    By locatorSelectClaseTurista = By.xpath("//div[@data-value='P']");
    By locatorBtnBuscar = By.xpath("//div[contains(text(),'Buscar')]");

    public void viajeALondres(String origen) throws InterruptedException{
        Thread.sleep(2000);
        click(locatorSelectorSentidoViaje);
        click(locatorInputOrigen);
        Thread.sleep(2000);
        write(origen,locatorInputOrigen);
        Thread.sleep(2000);
        sendKeys (DOWN, locatorInputOrigen);
        Thread.sleep(2000);
        sendKeys(ENTER, locatorInputOrigen);
        click(locatorTxtCalendario);
        click(locatorSelectIda);
        click(locatorSelectVuelta);
        click(locatorTxtPasajeros);
        click(locatorSelectorAnadirPasajero);
        click(locatorSelectClase);
        click(locatorSelectClaseTurista);
        click(locatorBtnBuscar);
    }
}
