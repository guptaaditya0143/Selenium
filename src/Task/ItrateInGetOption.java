package Task;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ItrateInGetOption {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///E:/selenium%20file/demo.html");
		WebElement digital = driver.findElement(By.id("multiple_cars"));
		Select multi=new Select(digital);
		List<WebElement> brands = multi.getOptions();
		for (WebElement web : brands) {
			web.click();
			Thread.sleep(1000);
			
		}
		multi.deselectAll();
		Thread.sleep(2000);

	}

}
