package aut.grupo1.pages;

import framework.engine.selenium.SeleniumWrapper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static framework.engine.utils.Constants.BASE_URL_AUT;

public class RumboHomePageHoteles extends SeleniumWrapper {

    public RumboHomePageHoteles(WebDriver driver) {
        super(driver);
    }

    //localizadores de HOTELES
    By btnHotelesLocator = By.xpath("(//a[@title='Hoteles'][normalize-space()='Hoteles'])[1]");
    By btnCookiesAceptarLocator = By.xpath("//button[contains(text(),'Aceptar todo')]");
    By buscarAlojamientoEnLocator = By.xpath("(//input[@id=':R8qjalalaqlql2m:'])[1]");
    //                                                                   :R8qjalalaqlql2mm:-label
    By primerOpcionAlojamientoEnLocator = By.xpath("//li[@id=':R8qjalalaqlql2m:-option-0']");
    By seleccionFechaDeEntradaLocator = By.xpath("//body/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[5]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[2]/div[2]/button[4]");
    By seleccionFechaDeSalidaLocator = By.xpath("//body/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[5]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[2]/div[2]/button[9]");
    By btnMasPersonasLocator = By.xpath("//body/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[5]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/section[1]/div[1]/div[2]/div[2]/button[2]");
    By btnBuscarHotelesLocator = By.xpath("//body/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[5]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[4]/div[1]/button[1]/div[1]/*[1]");
    By txtPrecioLocator = By.xpath("//div[@class='sc-rZqKh jEcotq']/div[1]//span[@class='sc-iqavZe kDhOEP']");
    By selectHotelLocator = By.xpath("//body/div[@id='__next']/main[1]/div[1]/div[1]/div[2]/div[1]/a[1]");
    By btnContinuarReservaLocator = By.xpath("//div[@class='HotelPageRoomSection___StyledRoomPanel-sc-1mmoe2k-1 bCAKwe']//div[@class='RoomPanelMealPlanStructure__MealPlanStructureContainer-sc-guxc13-0 zhNTC RoomPanel___StyledMealPlanStructure-sc-szpnyn-21 JuwoH']/div[1]/div[1]//button[@class='Button-sc-1bbve8d-0 RoomPanelMealPlan___StyledButton-sc-u6tmcf-26 gRWIbt jrBcJL']");
    By selectSoloAlojamientoLocator = By.xpath("//body/div[@id='__next']/div[2]/section[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]");
    By txtNombreLocator = By.xpath("//input[@name='name']");
    By txtApellidoLocator = By.xpath("//input[@name='surname']");
    By txtEmailLocator= By.xpath("//input[@id='contact-email']");
    By txtTelefonoLocator = By.xpath("//input[@name='phone']");
    By checkNoProtegerViajeLocator = By.xpath("//label[@class='insurance__noThanks-radio-label']/span[@class='check']");
    By checkTarjetaCreditoLocator = By.xpath("//label[@id='radio-paymentGroups-creditCard-label']//span[@class='check']");
    By txtNombreTitularTarjetaLocator = By.xpath("//input[@name='creditCard.cardHolder']");
    By txtNumeroTarjetaLocator = By.xpath("//input[@name='creditCard.cardNumber']");
    By txtMesTarjetaLocator = By.xpath("//input[@placeholder='MM']");
    By txtYearTarjetaLocator = By.xpath("//input[@placeholder='AA']");
    By txtCVVLocator = By.xpath("//input[@name='creditCard.cvv']");


    //methods

    public void aceptarCookies (){
        click(btnCookiesAceptarLocator);
    }
    public void ingresarSeccionHoteles() {

        click(btnHotelesLocator);
    }
    public void buscarLugarAlojamiento ( String lugar){

       // WebElement esperarAlojamiento = findElement(buscarAlojamientoEnLocator);
        click(buscarAlojamientoEnLocator);
        write(lugar, buscarAlojamientoEnLocator);
        click(primerOpcionAlojamientoEnLocator);
    }

    public void fechaEntradaSalida () throws InterruptedException {

        click(seleccionFechaDeEntradaLocator);
        Thread.sleep(5000);
        click(seleccionFechaDeSalidaLocator);
    }

    public void buscarHotel() throws InterruptedException {
        click(btnBuscarHotelesLocator);
        Thread.sleep(3000);

    }

    public void clickCantMaximaPersonas() {
        buscarElementosWeb(btnMasPersonasLocator);
        int contador = 0;
        for (int i = 0; i < 10; i++) {
            click(btnMasPersonasLocator);
            contador++;
        }
        if (contador == 10) {
            System.out.println("La cantidad de personas no puede superar los 10");
        }
    }

    public void elegirHotel () throws InterruptedException {
        click(selectHotelLocator);
        Thread.sleep(5000);
        switchToTabByTitleContains("Pago seguro - Rumbo");
        scroll(selectSoloAlojamientoLocator);
        Thread.sleep(5000);
        click(btnContinuarReservaLocator);
        Thread.sleep(15000);

    }

    public void verificarPrecioHotel () {

        buscarElementosWeb(txtPrecioLocator);

        String precio = obtenerTexto(txtPrecioLocator);

        if(!precio.isEmpty()) {
            System.out.println("El precio es: " + precio);
            } else {
            System.out.println("El precio está vacío");
            }
    }

    public void ingresarDatosReserva (String nombre, String apellido, String email, int telefono
                                      ,String tarjetaNom, String tarjetaNum, int mes, int year, int cvv)
                                        throws InterruptedException {

        write(nombre, txtNombreLocator);
        write(apellido, txtApellidoLocator);
        write(email, txtEmailLocator);
        Thread.sleep(5000);
        write(String.valueOf(telefono), txtTelefonoLocator);
        Thread.sleep(5000);
        scroll(checkNoProtegerViajeLocator);
        Thread.sleep(5000);
        click(checkNoProtegerViajeLocator);
        Thread.sleep(5000);
        scroll(checkTarjetaCreditoLocator);
        click(checkTarjetaCreditoLocator);
        Thread.sleep(5000);
        write(tarjetaNom,txtNombreTitularTarjetaLocator);
        write(tarjetaNum, txtNumeroTarjetaLocator);
        write(String.valueOf(mes), txtMesTarjetaLocator);
        write(String.valueOf(year), txtYearTarjetaLocator);
        write(String.valueOf(cvv), txtCVVLocator);
        Thread.sleep(5000);
        System.out.println("DATOS DE LA TARJETA INCORRECTOS");
    }

    public void ingresarDatosOk (String nombre, String apellido, String email, int telefono
            ,String tarjetaNom, String tarjetaNum, int mes, int year, int cvv)
            throws InterruptedException {

        write(nombre, txtNombreLocator);
        write(apellido, txtApellidoLocator);
        write(email, txtEmailLocator);
        Thread.sleep(5000);
        write(String.valueOf(telefono), txtTelefonoLocator);
        Thread.sleep(5000);
        scroll(checkNoProtegerViajeLocator);
        Thread.sleep(5000);
        click(checkNoProtegerViajeLocator);
        Thread.sleep(5000);
        scroll(checkTarjetaCreditoLocator);
        click(checkTarjetaCreditoLocator);
        Thread.sleep(5000);
        write(tarjetaNom,txtNombreTitularTarjetaLocator);
        write(tarjetaNum, txtNumeroTarjetaLocator);
        write(String.valueOf(mes), txtMesTarjetaLocator);
        write(String.valueOf(year), txtYearTarjetaLocator);
        write(String.valueOf(cvv), txtCVVLocator);
        Thread.sleep(5000);
        System.out.println("DATOS INGRESADOS CORRECTOS");
    }

    public void ingresarDatosUsuario (String nombre, String apellido, String email, int telefono) throws InterruptedException {

        write(nombre, txtNombreLocator);
        write(apellido, txtApellidoLocator);
        write(email, txtEmailLocator);
        Thread.sleep(5000);
        write(String.valueOf(telefono), txtTelefonoLocator);
        Thread.sleep(5000);
        System.out.println("DATOS INGRESADOS INCORRECTOS");
    }


    public void navegarAlHome(){
        navigateTo(BASE_URL_AUT);
    }


}
