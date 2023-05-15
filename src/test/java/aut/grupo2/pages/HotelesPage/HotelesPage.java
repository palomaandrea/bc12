package aut.grupo2.pages.HotelesPage;

import framework.engine.selenium.SeleniumWrapper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HotelesPage extends SeleniumWrapper {
    public HotelesPage(WebDriver driver) {
        super(driver);
    }

    //Localizadores generales
    By locatorSelectorUbicacionHotel = By.xpath("//input[@placeholder='¿Adónde quieres ir?']");
    By locatorSeleccionarUbicacion = By.xpath("//li[@data-option-index='0']");
    By locatorBtnBuscar = By.xpath("//button[@aria-label='Buscar']");
    //Localizadores de caso de prueba de hotel de mayor valor
    By locatorHuesped = By.xpath("//button[@aria-label='Reducir el número de adultos']");
    By locatorFechaEntrada = By.xpath("//button[contains(text(),'22')]");
    By locatorFechaSalida = By.xpath("//button[contains(text(),'26')]");
    By locatorBtnOrdenar = By.xpath("//img[@alt = 'Ordenar']");
    By locatorMayorValor = By.xpath("//label[contains(text(), 'Precio (más alto primero)')]");
    public void casoPrueba1(String buscarAlojamiento)throws InterruptedException{
        click(locatorSelectorUbicacionHotel);
        write(buscarAlojamiento, locatorSelectorUbicacionHotel);
        Thread.sleep(1000);
        click(locatorSeleccionarUbicacion);
        Thread.sleep(1000);
        click(waitElement(locatorFechaEntrada));
        click(waitElement(locatorFechaSalida));
        click(waitElement(locatorHuesped));
        click(waitElement(locatorBtnBuscar));
        click(waitElement(locatorBtnOrdenar));
        click(waitElement(locatorMayorValor));
        Thread.sleep(5000);
    }

    //Localizadores para caso de prueba con filtros
    By locatorFechaEntrada1 = By.xpath("//button[contains(text(),'24')]");
    By locatorFechaSalida1 = By.xpath("//button[contains(text(),'26')]");
    By locatorBtnEstrellas = By.xpath("//img[@alt = 'Estrellas']");
    By locatorBoxEstrellas = By.xpath("//li[@id = 'exp_elem_hotel_stars_3']");
    By locatorBtnRangoDePrecio = By.xpath("//img[@alt = 'Precio']");
    By locatorRangoPrecio = By.xpath("//div[contains(text(), '100')]");
    By locatorBtnAplicar = By.xpath("//button[@class = 'sc-eZYOHW khSA-dJ']");

    //<div class="sc-fYdXmn hgOFNA"><div class="sc-cmEail jmpLbV">Limpiar</div><div class="sc-eZYOHW khSA-dJ">Aplicar</div></div>

    public void casoPrueba2(String buscarAlojamiento)throws InterruptedException{
        click(locatorSelectorUbicacionHotel);
        write(buscarAlojamiento, locatorSelectorUbicacionHotel);
        Thread.sleep(1000);
        click(locatorSeleccionarUbicacion);
        Thread.sleep(1000);
        click(waitElement(locatorFechaEntrada1));
        click(waitElement(locatorFechaSalida1));
        click(waitElement(locatorHuesped));
        click(waitElement(locatorBtnBuscar));
        click(waitElement(locatorBtnEstrellas));
        click(waitElement(locatorBoxEstrellas));
        click(waitElement(locatorBtnAplicar));
        //click(waitElement(locatorBtnRangoDePrecio));
        //click(waitElement(locatorRangoPrecio));
        Thread.sleep(5000);
    }
    //Localizadores
    /*public void casoPrueba3(){
    }

    //Localizadores
    public void casoPrueba4(String buscarAlojamiento)throws InterruptedException{
        click(locatorSelectorUbicacionHotel);
        write(buscarAlojamiento, locatorSelectorUbicacionHotel);
        Thread.sleep(1000);
        click(locatorSeleccionarUbicacion);
        Thread.sleep(1000);
    }

    //Localizadores
    public void casoPrueba5(){
    }

    //Localizadores
    public void casoPrueba6(){
    }*/
}