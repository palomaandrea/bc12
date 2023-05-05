package aut.testcreation.pages.rumboesbracamontequezadapino;

import framework.engine.selenium.SeleniumWrapper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class FlashSalesPage extends SeleniumWrapper {
    public FlashSalesPage(WebDriver driver) {
        super(driver);
    }
    By locatorTxtOfertasDeLaSemana = By.xpath("//span[contains(text(),'Ofertas de la semana')]");
    By locatorSelectOferta = By.xpath("//div[@class='slick-list']");

    public void ofertaVuelo() throws InterruptedException{
        scroll(findElement(locatorTxtOfertasDeLaSemana));
        Thread.sleep(5000);
        List<WebElement> ofertasSemana = findElements(locatorSelectOferta);
        click(ofertasSemana.get(1));
    }
}
