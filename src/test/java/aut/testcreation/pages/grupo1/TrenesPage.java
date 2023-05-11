package aut.testcreation.pages.grupo1;

import aut.testcreation.base.SeleniumBase;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class TrenesPage extends SeleniumBase{

    public TrenesPage(WebDriver driver) {super(driver);}

    //Locators 01
    By btnOrigen=By.xpath("//input[@placeholder='Origen']");
    By btnDestino=By.xpath("//input[@placeholder='Destino']");
    By btnDiaIda=By.xpath("//*[@id=\"hub-csw-container\"]/div/div/form/div[2]/div[2]/div[1]/div/div/div/div/section/div/div/div[2]/div[2]/button[1]");
    By btnDiaVuelta=By.xpath("//*[@id=\"hub-csw-container\"]/div/div/form/div[2]/div[2]/div[1]/div/div/div/div/section/div/div/div[2]/div[2]/button[2]");
    By btnPasajeros=By.xpath("//*[@id='hub-csw-container']/div/div/form/div[2]/div[3]/div[1]/div/div[1]/button");
    By btnAgregarPasajeros=By.xpath("//*[@id='hub-csw-container']/div/div/form/div[2]/div[3]/div[1]/div/div[2]/div/section/div/div[1]/div[2]/button[2]");
    By btnBuscar=By.xpath("//*[@id='hub-csw-container']/div/div/form/div[2]/div[4]/div/button");
    By txtBusqueda=By.xpath("//*[@id=\"scrollableHeader\"]/div/div/div/div[1]/div/div/div/div/div[2]/div/div[1]");
    By btnSoloIda=By.xpath("//*[@id='hub-csw-container']/div/div/form/div[1]/div/div/div[2]");
    By btnAniadirNinio=By.xpath("//*[@id=\"hub-csw-container\"]/div/div/form/div[2]/div[3]/div[1]/div/div[2]/div/section/div/div[2]/button");
    By btnNinio10Anios=By.xpath("//*[@id=\"hub-csw-container\"]/div/div/form/div[2]/div[3]/div[1]/div/div[2]/div/section/div/div[2]/div/div/ul/li[11]");
    By btnBebe12A23Meses=By.xpath("//*[@id=\"hub-csw-container\"]/div/div/form/div[2]/div[3]/div[1]/div/div[2]/div/section/div/div[2]/div/div/ul/li[2]");

    public void EscribirOrigen() throws InterruptedException {
        //List<WebElement> origenes = buscarElementosWeb(btnOrigen);
        clickear(btnOrigen);
        Thread.sleep(3000);
        escribir(Keys.TAB,btnOrigen);
    }
    public void EscribirDestino() throws InterruptedException {
        //List<WebElement> origenes = buscarElementosWeb(btnOrigen);
        clickear(btnDestino);
        Thread.sleep(3000);
        escribir("Barcelona",btnDestino);
        escribir(Keys.TAB,btnDestino);
    }
    public void ClickDia(){
        clickear(btnDiaIda);
    }
    public void ClickVuelta(){
        clickear(btnDiaVuelta);
    }
    public void ClickPasajeros(){
        clickear(btnPasajeros);
    }
    public void ClickBuscar(){
        clickear(btnBuscar);
    }
    public String obtenerTextoBusqueda(){
        return obtenerTexto(txtBusqueda);
    }
    public void AgregarPasajero() throws InterruptedException {
        clickear(btnPasajeros);
        Thread.sleep(3000);
    }
    public void AgregarPasajeros() throws InterruptedException{
        clickear(btnAgregarPasajeros);
    }
    public void AgregarNinio10Anios() throws InterruptedException {
        clickear(btnAniadirNinio);
        Thread.sleep(1000);
        clickear(btnNinio10Anios);
    }
    public void AgregarBebe12A23Meses() throws InterruptedException {
        clickear(btnAniadirNinio);
        Thread.sleep(1000);
        clickear(btnBebe12A23Meses);
    }

    public void ClickSoloIda(){
        clickear(btnSoloIda);
    }

}
