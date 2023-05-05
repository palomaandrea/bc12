package aut.testcreation.pages.vuelos;

import framework.engine.selenium.SeleniumWrapper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class VerificacionPagoPage extends SeleniumWrapper {
    public VerificacionPagoPage(WebDriver driver) {
        super(driver);
    }

    By locatorVerificaDatos = By.xpath("//div[contains(text(),'Verifica tus datos')]");


    public String mensajeVerificarEncontrado() {
        return getText(locatorVerificaDatos);
    }

}
