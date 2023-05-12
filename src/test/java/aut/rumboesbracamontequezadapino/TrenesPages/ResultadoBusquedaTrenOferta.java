package aut.rumboesbracamontequezadapino.TrenesPages;

import framework.engine.selenium.SeleniumWrapper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ResultadoBusquedaTrenOferta extends SeleniumWrapper {
    public ResultadoBusquedaTrenOferta(WebDriver driver) {
        super(driver);
    }

    //Localizadores
    By locatorSeleccionHotel = By.xpath("//div[@class='Container__StyledContainer-sc-sb5e2u-0 NYTal CardInfoPanel__TripInformationWrapper-sc-15o9r3a-1 ecqObO']");
    //div[contains(text(), 'Ilunion Pio XII')]

    By locatorSeleccionDesayuno = By.xpath("//button[contains(text(),'Desayuno incluido')]");

    By locatorMejorPrecio = By.xpath("//body/div[@id='__next']/div[2]/section[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/button[1]");
    ////body/div[@id='__next']/div[2]/section[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/button[1]
        public void seleccionaHotel(){
            scrolling(findElement(locatorSeleccionHotel));
            click(findElement(locatorSeleccionHotel));
        }

    public void seleccionaHotelTren(){
        click(findElement(locatorMejorPrecio));
    }
    public void seleccionaConDesayuno(){
            scrolling(findElement(locatorSeleccionDesayuno));
        click(findElement(locatorSeleccionDesayuno));
    }
}
