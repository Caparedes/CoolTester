package navigationPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver,this);//Inicializamos los PageObject con Page Factory
											// This es un keyword de java con el que le estamos diciendo qe es la mis clase
			
	}

	//Login PageOBjects/WebElements
	@FindBy(id = "txtUsername")
	private WebElement userNameTxt;
	
	@FindBy(id = "txtPassword")
	private WebElement passwordTxt;
	
	@FindBy( id ="btnLogin")
	private WebElement btnLogin;
	
	@FindBy(id = "spanMessage")
	private WebElement spanMessage;
	
	public void Login (String user, String password) {
		userNameTxt.sendKeys(user);
		passwordTxt.sendKeys(password);
		btnLogin.click();
	}
	
	public boolean LoginIncorrect (String user, String password) {
		userNameTxt.sendKeys(user);
		passwordTxt.sendKeys(password);
		btnLogin.click();
		
		boolean errorMsj = spanMessage.getText().contains("Invalid credentials");
		return errorMsj;
		
		
	}
	
}
