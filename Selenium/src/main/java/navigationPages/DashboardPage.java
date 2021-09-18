package navigationPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage {
	
	public DashboardPage(WebDriver driver) {
		PageFactory.initElements(driver,this);//Inicializamos los PageObject con Page Factory
											// This es un keyword de java con el que le estamos diciendo qe es la mis clase
			
	}
	
	//Dashboard PageObject/WebElements
	
	@FindBy(id="welcome")
	private WebElement welcomeDropDown;
	@FindBy(xpath ="//*[@id=\"welcome-menu\"]/ul/li[3]/a")
	private WebElement logoutBtn;
	
	public void logout() {
		welcomeDropDown.click();
		logoutBtn.click();
	}

}
