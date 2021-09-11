package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ejemplo_FindElements {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		String exePath = "./driver/chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exePath);
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");//inicia el navegador en URL especificada
		driver.manage().window().maximize();//maximizar ventana
		
		//obtieniendo objetos / webelements de la pagina web
		WebElement userName = driver.findElement(By.id("txtUsername"));
		WebElement password = driver.findElement(By.id("txtPassword"));
		WebElement loginBtn = driver.findElement(By.id("btnLogin"));
		
		//Login
		userName.sendKeys("Admin");
		Thread.sleep(2000);
		password.sendKeys("admin123");
		Thread.sleep(2000);
		loginBtn.click();
		
		//FindElements
		List<WebElement> firstLevelMenu = driver.findElements(By.className("firstLevelMenu"));
		
		System.out.println("Numero de Menus" + firstLevelMenu.size());//numero de elementos
		
		String primerMenu = firstLevelMenu.get(0).getText();
		String segundoMenu = firstLevelMenu.get(1).getText();
		
		System.out.println(primerMenu);
		System.out.println(segundoMenu);
		
		for (int i = 0; i<firstLevelMenu.size();i++) {
			System.out.println("Los menus son :" + firstLevelMenu.get(i).getText());
		}
		driver.close();
		
		

	}

}
