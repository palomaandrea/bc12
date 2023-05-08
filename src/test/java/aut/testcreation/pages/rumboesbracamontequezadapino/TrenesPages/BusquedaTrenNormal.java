package aut.testcreation.pages.rumboesbracamontequezadapino.TrenesPages;

import framework.engine.selenium.SeleniumWrapper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class BusquedaTrenNormal extends SeleniumWrapper {
    public BusquedaTrenNormal(WebDriver driver) {
        super(driver);
    }

    //Localizadores

    By locatorNuevaBusqueda = By.xpath("//button[contains(text(), 'Volver a buscar')]");

    By locatorBtnMasBarato = By.xpath("//body/div[@id='app-container']/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[1]/div[2]/div[1]/div[10]/div[1]/ul[1]/li[2]");
    ////li[@class='Tabs__ListElement-cncr__sc-61rlvo-1 ezUVfc active']
    //h5[contains(text(), 'Más barato')]
    By locatorAlmeria = By.xpath("//input[@aria-label='Almería (LEI)']");
    By locatorTickets = By.xpath("//div[@class='FullTripCard__PaymentContainer-sc-z8znd4-3 juamvE']");
    public void buscarDeNuevo(){
        scrolling(findElement(locatorNuevaBusqueda));
        click(findElement(locatorNuevaBusqueda));
    }

    public void masBarato()throws InterruptedException{
        //Thread.sleep(3000);
        findElement(locatorBtnMasBarato);
        click(waitElement(locatorBtnMasBarato));
        click(waitElement(locatorBtnMasBarato));
    }

    public void estacionAlmeria() throws InterruptedException{
        Thread.sleep(5000);
        scrolling(findElement(locatorAlmeria));
        click(findElement(locatorAlmeria));
    }

    public void seleccionaTicketMasBarato() throws InterruptedException{
        scrolling(findElement(locatorBtnMasBarato));
        Thread.sleep(5000);
        List<WebElement> ticketMasBarato = findElements(locatorTickets);
        click(ticketMasBarato.get(0));

    }
}
