package aut.testcreation.testcases;

import aut.testcreation.pages.vuelos.*;
import framework.engine.selenium.DriverFactory;
import framework.engine.selenium.SeleniumTestBase;
import org.junit.jupiter.api.Test;


public class TC002_POM extends SeleniumTestBase {
    RumboHomePage rumboHomePage;
    OfertasVuelosPage ofertasVuelosPage;
    TarifaVueloPage tarifaVueloPage;
    FormularioVuelosPage formularioVuelosPage;
    ServiciosAdicionalesPage serviciosAdicionalesPage;


    @Test
    void registroVuelo() throws InterruptedException {
        rumboHomePage = new RumboHomePage(DriverFactory.getDriver());
        ofertasVuelosPage = new OfertasVuelosPage(DriverFactory.getDriver());
        tarifaVueloPage = new TarifaVueloPage(DriverFactory.getDriver());
        formularioVuelosPage = new FormularioVuelosPage(DriverFactory.getDriver());
        serviciosAdicionalesPage = new ServiciosAdicionalesPage(DriverFactory.getDriver());
        rumboHomePage.formularioHomeIdaYVuelta( "Santiago (SCL)", "Portland (PDX)", true);
        ofertasVuelosPage.elegirPrimerOfertaQueAparezca();
        tarifaVueloPage.elegirTarifa(true);
        formularioVuelosPage.formularioDosPasajeros("Francisca", "Benavides", "Holamundo2222@gmail.com", "9255874", false, true, "08", "1993", "Gaston", "Gatuso", "09", "2001");
        serviciosAdicionalesPage.mensajeServiciosAdicEncontrado();
        if (serviciosAdicionalesPage.mensajeServiciosAdicEncontrado().equals("Servicios adicionales")) {
            System.out.println("Test completado con éxito: La ejecución del test finaliza en la pestaña 'Servicios adicionales'. \nMensaje: 'Servicios adicionales' ha sido encontrado y desplegado en pantalla.\n ");
        } else {
            System.out.println("Test sin éxito: No ha sido posible encontrar el mensaje: 'Servicios adicionales'. \n");
        }
    }
}