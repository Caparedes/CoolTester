package ejemploAssertions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class EjemploSoftAsserts {
	
	SoftAssert softA = new SoftAssert();
 /* @Test
  public void softAssertEjemplo() {
	  int a = 5;
	  int b = 10;
	  int x= 8;
	  int y = 8;
	  
	  softA.assertEquals(a,b);
	  softA.assertEquals(x, y);
	  
	  softA.assertAll();
	  
  }*/
  @Test
  public void softAsserEjemploSel() {
	  
	  String exePath = "./driver/chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exePath);
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");//inicia el navegador en URL especificada
		driver.manage().window().maximize();//maximizar ventana
		
		String actualTitle = driver.getTitle();
		String expectedTitle = "OrangeHRM";
		String badTitle= "OraneHRM";
		
		softA.assertEquals(actualTitle,expectedTitle);
		softA.assertEquals(actualTitle, badTitle);
		softA.assertAll();
		
		driver.close();
		
		
  }
}
