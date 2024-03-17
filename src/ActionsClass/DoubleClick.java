package ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		String given_title="Simple Context Menu";
		if(given_title.equalsIgnoreCase(driver.getTitle()))
		{
			System.out.println("passs");
			Actions act=new Actions(driver);
			WebElement Double = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
			
			act.moveToElement(Double).doubleClick().build().perform();
		}
		else
		{
			System.out.println("fail");
		}
	}
}
