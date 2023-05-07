package aut.testcreation.pages.vuelos;

import framework.engine.selenium.DriverFactory;
import framework.engine.selenium.SeleniumWrapper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.ArrayList;
import java.util.List;

public class MultidestinoPage extends SeleniumWrapper {
    public MultidestinoPage(WebDriver driver) {super(driver);}

    By btnCancelar = By.xpath("//div[@class='ButtonPrimitiveContentChildren__StyledButtonPrimitiveContentChildren-sc-mra4yy-0 dLfJcB'][contains(text(),'Cancelar')]");
    By locatorInputs = By.xpath("//input[@data-test='SearchField-input']");
    By btnBorrarTodos = By.xpath("//div[@class='ButtonPrimitiveContentChildren__StyledButtonPrimitiveContentChildren-sc-mra4yy-0 NRXsW'][contains(text(),'Borrar todos')]");
    By locatoraceptarCookies = By.xpath("//button[@id='cookies_accept']");
    By btnBuscarMulti = By.xpath("//div[@class='ButtonPrimitiveContentChildren__StyledButtonPrimitiveContentChildren-sc-mra4yy-0 dLfJcB'] [contains(text(), 'Buscar')]");

    public void borrarPreIngresados(boolean limpiarCampos) throws InterruptedException {
        String popupHandle = DriverFactory.getDriver().getWindowHandles().toArray()[1].toString();
        DriverFactory.getDriver().switchTo().window(popupHandle);
        DriverFactory.getDriver().findElement(btnCancelar).click();
        DriverFactory.getDriver().switchTo().defaultContent();
        click(locatoraceptarCookies);
        try {
            if (limpiarCampos) {
                click(btnBorrarTodos);
            }
        } catch (Exception e) {
            System.out.println("Error: Campos no se han limpiado con éxito");
        }
        Thread.sleep(1000);
        click(btnBuscarMulti);
        List<WebElement> inputElements = DriverFactory.getDriver().findElements(locatorInputs);
        List<WebElement> inputsVacios = new ArrayList<>();
        for (WebElement inputElement : inputElements) {
            String value = inputElement.getAttribute("value");
            if (value == null || value.trim().isEmpty()) {
                inputsVacios.add(inputElement);
            }
        }
        if (inputsVacios.size() == inputElements.size()) {
            System.out.println("Todos los campos de entrada han sido borrados de forma exitosa. \nBotón 'Borrar todos' funciona según lo esperado.");
        } else {
            int totalInputs = inputElements.size();
            int contarVacios = inputsVacios.size();
            System.out.println("El test no paso: Se encontraron " + contarVacios + " campos de entrada vacíos de un total de " + totalInputs + " campos de entrada en la página. \nBotón 'Borrar todos' no realizó su función segón lo esperado.");
        }
    }
}








