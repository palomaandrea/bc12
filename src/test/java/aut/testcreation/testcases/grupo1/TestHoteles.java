package aut.testcreation.testcases.grupo1;

import aut.testcreation.base.TestBase;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import aut.testcreation.pages.grupo1.HomePage;
import aut.testcreation.pages.grupo1.HotelesPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestHoteles extends TestBase {
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



}
