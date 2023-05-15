package framework.engine.selenium;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SeleniumWrapper {

    private final WebDriver driver;

    private WebDriverWait wait;

    private JavascriptExecutor js;
    private Select select;

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
  



    public void seleccionaUnDiaDia(int dia)throws InterruptedException{
        By locatorDia = By.xpath("//button[contains(text(), "+dia+")]");
        Thread.sleep(3000);
        List<WebElement> day = findElements(locatorDia);
        click(day.get(0));
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


    // Métodos de espera
    public WebElement waitForElementToBeClickable(By locator, int timeoutInSeconds) {
        WebDriverWait wait = new WebDriverWait(driver, timeoutInSeconds);
        return wait.until(ExpectedConditions.elementToBeClickable(locator));
    }

    public WebElement waitForElementToBeVisible(By locator, int timeoutInSeconds) {
        WebDriverWait wait = new WebDriverWait(driver, timeoutInSeconds);
        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public Boolean waitForUrlToContain(String urlPart, int timeoutInSeconds) {
        WebDriverWait wait = new WebDriverWait(driver, timeoutInSeconds);
        return wait.until(ExpectedConditions.urlContains(urlPart));
    }

    public void waitInMs(int milliseconds) {
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void implicitWait(int seconds) {
        driver.manage().timeouts().implicitlyWait(seconds, TimeUnit.SECONDS);
    }

    public void scroll (String xpath){
        WebElement element = driver.findElement(By.xpath(xpath));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
    }

    public void clear(By locator) {
        WebElement indexTexto = driver.findElement(locator);
        indexTexto.clear();
    }
    public void submit(By locator) {
        WebElement enviarDatos = driver.findElement(locator);
        enviarDatos.submit();
    }
    public void cambiarDePestania() {

        // Hacer clic en un enlace que abre una nueva pestaña
        driver.findElement(By.linkText("Abrir nueva pestaña")).click();

        // Esperar a que se abra la nueva pestaña y cambiar el enfoque
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.numberOfWindowsToBe(2));
        for (String windowHandle : driver.getWindowHandles()) {
            String originalWindowHandle = driver.getCurrentUrl();
            if (!windowHandle.equals(originalWindowHandle)) {
                driver.switchTo().window(windowHandle);
                break;
            }
        }
    }

    public void switchToTabByTitleContains(String searchStr) {
        for (String ventana : driver.getWindowHandles()) {
            driver.switchTo().window(ventana);
            if (driver.getTitle().contains(searchStr)) {
                return;
            }
        }
    }
    public List <WebElement> buscarElementosWeb(By localizador){
        return driver.findElements(localizador);
    }


    public WebElement buscarElementoWeb(By localizador) {
        return driver.findElement(localizador);
    }


    public void seleccionarComboBoxPorTextoVisible(WebElement elemento, String valor){
        select = new Select(elemento);
        select.selectByVisibleText(valor);

    }
    public void escribir (String texto, WebElement elemento){

        elemento.sendKeys(texto);
        elemento.click();
    }

    public void cerrarVentana (){
        driver.close();
    }

    public String obtenerTexto (By localizador){
        return driver.findElement(localizador).getText();
    }



    public Boolean estaSeleccionado(By localizador){
        try{
            return driver.findElement(localizador).isSelected();
        }catch (org.openqa.selenium.NoSuchElementException e){
            return false;
        }

    }

    public WebElement esperarPorElementoVisible (WebElement elemento){
        wait = new WebDriverWait(driver, 20);

        return wait.until(ExpectedConditions.visibilityOf(elemento));
    }

    public void clickear(WebElement elemento){
        elemento.click();
    }


}


