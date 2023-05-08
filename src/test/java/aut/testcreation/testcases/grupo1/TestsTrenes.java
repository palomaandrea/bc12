package aut.testcreation.testcases.grupo1;

import aut.testcreation.base.TestBase;
import aut.testcreation.pages.grupo1.HomePage;
import aut.testcreation.pages.grupo1.TrenesPage;
import org.junit.jupiter.api.Test;

public class TestsTrenes extends TestBase {
    HomePage homePage;
    TrenesPage trenesPage;

    @Test
    public void CP001_TC001_NOOK() throws InterruptedException {
        homePage = new HomePage(super.driver);
        trenesPage = new TrenesPage(super.driver);
        homePage.navegarAPagina("https://www.rumbo.es/");
        homePage.aceptarCookies();
        homePage.clickTrenes();
        Thread.sleep(3000);
        trenesPage.EscribirOrigen();

        /*

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        By locatorbtnorigen = By.xpath("//*[@id=':Rmhl6lalaqlql2m:']");
        WebElement btnorigen = wait.until(ExpectedConditions.presenceOfElementLocated(locatorbtnorigen));

        btnorigen.sendKeys("A Coruña");

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        By locatorbtndestino = By.xpath("//*[@id=':Rqhl6lalaqlql2m:']");
        WebElement btndestino = wait.until(ExpectedConditions.presenceOfElementLocated(locatorbtndestino));

        btndestino.sendKeys("Barcelona");

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        btnclickdia.click();
        btndiaida.click();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        btndiavuelta.click();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //btnmasadultos.click();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        btnbuscar.click();
         */
    }
}
