package aut.grupo4.Pages;

import framework.engine.selenium.SeleniumWrapper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PageCompra extends SeleniumWrapper {
    public PageCompra(WebDriver driver) {
        super(driver);
    }
        By titularTarjeta = By.name("creditCard.cardHolder");
        By numeroTarjeta = By.name("creditCard.cardNumber");
        By fechaVencimiento = By.xpath("//div[@class='credit-card__input-box css-15xcoh2']");
        By CVV = By.name("creditCard.cvv");
        By btnComprar = By.xpath("//button[@class='btn btn-cta submit__button submit__button--creditCard ']");


        //Funciones

    public void datoTitularTarjeta(){
        escribir("Lucia Galbiatti",titularTarjeta);
    }

    public void datoNumeroTarjeta(){
        escribir("1234 5678 9754 2345",numeroTarjeta);
    }

    public void datoFechaVencimiento(){
        escribir("0426",fechaVencimiento);
    }

    public void datoCVV(){
        escribir("123",CVV);
    }

    public void Compar(){
        clickear(btnComprar);
    }

    }

