package aut.testcreation.pages.rumboesabbaro.trenes;

import framework.engine.selenium.SeleniumWrapper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TrenesPage extends SeleniumWrapper {

    public TrenesPage(WebDriver driver) {
        super(driver);
    }

    //Localizadores

    By locatorSoloIda = By.xpath("//div[contains(text(),'Solo ida')]");
    By locatorIdaYVuelta = By.xpath("//div[contains(text(),'Ida y vuelta')]");
    By locatorLugarOrigen = By.xpath("//input[@placeholder= 'Origen']");
    By locatorLugarDestino = By.xpath("//input[@placeholder= 'Destino']");
    By locatorFechaIda = By.xpath("//label[contains(text(), 'Fecha de ida')]");
    By locatorMarcarDiaIda15M = By.xpath("//button[contains(text(), '15')][@class='d-czl827']");

    // Para junio, julio //button[contains(text(), '15')][@class='d-1kuzy14']

    By locatorMarcarDiaVuelta25M = By.xpath("//button[contains(text(), '25')][@class='d-czl827']");
    By locatorFechaVuelta = By.xpath("//label[contains(text(), 'Fecha de vuelta')]");
    By locatorPasajero = By.xpath("//div[@class='d-1rd1g4p']");
    By locatorAgregarNinio = By.xpath("//button[@class='d-1ch1522']");
    By locatorEdadNinno = By.xpath("//li[contains(text(), '4 años')]");
    By locatorBtnBuscar = By.xpath("//button[@class='d-1ch1522']");

    //https://res.cloudinary.com/lastminute-contenthub/i…s/Europe/Spain/Sevilla/shutterstock_108544976.jpg
    By locatorOfertaSevillaMadrid = By.linkText("https://res.cloudinary.com/lastminute-contenthub/i…s/Europe/Spain/Sevilla/shutterstock_108544976.jpg");

    //https://res.cloudinary.com/lastminute-contenthub/c…ons/Europe/Spain/Barcelona/shutterstock_165497819
    By locatorOfertaBarcelonaMadrid = By.linkText("https://res.cloudinary.com/lastminute-contenthub/c…ons/Europe/Spain/Barcelona/shutterstock_165497819");

    public void soloIda(){
        click(locatorSoloIda);
    }

    public void idaYVuelta(){
        click(locatorIdaYVuelta);
    }
    public void escribirOrigen (String origen){
        write(origen, locatorLugarOrigen);

    }

    public void escribirDestino (String destino){
        write(destino, locatorLugarDestino);
    }

    public void fechaIda(){
        click(locatorFechaIda);
        click(locatorMarcarDiaIda15M);

    }
    public void fechasIdaYVuelta(){
        click(locatorFechaIda);
        click(locatorMarcarDiaIda15M);
        click(locatorMarcarDiaVuelta25M);
    }

    public void marcarPasajeroYAgregarNinnio(){
        click(locatorPasajero);
        click(locatorAgregarNinio);
        click(locatorEdadNinno);
    }

    public void clickEnBuscar(){
        click(locatorBtnBuscar);
    }

    public void ofertaMadridSevilla(){
        click(locatorOfertaSevillaMadrid);
    }
    public void ofertaABarcelona(){
        click(locatorOfertaBarcelonaMadrid);
    }
}
