package Assertions;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertMethods {
@Test
public void dws() {
	String Expected_Result="https://demowebshop.tricentis.co";
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get("https://demowebshop.tricentis.com/");
	String Actual_Expected=driver.getCurrentUrl();
	SoftAssert sa=new SoftAssert();
	sa.assertEquals(Expected_Result, Actual_Expected);
	System.out.println("My Script is done");
	sa.assertAll();//without using this we cant fetch tha exception
	driver.quit();
}
}
