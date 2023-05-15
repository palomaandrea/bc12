package aut.grupo5.testcases;

import aut.grupo5.pages.vuelos.RumboHomePage;
import aut.grupo5.pages.vuelos.MultidestinoPage;
import framework.engine.selenium.DriverFactory;
import framework.engine.selenium.SeleniumTestBase;
import org.junit.jupiter.api.Test;

public class TC006_POM extends SeleniumTestBase {
    RumboHomePage rumboHomePage;
    MultidestinoPage multidestinoPage;

    @Test
    void botonBorrarTodos() throws InterruptedException {
        rumboHomePage = new RumboHomePage(DriverFactory.getDriver());
        multidestinoPage = new MultidestinoPage(DriverFactory.getDriver());
        rumboHomePage.irARumboYCookies(true);
        rumboHomePage.seleccioneTipoDeVuelo(false, false,true);
        multidestinoPage.cambiarPestaniaAMultidestino();
        multidestinoPage.repetirOrigenesDestinos(true, "Santiago de chile","Santiago de chile","Santiago de chile","Santiago de chile");
        multidestinoPage.buscarMultidestino();
        if (multidestinoPage.mensajeErrorMultidestino().equals("Prueba seleccionar fechas distintas o destinos cercanos.")) {
            System.out.println("Test completado con éxito: La ejecución del test finaliza con el mensaje de error esperado al ingresar mismos orígenes y destinos. \nMensaje: 'Prueba seleccionar fechas distintas o destinos cercanos' ha sido encontrado y desplegado en pantalla.\n ");
        } else {
            System.out.println("Test sin éxito: No ha sido posible encontrar el mensaje de error esperado. \n");
        }
    }
}