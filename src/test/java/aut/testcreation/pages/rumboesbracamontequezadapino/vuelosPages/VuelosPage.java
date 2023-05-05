package aut.testcreation.pages.rumboesbracamontequezadapino.vuelosPages;

import framework.engine.selenium.SeleniumWrapper;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import static org.openqa.selenium.Keys.ENTER;

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
    By locatorSelectorAnadirAdulto = By.xpath("");
    By locatorSelectorMetodoPago = By.xpath("//span[@class='d-ocxq5f']");
    By locatorSelectorPagoMastercard = By.xpath("//li[contains(text(),'Mastercard')]");
    By locatorSelectorPagoEconomico = By.xpath("//li[contains(text(),'económico')]");
    By locatorBtnBuscar = By.xpath("//button[@type='submit']");
    By locatorTxtEuropa = By.xpath("//h4[contains(text(),'Vuela a Europa')]");



    public void seleccionarSentidoViajeIdaYVuelta(){
        click(locatorSelectorSentidoViaje);
    }
    public void ingresarOrigen (String origen){
        write(origen, locatorInputOrigen);
        sendKeys(ENTER, locatorInputOrigen);
    }
    public void ingresarDestino (String destino){
        write(destino, locatorInputDestino);
        sendKeys(ENTER, locatorInputDestino);
    }

    public void seleccionarFecha (){
        click(locatorSelectorFecha);
        click(locatorSelectMes);
        click(locatorSelectIda);
        click(locatorSelectVuelta);
    }
    public void seleccionarAnadirPasajerosAdultos(){
        click(locatorSelectorPasajeros);
        click(locatorSelectorAnadirAdulto);
    }
    public void seleccionarMetodoPagoMastercard(){
        click(locatorSelectorMetodoPago);
        click(locatorSelectorPagoMastercard);
    }
    public void seleccionarMetodoPagoEconomico(){
        click(locatorSelectorMetodoPago);
        click(locatorSelectorPagoEconomico);
    }

    public  void buscarVuelo(){
        click(locatorBtnBuscar);
    }
    public void vuelaAEuropa(){
        scroll(findElement(locatorTxtEuropa));
        click(locatorTxtEuropa);
    }
}
