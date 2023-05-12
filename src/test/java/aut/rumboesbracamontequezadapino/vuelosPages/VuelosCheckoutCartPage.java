package aut.rumboesbracamontequezadapino.vuelosPages;

import framework.engine.selenium.SeleniumWrapper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class VuelosCheckoutCartPage extends SeleniumWrapper {
    public VuelosCheckoutCartPage(WebDriver driver) {
        super(driver);
    }

    By locatorBtnElegirClassic = By.xpath("//button[contains(text(),'Elegir Classic')]");

    public void elegirClassic() throws InterruptedException{
        Thread.sleep(10000);
        scroll(findElement(locatorBtnElegirClassic));
        click(locatorBtnElegirClassic);
    }


}
