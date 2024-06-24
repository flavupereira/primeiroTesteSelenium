package pageobject;

import org.openqa.selenium.WebDriver;

public class Basepage {

    protected WebDriver navegador;

    public Basepage(WebDriver navegador) {
        this.navegador = navegador;
    }

}
