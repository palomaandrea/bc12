package aut.testcreation.testcases;

import aut.testcreation.pages.vuelos.RumboHomePage;
import aut.testcreation.pages.vuelos.*;
import framework.engine.selenium.DriverFactory;
import framework.engine.selenium.SeleniumTestBase;
import org.junit.jupiter.api.Test;

public class TC001_POM extends SeleniumTestBase {
    RumboHomePage rumboHomePage;
    OfertasVuelosPage ofertasVuelosPage;
    TarifaVueloPage tarifaVueloPage;
    FormularioVuelosPage formularioVuelosPage;
    ServiciosAdicionalesPage serviciosAdicionalesPage;
    VerificacionPagoPage verificacionPagoPage;

    @Test
    void comprobacionesHastaPago() throws InterruptedException {
        rumboHomePage = new RumboHomePage(DriverFactory.getDriver());
        ofertasVuelosPage = new OfertasVuelosPage(DriverFactory.getDriver());
        tarifaVueloPage = new TarifaVueloPage(DriverFactory.getDriver());
        formularioVuelosPage = new FormularioVuelosPage(DriverFactory.getDriver());
        serviciosAdicionalesPage = new ServiciosAdicionalesPage(DriverFactory.getDriver());
        verificacionPagoPage = new VerificacionPagoPage(DriverFactory.getDriver());
        rumboHomePage.formularioHomeIdaYVuelta( "Buenos Aires (BUE)", "Santiago (SCL)", false);
        ofertasVuelosPage.modificarVuelo( "Mendoza (MDZ)", "Cartagena");
        tarifaVueloPage.elegirTarifa(true);
        formularioVuelosPage.formularioLatam("Francisca", "Benavides", "Holamundo2222@gmail.com", "9255874", false, true, true, false,"08", "1993");
        serviciosAdicionalesPage.presionarSiguiente();
        verificacionPagoPage.verificacionYPago();
        if (verificacionPagoPage.verificacionYPago().equals("Verificación y pago")) {
            System.out.println("Test completado con éxito: La ejecución del test finaliza en la pestaña 'Verificación y pago'. \nNombre de pestaña 'Verificación y pago' ha sido encontrado y desplegado en pantalla.\n ");
        } else {
            System.out.println("Test sin éxito: No ha sido posible encontrar el nombre de pestaña 'Verificación y pago'. \n");
        }
    }
}
