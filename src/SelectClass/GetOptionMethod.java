package SelectClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetOptionMethod {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///E:/selenium%20file/demo.html");
		WebElement single_dropdown = driver.findElement(By.id("standard_cars"));
		Select s_ref=new Select(single_dropdown);
		List<WebElement> cars = s_ref.getOptions();
		int i=0;
		for (WebElement web : cars) {
			s_ref.selectByIndex(i++);
		/*	 // ye bhi use kar skte but esme kuch error hai esliye ham ye use naahi karte 
			web.click();*/
			Thread.sleep(1000);
			
			
		}

	}

}
