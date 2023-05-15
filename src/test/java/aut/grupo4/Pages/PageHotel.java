package aut.grupo4.Pages;

import framework.engine.selenium.SeleniumWrapper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PageHotel extends SeleniumWrapper {
    public PageHotel(WebDriver driver) {super(driver);
    }

//    XPath
    By btnHoteles = By.xpath("//div[@class='d-1ytebqy e10w470p3']//a[.='Hoteles']");
    By fecha = By.xpath("//span[.='lun, 8 may']");
    By fecha17 = By.xpath(" //div[@class='d-mog2ng']/div[2]//button[.='17']");
    By btnlupa = By.xpath("//button[@class='d-1jmk4ql']");

    By btnAceptarTodo = By.xpath("//button[@class='iubenda-cs-accept-btn iubenda-cs-btn-primary']");

   By destino = By.xpath("//input[@class='d-1o7da3w ed5mks91']");

    By primeraOP = By.cssSelector("[data-option-index='0'] .d-8qgvsz");
    By fecha31 = By.xpath("//button[.='31']");
    By iconoagregarhuspeded = By.xpath("//div[@class='d-1ea2lc2']/button[2]");

    By afuera = By.xpath("//div[@class='MuiBackdrop-root MuiBackdrop-invisible d-1my3fkn']");

    By Estrella = By.xpath("//ul[@id='lb_list_hotel_stars']/li[@class='styled__LiContainer-sc-1v4e66q-0 leObzb focused whith-label two-columns']//div[@class='sc-cyRfQX fxQeqI']");
    By SelectFiltro = By.xpath("//li[@class='styled__LiContainer-sc-1v4e66q-0 leObzb focused whith-label']");
    By btnAplicar = By.xpath("//div[@class='sc-kPaQWy gkFaGb']");

    By Mensaje = By.xpath("//div[@class='sc-fGFwAa ljuqoA']");

    By destinoerror = By.xpath("//input[@class='d-1o7da3w ed5mks91']");

    By btntodoslosfiltros = By.xpath("//div[@id='Pill-undefined']");

    By cerrarPrecio = By.xpath("//div[@id='PriceContainer']/div[@class='styled__ContainerLabel-sc-sugfyn-1 fmYqDG container-label']");
    By cerrarTipoAlojamiento = By.xpath("//div[@id='PropertyTypeContainer']/div[@class='styled__ContainerLabel-sc-sugfyn-1 fmYqDG container-label']");
    By cerrarNombreAlojamiento = By.xpath("//div[@id='PropertyTypeContainer']/div[@class='styled__ContainerLabel-sc-sugfyn-1 fmYqDG container-label']");

    By tresEstrella = By.xpath(" //*[@id=\'exp_elem_hotel_stars_3\']");
    By body = By.xpath("//aside[@class='AsideInfo__AsideInfoContainer-sc-jtsh90-1 isyvym']");
    By selecionreserva = By.xpath("//button[@class='Button-sc-1bbve8d-0 bsSjVP Hero___StyledScrollToIdButton-sc-1pqg2ch-22 bZMZIZ']");
    By selecionhotelop = By.xpath("//div[@class='sc-rZqKh jEcotq']/div[1]//div[@class='sc-jItqcz eIHWAb']");

    By btncontinuar= By.xpath("//div[@class='HotelPageRoomSection___StyledRoomPanel-sc-1mmoe2k-1 bCAKwe']//div[@class='RoomPanelMealPlanStructure__MealPlanStructureContainer-sc-guxc13-0 zhNTC RoomPanel___StyledMealPlanStructure-sc-szpnyn-21 JuwoH']/div[1]/div[1]//button[@class='Button-sc-1bbve8d-0 RoomPanelMealPlan___StyledButton-sc-u6tmcf-26 gRWIbt jrBcJL']");
    By btnreservafinal= By.xpath("//span[@class='submit__button-label']/span[2]");

//    Metodos/Steps

    public void aceptar() {clickear(btnAceptarTodo);}
    public void SeleccionarOpcionHoteles() {clickear(btnHoteles);}
    public void textdestino() { clickear(destino);}
    public void ingresDestino() { escribir("roma", destino);}
    public void primeraOpcion() {
        espera();
        clickear(primeraOP);
    }
    public void seleccionFechaEntrada() {clickear(fecha17);}
    public void seleccionFechaSalida() {clickear(fecha31);}
    public void cantidadHuesped(){clickear(iconoagregarhuspeded);clickear(afuera);}
    public void lupa() {clickear(btnlupa);}

    public void ValidarText() {
        validacionText(Mensaje, "Alojamientos en Roma");
    }

    public void todosLosFiltros() {clickear(btntodoslosfiltros);}
    public void cerrarfiltros()throws InterruptedException {
        clickear(cerrarPrecio);
        Thread.sleep(2000);
        clickear(cerrarTipoAlojamiento);
        Thread.sleep(2000);
        clickear(cerrarNombreAlojamiento);
        Thread.sleep(2000);
        scroll(Estrella);
        clickear(Estrella);
        Thread.sleep(2000);
        clickear(btnAplicar);
    }
    public void cerrarx2 ()throws InterruptedException {
        clickear(cerrarPrecio);
        Thread.sleep(2000);
        clickear(cerrarTipoAlojamiento);
        Thread.sleep(2000);
        clickear(cerrarNombreAlojamiento);
        Thread.sleep(2000);
        scroll(Estrella);
        Thread.sleep(2000);
        clickear(tresEstrella);
        Thread.sleep(2000);
        clickear(btnAplicar);
    }



    //test002

    public void seleccionhotel (){clickear(selecionhotelop);}


    //test003
    public void errorBusqueda (){escribir("humahuaewsedfvxhd2ca",destinoerror);}

    //test004
    //public void seleccionreserva (){ clickear(selecionreserva);}

    public void estrellamin()throws InterruptedException {
        scroll(tresEstrella);
        clickear(tresEstrella);
        Thread.sleep(2000);
        clickear(btnAplicar);
    }

    public void seleccionarbtncontinuar (){
        scroll(btncontinuar);
        clickear(btncontinuar);
       espera();
    }
    public void seleccionarbtnreservaf(){
        scroll(btnreservafinal);
        clickear(btnreservafinal);
        espera();
    }


//    public void filtroEstrellas() {clickear(btnlupa);}
//    public void CantidadEstrellas() {clickear(btnlupa);}
//    public void AplicarFiltro() {clickear(btnlupa);}


}