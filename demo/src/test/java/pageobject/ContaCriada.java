package pageobject;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.WebDriver;

public class ContaCriada extends Basepage {

    public ContaCriada(WebDriver navegador) {
        super(navegador);

        assertTrue(navegador.getPageSource().contains("Account Created!"));

    }

}