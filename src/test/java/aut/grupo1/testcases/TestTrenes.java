package aut.grupo1.testcases;

import aut.grupo1.pages.RumboTrenesPage;
import framework.engine.selenium.SeleniumTestBase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

public class TestTrenes extends SeleniumTestBase {
    WebDriver driver;

    RumboTrenesPage rumboTrenesPage;

    @Test //OK
    public void CP0013_BusquedadeBoletosTrenes31Noches()throws InterruptedException{
        rumboTrenesPage = new RumboTrenesPage(super.driver);
        rumboTrenesPage.navigateTo("https://www.rumbo.es/");
        rumboTrenesPage.rechazarCookies();
        rumboTrenesPage.ingresarSeccionTrenes();
        Thread.sleep(5000);
        rumboTrenesPage.BuscarOrigen("Madrid (Mad)");
        Thread.sleep(5000);
        rumboTrenesPage.BuscarDestino("Cordoba (Cor)");
        Thread.sleep(5000);
        rumboTrenesPage.fechaIdaVuelta();

        Assertions.assertEquals("Lo sentimos, no se pueden reservar más de 31 noches", rumboTrenesPage.mensajedeErrorFecha());


    }

    @Test //OK
    public void CP00014_DatosViajeTrenesHotel() throws InterruptedException {
        rumboTrenesPage = new RumboTrenesPage(super.driver);
        rumboTrenesPage.navigateTo("https://www.rumbo.es/");
        rumboTrenesPage.rechazarCookies();
        rumboTrenesPage.ingresarSeccionTrenesHotel();
        Thread.sleep(5000);
        rumboTrenesPage.BuscarOrigen("Madrid (Mad)");
        Thread.sleep(5000);
        rumboTrenesPage.BuscarDestino("Cordoba (Cor)");
        Thread.sleep(5000);
        rumboTrenesPage.fechaIdaVueltaTH();
        rumboTrenesPage.agregarPersonayHotel();
        rumboTrenesPage.bntBuscar();


    }

    @Test
    public void CP0015_DatosdeReserva_DniNoIngresado () throws InterruptedException{
        rumboTrenesPage = new RumboTrenesPage(super.driver);
        rumboTrenesPage.navigateTo("https://www.rumbo.es/");
        rumboTrenesPage.rechazarCookies();
        rumboTrenesPage.ingresarDatosUsuario("Julia", "Martinez","juliamartinez12@gmail.com",1131345682,"Andres","Lopez","9","1990");
        Assertions.assertEquals("Introduce nº de documento", rumboTrenesPage.mensajeErrorDNI());



    }





}
