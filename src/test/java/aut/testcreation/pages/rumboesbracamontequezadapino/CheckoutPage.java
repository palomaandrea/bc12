package aut.testcreation.pages.rumboesbracamontequezadapino;

import framework.engine.selenium.SeleniumWrapper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutPage extends SeleniumWrapper {
    public CheckoutPage(WebDriver driver) {
        super(driver);
    }

    By locatorTxtDetallesViaje = By.xpath("//button[@data-test='journey-details-link']");
    By locatorTxtAside = By.xpath("//div[@class='panel-footer journey__details-footer']");
    By locatorTxtDetallesMensaje = By.xpath("//span[contains(text(),'Detalles del viaje')]");

    public void verDetallesViaje() throws InterruptedException {
        Thread.sleep(10000);
        scroll(findElement(locatorTxtAside));
        Thread.sleep(2000);
        click(locatorTxtDetallesViaje);
    }

    public String mensajeDetalleVuelo(){
        return getText(locatorTxtDetallesMensaje);
    }

}
