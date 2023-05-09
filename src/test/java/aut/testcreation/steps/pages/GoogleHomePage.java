package aut.testcreation.steps.pages;

import framework.engine.selenium.SeleniumWrapper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static framework.engine.utils.Constants.BASE_URL_AUT;

public class GoogleHomePage extends SeleniumWrapper {

    public GoogleHomePage(WebDriver driver) {
        super(driver);
    }


    //locators
    By barraBusquedaLocator = By.name("q");
    By btnBuscarConGoogleLocator = By.name("btnK");
    By btnVoyATenerSuerteLocator = By.name("btnI");

    By palabraTsoft= By.xpath("//h3[contains(text(),'HOME - TSOFT - Make IT Real')]");

    //methods
    public void buscarConBotonBuscar(String busqueda){
        write(busqueda,barraBusquedaLocator);
        click(btnBuscarConGoogleLocator);
    }

    public void irAGoogle(){
        navigateTo("google.com.ar");
    }

    public void buscarConBotonVoyATenerSuerte(String busqueda){
        write(busqueda,barraBusquedaLocator);
        click(btnVoyATenerSuerteLocator);
    }

    public void seleccionarPalabraTsoft (){
        isDisplayed(palabraTsoft);
    }

    public void navegarAlHome(){
        navigateTo(BASE_URL_AUT);
    }


}
