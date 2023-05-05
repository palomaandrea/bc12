package aut.testcreation.pages.vuelos;

import framework.engine.selenium.SeleniumWrapper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class OfertasVuelosPage extends SeleniumWrapper {
    public OfertasVuelosPage(WebDriver driver) {
        super(driver);
    }

    By elegirVuelo = By.xpath("//div[@class='FullTripCard__PaymentContainer-sc-z8znd4-3 juamvE']");
    By locatorOfertas = By.xpath("//div[@class='FullJourneySummary__JourneySummary-sc-1yzjt4d-0 iwxxyr']");

    public void elegirPrimerOfertaQueAparezca() throws InterruptedException {
            Thread.sleep(2000);
            findElement(elegirVuelo);
            Thread.sleep(2000);
            click(elegirVuelo);

    }

    public void contarNumOfertas() throws InterruptedException {
        Thread.sleep(2000);
        List<WebElement> ofertas = findElements(locatorOfertas);
        int num_ofertas = ofertas.size();
        if (num_ofertas == 15) {
            System.out.println("Han sido detectadas las 15 ofertas esperadas");
        } else {
            System.out.println("No se han desplegado las 15 ofertas como se esperaba");
        }
    }

}
