package aut.testcreation.pages.vuelos;

import framework.engine.selenium.SeleniumWrapper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static framework.engine.utils.Constants.BASE_URL_AUT;
import static org.openqa.selenium.Keys.DOWN;
import static org.openqa.selenium.Keys.ENTER;

public class RumboHomePage extends SeleniumWrapper {

    public RumboHomePage(WebDriver driver) {
        super(driver);
    }

    //Locators
    By btnAceptarCoockies = By.xpath("//button[@class='iubenda-cs-accept-btn iubenda-cs-btn-primary']");
    By btnVueloIdaVuelta = By.xpath("//div[@class='d-vfn33k']");
    By btnVueloSoloIda = By.xpath("//div[@class='d-1s1pmhl']");
    By btnVueloMultidestino = By.xpath("//*[@class='d-1w89ccl']");
    By btnLimpiarOrigen = By.xpath("//button[@class='d-1nmp0nm ed5mks90'][1]");
    //By btnLimpiarDestino = By.xpath("//button[@class='d-1nmp0nm ed5mks90'][2]");
    By locatorOrigenVuelo = By.xpath("//input[@id=':Riqed6lalallbla2m:']");
    By locatorDestinoVuelo = By.xpath("//input[@id=':Rjaed6lalallbla2m:']");
    By locatorVerCalendario = By.xpath("//span[@class='d-aziqil']");
    By locatorFechaSoloIda = By.xpath("//button[@class='d-1kuzy14'][9]");
    By locatorFechaIda = By.xpath("//button[@class='d-zlm2xw'][1]");
    By locatorFechaVuelta = By.xpath("//button[@class='d-1dj49va'][1]");
    By locatorNumeroPasajeros = By.xpath("//span[@class='d-5n2gua']");
    By btnBuscar = By.xpath("//button[@class='d-1jmk4ql']");
    By errOrigenVuelo = By.xpath("//span[@class = 'd-1toc9z2'][contains(text(),'Introduce ciudad o aeropuerto de origen')]");

    public void formularioHomeIdaYVuelta(String origenVuelo, String destinoVuelo) {
        navigateTo(BASE_URL_AUT);
        click(btnAceptarCoockies);
        click(btnVueloIdaVuelta);
        click(btnLimpiarOrigen);
        write(origenVuelo, locatorOrigenVuelo);
        sendKeys(DOWN, locatorOrigenVuelo);
        sendKeys(ENTER, locatorOrigenVuelo);
        click(locatorOrigenVuelo);
        click(locatorDestinoVuelo);
        write(destinoVuelo, locatorDestinoVuelo);
        sendKeys(DOWN, locatorDestinoVuelo);
        sendKeys(ENTER, locatorDestinoVuelo);
        click(locatorDestinoVuelo);
        click(locatorVerCalendario);
        click(locatorFechaIda);
        click(locatorFechaVuelta);
        click(locatorNumeroPasajeros);
        click(btnBuscar);
    }



    public void formularioSoloIda(String origenVuelo, String destinoVuelo) {
        navigateTo(BASE_URL_AUT);
        click(btnAceptarCoockies);
        click(btnVueloSoloIda);
        click(btnLimpiarOrigen);
        write(origenVuelo, locatorOrigenVuelo);
        sendKeys(DOWN, locatorOrigenVuelo);
        sendKeys(ENTER, locatorOrigenVuelo);
        click(locatorOrigenVuelo);
        click(locatorDestinoVuelo);
        click(locatorDestinoVuelo);
        write(destinoVuelo, locatorDestinoVuelo);
        sendKeys(DOWN, locatorDestinoVuelo);
        sendKeys(ENTER, locatorDestinoVuelo);
        click(locatorVerCalendario);
        click(locatorFechaSoloIda);
        click(locatorNumeroPasajeros);
        click(btnBuscar);
    }

    public void opcionMultidestino(){
        navigateTo(BASE_URL_AUT);
        click(btnAceptarCoockies);
        click(btnVueloMultidestino);
    }

    public void formularioIdaSinOrigen(String destinoVuelo) {
        navigateTo(BASE_URL_AUT);
        click(btnAceptarCoockies);
        click(btnVueloSoloIda);
        click(btnLimpiarOrigen);
        click(locatorDestinoVuelo);
        write(destinoVuelo, locatorDestinoVuelo);
        sendKeys(DOWN, locatorDestinoVuelo);
        sendKeys(ENTER, locatorDestinoVuelo);
        click(locatorVerCalendario);
        click(locatorFechaSoloIda);
        click(locatorNumeroPasajeros);
        click(btnBuscar);
    }
    public String mensajeErrorOrigen() {
        return getText(errOrigenVuelo);
    }
}