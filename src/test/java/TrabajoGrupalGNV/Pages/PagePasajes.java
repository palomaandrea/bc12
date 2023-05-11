package TrabajoGrupalGNV.Pages;

import framework.engine.selenium.SeleniumWrapper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PagePasajes extends SeleniumWrapper {
    public PagePasajes(WebDriver driver) {
        super(driver);
    }
    By btnmasbarato = By.xpath("//*[@id=\'top-listing-container\']/div[10]/div/ul/li[3]");
    By btnmasrapido = By.xpath("//*[@id=\'top-listing-container\']/div[10]/div/ul/li[2]");
    By pasaje = By.className("FullTripCard__SelectedPriceContainer-sc-z8znd4-4 cbaIot");

    //Funciones

    public void seleccionarMasBarato(){
        clickear(btnmasbarato);
    }

    public void seleccionarMasRapido(){
        clickear(btnmasrapido);
    }

    public void seleccionarPasaje(){
        clickear(pasaje);
    }

    }

