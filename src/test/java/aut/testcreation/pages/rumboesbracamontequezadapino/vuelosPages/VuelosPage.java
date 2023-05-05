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
    By locatorInputOrigen = By.xpath("//input[@aria-label= 'Origen']");
    By locatorInputDestino = By.xpath("//input[@aria-label= 'Destino']");
    By locatorSelectorFecha = By.xpath("//span[@class='d-aziqil']");
    By locatorSelectIda = By.xpath("//button[contains(text(), '17')]");
    By locatorSelectVuelta = By.xpath("//button[contains(text(), '24')]");
    By locatorSelectorPasajeros = By.xpath("//span[@class='d-5n2gua']");
    By locatorSelectorAnadirAdulto = By.xpath("//button[@aria-label='Aumentar el número de adultos']");
    By locatorSelectorMetodoPago = By.xpath("//span[@class='d-ocxq5f']");
    By locatorSelectorPagoMastercard = By.xpath("//li[contains(text(),'Mastercard')]");
    By locatorSelectorPagoEconomico = By.xpath("//li[contains(text(),'económico')]");
    By locatorBtnBuscar = By.xpath("//button[@aria-label='Buscar']");
    By locatorTxtEuropa = By.xpath("//h4[contains(text(),'Vuela a Europa')]");




    public void seleccionarSentidoViajeIdaYVuelta(){
        click(locatorSelectorSentidoViaje);
    }
    public void ingresarOrigen (String origen) throws InterruptedException {
        write(origen, locatorInputOrigen);
        Thread.sleep(1000);
        sendKeys (DOWN, locatorInputOrigen);
        Thread.sleep(1000);
        sendKeys(ENTER, locatorInputOrigen);
    }
    public void ingresarDestino (String destino) throws InterruptedException {
        write(destino, locatorInputDestino);
        Thread.sleep(1000);
        sendKeys(DOWN, locatorInputDestino);
        Thread.sleep(1000);
        sendKeys(ENTER, locatorInputDestino);
    }

    public void seleccionarFecha (){
        click(waitElement(locatorSelectIda));
        click(waitElement(locatorSelectVuelta));
    }
    public void seleccionarAnadirPasajerosAdultos(){
        click(waitElement(locatorSelectorAnadirAdulto));
    }
    public void seleccionarMetodoPagoMastercard(){
        click(locatorSelectorMetodoPago);
        click(locatorSelectorPagoMastercard);
    }
    public void seleccionarMetodoPagoEconomico(){
        click(locatorSelectorMetodoPago);
        click(locatorSelectorPagoEconomico);
    }
    public void vuelaAEuropa(){
        scroll(findElement(locatorTxtEuropa));
        click(locatorTxtEuropa);
    }
    public void buscarVuelo(){
        click(locatorBtnBuscar);
    }

}
