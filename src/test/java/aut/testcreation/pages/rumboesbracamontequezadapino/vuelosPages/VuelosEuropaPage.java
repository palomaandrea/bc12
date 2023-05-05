package aut.testcreation.pages.rumboesbracamontequezadapino.vuelosPages;

import framework.engine.selenium.SeleniumWrapper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class VuelosEuropaPage extends SeleniumWrapper {
    public VuelosEuropaPage(WebDriver driver) {
        super(driver);
    }

    By locatorTxtDestinosUrbanos = By.xpath("//body/div[1]/div[5]/div[2]/div[1]/div[2]/div[1]/div[1]/div[3]')]')]");
    By locatorTxtVuelaALisboa = By.xpath("//h4[contains(text(),'Vuela a Lisboa')]");

    public void vuelaALisboa()throws InterruptedException {
        if(isDisplayed(locatorTxtDestinosUrbanos)){
            scroll(findElement(locatorTxtDestinosUrbanos));
            Thread.sleep(1000);
            click(waitElement(locatorTxtVuelaALisboa));
        }else {
            navigateTo("https://www.rumbo.es/es/vuelos/europa.html?int_type=CMS_FLI&int_campaign=CNT&int_detail=PHP_FLI_RMB_europa_1&subsource=S02HPB30S10RR01");
        }
    }
}
