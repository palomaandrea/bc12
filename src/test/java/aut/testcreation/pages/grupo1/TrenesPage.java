package aut.testcreation.pages.grupo1;

import aut.testcreation.base.SeleniumBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TrenesPage extends SeleniumBase{

    public TrenesPage(WebDriver driver) {super(driver);}

    //Locators 01
    By btnOrigen=By.xpath("//*[@id=':Rmhl6lalaqlql2m:']");
    By btnDestino=By.xpath("//*[@id=':Rqhl6lalaqlql2m:']");
    By btnClickDia=By.xpath("//*[@id='hub-csw-container']/div/div/form/div[2]/div[2]/div[1]/div/fieldset/div[1]/button");
    By btnDiaIda=By.xpath("//*[@id='hub-csw-container']/div/div/form/div[2]/div[2]/div[1]/div/div/div/div/section/div/div/div[2]/div[2]/button[15]");
    By btnDiaVuelta=By.xpath("//*[@id='hub-csw-container']/div/div/form/div[2]/div[2]/div[1]/div/div/div/div/section/div/div/div[3]/div[2]/button[2]");
    By btnMasAdultos=By.xpath("//*[@id='hub-csw-container']/div/div/form/div[2]/div[3]/div[1]/div/div[2]/div/section/div/div[1]/div[2]/button[2]");
    By btnBuscar=By.xpath("//*[@id='hub-csw-container']/div/div/form/div[2]/div[4]/div/button");
    By btnSoloIda=By.xpath("//*[@id='hub-csw-container']/div/div/form/div[1]/div/div/div[2]");

    public void EscribirOrigen(){
        clickear(btnOrigen);
        escribir("A Coruña",btnOrigen);
    }
}
