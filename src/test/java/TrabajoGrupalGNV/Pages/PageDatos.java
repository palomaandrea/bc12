package TrabajoGrupalGNV.Pages;

import framework.engine.selenium.SeleniumWrapper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PageDatos extends SeleniumWrapper {
    public PageDatos(WebDriver driver) {
        super(driver);
    }
        By nombre = By.name("name");
        By apellido = By.name("surname");
        By mail = By.name("email");
        By telefono = By.name("phone");
        By genero = By.className("text");
        By Nombrepasajero = By.name("groups.1.travellers.1.name");
        By Apellidopasajero = By.name("groups.1.travellers.1.surname");
        By diaDeNacimiento = By.name("groups.1.travellers.1.dateOfBirth");
        By mesDeNacimiento = By.className("form-control select-input date__field");
        By Mes = By.xpath("//option[contains(text(),'marzo')]");
        By anioDeNacimiento = By.name("groups.1.travellers.1.dateOfBirth");
        By numeroDePasaporte = By.name("groups.1.travellers.1.documentNumber");
        By btnSiguiente = By.xpath("//button[contains(text(),'Siguiente')]");

        //Funciones

    public void datoNombre (){
        escribir("Lucia",nombre);
    }

    public void datoApellido(){
        escribir("Galbiatti",apellido);
    }

    public void datoMail(){
        escribir("luciagalbiatti@gmail.com",mail);
    }

    public void datoTelefono(){
        escribir("35890865245",telefono);
    }

    public void seleccionarGenero(){
        clickear(genero);
    }

    public void datoNombrePasajero(){
        escribir("Lucia",Nombrepasajero);
    }

    public void datoApellidoPasajero(){
        escribir("Galbiatti",Apellidopasajero);
    }

    public void datoDiaNacimiento(){
        escribir("4",diaDeNacimiento);
    }

    public void datoMesNacimiento(){
        clickear(mesDeNacimiento);
        clickear(Mes);
    }

    public void datoAnioNacimiento(){
        escribir("2000",anioDeNacimiento);
    }

    public void datoPasaporte(){
        escribir("430751491",numeroDePasaporte);
    }

    public void Siguiente(){
        clickear(btnSiguiente);
    }



    }

