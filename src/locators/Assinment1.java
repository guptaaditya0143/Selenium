package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assinment1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//open the browser
		WebDriver driver=new ChromeDriver();
		//maxizmise
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		//Eneter into the webSite
		driver.get("https://demowebshop.tricentis.com/");
		
		
		driver.findElement(By.className("ico-register")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("gender-male")).click();
		Thread.sleep(1500);
		driver.findElement(By.name("FirstName")).sendKeys("Aditya");
		Thread.sleep(1500);
		driver.findElement(By.name("LastName")).sendKeys("Gupta");
		Thread.sleep(1500);
		driver.findElement(By.id("Email")).sendKeys("aditya@gmail.com");
		Thread.sleep(1500);
		driver.findElement(By.name("Password")).sendKeys("aditya1234");
		Thread.sleep(1500);
		driver.findElement(By.id("ConfirmPassword")).sendKeys("aditya1234");
		Thread.sleep(1500);
		driver.findElement(By.id("register-button")).click();
		Thread.sleep(5000);
		driver.close();
		
		
		

	}

}
