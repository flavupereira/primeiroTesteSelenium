package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PreCadastro extends Basepage {

    public PreCadastro(WebDriver navegador) {
        super(navegador);

    }

    public PreCadastro login(String login) {
        navegador.findElement(By.id("form")).findElement(By.className("name")).sendKeys(login);
        return this;

    }

    public PreCadastro email(String email) {
        navegador.findElement(By.id("form"))
                .findElement(By.xpath("/html/body/section/div/div/div[3]/div/form/input[3]")).sendKeys(email);
        ;
        return this;
    }

    public PaginaDeCadastro pagina() {
        navegador.findElement(By.xpath("html/body/section/div/div/div[3]/div/form/button")).click();

        return new PaginaDeCadastro(navegador);

    }

}
