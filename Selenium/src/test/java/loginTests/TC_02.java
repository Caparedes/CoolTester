package loginTests;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import driverSetup.DriverSetup;
import navigationPages.LoginPage;
import variableGlobales.GobalVariables;
import wrapper.CommonMethods;


public class TC_02 {

	WebDriver driver = DriverSetup.setupDriver();
	
	//Login Page Object
	
	LoginPage login = new LoginPage(driver);
	
	@BeforeTest
	public void startWebDriver() {
		
		driver.get(GobalVariables.URL_PAGE);
		driver.manage().window().maximize();
		
	}
	
  @Test
  public void TC_02_IncorrectLogin(){
	  
	  boolean msjError = login.LoginIncorrect("SuperUser","superuser123");
	  Assert.assertTrue(msjError);
	  System.out.println("El usuario es incorrecto");
	  
  }
  
  @AfterTest
  public void closeDriver( ) {
	  CommonMethods.takeScreenshot(driver, "TC_02_IncorrectLogin");
	  driver.close();
  }
}
