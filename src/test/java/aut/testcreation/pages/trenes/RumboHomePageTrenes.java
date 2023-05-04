package aut.testcreation.pages.trenes;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import framework.engine.selenium.SeleniumWrapper;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RumboHomePageTrenes extends SeleniumWrapper {

    public RumboHomePageTrenes(WebDriver driver) {
        super(driver);
    }
    private WebDriver driver;

    private WebDriverWait wait;

    private Select select;
    private JavascriptExecutor js;




    public void abrirUrl (String dato){

        navigateTo(dato);

    }

    public void clickear (WebElement locator){

        locator.click();

    }

    public  void completarTexto (WebElement locator, String texto){

        locator.sendKeys(texto);

    }

    public WebElement esperarElemento(WebElement element){
        wait = new WebDriverWait(driver,20);

        return wait.until(ExpectedConditions.visibilityOf(element));
    }



}
