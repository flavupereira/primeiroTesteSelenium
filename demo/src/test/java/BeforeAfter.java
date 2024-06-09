import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BeforeAfter {

    @Test
    public void chromeTest() {
        WebDriver navegador = new ChromeDriver();

        navegador.get("https://automationexercise.com/login");

        // navegador.findElement(By.name("name")).sendKeys("curso");

        // Criar Formulario
        WebElement loginPararCriarUsuario = navegador.findElement(By.className("signup-form"));

        // Preecnher o campo name
        loginPararCriarUsuario.findElement(By.name("name")).sendKeys("curso");

        // clicar no botao singup
        loginPararCriarUsuario.findElement(By.name("email")).sendKeys("curso2000teste@teste.com.br");

        navegador.findElement(By.xpath("/html/body/section/div/div/div[3]/div/form/button")).click();
        // navegador.quit();
    }

}
