package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class VerifuUsingWebElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
		WebElement digital = driver.findElement(By.xpath("//a[contains(text(),'Digital downloads')]"));
		if(digital.isDisplayed()) {
			System.out.println("passss");
			
		}
		else {
			System.out.println("fail");
		}

	}

}
