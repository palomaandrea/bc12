package framework.engine.selenium;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;

import java.util.List;


public class SeleniumWrapper {

    private final WebDriver driver;

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

    public void scrolling(By locator) {
        WebElement element = driver.findElement(locator);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", element);
    }

    public void seleccionarComboBoxPorTextoVisible(By locator, String valor) {
        WebElement elemento = findElement(locator);
        Select select = new Select(elemento);
        select.selectByVisibleText(valor);
    }

    public void switchToTabByTitleContains(String searchStr) {
        for (String ventana : driver.getWindowHandles()) {
            driver.switchTo().window(ventana);
            if (driver.getTitle().contains(searchStr)) {
                return;
            }
        }
    }




    public void write2(String inputText, WebElement element) {
        element.sendKeys(inputText);
    }
}

