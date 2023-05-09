package aut.testcreation.pages.rumboesbracamontequezadapino.HotelesPage;

import framework.engine.selenium.SeleniumWrapper;
import gherkin.lexer.Th;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import static org.openqa.selenium.Keys.DOWN;
import static org.openqa.selenium.Keys.ENTER;

public class HotelesPage extends SeleniumWrapper {
    public HotelesPage(WebDriver driver) {
        super(driver);
    }

    //Localizadores
    By locatorSelectorUbicacionHotel = By.xpath("//input[@arial-label = 'Buscar alojamiento en']");
    By locatorSelectorHuespedYHabitacion = By.xpath("//span[contains(text(), '1 huésped, 1 habitación')]");
    By locatorEntrada = By.xpath("//button[@arial-label= 'Fecha de entrada']");
    By locatorSalida = By.xpath("//button[@arial-label= 'Fecha de salida']");
    By locatorBtnBuscar = By.xpath("//button[@arial-label= 'Buscar']");

    //Localizadores de caso de prueba de hotel de mayor valor
    By locatorSelectFechaEntrada = By.xpath("//span[contains(text(), 'lun,22 may')]");
    By locatorSelectFechaSalida = By.xpath("//span[contains(text(), 'vie,26 may')]");
    By locatorHuesped = By.xpath("//button[@aria-label='Reducir el número de adultos']");
    By locatorMayorValor = By.xpath("//img[@alt = 'Precio (más bajo primero)']");
    //////////////////////////////////


    public void ubicacionHotel(String buscarAlojamiento/*, String Entrada, String Salida*/)throws InterruptedException{
        click(locatorSelectorUbicacionHotel);
        write(buscarAlojamiento, locatorSelectorUbicacionHotel);
        Thread.sleep(3000);
        /////
        /*click(waitElement(locatorEntrada));
        write(Entrada, locatorEntrada);
        Thread.sleep(1000);
        sendKeys(Keys.DOWN, locatorEntrada);
        Thread.sleep(1000);
        sendKeys(Keys.ENTER, locatorEntrada);
        ////
        click(waitElement(locatorSalida));
        write(Salida, locatorSalida);
        Thread.sleep(1000);
        sendKeys(Keys.DOWN, locatorSalida);
        Thread.sleep(1000);
        sendKeys(Keys.ENTER, locatorSalida);
        ////
        click(findElement(locatorSelectorHuespedYHabitacion));
        click(findElement(locatorHuesped));*/
    }
    public void Buscar(){
        click(findElement(locatorBtnBuscar));
    }
    public void precioMasAltoPrimero(){
        click(findElement(locatorMayorValor));
        click(findElement(locatorMayorValor));
    }

    /*public void Bajar(){
        scrolling(findElement());
    }*/
}