package SeleniumWaiting;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.shoppersstack.com/");
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(40));
		WebElement Login = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("loginBtn")));
		Login.click();
		WebElement Create_Account = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Create Account']")));
		Create_Account.click();
		driver.close();
		
	}

}

