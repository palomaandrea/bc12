package aut.grupo3.base;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class SeleniumBase {
    private WebDriver driver;
    private WebDriverWait wait;
    private Select select;
    private JavascriptExecutor js;

    //Constructor

    public SeleniumBase(WebDriver driver) {
        this.driver = driver;
    }

    //Getters y Setters
    public WebDriver getDriver() {
        return driver;
    }
    public void setDriver(WebDriver driver) {
        this.driver = driver;
    }

    //Métodos
    public WebElement buscarElementoWeb(By localizador){
        return driver.findElement(localizador);
    }
    public List<WebElement> buscarElementosWeb(By localizador){
        return driver.findElements(localizador);
    }

    public void navegarAPagina(String url){
        driver.navigate().to(url);
    }
    public void clickear(By localizador){
        driver.findElement(localizador).click();
    }
    public void clickear(WebElement elemento){
        elemento.click();
    }
    public void escribir(String texto, By localizador){
        driver.findElement(localizador).sendKeys(texto);
    }
    public void escribir(Keys keys, By localizador){
        driver.findElement(localizador).sendKeys(keys);
    }
    public void escribir(String texto, WebElement elemento){
        elemento.sendKeys(texto);
    }
    public void cerrarVentana(){
        driver.close();
    }
    public String obtenerTexto(By localizador){
        return driver.findElement(localizador).getText();
    }
    public boolean estaDesplegado(By localizador){
        try{
            return driver.findElement(localizador).isDisplayed();
        }catch (NoSuchElementException e){
            return false;
        }
    }
    public boolean estaSeleccionado(By localizador){
        try{
            return driver.findElement(localizador).isSelected();
        }catch (NoSuchElementException e){
            return false;
        }
    }
    public void scrolling(WebElement elemento){
        js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", elemento);
    }
    public void seleccionarComboBoxPorTextoVisible(WebElement elemento,String valor){
        select = new Select(elemento);
        select.selectByVisibleText(valor);
    }
    public WebElement esperarPorElementoVisible(WebElement element){
        wait = new WebDriverWait(driver,20);

        return wait.until(ExpectedConditions.visibilityOf(element));
    }
    public void switchPestaniaPorTitulo(String pestania) {
        for (String ventana : driver.getWindowHandles()) {
            driver.switchTo().window(ventana);
            if (driver.getTitle().contains(pestania)) {
                return;
            }
        }
    }
}
