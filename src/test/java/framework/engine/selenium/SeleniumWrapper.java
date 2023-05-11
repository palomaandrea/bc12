package framework.engine.selenium;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

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

    public void sendKeys(Keys key, By locator){
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
    public WebElement waitElement(Keys enter, By localizador){
        wait = new WebDriverWait(driver,20);

       return wait.until(ExpectedConditions.presenceOfElementLocated(localizador));
    }
    public WebElement waitElement(By localizador){
        wait = new WebDriverWait(driver,20);

        return wait.until(ExpectedConditions.presenceOfElementLocated(localizador));
    }




    public static String fixEncoding(String text) {
            byte[] utf8Bytes = text.getBytes(StandardCharsets.ISO_8859_1);
            return new String(utf8Bytes, StandardCharsets.UTF_8);
    }

    public void scrolling(WebElement elemento) {
        js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", elemento);
    }

    public void moverseAOtraPestana(int nro) {
        // Obtiene la lista de identificadores de las pestañas abiertas
        List<String> tabHandles = new ArrayList<>(driver.getWindowHandles());

        // Cambia al segundo tab (pestaña)
        driver.switchTo().window(tabHandles.get(nro));

    }

    public void moverseAOtraPestana(String text) {
        for (String pestana : driver.getWindowHandles()) {
            driver.switchTo().window(pestana);
            if (driver.getTitle().contains(text)) {
                return;
            }
        }
    }
  
    public void esperarAQueLaPaginaCargue(){
        driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
    }
    public void seleccionaUnDia(int dia)throws InterruptedException{
        By locatorDia = By.xpath("//button[contains(text(), "+dia+")]");
        Thread.sleep(3000);
        List<WebElement> day = findElements(locatorDia);
        click(day.get(11));
    }
    public void seleccionaDosDias(int dia1, int dia2) throws InterruptedException{
        By locatorDiaIda= By.xpath("//button[contains(text(), "+dia1+")]");
        By locatorDiaVuelta= By.xpath("//button[contains(text(), "+dia2+")]");
        Thread.sleep(3000);
        List < WebElement> diaIda = findElements(locatorDiaIda);
        click(diaIda.get(0));
        List < WebElement> diaVuelta = findElements(locatorDiaVuelta);
        click(diaVuelta.get(0));

    }
    public void seleccionaUnDiaDia(int dia)throws InterruptedException{
        By locatorDia = By.xpath("//button[contains(text(), "+dia+")]");
        Thread.sleep(3000);
        List<WebElement> day = findElements(locatorDia);
        click(day.get(0));
    }

}


