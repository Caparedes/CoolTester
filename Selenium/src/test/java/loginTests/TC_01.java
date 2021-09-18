package loginTests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import driverSetup.DriverSetup;
import navigationPages.LoginPage;
import variableGlobales.GobalVariables;
import wrapper.CommonMethods;


public class TC_01 {

	WebDriver driver = DriverSetup.setupDriver();
	
	//Login Page Object
	
	LoginPage login = new LoginPage(driver);
	
	@BeforeTest
	public void startWebDriver() {
		
		driver.get(GobalVariables.URL_PAGE);
		driver.manage().window().maximize();
		
	}
	
  @Test
  public void TC_01_CorrectLogin(){
	  
	  login.Login(GobalVariables.USER_ADMIN, GobalVariables.PASSWORD_ADMIN);
	  
  }
  
  @AfterTest
  public void closeDriver( ) {
	  CommonMethods.takeScreenshot(driver, "TC_01_CorrectLogin");
	  driver.close();
  }
}
