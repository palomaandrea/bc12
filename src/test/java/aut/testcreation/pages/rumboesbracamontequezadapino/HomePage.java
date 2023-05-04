package aut.testcreation.pages.rumboesbracamontequezadapino;

import framework.engine.selenium.SeleniumWrapper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends SeleniumWrapper {
    public HomePage(WebDriver driver) {
        super(driver);
    }

    //localizadores

    By locatorTrenes = By.linkText("https://www.rumbo.es/trenes/");
    By locatorVuelos = By.xpath("//a[@title='Vuelos']");
    By locatorHoteles = By.linkText("https://www.rumbo.es/hoteles/");

    public void irATrenes(){
        click(locatorTrenes);
    }

    public void irAVuelos(){
        click(locatorVuelos);
    }

    public void irAHoteles(){
        click(locatorHoteles);
    }
}
