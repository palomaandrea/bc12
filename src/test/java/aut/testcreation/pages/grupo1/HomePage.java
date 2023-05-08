package aut.testcreation.pages.grupo1;

import aut.testcreation.base.SeleniumBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends SeleniumBase {
    public HomePage(WebDriver driver) {super(driver);}

    //Locators
    By btnAceptarCookies=By.xpath("//button[contains(@class, 'iubenda-cs-accept-btn') and contains(@class, 'iubenda-cs-btn-primary') and contains(text(), 'Aceptar todo')]");
    By btnTrenes=By.xpath("//a[contains(text(),'Trenes')]");
    By btnVuelos=By.xpath("//a[contains(text(),'Vuelos')]");
    By btnHoteles=By.xpath("//a[contains(text(),'Hoteles')]");

    public void aceptarCookies(){
        clickear(btnAceptarCookies);
    }
    public void clickTrenes(){
        clickear(btnTrenes);
    }
    public void clickVuelos(){
        clickear(btnVuelos);
    }
    public void clickHoteles(){
        clickear(btnHoteles);
    }
}
