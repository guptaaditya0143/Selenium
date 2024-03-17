package Assertions;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertNotEquals;
import static org.testng.Assert.assertTrue;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HardAssertMethods {
@Test
public void dws() {
	String Expected_Result="https://demowebshop.tricentis.co/";
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get("https://demowebshop.tricentis.com/");
	String Actual_Result=driver.getCurrentUrl();
	//assertEquals(Expected_Result, Actual_Result); When we use postive senarios
	//assertNotEquals(Expected_Result, Actual_Result); When we use Negitive Senarios
	WebElement community_Poll = driver.findElement(By.id("pollanswers-1"));
	/*community_Poll.click();
	//assertTrue(community_Poll.isSelected());*/ //when we check select option
	assertFalse(community_Poll.isSelected()); //when we check not selected option
	
	System.out.println("My Script is Sucessfull.....");
	driver.quit();
}
}
