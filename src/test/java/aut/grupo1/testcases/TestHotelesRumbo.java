package aut.grupo1.testcases;

import aut.grupo1.pages.RumboHomePageHoteles;
import framework.engine.selenium.DriverFactory;
import framework.engine.selenium.SeleniumTestBase;
import io.qameta.allure.Description;
import io.qameta.allure.Issue;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

import static framework.engine.utils.Constants.BASE_URL_AUT;

public class TestHotelesRumbo extends SeleniumTestBase {
    WebDriver driver;

    RumboHomePageHoteles rumboHomePageHoteles;




    @Test
    public void CP0001_BusquedaAlojamiento_OK() throws InterruptedException {
        rumboHomePageHoteles= new RumboHomePageHoteles(super.driver);
        rumboHomePageHoteles.navigateTo("https://www.rumbo.es/");
        rumboHomePageHoteles.aceptarCookies();
        rumboHomePageHoteles.ingresarSeccionHoteles();
        Thread.sleep(5000);
        rumboHomePageHoteles.buscarLugarAlojamiento("Barcelona");
        Thread.sleep(5000);
        rumboHomePageHoteles.fechaEntradaSalida();
        rumboHomePageHoteles.buscarHotel();
        Thread.sleep(5000);
    }
    @Test
    public void CP0002_BusquedaAlojamiento_CantMaxPersonas () throws InterruptedException {
        rumboHomePageHoteles= new RumboHomePageHoteles(super.driver);
        rumboHomePageHoteles.navigateTo("https://www.rumbo.es/");
        rumboHomePageHoteles.aceptarCookies();
        rumboHomePageHoteles.ingresarSeccionHoteles();
        Thread.sleep(5000);
        rumboHomePageHoteles.buscarLugarAlojamiento("Barcelona");
        Thread.sleep(1000);
        rumboHomePageHoteles.fechaEntradaSalida();
        rumboHomePageHoteles.clickCantMaximaPersonas();
    }

    @Test
    public void CP0003_PagoRechazado_noOK () throws InterruptedException {
        rumboHomePageHoteles= new RumboHomePageHoteles(super.driver);
        rumboHomePageHoteles.navigateTo("https://www.rumbo.es/");
        rumboHomePageHoteles.aceptarCookies();
        rumboHomePageHoteles.ingresarSeccionHoteles();
        Thread.sleep(5000);
        rumboHomePageHoteles.buscarLugarAlojamiento("Barcelona");
        Thread.sleep(5000);
        rumboHomePageHoteles.fechaEntradaSalida();
        rumboHomePageHoteles.buscarHotel();
        rumboHomePageHoteles.elegirHotel();
        Thread.sleep(5000);
        rumboHomePageHoteles.ingresarDatosReserva("Juliana", "Martinez", "julianamartinez.1452@gmail.com", 154123123, "Juliana Martinez", "123412341234", 10,24,123);

    }
    @Test
    public void CP004_ReservaHotel_CargaDatosOK () throws InterruptedException {
        rumboHomePageHoteles= new RumboHomePageHoteles(super.driver);
        rumboHomePageHoteles.navigateTo("https://www.rumbo.es/");
        rumboHomePageHoteles.aceptarCookies();
        rumboHomePageHoteles.ingresarSeccionHoteles();
        Thread.sleep(5000);
        rumboHomePageHoteles.buscarLugarAlojamiento("Barcelona");
        Thread.sleep(5000);
        rumboHomePageHoteles.fechaEntradaSalida();
        rumboHomePageHoteles.buscarHotel();
        Thread.sleep(5000);
        rumboHomePageHoteles.elegirHotel();
        Thread.sleep(5000);
        rumboHomePageHoteles.ingresarDatosOk("Juliana", "Martinez", "julianamartinez.1452@gmail.com", 154123123, "Juliana Martinez", "5547301830746856", 8,23,123);

    }
    @Test
    public void CP005_ReservaHotel_PrecioVisible () throws InterruptedException {
        rumboHomePageHoteles= new RumboHomePageHoteles(super.driver);
        rumboHomePageHoteles.navigateTo("https://www.rumbo.es/");
        rumboHomePageHoteles.aceptarCookies();
        rumboHomePageHoteles.ingresarSeccionHoteles();
        Thread.sleep(5000);
        rumboHomePageHoteles.buscarLugarAlojamiento("Barcelona");
        Thread.sleep(5000);
        rumboHomePageHoteles.fechaEntradaSalida();
        rumboHomePageHoteles.buscarHotel();
        rumboHomePageHoteles.verificarPrecioHotel();

    }
    @Test
    public void CP006_CargaDatosUsuarios_NO_OK () throws InterruptedException {
        rumboHomePageHoteles= new RumboHomePageHoteles(super.driver);
        rumboHomePageHoteles.navigateTo("https://www.rumbo.es/");
        rumboHomePageHoteles.aceptarCookies();
        rumboHomePageHoteles.ingresarSeccionHoteles();
        Thread.sleep(5000);
        rumboHomePageHoteles.buscarLugarAlojamiento("Barcelona");
        Thread.sleep(5000);
        rumboHomePageHoteles.fechaEntradaSalida();
        rumboHomePageHoteles.buscarHotel();
        Thread.sleep(5000);
        rumboHomePageHoteles.elegirHotel();
        Thread.sleep(5000);
        rumboHomePageHoteles.ingresarDatosUsuario("Juliana", "Martinez", "julianamartinez.1452", 154123123);
    }

    @Issue("123")
    @Issue("432")
    @DisplayName("Human-readable test name")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Test creado para bootcamp 12 tsoft")
    public void testDemo() throws InterruptedException {
        driver = DriverFactory.getDriver();
        driver.navigate().to(BASE_URL_AUT);
        Thread.sleep(5000);
        Assertions.assertTrue(true);
    }
}

