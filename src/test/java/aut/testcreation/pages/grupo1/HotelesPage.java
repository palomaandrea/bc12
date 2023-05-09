package aut.testcreation.pages.grupo1;

import aut.testcreation.base.SeleniumBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;

public class HotelesPage extends SeleniumBase{

    public HotelesPage(WebDriver driver) {super(driver);}

        //Locators


    //By locatorBtnRechazarCookies = By.xpath("//*[@id='iubenda-cs-banner']/div/div/div/div[3]/div[2]/button[1]");
    By locatorBuscarAlojamientoBar = By.xpath("//*[@id=\':R8qjalalaqlql2m:\']");

    By locatorBtnClickDia = By.xpath("//*[@id=\"hub-csw-container\"]/div/div[2]/div/form/div/div[2]/div[1]/div/fieldset/div[1]/button");
    By locatorBtnClickDiaIda = By.xpath("//*[@id=\"hub-csw-container\"]/div/div[2]/div/form/div/div[2]/div[1]/div/div/div/div/section/div/div/div[2]/div[2]/button[14]");
    By locatorBtnClickDiaVuelta = By.xpath("//*[@id=\"hub-csw-container\"]/div/div[2]/div/form/div/div[2]/div[1]/div/div/div/div/section/div/div/div[3]/div[2]/button[1]");
    By locatorBtnHuesped = By.xpath("//*[@id=\"hub-csw-container\"]/div/div[2]/div/form/div/div[3]/div[1]/div/div[1]/button");
    By locatorBtnClickBuscar = By.xpath("//*[@id=\"hub-csw-container\"]/div/div[2]/div/form/div/div[4]/div/button");

    public void busquedaHotelPorDestinoYFechaPorCalendario(String destino) throws InterruptedException {
        escribir(destino,locatorBuscarAlojamientoBar);
        Thread.sleep(2000);
        clickear(locatorBtnClickDia);
        Thread.sleep(2000);
        clickear(locatorBtnClickDiaIda);
        Thread.sleep(2000);
        clickear(locatorBtnClickDiaVuelta);
        Thread.sleep(2000);
        clickear(locatorBtnHuesped);
        Thread.sleep(2000);
        clickear(locatorBtnClickBuscar);



    }

}
