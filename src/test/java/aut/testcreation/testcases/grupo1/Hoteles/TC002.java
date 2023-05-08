package aut.testcreation.testcases.grupo1.Hoteles;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.xml.xpath.XPath;
import java.util.concurrent.TimeUnit;

public class TC002 {
    WebDriver driver; //Creación de atributo WebDriver

    WebDriverWait wait;

    JavascriptExecutor js;

    @FindBy(xpath = "/html/body/div[1]/div[1]/div/div[2]/div/div/div[3]/div/div[2]/div/ul/li[2]/div/a" )
    WebElement btnHoteles;

    @FindBy(xpath = "//*[@id='iubenda-cs-banner']/div/div/div/div[3]/div[2]/button[1]")
    WebElement btnRechazarCookies;

    @FindBy(xpath = "//*[@id=\":R8qjalalaqlql2m:\"]" )
    WebElement buscarAlojamientoBar;

    @FindBy(xpath = "//span[.='Cualquier destino']")
    WebElement inputCualquierDestino;

    @FindBy(xpath = "//*[@id=\"hub-csw-container\"]/div/div[2]/div/form/div/div[2]/div[1]/div/fieldset/div[1]/button")
    WebElement btnFechaEntrada;
    @FindBy(xpath = "//*[@id=\"hub-csw-container\"]/div/div[2]/div/form/div/div[2]/div[1]/div/div/header/div/div/div/button[2]")
    WebElement btnClikFechaFlexible;

    @FindBy(xpath = "//*[@id=\"hub-csw-container\"]/div/div[2]/div/form/div/div[2]/div[1]/div/div[2]/div/div/section[1]/div/div/div[1]/div/button[3]")
    WebElement btn23Noches;

    @FindBy(xpath="//*[@id=\"hub-csw-container\"]/div/div[2]/div/form/div/div[2]/div[1]/div/div[2]/div/div/section[2]/div/div/div/div/button[1]")
    WebElement btnCualquierFecha;

    @FindBy(xpath ="//*[@id=\"hub-csw-container\"]/div/div[2]/div/form/div/div[3]/div/div/div/button")
    WebElement btnHuespedesHabitaciones;
    @FindBy(xpath="//*[@id=\"hub-csw-container\"]/div/div[2]/div/form/div/div[4]/div/button")
    WebElement btnBuscar;


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
    void CP001_TC002_OK_() throws InterruptedException {

        //Aqui crearemos el test
        btnRechazarCookies.click();
        btnHoteles.click();
        buscarAlojamientoBar.click();
        if(buscarAlojamientoBar.isDisplayed()){
            inputCualquierDestino.click();
        }
        btnFechaEntrada.click();
        if(btnFechaEntrada.isDisplayed() && btnFechaEntrada.isSelected() ){
            btnClikFechaFlexible.click();
        }
        btnClikFechaFlexible.isEnabled();
        btn23Noches.click();

        if(btn23Noches.isDisplayed()){
            btnCualquierFecha.click();
        }

        btnHuespedesHabitaciones.click();
        btnBuscar.click();













    }





    @AfterEach
    void posTests(){
        //  driver.close();
    }







}
