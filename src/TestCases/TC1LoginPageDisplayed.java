package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC1LoginPageDisplayed {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.shoppersstack.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='loginBtn']")).click();
		String given_Title = "ShoppersStack | Login";
		if(given_Title.equalsIgnoreCase(driver.getTitle()))
		{
			System.out.println("Test CAse Pass");
			driver.close();
		}
	}
}
