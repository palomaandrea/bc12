package aut.testcreation.pages.rumboesbracamontequezadapino.TrenesPages;

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
        public void seleccionaHotel(){
            scrolling(findElement(locatorSeleccionHotel));
            click(findElement(locatorSeleccionHotel));
        }
}
