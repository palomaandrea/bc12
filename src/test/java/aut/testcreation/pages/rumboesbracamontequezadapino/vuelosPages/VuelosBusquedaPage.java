package aut.testcreation.pages.rumboesbracamontequezadapino.vuelosPages;

import framework.engine.selenium.SeleniumWrapper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class VuelosBusquedaPage extends SeleniumWrapper {
    public VuelosBusquedaPage(WebDriver driver) {
        super(driver);
    }

    By locatorFilterElmejor = By.xpath("//h5[contains(text(),'El mejor')]");
    By locatorFilterMasBarato = By.xpath("//h5[contains(text(),'Más barato')]");
    By locatorFilterMasRapido = By.xpath("//h5[contains(text(),'Más rápido')]");
    By locatorFilterEscalaIda = By.xpath("");
    By locatorFilterEscalataVuelta = By.xpath("");
    By locatorSelectVuelo = By.xpath("//div[@class='FullTripCard__SelectedPriceContainer-sc-z8znd4-4 cbaIot']");

    public void filtrarPorElMejor() {
        click(locatorFilterElmejor);
    }

    public void filtrarPorMasBarato() {
        click(locatorFilterMasBarato);
    }

    public void filtrarPorMasRapido() {
        click(waitElement(locatorFilterMasRapido));
    }

    public void filtrarPorUnaEscala() {
        scroll(findElement(locatorFilterEscalaIda));
        click(locatorFilterEscalaIda);
        click(locatorFilterEscalataVuelta);
    }

    public void seleccionarVuelo() throws InterruptedException{
            List<WebElement> vuelos = findElements(locatorSelectVuelo);
            click(vuelos.get(0));
    }
}
