package aut.grupo1.pages;

import framework.engine.selenium.SeleniumWrapper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RumboTrenesPage extends SeleniumWrapper {
    public RumboTrenesPage(WebDriver driver) {
        super(driver);
    }
    //locators

    //Rechazar cookies

    By cookiesLocator = By.xpath("//div[@class=\"iubenda-cs-rationale\"]");
    By rechazarCookiesLocator = By.xpath("//button[contains(text(), 'Rechazar todo')]");


    By btnTrenes = By.xpath("(//a[@title='Trenes'][normalize-space()='Trenes'])[1]");


    By BuscarOrigenLocator = By.xpath("(//input[@id=\":Rmhl6lalaqlql2m:\"])[1]");

    By primerOpcionOrigenEnLocator = By.xpath("//li[@id=':Rmhl6lalaqlql2m:-option-8']");

    By BuscarDestinoLocator = By.xpath("(//input[@id=\":Rqhl6lalaqlql2m:\"])[1]");
    By primerOpcionDestinoEnLocator = By.xpath("//li[@id=':Rqhl6lalaqlql2m:-option-8']");

    By seleccionFechaIdaLocator = By.xpath("//body/div[1]/div[2]/div/div[2]/div/div/div[5]/div/div/div/div/div/form/div[2]/div[2]/div[1]/div/div/div/div/section/div/div/div[2]/div[2]/button[6]");
    By seleccionFechaVueltaLocator = By.xpath("//body/div[1]/div[2]/div/div[2]/div/div/div[5]/div/div/div/div/div/form/div[2]/div[2]/div[1]/div/div/div/div/section/div/div/div[3]/div[2]/button[16]");

    By mjeError31DiasMas= By.xpath("//span[@class=\"d-1toc9z2\" and contains(text(), 'Lo sentimos, no se pueden reservar más de 31 noches')]");
    By btnSelecPersonasMasHabitacionLocator = By.xpath("//body/div[1]/div[2]/div/div[2]/div/div/div[5]/div/div/div/div/div/form/div[2]/div[3]/div/div/div/button");
    By btnBuscarLocator = By.xpath("//body/div[1]/div[2]/div/div[2]/div/div/div[5]/div/div/div/div/div/form/div[2]/div[4]/div/button");

    By btnTrenesHotel = By.xpath("//div[@class='d-1ytebqy e10w470p3']//a[.='Tren + Hotel']");
    By selecFechaIdaTHLocator = By.xpath("//body/div[1]/div[2]/div/div[2]/div/div/div[5]/div/div/div/div/div/form/div[2]/div[2]/div[1]/div/div/div/div/section/div/div/div[2]/div[2]/button[6]");
    By selecFechaVueltaTHLocator = By.xpath("//body/div[1]/div[2]/div/div[2]/div/div/div[5]/div/div/div/div/div/form/div[2]/div[2]/div[1]/div/div/div/div/section/div/div/div[2]/div[2]/button[6]");

    By selecHotelLocator = By.xpath("(//a[@class='sc-jFJHMl jtYlit'])[1]");
    By SelecTSoloAlojamientoLocator = By.xpath("//body/div[@id='__next']//div[2]/div[2]/section[1]/div[3]/div/div/div/div/div[1]/div[2]/div/div/div[1]/div/div[2]/button");
    By txtNombreLocator = By.xpath("//input[@name='name']");
    By txtApellidoLocator = By.xpath("//input[@name='surname']");

    By txtemailLocator = By.xpath("//input[@id=\"contact-email]");
    By txtTelefonoLocator = By.xpath("//input[@name='phone']");
    By mjeErrorDNI = By.xpath("//input[@name='groups.1.travellers.1.documentNumber']") ;

    By SrapasajeroLocator = By.xpath("//div[@class=\"radio-groups.1.travellers.1.title-MALE-label\"]");

    By txtPasajeroNombreLocator = By.xpath("//input[@name='name']");
    By txtPasajeroApellidoLocator = By.xpath("//input[@name='surname']");
    By inputDiaNacimientoLocator = By.xpath("//input[@id=\"input-groups.1.travellers.1.dateOfBirth-day\"]//ancestor::div[@class=\"form-control text-input date__field date_day\"]");

    By selecMesNacimientoLocator = By.xpath("//select[@class='form-control select-input date__field' and @aria-label='Selecciona el mes']");

    By anoNacimientoLocator = By.xpath("//input[@data-test='input-groups.1.travellers.1.dateOfBirth-year' and @class='form-control text-input date__year date__field ']");

    By selecDocumentoLocator = By.xpath("//select[@class='form-control select-input' and @aria-label='groups.1.travellers.1.documentType' ]");

    By btnTSoloAlojamientoLocator = By.xpath("//body/div[@id='__next']//div[2]/div[2]/section[1]/div[3]/div/div/div/div/div[1]/div[2]/div/div/div[1]/div/div[2]/button");

    By checkboxAniadirAsistenciaEsp = By.xpath("//input[@id=\"checkbox \"]//ancestor::div[@class=\"check\"]");

    By siguienteButtonLocator = By.xpath("//button[contains(text(), 'Siguiente')]");


    By inputOrigenMadrid = By.xpath("//input[@class=\"d-1r0xobh ed5mks91\"]");
    By inputDestinoCordoba = By.xpath("//input[@class=\"d-1r0xobh ed5mks91\"]");





    public void rechazarCookies(){
        if(isEnabled(cookiesLocator)){
            click(rechazarCookiesLocator);

        }

    }
    public void ingresarSeccionTrenes() {
        click(btnTrenes);

    }



    public void BuscarOrigen ( String lugar){


        click(BuscarOrigenLocator);
        write(lugar, BuscarOrigenLocator);
        click(primerOpcionOrigenEnLocator);
    }

    public void BuscarDestino ( String lugar){


        click(BuscarDestinoLocator);
        write(lugar, BuscarDestinoLocator);
        click(primerOpcionDestinoEnLocator);
    }

    public void fechaIdaVuelta () throws InterruptedException {

        click(seleccionFechaIdaLocator);
        Thread.sleep(5000);
        click(seleccionFechaVueltaLocator);
    }


    public String mensajedeErrorFecha() {
        return getText(mjeError31DiasMas);
    }

    public void  ingresarSeccionTrenesHotel(){

        click(btnTrenesHotel);



    }
    public void agregarPersonayHotel(){
        click(btnSelecPersonasMasHabitacionLocator);
    }

    public void bntBuscar(){
        click(btnBuscarLocator);

    }

    public void fechaIdaVueltaTH () throws InterruptedException {

        click(selecFechaIdaTHLocator);
        Thread.sleep(5000);
        click(selecFechaVueltaTHLocator);
    }

    public void selecionarTrenHotel() throws InterruptedException{
        click(selecHotelLocator);
        Thread.sleep(1000);
        cambiarDePestania();
        scroll(SelecTSoloAlojamientoLocator);


    }


    public void ingresarDatosUsuario (String nombre, String apellido,String email,int telefono, String nombre1, String apellido1, String day, String year) throws InterruptedException {

        write(nombre, txtNombreLocator);
        write(apellido, txtApellidoLocator);
        Thread.sleep(5000);
        write(email, txtemailLocator);
        write(String.valueOf(telefono), txtTelefonoLocator);
        Thread.sleep(5000);
        write(nombre1, txtPasajeroNombreLocator);
        write(apellido1, txtPasajeroApellidoLocator);
        write(String.valueOf(day), inputDiaNacimientoLocator);
        scrolling(buscarElementoWeb(selecMesNacimientoLocator));
        seleccionarComboBoxPorTextoVisible(buscarElementoWeb(selecMesNacimientoLocator), "Abril");
        write(year, anoNacimientoLocator);
        click(selecDocumentoLocator);

    }





    public String mensajeErrorDNI() {
        return getText(mjeErrorDNI);
    }



}
