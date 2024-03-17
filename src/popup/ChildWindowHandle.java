package popup;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildWindowHandle {
	public static void main(String[] args) throws InterruptedException {
		String given="https://www.facebook.com/nopCommerce";
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		String parent = driver.getWindowHandle();
		driver.findElement(By.xpath("//a[text()='Twitter']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Facebook']")).click();
		Thread.sleep(2000);
		Set<String> child = driver.getWindowHandles();
		System.out.println(child);
		for (String str : child) {
			driver.switchTo().window(str);
			Thread.sleep(2000);
			String current=driver.getCurrentUrl();
			if(given.equalsIgnoreCase(current))
			{
				Thread.sleep(2000);
				driver.findElement(By.id(":rn:")).sendKeys("AADi");
			}
			Thread.sleep(2000);
						
		}
	}
}
