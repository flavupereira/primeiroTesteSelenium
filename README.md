# 🧪 Projeto de Automação de Testes - Automation Exercise

Projeto de automação de testes web utilizando Selenium WebDriver, TestNG e padrão
Page Object para testar o fluxo de cadastro no site Automation Exercise.

## 📋 Descrição do Projeto

Este projeto implementa testes automatizados para o processo de cadastro de usuários no 
site Automation Exercise, utilizando diferentes abordagens de implementação que evoluem desde 
testes simples até uma estrutura mais robusta com padrão Page Object.

## 📄 Arquivos de Configuração

- pom.xml - Configuração do Maven com dependências

- settings.json - Configurações do VS Code para Java

## 🛠️ Tecnologias Utilizadas

- Java 17 - Linguagem de programação

- Selenium WebDriver 4.20.0 - Automação web

- TestNG 7.10.2 - Framework de testes

- WebDriverManager 5.8.0 - Gerenciamento automático de drivers

- JUnit 4.13.2 - Assertions para testes

- FEST Assert 1.4 - Biblioteca de assertions

- Apache Commons Lang 3 - Geração de dados aleatórios

- Maven - Gerenciamento de dependências e build


  ## 🚀 Funcionalidades Implementadas

### 1. Testes Básicos

- **BeforeAfter.java** - Teste simples com WebDriver

- **Cadastro.java** - Teste com configuração Before/After do TestNG

- **CadastroFormulario.java** - Teste completo com preenchimento de formulário e dados aleatórios

### 2. Padrão Page Object

- **Web.java** - Factory para criação do WebDriver

- **Basepage.java** - Classe base para pages

- **PreCadastro.java** - Page Object para página inicial de cadastro

- **PaginaDeCadastro.java** - Page Object para formulário de cadastro

- **ContaCriada.java** - Page Object para página de confirmação

- **CadastroPageObject.java** - Teste utilizando o padrão Page Object

  ## 📖 Como Executar
### Pré-requisitos

- Java 17 ou superior

- Maven 3.6+

- Chrome Browser instalado

- Executando os Testes

## 🧩 Padrão Page Object Implementado

O projeto utiliza o padrão Page Object Model (POM) que oferece:

- Encapsulamento: Detalhes de localização de elementos são encapsulados

- Reusabilidade: Métodos podem ser reutilizados em múltiplos testes

- Manutenibilidade: Mudanças na UI exigem atualizações apenas nas pages

- Legibilidade: Testes ficam mais claros e expressivos

### Exemplo de Uso:

```new PreCadastro(navegador)
    .login("UsuarioTeste")
    .email("teste@email.com")
    .pagina()
    .genero()
    .senha("senha123")
    // ... mais ações
    .pagina(); // finaliza cadastro
```

## ⚙️ Configurações

### Dependências no pom.xml
- Selenium Java para automação web

- TestNG como framework de teste

- WebDriverManager para gerenciamento automático de drivers

- JUnit e FEST Assert para verificações

### Configurações do VS Code

- O settings.json inclui imports favoritos para:

- JUnit 4 e 5

- Mockito

- Assertions e Assumptions

## 🎯 Funcionalidades de Teste

✅ Navegação para página de login

✅ Preenchimento de formulário de cadastro

✅ Geração de dados aleatórios para testes

✅ Seleção de opções em dropdowns

✅ Marcação de checkboxes

✅ Submissão de formulários

✅ Verificação de criação de conta bem-sucedida


