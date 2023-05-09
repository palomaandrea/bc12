package aut.testcreation.pages.grupo1;

import aut.testcreation.base.SeleniumBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;

public class HotelesPage extends SeleniumBase{

    public HotelesPage(WebDriver driver) {super(driver);}

        //Locators


    //By locatorBtnRechazarCookies = By.xpath("//*[@id='iubenda-cs-banner']/div/div/div/div[3]/div[2]/button[1]");
    By locatorBuscarAlojamientoBar = By.xpath("//*[@id=\':R8qjalalaqlql2m:\']");

    //By locatorBuscarAlojamientoBarCualquierDestino = By.xpath("//*[@value=\"Cualquier destino\"]");

    By locatorBtnFechaFlexible = By.xpath("//*[@id=\"hub-csw-container\"]/div/div[2]/div/form/div/div[2]/div[1]/div/div[2]/header/div/div/div/button[2]");

    By locatorBtn2o3NOches =By.xpath("//*[@id=\"hub-csw-container\"]/div/div[2]/div/form/div/div[2]/div[1]/div/div[2]/div/div/section[1]/div/div/div[1]/div/button[3]");

    By locatorBtnCualquierFecha=By.xpath("//*[@id=\"hub-csw-container\"]/div/div[2]/div/form/div/div[2]/div[1]/div/div[2]/div/div/section[2]/div/div/div/div/button[1]/div");
    By locatorBtnClickDia = By.xpath("//*[@id=\"hub-csw-container\"]/div/div[2]/div/form/div/div[2]/div[1]/div/fieldset/div[1]/button");

    By locatorTiempo =By.xpath("//*[@id=\"hub-csw-container\"]/div/div[2]/div/form/div/div[2]/div[1]/div/div[2]/div");
    By locatorcalActivado = By.xpath("//*[@id=\"hub-csw-container\"]/div/div[2]/div/form/div/div[2]/div[1]/div/div");
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

    public void busquedaHotelPorCualquierDestinoYFechaFlexible() throws InterruptedException {
        clickear(locatorBuscarAlojamientoBar);
        Thread.sleep(2000);
        clickear(locatorBtnClickDia);
        Thread.sleep(2000);
        if(estaDesplegado(locatorcalActivado)){
            Thread.sleep(2000);
            clickear(locatorBtnFechaFlexible);

        }
        if(estaSeleccionado(locatorBtnFechaFlexible)&&estaDesplegado(locatorTiempo)){
            Thread.sleep(2000);
            clickear(locatorBtn2o3NOches);

        }
        Thread.sleep(2000);
        clickear(locatorBtnCualquierFecha);
        Thread.sleep(2000);
        clickear(locatorBtnHuesped);
        Thread.sleep(2000);
        clickear(locatorBtnClickBuscar);


    }




}
