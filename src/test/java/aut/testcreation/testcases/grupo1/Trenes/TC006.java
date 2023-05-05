package aut.testcreation.testcases.grupo1.Trenes;

//ida y vuelta

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
import java.util.concurrent.TimeUnit;

public class TC006 {
    WebDriver driver; //Creación de atributo WebDriver
    WebDriverWait wait;

    JavascriptExecutor js;

    @FindBy(xpath = "//*[@id='iubenda-cs-banner']/div/div/div/div[3]/div[2]/button[2]")
    WebElement btnaceptar;
    @FindBy(xpath = "/html/body/div[1]/div[1]/div/div[2]/div/div/div[3]/div/div[2]/div/ul/li[8]/div/a" )
    WebElement btntrenes;
    @FindBy(xpath = "//*[@id='hub-csw-container']/div/div/form/div[2]/div[2]/div[1]/div/fieldset/div[1]/button")
    WebElement btnclickdia;

    @FindBy(xpath = "//*[@id='hub-csw-container']/div/div/form/div[2]/div[2]/div[1]/div/div/div/div/section/div/div/div[2]/div[2]/button[15]")
    WebElement btndiaida;

    @FindBy(xpath = "//*[@id='hub-csw-container']/div/div/form/div[2]/div[2]/div[1]/div/div/div/div/section/div/div/div[3]/div[2]/button[2]")
    WebElement btndiavuelta;

    @FindBy(xpath = "//*[@id='hub-csw-container']/div/div/form/div[2]/div[3]/div[1]/div/div[2]/div/section/div/div[1]/div[2]/button[2]")
    WebElement btnmasadultos;

    @FindBy(xpath = "//*[@id='hub-csw-container']/div/div/form/div[2]/div[4]/div/button")
    WebElement btnbuscar;

    @BeforeAll
    static void preparacionClase(){
        //System.setProperty("file.encoding", "UTF-8");
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
    void CP001_TC006_NOOK_() throws InterruptedException {

        //Aqui crearemos el test
        btnaceptar.click();
        btntrenes.click();

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

        btnmasadultos.click();
        btnmasadultos.click();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        btnbuscar.click();


    }


    @AfterEach
    void posTests(){
        //  driver.close();
    }

    public static String fixEncoding(String text) {
        byte[] utf8Bytes = text.getBytes(StandardCharsets.ISO_8859_1);
        return text;
    }
    // return new String(utf8Bytes, StandardCharsets.UTF_8);
}
