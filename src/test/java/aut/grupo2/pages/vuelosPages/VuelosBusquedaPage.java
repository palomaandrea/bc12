package aut.grupo2.pages.vuelosPages;

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
    By locatorFilterEscalas = By.xpath("//span[contains(text(),'Escalas')]");
    By locatorFilterEscalaIda = By.xpath("//input[@aria-label ='1 escala']");
    By locatorFilterEscalaVuelta = By.xpath("//div[@class='CheckboxListstyled__CheckboxListWrapper-cncr__sc-epivn3-0 ldnIlp'][1]");
    By locatorSelectVuelo = By.xpath("//div[@class='FullTripCard__SelectedPriceContainer-sc-z8znd4-4 cbaIot']");
    By locatorSinVuelos = By.xpath("//div[@class='alerts']");

    public void filtrarPorElMejor() {
        click(locatorFilterElmejor);
    }

    public void filtrarPorMasBarato() throws InterruptedException{
        Thread.sleep(11000);
        click(waitElement(locatorFilterMasBarato));
    }

    public void filtrarPorMasRapido() throws InterruptedException{
        Thread.sleep(11000);
        click(waitElement(locatorFilterMasRapido));
    }

    public void filtrarPorUnaEscala() throws InterruptedException {
        scroll(findElement(locatorFilterEscalas));
        click(locatorFilterEscalaIda);
        Thread.sleep(9000);
        List<WebElement> escalasVuelta = findElements(locatorFilterEscalaVuelta);
        click(escalasVuelta.get(1));
    }

    public void seleccionarVuelo() throws InterruptedException {
        scroll(findElement(locatorSelectVuelo));
        List<WebElement> vuelos = findElements(locatorSelectVuelo);
        click(vuelos.get(0));
    }

    public Boolean noHayVuelos(){
        return isDisplayed(locatorSinVuelos);
    }

    public String noHayVuelosTxt(){
        return getText(locatorSinVuelos);
    }
}
