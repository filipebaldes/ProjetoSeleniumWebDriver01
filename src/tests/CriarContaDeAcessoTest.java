package tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class CriarContaDeAcessoTest {

		@Test
		void testCriarContaDeUsuarioComSucesso() {
	
		/*
		 * Fun��o de teste para o passo 1 do caso de teste
		 */
		
		// Apontando o local onde esta o driver do googlechrome..
		System.setProperty("webdriver.chrome.driver",
				"c:\\drivers\\chromedriver.exe");
			
		// Abrindo o navegador do googlechrome..
		WebDriver driver = new ChromeDriver();
		
		// Acessar a p�gina que ser� utilizada para testes
		driver.get("https://lojaexemplod.lojablindada.com/customer/account/create/");
		
		// maximizar a janela do navegador
		driver.manage().window().maximize();
		
		// Preencha o campo 'Primeiro nome'
		driver.findElement(By.xpath("//*[@id=\"firstname\"]")).sendKeys("Filipe");
		
		// Preencha o campo '�ltimo nome'
		driver.findElement(By.xpath("//*[@id=\"lastname\"]")).sendKeys("Bald�s");
		
		// Preencha o campo 'Email'
		driver.findElement(By.xpath("//*[@id=\"email_address\"]")).sendKeys("filipe5teste@gmail.com");
		
		// Preencha o campo 'Senha"
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("teste5");
		
		// Preencha o campo 'Confirme a Senha'
		driver.findElement(By.xpath("//*[@id=\"confirmation\"]")).sendKeys("teste5");
		
		// Clicar no bot�o para cadastrar o cliente
		driver.findElement(By.xpath("//*[@id=\"form-validate\"]/div[3]/button")).click();
		
		// Ler a mensagem obtida pelo sistema
		String mensagem = driver.findElement(By.xpath("/html/body/div/div/div[3]/div/div[1]/div/div/ul/li/ul/li/span")).getText();
		
		// CRIT�RIO DO TESTE!
		// verificar a mensagem obtida pelo sistema
		// compara��o do Resultado Esperado X Resultado Obtido
		assertEquals(mensagem, "Obrigado por se registrar com LOJA EXEMPLO de Livros");
		
		// fechar o navegador..
		driver.close();
		
		
		
		
		
	}

}
