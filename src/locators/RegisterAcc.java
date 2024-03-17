package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.w3c.dom.CDATASection;

import Basic.BaseClass;

public class RegisterAcc extends BaseClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub]
		chromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(3000);
		driver.findElement(By.className("ico-register")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("gender-male")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("FirstName")).sendKeys("Aditya");
		Thread.sleep(3000);
		driver.findElement(By.name("LastName")).sendKeys("gupta");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input[id='Email']")).sendKeys("guptaaditya0123@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.name("Password")).sendKeys("aditya12345");
		Thread.sleep(3000);
		driver.findElement(By.name("ConfirmPassword")).sendKeys("aditya12345");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input[value='Register']")).click();
		Thread.sleep(3000);
		driver.findElement(By.className("ico-login")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("Email")).sendKeys("guptaaditya0123@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.className("password")).sendKeys("aditya12345");
		Thread.sleep(3000);
		driver.findElement(By.id("RememberMe")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input[value='Log in']")).click();
		Thread.sleep(3000);
		driver.findElement(By.className("ico-logout")).click();
		Thread.sleep(3000);
		

		
		closeDriver();
		

	}

}
