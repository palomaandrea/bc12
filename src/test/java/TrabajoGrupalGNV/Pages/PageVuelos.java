package TrabajoGrupalGNV.Pages;


import framework.engine.selenium.SeleniumWrapper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PageVuelos extends SeleniumWrapper {
    public PageVuelos(WebDriver driver) {
        super(driver);
    }

    //Mejor vuelo
    By btnMasBarato = By.xpath("//*[@id=\'top-listing-container\']/div[10]/div/ul/li[2]");
    By btnElMejor = By.xpath("//*[@id=\'top-listing-container\']/div[10]/div/ul/li[1]");

    By btnSinEscalas= By.xpath("//div[@class='Switchstyles__Slider-sc-1ym8u79-3 gFZhLg']");

    //Funciones



    public void presionarVueloSinEscalas(){
        espera();
        scroll(btnSinEscalas);
        clickear(btnSinEscalas);
        espera();
    }
    public void PresionarMasBarato(){
        clickear(btnMasBarato);
    }

    public void PresionarElMejor(){
        clickear(btnElMejor);
    }



}