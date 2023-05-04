package aut.testcreation.pages.vuelos;

import framework.engine.selenium.SeleniumWrapper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OfertasVuelosPage extends SeleniumWrapper {
    public OfertasVuelosPage(WebDriver driver) {
        super(driver);
    }

    By elegirVuelo = By.xpath("//div[@class='FullTripCard__PaymentContainer-sc-z8znd4-3 juamvE']");

    public void elegirPrimerVueloQueAparezca(){
        esperar(elegirVuelo);
        click(elegirVuelo);

    }


}
