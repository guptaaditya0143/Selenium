package ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SendKeysUsingKeyBoard {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://demowebshop.tricentis.com/");
		WebElement Search = driver.findElement(By.id("small-searchterms"));
		Actions act=new Actions(driver);
		act.moveToElement(Search).click().sendKeys("laptops").build().perform();
		act.keyDown(Keys.TAB).keyDown(Keys.ENTER).build().perform();
		Thread.sleep(2000);

	}

}
