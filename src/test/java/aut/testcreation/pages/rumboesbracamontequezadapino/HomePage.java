package aut.testcreation.pages.rumboesbracamontequezadapino;

import framework.engine.selenium.SeleniumWrapper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends SeleniumWrapper {
    public HomePage(WebDriver driver) {
        super(driver);
    }

    //localizadores


    By locatorTrenes = By.xpath("//body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/ul[1]/li[8]/div[1]/a[1]");
    ////body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/ul[1]/li[8]/div[1]/a[1]
    By locatorVuelos = By.xpath("//a[@title='Vuelos']");

    //By locatorHoteles = By.linkText("https://www.rumbo.es/hoteles/");
    By locatorHoteles = By.xpath("//a[@title = 'Hoteles']");
    By locatorRechazarCookis = By.xpath("//button[contains(text(), 'Rechazar todo')]");
    By locatorFlashsales = By.xpath("//a[@title='Flash Sales']");

    public void cerrarCookis() {
        if (isDisplayed(locatorRechazarCookis)) {
            click(findElement(locatorRechazarCookis));
        }
    }

    public void irATrenes() {
        click(findElement(locatorTrenes));
    }

    public void irAVuelos() {
        click(findElement(locatorRechazarCookis));
        click(locatorVuelos);
    }

    public void irAHoteles() {
        click(locatorHoteles);
    }

    public void irAFlashSales() {
        scroll(findElement(locatorFlashsales));
        click(locatorFlashsales);
    }

}
