package locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Basic.BaseClass;

public class Assinment2 extends BaseClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		chromeDriver();
		driver.get("https://demowebshop.tricentis.com/digital-downloads");
		
		List<WebElement> add = driver.findElements(By.cssSelector("input[value='Add to cart']"));
		for (WebElement web : add) {
			web.click();
			Thread.sleep(3000);
		}
		driver.findElement(By.className("cart-label")).click();
		Thread.sleep(10000);
		quitDriver();

	}

}
