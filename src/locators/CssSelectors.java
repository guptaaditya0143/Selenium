package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectors {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//open the browser
		WebDriver driver=new ChromeDriver();
		//maximaize
		driver.manage().window().maximize();
		//Enter into the browser
		driver.get("https://demowebshop.tricentis.com/");
		
		driver.findElement(By.cssSelector("input[type='text']")).sendKeys("Laptop");
		driver.findElement(By.cssSelector("input[value='Search']")).click();
		Thread.sleep(5000);
		driver.close();
		

	}

}
