package ejemploAssertions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class EjemploHardAssert {
  @Test
  public void fassertEquals() {
	  int a = 10;
	  int b = 10;
	  Assert.assertEquals(a,b,"Los elementos no son iguales");
  }
  
  @Test
  public void assertNotEquals() {
	  int a = 10;
	  int b = 10;
	  Assert.assertEquals(a,b,"Los elementos no son iguales");
  }
  @Test
  public void TC_VerificarTituloDePagina() {
	  String exePath = "./driver/chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exePath);
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");//inicia el navegador en URL especificada
		driver.manage().window().maximize();//maximizar ventana
		
		String actualTitle = driver.getTitle();
		String expectedTitle = "OrangeHRM";
		
		Assert.assertEquals(actualTitle, expectedTitle);
	  
  }
}
  
