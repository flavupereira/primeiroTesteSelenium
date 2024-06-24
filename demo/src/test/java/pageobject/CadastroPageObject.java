package pageobject;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CadastroPageObject {

    private WebDriver navegador;

    @BeforeTest
    public void setUp() {
        navegador = Web.createChrome();
    }

    @Test
    public void cadastro() {
        new PreCadastro(navegador)
                .login("TestaPaginaPreCadastro")
                .email("Testaemail@precadastro")
                .pagina()
                .genero()
                .senha("123456")
                .dia()
                .mes()
                .ano()
                .noticia()
                .opcao()
                .primeiroNome("Jose")
                .sobreNome("Teste")
                .rua("rua teste")
                .pais()
                .ano()
                .estado("Ceará")
                .cidade("Fortaleza")
                .codigoPostal("000000")
                .telefone("85999999")
                .pagina();

    }

    @AfterTest
    public void tearDown() {
        navegador.quit();

    }

}
