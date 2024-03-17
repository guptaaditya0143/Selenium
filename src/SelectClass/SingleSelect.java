package SelectClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SingleSelect {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///E:/selenium%20file/demo.html");
		WebElement single_dropdown = driver.findElement(By.id("standard_cars"));
		Select s_ref=new Select(single_dropdown);
		Thread.sleep(2000);
		/* //selecting data bys index number
		s_ref.selectByIndex(4);*/
		
		/*// selecting data by using value
		s_ref.selectByValue("min");*/
		
		//selecting data by using text
		s_ref.selectByVisibleText("Jaguar");
	}

}
