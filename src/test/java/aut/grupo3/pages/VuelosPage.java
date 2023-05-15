package aut.grupo3.pages;

import aut.grupo3.base.SeleniumBase;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class VuelosPage extends SeleniumBase{

    public VuelosPage(WebDriver driver) {super(driver);}

    //Locators 01
    By btnOrigen=By.xpath("//input[@aria-label='Origen' and @placeholder='Ciudad o aeropuerto']");
    By seleccionarOrigenLaRioja=By.xpath("//*[@id=\":R9d76jalalaqlql2m:\"]");
    By btnDestino=By.xpath("//input[@aria-label='Destino' and @placeholder='Ciudad o aeropuerto']");
    By btnDiaIda=By.xpath("//*[@id=\"hub-csw-container\"]/div/div[2]/div/form/div/div[4]/div[1]/div/div[2]/div/div/section/div/div/div[2]/div[2]/button[1]");
    By btnDiaVuelta=By.xpath("//*[@id=\"hub-csw-container\"]/div/div/form/div[2]/div[2]/div[1]/div/div/div/div/section/div/div/div[2]/div[2]/button[2]");
    By btnPasajeros=By.xpath("//*[@id=\"hub-csw-container\"]/div/div[2]/div/form/div/div[5]/div/div/div/button");
    By btnAgregarPasajeros=By.xpath("//*[@id=\"hub-csw-container\"]/div/div[2]/div/form/div/div[5]/div[1]/div/div[2]/div/section/div/div[1]/div[2]/button[2]");
    By btnBuscar=By.xpath("//*[@id=\"hub-csw-container\"]/div/div[2]/div/form/div/div[6]/div/button");
    By txtBusqueda=By.xpath("//*[@id=\"scrollableHeader\"]/div/div/div/div[1]/div/div/div/div/div[2]/div/div[1]");
    By txtBusquedaPestania=By.xpath("//*[@id=\"scrollableHeader\"]/div/div/div/div[1]/div/div/div/div/div[2]/div/div[1]");
    By btnSoloIda=By.xpath("//*[@id=\"hub-csw-container\"]/div/div[2]/div/form/div/div[1]/div/div/div[2]");
    public void EscribirOrigen() throws InterruptedException {
        //List<WebElement> origenes = buscarElementosWeb(btnOrigen);
        clickear(btnOrigen);
        Thread.sleep(3000);
        escribir("La Rioja (IRJ) - Captain V. A. Almonacid, Argentina",btnOrigen);
        escribir(Keys.ENTER,btnOrigen);
        Thread.sleep(1000);
        clickear(seleccionarOrigenLaRioja);
    }
    public void EscribirDestino() throws InterruptedException {
        //List<WebElement> origenes = buscarElementosWeb(btnOrigen);
        clickear(btnDestino);
        Thread.sleep(3000);
        escribir("Salta (SLA) - Martín Miguel de Güemes, Argentina",btnDestino);
        Thread.sleep(2000);
        escribir(Keys.TAB,btnDestino);
    }
    public void EscribirDestinoEquivocado() throws InterruptedException {
        //List<WebElement> origenes = buscarElementosWeb(btnOrigen);
        clickear(btnDestino);
        Thread.sleep(3000);
        escribir("Barcelona (BCN) - Todos los aeropuertos, España",btnDestino);
        Thread.sleep(2000);
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
    public String obtenerTextoBusquedaPestania(){
        return obtenerTexto(txtBusquedaPestania);
    }
    public void AgregarPasajero() throws InterruptedException {
        clickear(btnPasajeros);
        Thread.sleep(3000);
    }
    public void AgregarPasajeros() throws InterruptedException{
        clickear(btnAgregarPasajeros);
    }
    public void ClickSoloIda(){
        clickear(btnSoloIda);
    }
    public void CambiarPestaniaResultados(){
        switchPestaniaPorTitulo("Rumbo vuelos baratos La Rioja");
    }

}
