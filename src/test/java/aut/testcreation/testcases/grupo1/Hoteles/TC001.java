package aut.testcreation.testcases.grupo1.Hoteles;

import framework.engine.selenium.SeleniumTestBase;
import framework.engine.selenium.SeleniumWrapper;
import framework.engine.selenium.DriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.concurrent.TimeUnit;


public class TC001 {

    WebDriver driver; //Creación de atributo WebDriver

    WebDriverWait wait;

    JavascriptExecutor js;

    @FindBy(xpath = "/html/body/div[1]/div[1]/div/div[2]/div/div/div[3]/div/div[2]/div/ul/li[2]/div/a" )
    WebElement btnHoteles;


    @FindBy(xpath = "//*[@id='iubenda-cs-banner']/div/div/div/div[3]/div[2]/button[1]")
    WebElement btnRechazarCookies;

    @FindBy(xpath = "//*[@id=\':R8qjalalaqlql2m:\']" )
    WebElement buscarAlojamientoBar;


    @FindBy(xpath = "//*[@id=\"hub-csw-container\"]/div/div[2]/div/form/div/div[2]/div[1]/div/fieldset/div[1]/button")
    WebElement btnclickdia;

    @FindBy(xpath = "//*[@id=\"hub-csw-container\"]/div/div[2]/div/form/div/div[2]/div[1]/div/div/div/div/section/div/div/div[2]/div[2]/button[14]")
    WebElement btndiaida;

    @FindBy(xpath = "//*[@id=\"hub-csw-container\"]/div/div[2]/div/form/div/div[2]/div[1]/div/div/div/div/section/div/div/div[3]/div[2]/button[1]")
    WebElement btndiavuelta;

    @FindBy(xpath = "//*[@id=\"hub-csw-container\"]/div/div[2]/div/form/div/div[3]/div[1]/div/div[1]/button")
    WebElement btnHuesped;

    @FindBy(xpath = "//*[@id=\"hub-csw-container\"]/div/div[2]/div/form/div/div[4]/div/button")
    WebElement btnBUscar;




    @BeforeAll
    static void preparacionClase(){
        System.setProperty("file.encoding", "UTF-8");
        WebDriverManager.chromedriver().setup();
    }

    @BeforeEach
    void preTests(){
        driver = new ChromeDriver(); //Instanciamos el chromeDriver
        wait = new WebDriverWait(driver,10);
        js = (JavascriptExecutor) driver;

        PageFactory.initElements(driver,this);
        driver.get("https://www.rumbo.es/");

        //Maximizar page
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
    }


    @Test
    void CP001_TC001_OK_() throws InterruptedException {

        //Aqui crearemos el test
        btnRechazarCookies.click();
        btnHoteles.click();
        buscarAlojamientoBar.click();
        buscarAlojamientoBar.sendKeys("Cordoba, Argentina");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        btnclickdia.click();
        btndiaida.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        btndiavuelta.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        btnHuesped.click();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        btnBUscar.click();






    }





    @AfterEach
    void posTests(){
        //  driver.close();
    }




}
