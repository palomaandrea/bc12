package aut.grupo1.pages;

import framework.engine.selenium.SeleniumWrapper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static framework.engine.utils.Constants.BASE_URL_AUT;


public class RumboHomePageVuelos extends SeleniumWrapper {

    public RumboHomePageVuelos(WebDriver driver) {
        super(driver);
    }
    //locators

    //Rechazar cookies

    By cookiesLocator = By.xpath("//div[@class=\"iubenda-cs-rationale\"]");
    By rechazarCookiesLocator = By.xpath("//button[contains(text(), 'Rechazar todo')]");

    //By origenLocator = By.xpath("//input[@id=\":Riqed6lalallbla2m:\"]");

   By origenLocator = By.xpath("//input[@aria-label=\"Origen\"]");

    By origenPresenteLocator = By.xpath("//input[@value=\"Madrid (MAD) - Adolfo Suárez Barajas, España\"]");

    By itemVuelosCentral = By.xpath("//div[@class=\"tab-button selected d-16uu04l\"]");

    By itemVuelosNav = By.xpath("//a[@class=\"evvzyi82 d-134lsl7 e89md6u0\"]//ancestor::div[@class=\"d-1ytebqy e10w470p3\"]");


    By itemOrigenLocator = By.name("Buenos Aires (BUE");

    //By destinoLocator = By.xpath("//input[@id=\":Rjaed6lalallbla2m:\"]");

    By origenVacioLocator = By.xpath("//input[@value=\"\" and @aria-label=\"Origen\"]");

    By destinoLocator = By.xpath("//input[@aria-label=\"Destino\"]");


    By destinoVacioLocator= By.xpath("//input[@value=\"\" and @aria-label=\"Destino\"]");
    By btnBorrarDatosOrigen = By.xpath("//button[@class=\"d-1nmp0nm ed5mks90\" ]//preceding::label[@class=\"d-1vyfrs4\" and contains(text(), 'Origen')]");
    By inputFechaIdaLocator= By.xpath("//button[@aria-label=\"Fecha de ida\"]");

    By inputFechaVueltaLocator= By.xpath("//button[@aria-label=\"Fecha de vuelta\"]");

    By pasajerosLocator = By.xpath("//button[@class=\"d-1rd1vwn\"]");

    By cargaPasajerosLocator = By.xpath("//div[@class=\"d-fje0wm\"]");

    By agregaAdultosLocator = By.xpath("//button[@class=\"d-px64vf\" and @aria-label=\"Aumentar el número de adultos\"]");

    By reduceAdultosLocator = By.xpath("//button[@class=\"d-px64vf\" and @aria-label=\"Reducir el número de adultos\"]");

    By checkboxAniadirHotel = By.xpath("//input[@id=\"isDpSearch\"]//ancestor::div[@class=\"d-bss3ni\"]");


    By selectorFechaVueltaLocator = By.xpath("//button[@class=\"d-1kuzy14\" and contains(number(), '31')]");

    By selectorFechaIdaLocator = By.xpath("//button[@class=\"d-1kuzy14\" and contains(number(), '17')]//ancestor::div[@aria-labelledby=\"5\"]");
    By inputOrigenBsAs = By.xpath("//input[@class=\"d-1r0xobh ed5mks91\"]");
    By inputDestinoSantiagoCl = By.xpath("//input[@class=\"d-1r0xobh ed5mks91\"]");

    //By selectorFechaIdaLocator = By.xpath("//button[@class=\"d-1kuzy14\"]//preceding::span[contains(text(), 'mayo 2023')][1]");
    //By selectorFechaVueltaLocator = By.xpath("//button[@class=\"d-1kuzy14\"]//preceding::span[contains(text(), 'junio 2023')][1]");
    By inputOrigenElegido = By.xpath("//input[@class=\"d-1r0xobh ed5mks91\"]//preceding::label[contains(text(), 'Origen')][1]");
    By inputDestinoElegido = By.xpath("//input[@class=\"d-1r0xobh ed5mks91\"]//preceding::label[contains(text(), 'Destino')][1]");


    By mjeErrorIntroduceDestino = By.xpath("//span[@class=\"d-1toc9z2\" and contains(text(), 'Introduce ciudad o aeropuerto de destino')]");
    By btnBuscarLocator = By.xpath("//button[@class=\"d-1jmk4ql\"]//ancestor::div[@class=\"d-xxdz9z\"]");

    By selectorVuelomasRapido = By.xpath("//div[contains(@class,'listing-sorting-container')]//div[contains(@class,'Container__StyledContainer-sc-sb5e2u-0 cenTRx')]//ancestor::h5[normalize-space()='Más rápido']");

    By selectOpcionesIda = By.xpath("(//input[@class=\"PrivateSwitchBase-input css-1m9pwf3\" and @type=\"checkbox\"]//ancestor::div[@class=\"FullWaySummary__WaySelectable-sc-43fbz2-0 hSrNDC\"])[1]");

    By tildeOpcionIdaElegida = By.xpath("//div[@aria-labelledby=\"mui-336\"]");


    By selectEsperarResultados = By.xpath("//div[@class=\"layer-1\"]//ancestor::div[@class=\"grid-container grid-with-right-ads\"]");


    By tildeOpcionVueltaElegida = By.xpath("//div[@aria-labelledby=\"mui-514\"]");
    By selectOpcionesVuelta = By.xpath("(//input[@class=\"PrivateSwitchBase-input css-1m9pwf3\" and @type=\"checkbox\"]//ancestor::div[@class=\"FullWaySummary__WaySelectable-sc-43fbz2-0 hSrNDC\"])[2]");

   // By selectEsperarResultados = By.xpath("//title[contains(text(), 'Rumbo vuelos baratos Buenos Aires - Santiago')]");
    By selectFiltrarvuelos = By.xpath("//ul[@class=\"Tabs__UlElement-cncr__sc-61rlvo-0 evvvUR\"]");


    By locatorCheckBoxsVuelosIda = By.xpath("//div[@class=\"Tooltip___StyledMuiTooltip-sc-ya8k7d-3 gyqIyU\" and @aria-labelledby=\"mui-1\"]");

    By locatorCheckBoxsVuelosVuelta = By.xpath("//div[@class=\"Tooltip___StyledMuiTooltip-sc-ya8k7d-3 gyqIyU\" and @aria-labelledby=\"mui-6\"]");


    //Seccion Reserva

    By inputNombreContactoLocator = By.xpath("//input[@data-test=\"input-name\"]");
    By inputApellidoContactoLocator = By.xpath("//input[@data-test=\"input-surname\"]");
    By inputEmailContactoLocator = By.xpath("//input[@id=\"contact-email\"]");
    By inputTelefonoContactoLocator = By.xpath("//input[@data-test=\"input-phone\" ]//preceding::div[@class=\"selected-dial-code\"]");
    By selectCarateristicaTelefonoContactoLocator = By.xpath("//div[@class=\"selected-dial-code\"]");
    By inputDireccionContactoLocator = By.xpath("//input[@data-test=\"input-address\"]");
    By inputNumeroCalleContactoLocator = By.xpath("//input[@data-test=\"input-houseNumber\"]");
    By inputCodigoPostalContactoLocator = By.xpath("//input[@data-test=\"input-postCode\"]");
    By inputCiudadContactoLocator = By.xpath("//input[@data-test=\"input-city\"]");
    By selectPaisContactoLocator = By.xpath("//div[@class=\"selected-flag\"]");

    By inputNombrePasajeroLocator = By.xpath("//input[@data-test=\"input-groups.1.travellers.1.name\"]");
    By inputApellidoPasajeroLocator = By.xpath("//input[@data-test=\"input-groups.1.travellers.1.surname\"]");

    By inputDiaNacimientoPasajeroLocator = By.xpath("//input[@data-test=\"input-groups.1.travellers.1.dateOfBirth-day\"]");
    By selectMesNacimientoPasajeroLocator = By.xpath("//div[@data-test=\"date-month-input\"]");
    By inputAnioNacimientoPasajeroLocator = By.xpath("//input[@data-test=\"input-groups.1.travellers.1.dateOfBirth-year\"]");

    By btnSiguiente = By.xpath("//button[@data-test=\"lead-generation-submit-btn\"]");

   By btnReservarAhora = By.xpath("//button[@data-test=\"submit-button\"]");

   By btnElegirFlexible = By.xpath("//button[@class=\"Button-sc-1bbve8d-0 ghhXOt\"]");

   By checkboxEquipaje = By.xpath("//label[@data-test=\"radio-label-selected\"]//preceding::div[@class=\"css-8nvty\"]");



       By locatorCheckBoxsVuelos = By.xpath("//div[@class=\"FullWaySummary__WaySelectable-sc-43fbz2-0 fXPHoK\"]");

       public void rechazarCookies () {

           if (isEnabled(cookiesLocator)) {
               click(rechazarCookiesLocator);

           }

       }

       public void ingresarOrigen (String origen){

           click(btnBorrarDatosOrigen);
           click(origenLocator);
           clear(origenLocator);

           write(origen, origenLocator);

           if (isDisplayed(origenLocator)) {

               click(inputOrigenElegido);
           }
       }
       public void ingresarDestino (String destino){


           click(destinoLocator);
           //clear(destinoLocator);
           write(destino, destinoLocator);

           if (isDisplayed(destinoLocator)) {

               click(inputDestinoElegido);
           }
       }
       public void borrarInputDestino () {

           click(destinoLocator);
           clear(destinoLocator);
           isSelected(destinoVacioLocator);

       }
       public void ingresarFecha () {


           click(inputFechaIdaLocator);

           if (isDisplayed(inputFechaIdaLocator)) {
               WebElement fechaIdaSeleccionada = findElement(selectorFechaIdaLocator);
               click(selectorFechaIdaLocator);
               boolean sehizoClick = fechaIdaSeleccionada.getAttribute("class").contains("selected");
               if (sehizoClick) {

                   click(selectorFechaVueltaLocator);
               }

           }

       }


       public void buscarVuelo () {

           submit(btnBuscarLocator);

       }
       public String mensajeErrorIngreseDestino () {
           return getText(mjeErrorIntroduceDestino);
       }

       public void aniadirHotel () {
           click(checkboxAniadirHotel);

       }

       public void seleccionarMasRapido () {


           click(selectorVuelomasRapido);

           switchToTabByTitleContains("Rumbo vuelos baratos Madrid - Cancún");

           click(selectorVuelomasRapido);


       }


       public void tildarOpcionIda () {

           switchToTabByTitleContains("Rumbo vuelos baratos Madrid - Santiago");


           click(locatorCheckBoxsVuelosIda);


       }

       public void tildarOpcionVuelta () {

           switchToTabByTitleContains("Rumbo vuelos baratos Madrid - Santiago");
           click(locatorCheckBoxsVuelosVuelta);
       }
       public void ingresarDatosContacto (String nombre, String apellido, String email, String telefono, String
       direccion, String nroCalle, String codigoPostal, String ciudad){

           write(nombre, inputNombreContactoLocator);
           write(apellido, inputApellidoContactoLocator);
           write(email, inputEmailContactoLocator);
           scrolling(buscarElementoWeb(selectCarateristicaTelefonoContactoLocator));
           write(telefono, inputTelefonoContactoLocator);
           write(direccion, inputDireccionContactoLocator);
           write(nroCalle, inputNumeroCalleContactoLocator);
           write(codigoPostal, inputCodigoPostalContactoLocator);
           write(ciudad, inputCiudadContactoLocator);
           scrolling(buscarElementoWeb(selectPaisContactoLocator));


       }

       public void ingresarDatosPasajero (String nombre, String apellido, String diaNacimiento, String anioNacimiento){

           write(nombre, inputNombrePasajeroLocator);
           write(apellido, inputApellidoPasajeroLocator);
           write(diaNacimiento, inputDiaNacimientoPasajeroLocator);
           scrolling(buscarElementoWeb(selectMesNacimientoPasajeroLocator));
           write(anioNacimiento, inputAnioNacimientoPasajeroLocator);


       }
       public void seleccionarTarifa () {
           switchToTabByTitleContains(" Pago seguro - Rumbo");
           scrolling(buscarElementoWeb(btnElegirFlexible));
           click(btnElegirFlexible);
       }
       public void seleccionarEquipaje () {

           scrolling(buscarElementoWeb(checkboxEquipaje));
           click(checkboxEquipaje);
       }
       public void clickEnSiguiente () {

           click(btnSiguiente);
       }
       public void seleccionarPrecio () {


       }
       public void reservarAhora () {
           click(btnReservarAhora);
       }


       public void navegarAlHome () {
           navigateTo(BASE_URL_AUT);
       }


   }
