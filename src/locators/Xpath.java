package locators;

import org.openqa.selenium.By;

import Basic.BaseClass;

public class Xpath extends BaseClass{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		chromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		// driver.findElement(By.xpath("(//a[@class='ico-register'])[10]"))
		//driver.findElement(By.className("ico-register")).click();
		//by using Xpath By Attributes
	//	driver.findElement(By.xpath("//input[@id='gender-male']")).click();
		
		//by using Xpath by textFunction
	/*	driver.findElement(By.xpath(text()='Computers
        ')).click();
        sometimes text() are not target then we go for contains function*/
		
		//by usimg Xpath by contains()
		
		driver.findElement(By.xpath("//a[contains(text(),'Book')]")).click();
	}

}
