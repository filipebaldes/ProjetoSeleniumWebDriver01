package tests;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
class RealizarAutenticacaoTest {


		@Test
		void testAutenticarUsuarioComSucesso() {
		
		// Definir o local onde esta o driver do googlechrome..
		System.setProperty("webdriver.chrome.driver",
					"c:\\drivers\\chromedriver.exe");
		
		//abrir o navegador..
		WebDriver driver = new ChromeDriver();
		
		//acessar a p�gina de autentica��o de usuarios da loja de livros
		driver.get("https://lojaexemplod.lojablindada.com/customer/account/login");
		
		//preencha o campo email
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("filipe5teste@gmail.com");
		
		//preencha o campo senha
		driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("teste5");
		
		//clicar no bot�o de confirma��o
		driver.findElement(By.xpath("//*[@id=\"send2\"]")).click();
		
		
		//ler a mensagem obtida pelo sistema ap�s a autentica��o do usu�rio
		String mensagem = driver.findElement(By.xpath("/html/body/div/div/div[3]/div/div[1]/div/div/div[2]/p[1]/strong")).getText();
		
		//CRIT�RIO DE ACEITA��O
		//verificar o resultado da mensagem obtida
		//Resultado esperado X resultado obtido
		assertEquals(mensagem, "Ol�, Filipe Bald�s!");
		
		//fechar o navegador
		driver.close();
		
		
		
		
		
		
		
		
		
		
		fail("Not yet implemented");
	}

}
