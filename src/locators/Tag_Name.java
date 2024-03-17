package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tag_Name {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//opoen the Browser
		WebDriver driver=new ChromeDriver();
		//maximize
		driver.manage().window().maximize();
		//enter into the webpage
		driver.get("https://demowebshop.tricentis.com/");
		//one method to find the element only use one time
		//driver.findElement(By.tagName("input")).click();
		WebElement Search_field=driver.findElement(By.tagName("input"));
		Search_field.click();
		driver.close();
	}

}
