package Assertions;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;

public class CheckUrlSearchButtonTextBox {
@Test
public void task() {
	String Expected_Result="https://demowebshop.tricentis.com/";
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get("https://demowebshop.tricentis.com/");
	String Actual_Result=driver.getCurrentUrl();
	assertEquals(Expected_Result,Actual_Result);
	System.out.println("url is matched");
	WebElement Search_Box = driver.findElement(By.xpath("//input[@id='small-searchterms']"));
	assertTrue(Search_Box.isEnabled());
	Search_Box.sendKeys("dell laptop");
	System.out.println("search field is enabled");
	WebElement Search_Button = driver.findElement(By.xpath("//input[@type='submit']"));
	assertTrue(Search_Button.isEnabled());
	Search_Button.click();
	System.out.println("Search button is Enabled");
}
}
