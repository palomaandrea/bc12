package aut.grupo2.pages.vuelosPages;

import framework.engine.selenium.SeleniumWrapper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class VuelosEuropaPage extends SeleniumWrapper {
    public VuelosEuropaPage(WebDriver driver) {
        super(driver);
    }

    By locatorTxtDestinosUrbanos = By.xpath("//h3[contains(text(),'Destinos urbanos')]");
    By locatorTxtVuelaALisboa = By.xpath("//figure[@class='e2zssff0 d-1u3qkqc e1cdiu7b0']");

    public void vuelaALisboa()throws InterruptedException {
            Thread.sleep(2000);
            scroll(findElement(locatorTxtDestinosUrbanos));
            Thread.sleep(1000);
            click(waitElement(locatorTxtVuelaALisboa));

    }
}
