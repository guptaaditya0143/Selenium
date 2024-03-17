package SeleniumWaiting;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class VisibiltyOfElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://omayo.blogspot.com/");
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement Click = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("dropbtn")));
		//WebElement Click = wait.until(ExpectedConditions.elementToBeClickable(By.className("dropbtn")));
		Click.click();
		WebElement flip = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Flipkart']")));
		flip.click();
		driver.quit();
		
	}

}
