package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class_Name {

	public static void main(String[] args) {
	/*	// TODO Auto-generated method stub
		//open the Browser
		WebDriver driver=new ChromeDriver();
		//maximize
		driver.manage().window().maximize();
		//enter into the web page
		driver.get("https://demowebshop.tricentis.com/");
		//click on register by using class name
		driver.findElement(By.className("ico-register")).click();
		driver.close();*/
		
	/*	WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		//click on login bys using class name
		driver.findElement(By.className("ico-login")).click();
		//driver.close();
		*/
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		//click on shopping car by using class name
		driver.findElement(By.className("cart-label")).click();

	}

}
