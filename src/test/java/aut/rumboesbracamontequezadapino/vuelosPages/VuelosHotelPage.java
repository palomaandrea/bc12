package aut.rumboesbracamontequezadapino.vuelosPages;

import framework.engine.selenium.SeleniumWrapper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class VuelosHotelPage extends SeleniumWrapper {
    public VuelosHotelPage(WebDriver driver) {
        super(driver);
    }

    By locatorClear = By.xpath("//button[@aria-label='Clear']");
    By locatorInputOrigen = By.xpath("//input[@aria-label='Origen']");
    By locatorDecrementViajerosAdultos = By.xpath("//button[@aria-label='Reducir el número de adultos']");
    By locatorIncrementViajerosAdultos = By.xpath("//button[@aria-label='Aumentar el número de adultos']");
    By locatorCBViajeros = By.xpath("//span[contains(text(),'2 viajeros, 1 habitación')]");
    By locatorCBClase = By.xpath("//body/div[@id='__next']/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/div[4]/div[1]/div[1]/button[1]");
    By locatorCBBusiness = By.xpath("//body/div[@id='__next']/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/div[4]/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[4]");
    By locatorSelectFecha = By.xpath("//button[@aria-label='Fecha de ida']");
    By locatorSelectFechaIda = By.xpath("//button[contains(text(),'17')]");
    By locatorSelectFechaVuelta = By.xpath("//button[contains(text(),'24')]");
    By locatorBtnBuscar = By.xpath("//button[@type='submit']");
    By locatorTxtServicios = By.xpath("//span[contains(text(),'Ver todos los servicios')]");
    By locatorTxtMapa = By.xpath("//button[contains(text(),'Ver mapa')]");
    By locatorBtnSalir = By.xpath("//body/reach-portal[1]/div[3]/div[1]/div[1]/div[1]/*[1]");
    By locatorTxtComentarios = By.xpath("//span[contains(text(),'Ver todos los comentarios')]");
    By locatorDetalles = By.xpath("//button[contains(text(),'ver detalles')]");
    By locatorCerrar = By.xpath("//body/div[4]/div[3]/div[1]/div[1]/div[1]/div[1]");
    By locatorDetallesPrecio = By.xpath("//body/div[@id='root']/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[3]/div[5]/div[1]/div[1]/div[1]/div[1]/button[1]");
    By locatorBtnContinuar = By.xpath("//button[contains(text(),'Continuar')]");
    By locatorSeguro1 = By.xpath("//body[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[7]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[2]/span[1]/a[1]/p[1]");
    By locatorSeguro2 = By.xpath("//body[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[7]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[2]/div[2]/span[1]/a[1]/p[1]");
    By selectSeguro = By.xpath("//body/div[@id='root']/div[1]/div[2]/div[1]/div[1]/div[2]/div[7]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/label[1]/span[2]");
    public void datosHotel() throws InterruptedException {
        Thread.sleep(1000);
        scroll(findElement(locatorTxtMapa));
        click(locatorTxtMapa);
        Thread.sleep(1000);
        click(locatorBtnSalir);
        Thread.sleep(1000);
        scroll(findElement(locatorTxtServicios));
        click(waitElement(locatorTxtServicios));
        scroll(findElement(locatorTxtComentarios));
        scroll(findElement(locatorSelectFecha));
        click(waitElement(locatorSelectFecha));
        click(waitElement(locatorSelectFechaIda));

        try {
            if (isDisplayed(locatorSelectFechaVuelta)) {
                click(waitElement(locatorSelectFechaVuelta));
            }
        } catch (Exception e) {
            System.out.println("La fecha no se ha fijado");
        }
        click(waitElement(locatorDecrementViajerosAdultos));
        Thread.sleep(1000);
        click(locatorIncrementViajerosAdultos);
        Thread.sleep(1000);
        click(locatorCBViajeros);
        Thread.sleep(1000);
        click(waitElement(locatorCBClase));
        click(waitElement(locatorCBBusiness));
        click(waitElement(locatorBtnBuscar));
        Thread.sleep(3000);
        scroll(findElement(locatorBtnContinuar));
        List<WebElement> opcion = findElements(locatorBtnContinuar);
        Thread.sleep(1000);
        click(opcion.get(0));
        Thread.sleep(10000);
        scroll(findElement(locatorDetalles));
        Thread.sleep(10000);
        click(waitElement(locatorDetalles));
        Thread.sleep(10000);
        click(waitElement(locatorCerrar));
        scroll(findElement(locatorDetallesPrecio));
        click(waitElement(locatorDetallesPrecio));
        scroll(findElement(locatorSeguro1));
        click(waitElement(locatorSeguro1));
        click(waitElement(locatorSeguro2));
        click(waitElement(selectSeguro));
    }
}


