package framework.engine.selenium;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SeleniumWrapper {

    private final WebDriver driver;
    private JavascriptExecutor js;

    //Constructor Base
    public SeleniumWrapper(WebDriver driver) {
        this.driver = driver;
    }

    //Wrappers Selenium
    public WebElement findElement(By locator) {
        return driver.findElement(locator);
    }

    public List<WebElement> findElements(By locator) {
        return driver.findElements(locator);
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

    public void click(By locator) {
        driver.findElement(locator).click();
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

    public void hacerenter(By localizador) {
        driver.findElement(localizador).submit();
    }

    public void espera() {
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    }

    public void dobleClick(By localizador) {
        Actions act = new Actions(driver);
        WebElement ele = driver.findElement(localizador);
        act.doubleClick(ele).perform();
    }

    public void scroll(By localizador) {
        WebElement elemento = driver.findElement(localizador);
        js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", elemento);

    }

    public void validacionText(By localizador, String text) {
        assertEquals(text, driver.findElement(localizador).getText());

    }

    public void clickear(By localizador) {
        driver.findElement(localizador).click();
    }

    public void escribir(String texto, By localizador) {
        driver.findElement(localizador).sendKeys(texto);
    }

    public boolean estaDesplegado(By localizador) {
        try {
            return driver.findElement(localizador).isDisplayed();
        } catch (org.openqa.selenium.NoSuchElementException e) {
            return false;
        }


    }
}