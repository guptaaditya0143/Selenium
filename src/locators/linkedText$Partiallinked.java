package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class linkedText$Partiallinked {

	public static void main(String[] args) throws InterruptedException {
		
		// TODO Auto-generated method stub
	/*	//linkedText
		//open the browser
		WebDriver driver=new ChromeDriver();
		//maximize
		driver.manage().window().maximize();
		//enter into the browser
		driver.get("https://demowebshop.tricentis.com/");
		//by using text
		driver.findElement(By.linkText("Register")).click();
		Thread.sleep(5000);
		driver.close();*/
		
		//partiallinkedText
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		//by using half text
		driver.findElement(By.partialLinkText("Shopping")).click();
		Thread.sleep(5000);
		driver.close();

	}

}
