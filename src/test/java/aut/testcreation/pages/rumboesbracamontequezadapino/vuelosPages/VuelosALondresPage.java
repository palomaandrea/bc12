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
    By locatorCKOrigen = By.xpath("//header/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]");
    By locatorInputOrigen = By.xpath("//input[@type='text']");
    By locatorInputDestino = By.xpath("//input[@id='input-qfgqh']");
    By locatorTxtCalendario = By.xpath("//header/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]");
    By locatorSelectIda = By.xpath("//header/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[11]");
    By locatorSelectVuelta = By.xpath("//header/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[18]");
    By locatorTxtPasajeros = By.xpath("//div[@class='passengersText lmn-sw-responsive-form-field lmn-sw-tooltip-responsive__text']");
    By locatorSelectorAnadirPasajero = By.xpath("//div[@class='lmn-sw-selectionControls__control lmn-sw-selectionControls__control-plus']");
    By locatorSelectClase = By.xpath("//span[@class='icon icon-seat icon--filled']");
    By locatorSelectClaseTurista = By.xpath("//div[@data-value='P']");
    By locatorBtnBuscar = By.xpath("//div[contains(text(),'Buscar')]");

    public void viajeALondres(String origen) throws InterruptedException{
        Thread.sleep(2000);
        click(waitElement(locatorSelectorSentidoViaje));
        click(waitElement(locatorCKOrigen));
        Thread.sleep(2000);
        write(origen,locatorInputOrigen);
        Thread.sleep(2000);
        sendKeys (DOWN, locatorInputOrigen);
        Thread.sleep(2000);
        sendKeys(ENTER, locatorInputOrigen);
        Thread.sleep(2000);
        sendKeys(ENTER, locatorInputOrigen);
        Thread.sleep(2000);
        click(waitElement(locatorTxtCalendario));
        click(waitElement(locatorSelectIda));
        click(waitElement(locatorSelectVuelta));
        //click(waitElement(locatorTxtPasajeros));
        //click(waitElement(locatorSelectorAnadirPasajero));
        //click(waitElement(locatorSelectClase));
        //click(waitElement(locatorSelectClaseTurista));
        click(waitElement(locatorBtnBuscar));
    }
}
