package aut.testcreation.pages.trenes;

import framework.engine.selenium.SeleniumWrapper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import aut.testcreation.pages.trenes.Trenes;

import static org.openqa.selenium.Keys.ARROW_DOWN;
import static org.openqa.selenium.Keys.ENTER;

public class Flights extends SeleniumWrapper {

    private WebDriver driver;


    public Flights(WebDriver driver) {
        super(driver);
    }


    public  void titulo(){
        String titulo = getUrlTitle();
        System.out.println(titulo);
    }
    public void  esperarVisibleLocated(String xpath, int tiempo){
        waitForElementToBeVisible(By.xpath(xpath), tiempo);
    }

    public void  esperarClickeable(String xpath, int tiempo){
        waitForElementToBeClickable(By.xpath(xpath), tiempo);
    }


    public  void clickear(String xpath){
        click(By.xpath(xpath));
    }

    public void escribirInput (String xpath, String textoInput){
        write(textoInput,By.xpath(xpath));
    }

    public void teclaEnter (String xpath){
        sendKeys(ENTER, By.xpath(xpath));
    }
    public void teclaAbajo(String xpath){
        sendKeys(ARROW_DOWN, By.xpath(xpath));
    }

    public void esperaImplicita(int segundos){
        implicitWait(segundos);
    }

    public void hacerScroll (String xpath){

        scroll(xpath);

    }

    public  void  esperarElementos(String xpath, int tiempo){
        esperarClickeable(xpath,tiempo);
        clickear(xpath);
        implicitWait(10);
    }

    public void completarInputOrigen(String xpath,String texto){
        esperarVisibleLocated(xpath,10);
        clickear(xpath);
        teclaAbajo(xpath);
        escribirInput(xpath, texto);
        teclaAbajo(xpath);
        teclaEnter(xpath);
    }
    public void completarInputDestino(String xpath,String texto){
        clickear(xpath);
        escribirInput(xpath, texto);
        teclaAbajo(xpath);
        teclaAbajo(xpath);
        teclaAbajo(xpath);
        teclaAbajo(xpath);
        teclaAbajo(xpath);
        teclaAbajo(xpath);

        teclaEnter(xpath);
    }

    public void seleccionarFechaIda(String xpath, String xpath2){
        scroll(xpath);
        esperarVisibleLocated(xpath,10);
        clickear(xpath);
        clickear(xpath2);

    }
    public  void  seleccionarPasajeros(String xpath, String xpath2, String xpath3,String xpath4){
        scroll(xpath);
        esperarVisibleLocated(xpath,10);
        clickear(xpath);
        esperarVisibleLocated(xpath2, 10);
        clickear(xpath2);
        esperarVisibleLocated(xpath3,10);
        clickear(xpath3);
        esperarVisibleLocated(xpath4,10);
        clickear(xpath4);


    }
    public void clickBuscar(String xpath){
        esperarVisibleLocated(xpath,10);
        clickear(xpath);
    }
}
