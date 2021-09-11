package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ejemplo_ImplicitWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String exePath = "./driver/chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exePath);
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");//inicia el navegador en URL especificada
		driver.manage().window().maximize();//maximizar ventana
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//obteniendo objetos webelemts de la pagina web
		WebElement userName = driver.findElement(By.id("txtUsername"));

	}

}
