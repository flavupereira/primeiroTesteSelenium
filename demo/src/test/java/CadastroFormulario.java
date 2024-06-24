import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CadastroFormulario {

    private WebDriver navegador;

    @BeforeTest
    public void setup() {

        navegador = new ChromeDriver();

        navegador.get("https://automationexercise.com/login");

    }

    @Test
    public void chromeTest() {
        // WebDriver navegador = new ChromeDriver();

        // navegador.get("https://automationexercise.com/login");

        // navegador.findElement(By.name("name")).sendKeys("curso");

        // Criar Formulario

        String nomeAleatorio = RandomStringUtils.randomAlphanumeric(8);

        WebElement loginPararCriarUsuario = navegador.findElement(By.className("signup-form"));

        // Preecnher o campo name
        loginPararCriarUsuario.findElement(By.name("name")).sendKeys(nomeAleatorio);

        String email = (nomeAleatorio + "@teste.com.br").trim();
        // clicar no botao singup
        loginPararCriarUsuario.findElement(By.name("email")).sendKeys(nomeAleatorio + "@teste.com.br");

        navegador.findElement(By.xpath("/html/body/section/div/div/div[3]/div/form/button")).click();

        WebElement cadastro = navegador.findElement(By.id("form"));

        cadastro.findElement(By.id("id_gender1")).click();
        cadastro.findElement(By.id("password")).sendKeys("abncdfg123");

        cadastro.findElement(
                By.xpath("/html/body/section/div/div/div/div[1]/form/div[5]/div/div[1]/div/select/option[18]"))
                .click();

        cadastro.findElement(
                By.xpath("/html/body/section/div/div/div/div[1]/form/div[5]/div/div[2]/div/select/option[8]"))
                .click();

        cadastro.findElement(
                By.xpath("/html/body/section/div/div/div/div[1]/form/div[5]/div/div[3]/div/select/option[23]"))
                .click();

        cadastro.findElement(By.id("newsletter")).click();

        cadastro.findElement(By.id("optin")).click();

        cadastro.findElement(By.id("first_name")).sendKeys("Pedro");

        cadastro.findElement(By.id("last_name")).sendKeys("Laranja");

        cadastro.findElement(By.id("company")).sendKeys("Curso2000Teste");

        cadastro.findElement(By.id("address1")).sendKeys("Rua A");

        cadastro.findElement(By.xpath("/html/body/section/div/div/div/div[1]/form/p[6]/select/option[2]")).click();

        cadastro.findElement(By.id("state")).sendKeys("NEY YORK");

        cadastro.findElement(By.id("city")).sendKeys("Olean");

        cadastro.findElement(By.id("zipcode")).sendKeys("41545154557");

        cadastro.findElement(By.id("mobile_number")).sendKeys("54869-0148845");

        navegador.findElement(By.xpath("/html/body/section/div/div/div/div[1]/form/button")).click();

    }

    @AfterTest
    public void tearDown() {
        navegador.quit();
    }

}
