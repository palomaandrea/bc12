package aut.rumboesbracamontequezadapino.TrenesPages;

import framework.engine.selenium.SeleniumWrapper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class BusquedaTrenOferta extends SeleniumWrapper {
    public BusquedaTrenOferta(WebDriver driver) {
        super(driver);
    }

    //Localizadores

    By locatorHotel = By.xpath("//figure[@class='e2zssff0 d-1u3qkqc e1cdiu7b0']");
    //figure[@class='e2zssff0 d-1u3qkqc e1cdiu7b0']
    //img[@class='horizontal d-q2h8mp e4f2r0y0']

    By locatorSinDisponibilidad = By.xpath("//span[contains(text(), 'No hemos encontrado ninguna')]");
    By locatorTxtNuevaBusqueda = By.xpath("//div[contains(text(), 'Realizar una nueva búsqueda')]");
    By locatorBtnMasBarato = By.xpath("//h5[contains(text(), 'Más barato')]");

    By locatorAtocha = By.xpath("//input[@aria-label='Puerta de Atocha (XOC)']");
    By locatorTickets = By.xpath("//div[@class='FullTripCard__PaymentContainer-sc-z8znd4-3 juamvE']");


    public void seleccionarHotel(){

        click(locatorHotel);
    }

    public void bajarAOfertas(){
        scrolling(findElement(locatorHotel));
    }

    public String sinDisponibilidad(){
        return getText(locatorSinDisponibilidad);
    }

    public Boolean noHayOferta(){
        return isDisplayed(locatorSinDisponibilidad);
    }

    public void masBarato(){
        click(findElement(locatorBtnMasBarato));
    }

    public void estacionAtocha(){
        scrolling(findElement(locatorAtocha));
        click(findElement(locatorAtocha));
    }

    public void seleccionaTicketMasBarato() throws InterruptedException{
        scrolling(findElement(locatorBtnMasBarato));
        Thread.sleep(2000);
        List<WebElement> ticketMasBarato = findElements(locatorTickets);
        Thread.sleep(2000);
        click(ticketMasBarato.get(0));

    }

    public Boolean noHayFecha(){
        return isDisplayed(locatorTxtNuevaBusqueda);
    }

    public String sinFechas(){
        return getText(locatorTxtNuevaBusqueda);
    }

    public void bajarAEstacion(){
        scrolling(findElement(locatorAtocha));
    }

    public void irATicket(){
        scrolling(findElement(locatorBtnMasBarato));
    }


}
