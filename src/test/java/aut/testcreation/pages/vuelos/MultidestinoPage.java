package aut.testcreation.pages.vuelos;

import framework.engine.selenium.SeleniumWrapper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import static framework.engine.utils.Constants.BASE_URL_AUT;
import static org.openqa.selenium.Keys.DOWN;
import static org.openqa.selenium.Keys.ENTER;

public class MultidestinoPage extends SeleniumWrapper {
    public MultidestinoPage(WebDriver driver) { super(driver);}

    //Locators
    By btnLimpiarCampo1 = By.xpath("//div[@data-test='PlacePickerInputPlace-close']");
    By btnLimpiarCampo2 = By.xpath("//*[@class='Icon__StyledIcon-sc-psgqgs-0 jIyban closeIcon']");
    By locatorIngresarOrigenMulti = By.xpath("//div[@class='SearchFieldstyled__SearchFieldLabel-sc-1f3jsso-4 XIFZe'][contains(text(),'Origen')]");
    //By locatorIngresarDestinoMulti = By.xpath("//div[@class='SearchFieldstyled__SearchFieldLabel-sc-1f3jsso-4 XIFZe'][contains(text(),'Destino')]");
    By locatorAceptarCoockiesMulti = By.xpath("//div[@class='ButtonPrimitiveContentChildren__StyledButtonPrimitiveContentChildren-sc-mra4yy-0 dLfJcB'][contains(text(),'Aceptar')]");


    public void borrarPreIngresados() {
        isDisplayed(btnLimpiarCampo1);
        click(btnLimpiarCampo1);
    }









}
