package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EjemploSelenium {

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
		
		
		String title = driver.getTitle();
		System.out.println("El titulo es : " + title);
		
		String urlActual = driver.getCurrentUrl();
		System.out.println("La URL actual es : " + urlActual);
		
		//Metodos de navvegacion
		//driver.navigate().back();
		//Thread.sleep(2000);
		//driver.navigate().forward();
		//Thread.sleep(2000);
		//driver.navigate().refresh();
		
		//Click en 'Assign Leave'
		WebElement assignLeaveBtn = driver.findElement(By.className("quickLinkText"));
		assignLeaveBtn.click();
		
		//Enviar texto a employee name
		WebElement employeNameTxt = driver.findElement(By.name("assignleave[txtEmployee][empName]"));
		Thread.sleep(2000);
		employeNameTxt.sendKeys("Carlos Paredes");
		Thread.sleep(2000);
		//Borrar Texto
		employeNameTxt.clear();
		
		//Verificar web element desplegado en pantalla
		boolean assignBtn = driver.findElement(By.id("assignBtn")).isDisplayed();
		if(assignBtn) {
			System.out.println("El boton Assign esta desplegado");
		}
		
		//Obtener texto
		String welcomeMsj = driver.findElement(By.id("welcome")).getText();
		System.out.println("El mensaje es " + welcomeMsj);
		
		boolean msj = welcomeMsj.contains("Paul");
		if (msj) {
			System.out.println("El mensaje contiene el nombre de Paul");
		}else{
			System.out.println("El mensaje no contiene el nombre de Paul");
			
		}
		
		//Dropdown ejemplo
		Select leaveTypeDrpDwn = new Select(driver.findElement(By.id("assignleave_txtLeaveType")));
		leaveTypeDrpDwn.selectByVisibleText("CAN - Matternity");
		Thread.sleep(2000);
		leaveTypeDrpDwn.selectByValue("5");
						
		//Cerrando el Navegador ventana actula 
		//driver.close();
		//Cierra todas las ventanas de chrome
		driver.quit(); 
		
			
	}

}
//https://demo.applitools.com/
// usename password

