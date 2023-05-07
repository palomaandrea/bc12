package aut.testcreation.pages.rumboesbracamontequezadapino.HotelesPage;

import framework.engine.selenium.SeleniumWrapper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HotelesPage extends SeleniumWrapper {
    public HotelesPage(WebDriver driver) {
        super(driver);
    }

    //Localizadores
    By locatorSelectorUbicacionHotel = By.xpath("//label[contains(text(), 'Buscar alojamiento en')]");
    By locatorHuespedYHabitacion = By.xpath("//*[@id= 'hub-csw-container']");
    By locatorFechaEntrada = By.xpath("button[@arial-label= 'Fecha de entrada']");
    By locatorFechaSalida = By.xpath("button[@arial-label= 'Fecha de salida']");
    By locatorBtnBuscar = By.xpath("//*[@id='hub-csw-container']");

    public void UbicacionHotel(String ubicacion){
        write(ubicacion, locatorSelectorUbicacionHotel);
    }
    public void huespedYHabitacion(){
        click(findElement(locatorHuespedYHabitacion));
    }
    public void Entrada(){
        click(findElement(locatorFechaEntrada));
    }
    public void Salida(){
        click(findElement(locatorFechaSalida));
    }
    public void botonBuscar(){
        click(findElement(locatorBtnBuscar));
    }
}