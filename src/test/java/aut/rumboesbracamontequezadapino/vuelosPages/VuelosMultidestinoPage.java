package aut.rumboesbracamontequezadapino.vuelosPages;

import framework.engine.selenium.SeleniumWrapper;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

import static org.openqa.selenium.Keys.ENTER;

public class VuelosMultidestinoPage extends SeleniumWrapper {
    public VuelosMultidestinoPage(WebDriver driver) {
        super(driver);
    }

    By locatorBtnlimpiar = By.xpath("//div[@class='ButtonPrimitiveContentChildren__StyledButtonPrimitiveContentChildren-sc-mra4yy-0 NRXsW'][contains(text(),'Borrar todos')]");
    By locatorAnadirDestino = By.xpath("//div[contains(text(),'Añadir destino')]");
    By locatorInputs = By.xpath("//input[@class='SearchFieldstyled__SearchFieldInput-sc-1f3jsso-5 jYLahH']");
    By locatorBtnBuscar = By.xpath("//div[@class='ButtonPrimitiveContentChildren__StyledButtonPrimitiveContentChildren-sc-mra4yy-0 dLfJcB'] [contains(text(), 'Buscar')]");
    By locatorAceptarCookies = By.xpath("//button[@id='cookies_accept']");
    By locatorPasajeros = By.xpath("//body/div[@id='react-view']/div[2]/div[3]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/button[1]/div[1]/div[1]");
    By locatorBtnMas = By.xpath("//button[@aria-label='increment']");
    By locatorBtnConfirmar = By.xpath("//div[contains(text(),'Confirmar')]");
    By locatorFiltros = By.xpath("//body/div[@id='react-view']/div[2]/div[4]/div[1]/div[1]/div[2]/div[1]/div[1]/button[1]/div[1]");
    By locatorCBEscalas = By.xpath("//div[@class='Select__SelectContainer-sc-2ijy2y-2 wvqZV']");
    By locatorUnaEscala = By.xpath("//option[@value='1']");
    By locatorPrimerVuelo = By.xpath("div[@class='ResultCardstyled__ResultCardSection-sc-vsw8q3-4 ResultCardstyled__ResultCardActions-sc-vsw8q3-5 jKgZti esbuLP']");
    By locatorNoHayVuelos = By.xpath("ResultCardstyled__ResultCardSection-sc-vsw8q3-4 ResultCardstyled__ResultCardActions-sc-vsw8q3-5 jKgZti esbuLP");

    public void escogerDestinos(boolean limpiar, String origen0, String destino0, String destino1, String destino2) throws InterruptedException {
        Thread.sleep(3000);
        moverseAOtraPestana("Viajes de");
        try {
            if (limpiar) {
                click(locatorBtnlimpiar);
            }
        } catch (Exception e) {
            System.out.println("Los campos no se han vaciado, vuelva a intentar");
        }
        click(locatorAnadirDestino);
        List<WebElement> inputs = findElements(locatorInputs);
        WebElement input0 = inputs.get(0);
        input0.click();
        input0.sendKeys(origen0);
        Thread.sleep(3000);
        input0.sendKeys(Keys.ENTER);
        Thread.sleep(3000);

        WebElement input1 = inputs.get(1);
        input1.click();
        input1.sendKeys(destino0);
        Thread.sleep(3000);
        input1.sendKeys(Keys.ENTER);
        Thread.sleep(3000);

        WebElement input3 = inputs.get(3);
        input3.click();
        Thread.sleep(3000);

        WebElement input4 = inputs.get(4);
        input4.click();
        input4.sendKeys(destino1);
        Thread.sleep(3000);
        input4.sendKeys(ENTER);
        if (!isSelected(locatorInputs)) {
            input4.click();
            Thread.sleep(3000);
            input4.sendKeys(ENTER);
        }
        WebElement input6 = inputs.get(6);
        input6.click();
        Thread.sleep(3000);

        WebElement input7 = inputs.get(7);
        input7.click();
        input7.sendKeys(destino2);
        Thread.sleep(3000);
        input7.sendKeys(ENTER);
        click(locatorBtnBuscar);
        Thread.sleep(3000);
        click(locatorAceptarCookies);
        Thread.sleep(3000);

    }

    public void viajeMultiDestino() throws InterruptedException {

        click(waitElement(locatorPasajeros));
        Thread.sleep(3000);
        List<WebElement> pasajeros = findElements(locatorBtnMas);
        click(pasajeros.get(2));

        click(pasajeros.get(5));
        click(pasajeros.get(5));
        click(pasajeros.get(6));
        click(pasajeros.get(6));
        click(waitElement(locatorBtnConfirmar));
        click(waitElement(locatorFiltros));
        List<WebElement> escalas = findElements(locatorCBEscalas);
        click(escalas.get(0));
        click(waitElement(locatorUnaEscala));
        Thread.sleep(3000);
        if(isEnabled(locatorPrimerVuelo)){
        List<WebElement> vuelos = findElements(locatorPrimerVuelo);
        click(vuelos.get(0));
        }else{
            noHayVuelos();
        }
    }
    public Boolean noHayVuelos(){
        return isDisplayed(locatorNoHayVuelos);
    }
    public String noHayVuelosTxt(){
        return getText(locatorNoHayVuelos);
    }
}



