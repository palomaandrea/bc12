package aut.testcreation.pages;

import framework.engine.selenium.SeleniumWrapper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static framework.engine.utils.Constants.BASE_URL_AUT;
import static org.openqa.selenium.Keys.DOWN;
import static org.openqa.selenium.Keys.ENTER;

public class RumboHomePage extends SeleniumWrapper {

    public RumboHomePage(WebDriver driver) {
        super(driver);
    }

    //Locators para Todos los métodos (sea de vuelo, tren u hotel):
    By btnVueloIdaVuelta = By.className("d-vfn33k");
    By btnVueloSoloIda = By.className("d-1s1pmhl");
    By btnVueloMultidestino = By.className("d-1w89ccl");
    By btnLimpiarOrigen = By.className("d-1nmp0nm ed5mks90");
    By locatorOrigenVuelo = By.id(":Riqed6lalallbla2m:");
    By LocatorDestinoVuelo = By.id(":Rjaed6lalallbla2m:");



    //methods
    public void ingresarOrigen(String origenVuelo){
        click(btnLimpiarOrigen);
        write(origenVuelo,locatorOrigenVuelo);
        sendKeys(DOWN, locatorOrigenVuelo);
        sendKeys(ENTER, locatorOrigenVuelo);

    }
    public void ingresarDestino(String destinoVuelo){
        write(destinoVuelo,locatorOrigenVuelo);
        sendKeys(DOWN, LocatorDestinoVuelo );
        sendKeys(ENTER, LocatorDestinoVuelo );

    }






    //Métodos para vuelos:
    public void elegirVueloIdaYVuelta(){
        click(btnVueloIdaVuelta);
    }
    public void elegirVueloSoloIda(){
        click(btnVueloSoloIda);
    }
    public void elegirVueloMiltidestino(){
        click(btnVueloMultidestino);
    }



    //Métodos HomePage trenes


    //Métodos HomePage hoteles







    //Éste método se usa para todos los casos asi que no borrar:
    public void navegarAlHome(){
        navigateTo(BASE_URL_AUT);
    }


}
