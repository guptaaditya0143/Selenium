package Task;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PlayingWithActionInSameTab {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://demowebshop.tricentis.com/");
		List<WebElement> links = driver.findElements(By.xpath("//div[@class='column follow-us']/ul/li/a"));
		Actions act=new Actions(driver);
		for (WebElement web : links) {
			act.keyDown(Keys.CONTROL).click(web).build().perform();
			Thread.sleep(2000);
			
		}
		driver.quit();
		
	}

}
