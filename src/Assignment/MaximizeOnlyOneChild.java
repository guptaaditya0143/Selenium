package Assignment;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class MaximizeOnlyOneChild {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String given_Url="https://www.olivegarden.com/home";
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("file:///C:/Users/admin/AppData/Local/Microsoft/Windows/INetCache/IE/J3XRX8U0/MultipleWindow-1[2].html");
		driver.findElement(By.xpath("//input[@value='Open Food Sites']")).click();
		Thread.sleep(2000);
		Set<String> child = driver.getWindowHandles();
		for (String str : child) {
			driver.switchTo().window(str);
			String current=driver.getCurrentUrl();
			if(given_Url.equalsIgnoreCase(current))
			{
				Thread.sleep(5000);
				driver.manage().window().maximize();
			}
			
		}
		

	}

}
