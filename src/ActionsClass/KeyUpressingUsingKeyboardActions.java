package ActionsClass;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyUpressingUsingKeyboardActions {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://demowebshop.tricentis.com/");
		Actions act=new Actions(driver);
	/*	act.keyDown(Keys.TAB).build().perform();
		Thread.sleep(2000);
		act.keyDown(Keys.TAB).build().perform();
		Thread.sleep(2000);
		act.keyDown(Keys.ENTER).build().perform();*/
		
		//methods Chaining
		act.keyDown(Keys.TAB).keyDown(Keys.TAB).keyDown(Keys.ENTER).build().perform();
		
		
		act.keyUp(Keys.ENTER).build().perform();
		Thread.sleep(2000);
		act.keyUp(Keys.TAB).build().perform();
		
	}

}
