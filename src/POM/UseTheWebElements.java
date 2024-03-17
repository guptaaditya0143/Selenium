package POM;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class UseTheWebElements {
@Test
public void search() {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get("https://demowebshop.tricentis.com/");
DwsHomePag data=new DwsHomePag(driver);
	data.Search_field.sendKeys("DEll laptops");
	data.Search_Button.click();
}
}
