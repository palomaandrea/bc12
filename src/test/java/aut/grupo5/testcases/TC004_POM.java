package aut.grupo5.testcases;

import aut.grupo5.pages.vuelos.RumboHomePage;
import aut.grupo5.pages.vuelos.OfertasVuelosPage;
import framework.engine.selenium.DriverFactory;
import framework.engine.selenium.SeleniumTestBase;
import org.junit.jupiter.api.Test;

public class TC004_POM extends SeleniumTestBase {
    RumboHomePage rumboHomePage;
    OfertasVuelosPage ofertasVuelosPage;

    @Test
    void buscarVueloIda() throws InterruptedException {
        rumboHomePage = new RumboHomePage(DriverFactory.getDriver());
        ofertasVuelosPage = new OfertasVuelosPage(DriverFactory.getDriver());
        rumboHomePage.irARumboYCookies(true);
        rumboHomePage.seleccioneTipoDeVuelo(false, true,false);
        rumboHomePage.limpiarCampos(true, false);
        rumboHomePage.agregarOrigen("Santiago (SCL)");
        rumboHomePage.agregarDestino("Buenos Aires (BUE)");
        rumboHomePage.fechaSoloIda();
        rumboHomePage.numPasajeros(false);
        rumboHomePage.realizarBusqueda();
        ofertasVuelosPage.cambiarPestaniaARumbo();
        ofertasVuelosPage.contarNumOfertas();
    }
}