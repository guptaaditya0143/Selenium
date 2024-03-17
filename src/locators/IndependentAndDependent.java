package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IndependentAndDependent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String given_url="https://demowebshop.tricentis.com/digital-downloads";
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/digital-downloads");
		if(given_url.equalsIgnoreCase(driver.getCurrentUrl()))
		{
			System.out.println("Entering into the digital download page is successfully");
			WebElement price = driver.findElement(By.xpath("(//a[text()='Music 2'])[2]/../../div[3]/div/span"));
			System.out.println(price.getText());
		}
		else
		{
			System.out.println("Entering into the digital page in not successfull");
		}

	}

}
