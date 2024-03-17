package locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Basic.BaseClass;

public class Triversing extends BaseClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String given_url="https://demowebshop.tricentis.com/";
		chromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		String current_url=driver.getCurrentUrl();
		if(given_url.equalsIgnoreCase(current_url))
		{
			System.out.println("I am ion DwS PAge");
		}
		else
		{
			System.out.println("I am not in Dws PAge");
		}
		
		List<WebElement> link = driver.findElements(By.xpath("//div[@class='header-menu']/ul/li/a"));
		for (WebElement web : link) {
			web.click();
			Thread.sleep(2000);
			driver.navigate().back();
		}
		
	}

}
