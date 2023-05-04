package aut.testcreation.pages.rumboesbracamontequezadapino.TrenesPages;

import framework.engine.selenium.SeleniumWrapper;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class TrenesPage extends SeleniumWrapper {

    public TrenesPage(WebDriver driver) {
        super(driver);
    }

    //Localizadores

    By locatorSoloIda = By.xpath("//div[contains(text(),'Solo ida')]");
    By locatorIdaYVuelta = By.xpath("//div[contains(text(),'Ida y vuelta')]");
    By locatorLugarOrigen = By.xpath("//input[@placeholder= 'Origen']");

    By locatorSeleccionaCiudad = By.xpath("//li[@data-option-index='0']");
    By locatorSeleccionaCiudad2 = By.xpath("//li[@data-option-index='7']");
    By locatorLugarDestino = By.xpath("//input[@placeholder= 'Destino']");
    By locatorFechaIda = By.xpath("//button[@aria-label='Fecha de ida']");
    By locatorMarcarDiaIda15 = By.xpath("//button[contains(text(), '15')]");
    //class="d-1z9ad3" [@class='d-1kuzy14'] //button[contains(text(), '15')]

    // Para junio, julio //button[contains(text(), '15')][@class='d-1kuzy14']

    By locatorMarcarDiaVuelta25M = By.xpath("//button[contains(text(), '25')][@class='d-czl827']");
    By locatorFechaVuelta = By.xpath("//label[contains(text(), 'Fecha de vuelta')]");
    By locatorPasajero = By.xpath("//div[@class='d-1rd1g4p']");
    By locatorAgregarNinio = By.xpath("//button[@class='d-1ch1522']");
    By locatorEdadNinno = By.xpath("//li[contains(text(), '4 años')]");
    By locatorBtnBuscar = By.xpath("//button[@aria-label='Buscar']");

    //https://res.cloudinary.com/lastminute-contenthub/i…s/Europe/Spain/Sevilla/shutterstock_108544976.jpg
    By locatorOfertaSevillaMadrid = By.linkText("https://res.cloudinary.com/lastminute-contenthub/i…s/Europe/Spain/Sevilla/shutterstock_108544976.jpg");

    //https://res.cloudinary.com/lastminute-contenthub/c…ons/Europe/Spain/Barcelona/shutterstock_165497819
    By locatorOfertaBarcelonaMadrid = By.linkText("https://res.cloudinary.com/lastminute-contenthub/c…ons/Europe/Spain/Barcelona/shutterstock_165497819");

    public void soloIda(){
        click(findElement(locatorSoloIda));
    }

    public void idaYVuelta(){
        click(findElement(locatorIdaYVuelta));
    }
    public void escribirOrigen (String origen) throws InterruptedException{
        write(origen, locatorLugarOrigen);
        Thread.sleep(3000);
        click(locatorSeleccionaCiudad);


    }

    public void escribirDestino (String destino) throws InterruptedException{
        write(destino, locatorLugarDestino);

    }

    public void marcarDestino() throws InterruptedException{

        Thread.sleep(3000);
        findElement(locatorSeleccionaCiudad2);
        click(locatorSeleccionaCiudad2);
    }

    public void fechaIda() throws InterruptedException{
        //click(findElement(locatorFechaIda));
        Thread.sleep(5000);
        //click(findElement(locatorFechaIda));
        List < WebElement> dia15 = findElements(locatorMarcarDiaIda15);
        click(dia15.get(0));

    }

    public void marcarDia() throws InterruptedException{
        Thread.sleep(3000);
        List < WebElement> dia15 = findElements(locatorMarcarDiaIda15);
        click(dia15.get(0));

    }
    public void fechasIdaYVuelta(){
        click(findElement(locatorFechaIda));
        click(findElement(locatorMarcarDiaIda15));
        click(findElement(locatorMarcarDiaVuelta25M));
    }

    public void marcarPasajeroYAgregarNinnio(){
        click(findElement(locatorPasajero));
        click(findElement(locatorAgregarNinio));
        click(findElement(locatorEdadNinno));
    }

    public void clickEnBuscar(){
        click(findElement(locatorBtnBuscar));
    }

    public void ofertaMadridSevilla(){
        click(findElement(locatorOfertaSevillaMadrid));
    }
    public void ofertaABarcelona(){
        click(findElement(locatorOfertaBarcelonaMadrid));
    }

    public void sendKeys(Keys key){
        sendKeys(key, locatorFechaIda);
    }
}
