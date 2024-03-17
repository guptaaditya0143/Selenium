package Iframe;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dream11 {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.dream11.com/");
	/*	// Select i frame By Indexing
		driver.switchTo().frame(0);*/
		
	/*	//Selecting Iframe By Id
		driver.switchTo().frame("send-sms-iframe");*/
		
		//Selecting Iframe By WbElement
		WebElement target = driver.findElement(By.id("send-sms-iframe"));
		driver.switchTo().frame(target);
		driver.findElement(By.id("regEmail")).sendKeys("8010177130");
		
		
	}
}
