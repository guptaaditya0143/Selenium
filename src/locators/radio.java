package locators;

import java.util.List;
import java.util.ListIterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Basic.BaseClass;

public class radio extends BaseClass{

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		chromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
//		driver.findElement(By.cssSelector("input[value='1']")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.cssSelector("input[value='2']")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.cssSelector("input[value='3']")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.cssSelector("input[value='4']")).click();
//		driver.findElement(By.cssSelector("input[value='Vote']")).click();
//		quitDriver();
		
		List<WebElement> poll = driver.findElements(By.cssSelector("input[type='Radio']"));
		for (WebElement web : poll) {
			web.click();
			Thread.sleep(2000);
		}
		

	}

}
