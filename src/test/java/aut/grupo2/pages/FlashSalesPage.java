package aut.grupo2.pages;

import framework.engine.selenium.SeleniumWrapper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FlashSalesPage extends SeleniumWrapper {
    public FlashSalesPage(WebDriver driver) {
        super(driver);
    }
    By locatorTxtOfertasDeLaSemana = By.xpath("//span[contains(text(),'Ofertas de la semana')]");
    By locatorSelectOferta = By.xpath("//div[@class='slick-list']");
    By locatorSelectOferta1 = By.xpath("//div[contains(text(),'Villa Nautica at Paradise Island')]");

    public void ofertaVuelo(){
        scroll(findElement(locatorTxtOfertasDeLaSemana));
        click(waitElement(locatorSelectOferta1));
        /*List<WebElement> ofertasSemana = findElements(locatorSelectOferta);
        Thread.sleep(5000);
        click(ofertasSemana.get(2));*/
    }
}
