package aut.testcreation.pages.rumboesbracamontequezadapino.vuelosPages;

import framework.engine.selenium.SeleniumWrapper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class VuelosBusquedaPage extends SeleniumWrapper {
    public VuelosBusquedaPage(WebDriver driver) {
        super(driver);
    }

    By locatorFilterElmejor = By.xpath("//h5[contains(text(),'El mejor')]");
    By locatorFilterMasBarato = By.xpath("//h5[contains(text(),'Más barato')]");
    By locatorFilterMasRapido = By.xpath("//h5[contains(text(),'Más rápido')]");
    By locatorFilterEscalaIda = By.xpath("");
    By locatorFilterEscalataVuelta = By.xpath("");
    By locatorSelectVuelo = By.xpath("");

    public void filtrarPorElMejor(){
        click(locatorFilterElmejor);
    }
    public void filtrarPorMasBarato(){
        click(locatorFilterMasBarato);
    }
    public void filtrarPorMasRapido(){
        click(locatorFilterMasRapido);
    }
    public void filtrarPorUnaEscala(){
        scroll(findElement(locatorFilterEscalaIda));
        click(locatorFilterEscalaIda);
        click(locatorFilterEscalataVuelta);
    }
    public void seleccionarVuelo(){
        scroll(findElement(locatorSelectVuelo));
        click(locatorSelectVuelo);
    }


}
