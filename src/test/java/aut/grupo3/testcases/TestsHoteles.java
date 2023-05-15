package aut.grupo3.testcases;

import aut.grupo3.base.TestBase;
import org.junit.jupiter.api.Test;
import aut.grupo3.pages.HomePage;
import aut.grupo3.pages.HotelesPage;

public class TestsHoteles extends TestBase {
    HomePage homePage;
    HotelesPage hotelespage;

    @Test
    public void CP001_BusquedaHotelesOK() throws InterruptedException {
        homePage=new HomePage(super.driver);
        hotelespage=new HotelesPage(super.driver);
        homePage.navegarAPagina("https://www.rumbo.es/");
        homePage.aceptarCookies();
        homePage.clickHoteles();

        hotelespage.busquedaHotelPorDestinoYFechaPorCalendario("Córdoba, España");

    }

    @Test
    public void CP001_BusquedaHotelesCualquierDestinoOK() throws InterruptedException {
        homePage=new HomePage(super.driver);
        hotelespage=new HotelesPage(super.driver);
        homePage.navegarAPagina("https://www.rumbo.es/");
        homePage.aceptarCookies();
        homePage.clickHoteles();
        hotelespage.busquedaHotelPorCualquierDestinoYFechaFlexible();

    }



}
