package Assignment;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class CloseChildWindow {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("file:///C:/Users/admin/AppData/Local/Microsoft/Windows/INetCache/IE/J3XRX8U0/MultipleWindow-1[2].html");
		driver.findElement(By.xpath("//input[@value='Open Food Sites']")).click();
		String parent = driver.getWindowHandle();
		System.out.println(parent);
		Thread.sleep(2000);
		Set<String> childs = driver.getWindowHandles();
		System.out.println(childs);
		for (String str : childs) {
			driver.switchTo().window(str);
			driver.close();
		}		
		

	}

}
