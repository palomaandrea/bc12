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

    public void presionarSiguiente() throws InterruptedException {
        Thread.sleep(2000);
        scrolling(avanzarSgte);
        click(avanzarSgte);
        Thread.sleep(2000);
        if (isDisplayed(noElegirAsiento)){
            click(noElegirAsiento);
        }
    }
}

