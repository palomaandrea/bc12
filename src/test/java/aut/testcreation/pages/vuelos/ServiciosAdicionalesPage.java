package aut.testcreation.pages.vuelos;

import framework.engine.selenium.SeleniumWrapper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ServiciosAdicionalesPage extends SeleniumWrapper {
    public ServiciosAdicionalesPage(WebDriver driver) {
        super(driver);
    }

    By avanzarSgte = By.xpath("//button[@data-test='lead-generation-submit-btn']");
    By noElegirAsiento = By.xpath("//button[@data-testid='dialog-secondary-button']");
    By locatorElegirAsiento = By.xpath("//button[@class= 'button--1JeL9 btn btn-cta-outline hidden-xs']");
    By primerAsientoDisponible = By.xpath("//div[@class='seat seat-available'][1]");
    By btnAceptarPrimerAsiento = By.xpath("//button[contains(text(),'Continuar')]");
    By btnConfirmarAsientos = By.xpath("//button[contains(text(),'Confirmar')]");

    public void presionarSiguiente() throws InterruptedException {
        /*
        if (isDisplayed(locatorElegirAsiento)){
            scrolling(locatorElegirAsiento);
            click(locatorElegirAsiento);
            scrolling(primerAsientoDisponible);
            if (isEnabled(primerAsientoDisponible)) {
                Thread.sleep(1000);
                click(primerAsientoDisponible);
                Thread.sleep(1000);
                click(btnAceptarPrimerAsiento);
                Thread.sleep(1000);
                scrolling(primerAsientoDisponible);
                Thread.sleep(1000);
                click(primerAsientoDisponible);
                Thread.sleep(1000);
                click(btnConfirmarAsientos);
            }
            scrolling(avanzarSgte);
            click(avanzarSgte);
        } else { */
            scrolling(avanzarSgte);
            click(avanzarSgte);
            Thread.sleep(1000);
            click(noElegirAsiento);
        }
    }

