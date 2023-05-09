package aut.testcreation.pages.rumboesbracamontequezadapino.TrenesPages;

import framework.engine.selenium.SeleniumWrapper;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;



public class TrenesPage extends SeleniumWrapper {

    public TrenesPage(WebDriver driver) {
        super(driver);
    }

    //Localizadores

    By locatorSoloIda = By.xpath("//div[contains(text(),'Solo ida')]");
    By locatorIdaYVuelta = By.xpath("//div[contains(text(),'Ida y vuelta')]");
    By locatorLugarOrigen = By.xpath("//input[@placeholder= 'Origen']");

    By locatorSeleccionaCiudad = By.xpath("//li[@data-option-index='0']");
    By locatorLugarDestino = By.xpath("//input[@placeholder= 'Destino']");
    By locatorFechaIda = By.xpath("//button[@aria-label='Fecha de ida']");

    int diaIda;
    //By locatorMarcarDiaIda15 = By.xpath("//button[contains(text(), "+diaIda+")]");
    int diaVuelta;

    By locatorMarcarDiaVuelta25 = By.xpath("//button[contains(text(), "+diaVuelta+")]");

    By locatorFechaVuelta = By.xpath("//label[contains(text(), 'Fecha de vuelta')]");
    By locatorPasajero = By.xpath("//div[@class='d-1rd1g4p']");
    By locatorAgregarNinio = By.xpath("//button[@class='d-1ch1522']");
    By locatorEdadNinno = By.xpath("//li[contains(text(), '4 años')]");
    By locatorBtnBuscar = By.xpath("//button[@aria-label='Buscar']");

    By locatorOfertaSevillaMadrid = By.xpath("//img[@alt='Madrid - Sevilla']");

    By locatorOfertaTrenHotelBarcelonaMadrid = By.xpath("//img[@alt='Tren + Hotel a Madrid']");

    By locatorObtenerMensajeSinDispo = By.xpath("//span[contains(text(), 'No hemos encontrado ninguna')]");
    By locatorSinDisponibilidad = By.xpath("//div[contains(text(), 'No hemos encontrado ningún')]");

    By locatorOfertaMadridBarcelona = By.xpath("//img[@alt='Madrid - Barcelona']");
    public void soloIda(){
        click(findElement(locatorSoloIda));
    }

    public void idaYVuelta(){
        click(findElement(locatorIdaYVuelta));
    }
    public void escribirOrigen (String origen) throws InterruptedException{
        click(locatorLugarOrigen);
        write(origen, locatorLugarOrigen);
        Thread.sleep(3000);
        click(locatorSeleccionaCiudad);
    }

    public void escribirDestino (String destino) throws InterruptedException{
        Thread.sleep(2000);
        write(destino, locatorLugarDestino);
        Thread.sleep(2000);
        click(locatorSeleccionaCiudad);
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
    public void ofertaTrenHotelMadridBarcelona(){
        click(findElement(locatorOfertaTrenHotelBarcelonaMadrid));
    }

    public void sendKeys(Keys key){
        sendKeys(key, locatorFechaIda);
    }

    public String obtenerMensajeSinDispo(){
        return getText(locatorObtenerMensajeSinDispo);
    }

    public void bajarAOfertas(){
        scrolling(findElement(locatorOfertaSevillaMadrid));
    }

    public String sinDisponibilidad(){
        return getText(locatorSinDisponibilidad);
    }
    public void ofertaMadridBarcelona(){
        click(findElement(locatorOfertaMadridBarcelona));
    }

    public void fechaNuevaBusqueda(){
        click(findElement(locatorFechaIda));
    }
}
