package framework.engine.selenium;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;


import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class SeleniumWrapper {

    private final WebDriver driver;

    private WebDriverWait wait;

    private JavascriptExecutor js;


    //Constructor Base
    public SeleniumWrapper(WebDriver driver) {
        this.driver = driver;
    }

    //Wrappers Selenium
    public WebElement findElement(By locator) {
        wait = new WebDriverWait(driver, 20);
        return wait.until(ExpectedConditions.presenceOfElementLocated(locator));

    }

    public List<WebElement> findElements(By locator) {
        wait = new WebDriverWait(driver, 20);
        return wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(locator));
        //return driver.findElements(locator);
    }

    public String getText(By locator) {
        return driver.findElement(locator).getText();
    }

    public void write(String inputText, By locator) {
        driver.findElement(locator).sendKeys(inputText);
    }

    public void sendKeys(Keys key, By locator) {
        driver.findElement(locator).sendKeys(key);
    }


    public void scroll(WebElement elemento) {
        js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", elemento);
    }

    public void click(By locator) {
        driver.findElement(locator).click();
    }

    public void click(WebElement elemento) {
        elemento.click();
    }

    public Boolean isDisplayed(By locator) {
        try {
            return driver.findElement(locator).isDisplayed();
        } catch (org.openqa.selenium.NoSuchElementException e) {
            return false;
        }
    }

    public Boolean isEnabled(By locator) {
        try {
            return driver.findElement(locator).isEnabled();
        } catch (org.openqa.selenium.NoSuchElementException e) {
            return false;
        }
    }

    public Boolean isSelected(By locator) {
        try {
            return driver.findElement(locator).isSelected();
        } catch (org.openqa.selenium.NoSuchElementException e) {
            return false;
        }
    }

    public void navigateTo(String url) {
        driver.navigate().to(url);
    }

    public String getUrlTitle() {
        return driver.getTitle();
    }

    public class ManejoEncodingUFT8 {

        public static String fixEncoding(String text) {
            byte[] utf8Bytes = text.getBytes(StandardCharsets.ISO_8859_1);
            return new String(utf8Bytes, StandardCharsets.UTF_8);
        }
    }

    public void scrolling(WebElement elemento) {
        js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", elemento);
    }

    public void moverseALaSegundaPestaña() {
        // Obtiene la lista de identificadores de las pestañas abiertas
        List<String> tabHandles = new ArrayList<>(driver.getWindowHandles());

        // Cambia al segundo tab (pestaña)
        driver.switchTo().window(tabHandles.get(1));

        // Abre la segunda página en la nueva pestaña
        //driver.get("URL de la segunda página");
    }
}


