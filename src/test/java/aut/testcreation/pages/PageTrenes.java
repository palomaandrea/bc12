package aut.testcreation.pages;

import framework.engine.selenium.SeleniumWrapper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PageTrenes extends SeleniumWrapper {
    public PageTrenes(WebDriver driver) {
        super(driver);
    }
        By btnIda = By.xpath("//div[contains(text(),'Solo ida')]");
        By btnIdayVuelta = By.xpath("//div[contains(text(),'Ida y vuelta')]");
        By Origen = By.xpath("//input[@id=':Rmhl6lalaqlql2m:']");
        By Destino = By.xpath("//input[@id=':Rqhl6lalaqlql2m:']");
        By FechadeIda = By.cssSelector("button.d-ccz9o3");
        By numeroida = By.xpath("//div[@class='d-mog2ng']/div[2]//button[.='10']");
        By numerovuelta =By.xpath("//button[@class='d-1dj49va']");
        By FechadeVuelta = By.xpath("[aria-label='Fecha de vuelta']");
        By Pasajero = By.xpath("//label[contains(text(),'Pasajero')]");
        By btnBuscar = By.xpath("//button[@class='d-1jmk4ql']");
        By fechaidamal = By.xpath("//div[@class='d-mog2ng']/div[2]//button[.='17']");
        By madrid = By.xpath("//ul[@class='d-1wtoxx4']/li[.='Madrid']");
        By Barcelona = By.xpath("//li[@class='d-1rf3z8c']");
        By fechaidax2= By.xpath("//label[contains(text(),'Fecha de ida')]");
        By fechavueltax2 = By.xpath("//label[contains(text(),'Fecha de vuelta')]");

        //Funciones

        public void SeleccionarbtnIda(){
            estaDesplegado(btnIda);
            clickear(btnIda);
        }
        public void SeleccionarbtnIdayVuelta(){
            clickear(btnIdayVuelta);
        }

        public void escribirorigen() {
            espera();
            clickear(Origen);
            escribir("Madrid",Origen);
            clickear(madrid);

        }

        public void seleccionardestino(){
            espera();
            clickear(Destino);
            escribir("Barcelona",Destino);
            espera();
            clickear(Barcelona);

        }

        public void escribirorigenraro(){
           // Montpellier Saint Roch
        }

        public void escribirdestinoraro(){
            clickear(Destino);
            escribir("Madrid",Destino);
            clickear(madrid);
        }



        public void seleccionarFechadeIda(){
            dobleClick(fechaidax2);
            espera();
            clickear(numeroida);
        }

        public void seleccionarFechaVuelta(){
            dobleClick(fechavueltax2);
            espera();
            clickear(numerovuelta);
        }

        public void buscar (){
            hacerenter(btnBuscar);
        }

        public void fechamalida(){
            clickear(FechadeIda);
            clickear(fechaidamal);
        }





    }

