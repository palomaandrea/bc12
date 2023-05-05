package aut.testcreation.pages.rumboesbracamontequezadapino.TrenesPages;

import framework.engine.selenium.SeleniumWrapper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BusquedaTrenOferta extends SeleniumWrapper {
    public BusquedaTrenOferta(WebDriver driver) {
        super(driver);
    }

    //Localizadores

    By locatorHotel = By.xpath("//figure[@class='e2zssff0 d-1u3qkqc e1cdiu7b0']");
    //figure[@class='e2zssff0 d-1u3qkqc e1cdiu7b0']
    //img[@class='horizontal d-q2h8mp e4f2r0y0']

    public void seleccionarHotel(){
        scrolling(findElement(locatorHotel));
        click(locatorHotel);
    }
}
