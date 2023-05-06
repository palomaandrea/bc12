package aut.testcreation.pages.vuelos;

import framework.engine.selenium.DriverFactory;
import framework.engine.selenium.SeleniumWrapper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class MultidestinoPage extends SeleniumWrapper {
    public MultidestinoPage(WebDriver driver) {
        super(driver);
    }

    //Locators
    By btnCancelar = By.xpath("//div[@class='ButtonPrimitiveContentChildren__StyledButtonPrimitiveContentChildren-sc-mra4yy-0 dLfJcB'][contains(text(),'Cancelar')]");
    By locatorInputs = By.xpath("//input[@data-test='SearchField-input']");
    By btnBorrarTodos = By.xpath("//div[@class='ButtonPrimitiveContentChildren__StyledButtonPrimitiveContentChildren-sc-mra4yy-0 NRXsW'][contains(text(),'Borrar todos')]");
    By locatorIngresarDestinoMulti = By.xpath("//div[@class='SearchFieldstyled__SearchFieldLabel-sc-1f3jsso-4 XIFZe'][contains(text(),'Destino')]");
    By locatoraceptarCookies = By.xpath("//button[@id='cookies_accept']");
    By btnBuscarMulti = By.xpath("//div[@class='ButtonPrimitiveContentChildren__StyledButtonPrimitiveContentChildren-sc-mra4yy-0 dLfJcB'] [contains(text(), 'Buscar')]");

    public void borrarPreIngresados(boolean limpiarCampos) throws InterruptedException {

        String popupHandle = DriverFactory.getDriver().getWindowHandles().toArray()[1].toString();
        // Cambiar contexto al cuadro emergente
        DriverFactory.getDriver().switchTo().window(popupHandle);
        // Interactuar con elementos dentro del cuadro
        DriverFactory.getDriver().findElement(btnCancelar).click();
        // Cambiar contexto al contexto predeterminado
        DriverFactory.getDriver().switchTo().defaultContent();
        click(locatoraceptarCookies);
        try {
            if (limpiarCampos) {
                click(btnBorrarTodos);
            }
        } catch (Exception e) {
            System.out.println("Error: Campos no se han limpiado con exito");
        }
        Thread.sleep(1000);
        click(btnBuscarMulti);
        List<WebElement> inputElements = DriverFactory.getDriver().findElements(locatorInputs);
        // Itera a través de los campos de entrada y verifica si estan vacios
        List<WebElement> emptyInputs = new ArrayList<>();
        for (WebElement inputElement : inputElements) {
            String value = inputElement.getAttribute("value");
            if (value == null || value.trim().isEmpty()) {
                emptyInputs.add(inputElement);
            }
        }
        // Comprueba si todos los campos de entrada están vacíos y, de ser así, imprime un mensaje indicando que el test no pasó
        if (emptyInputs.size() == inputElements.size()) {
            System.out.println("Todos los campos de entrada han sido borrados de forma exitosa. \nBoton 'Borrar todos' funciona segun lo esperado.");
        } else {
            // Imprime el número de campos de entrada vacíos encontrados y el número total de campos de entrada
            int totalInputs = inputElements.size();
            int emptyCount = emptyInputs.size();
            System.out.println("El test no paso: Se encontraron " + emptyCount + " campos de entrada vacíos de un total de " + totalInputs + " campos de entrada en la página. \nBoton 'Borrar todos' no realizo su funcion segun lo esperado.");
        }

    }
}








