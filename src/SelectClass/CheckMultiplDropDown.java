package SelectClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CheckMultiplDropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///E:/selenium%20file/demo.html");
		
		WebElement s1 = driver.findElement(By.id("standard_cars"));
		WebElement s2 = driver.findElement(By.id("multiple_cars"));
		
		Select ref1=new Select(s1);
		Select ref2=new Select(s2);
		
		if(ref2.isMultiple())
		{
			System.out.println("it is multiple");
		}
		else
		{
			System.out.println("it is not multiple");
			//ref2.deselectByIndex(1);
		}
	}

}
