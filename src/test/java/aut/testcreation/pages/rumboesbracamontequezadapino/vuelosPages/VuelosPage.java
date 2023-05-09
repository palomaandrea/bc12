package aut.testcreation.pages.rumboesbracamontequezadapino.vuelosPages;

import framework.engine.selenium.SeleniumWrapper;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import static org.openqa.selenium.Keys.DOWN;
import static org.openqa.selenium.Keys.ENTER;

public class VuelosPage extends SeleniumWrapper {
    public VuelosPage(WebDriver driver) {
        super(driver);
    }

    By locatorSelectorSentidoViaje = By.xpath("//div[contains(text(),'Ida y vuelta')]");
    By locatorSelectorSentidoMulti = By.xpath("//a[contains(text(),'Multidestino')]");
    By locatorInputOrigen = By.xpath("//input[@aria-label= 'Origen']");
    By locatorInputDestino = By.xpath("//input[@aria-label= 'Destino']");
    By locatorSelectIda = By.xpath("//button[contains(text(), '17')]");
    By locatorSelectVuelta = By.xpath("//button[contains(text(), '24')]");
    By locatorSelectorAnadirAdulto = By.xpath("//button[@aria-label='Aumentar el número de adultos']");
    By locatorSelectorMetodoPago = By.xpath("//span[@class='d-ocxq5f']");
    By locatorSelectorPagoMastercard = By.xpath("//li[contains(text(),'Mastercard')]");
    By locatorSelectorPagoEconomico = By.xpath("//li[contains(text(),'económico')]");
    By locatorBtnBuscar = By.xpath("//button[@aria-label='Buscar']");
    By locatorTxtEuropa = By.xpath("//h4[contains(text(),'Vuela a Europa')]");
    By locatorTxtOfertaLondres = By.xpath("//h4[contains(text(),'Londres')]");


    public void viajeiIdaYVuelta(String origen, String destino) throws InterruptedException {
        click(waitElement(locatorSelectorSentidoViaje));
        write(origen, locatorInputOrigen);
        Thread.sleep(2000);
        sendKeys(ENTER, locatorInputOrigen);
        Thread.sleep(2000);
        write(destino, locatorInputDestino);
        Thread.sleep(2000);
        sendKeys(DOWN, locatorInputDestino);
        Thread.sleep(2000);
        sendKeys(ENTER, locatorInputDestino);
        click(waitElement(locatorSelectIda));
        click(waitElement(locatorSelectVuelta));
        click(waitElement(locatorSelectorAnadirAdulto));
    }

    public void seleccionarMetodoPagoMastercard() {
        click(locatorSelectorMetodoPago);
        click(locatorSelectorPagoMastercard);
    }

    public void seleccionarMetodoPagoEconomico() {
        click(locatorSelectorMetodoPago);
        click(locatorSelectorPagoEconomico);
    }

    public void vuelaAEuropa() {
        scroll(findElement(locatorTxtEuropa));
        click(waitElement(locatorTxtEuropa));
    }

    public void buscarVuelo() {
        click(locatorBtnBuscar);
    }

    public void ofertaLondres() {
        scroll(findElement(locatorTxtOfertaLondres));
        click(locatorTxtOfertaLondres);
    }

  public void IrAMultidestino (){
    click(locatorSelectorSentidoMulti);
  }

}
