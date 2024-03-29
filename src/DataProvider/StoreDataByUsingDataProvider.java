package DataProvider;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class StoreDataByUsingDataProvider {
@Test(dataProvider = "Login")
public void reciever(String Email,String Pass) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get("https://demowebshop.tricentis.com/login");
	driver.findElement(By.id("Email")).sendKeys(Email);
	driver.findElement(By.id("Password")).sendKeys(Pass);
	driver.findElement(By.id("RememberMe")).click();
	driver.findElement(By.xpath("//input[@value='Log in']")).click();
	driver.close();
}

@DataProvider(name="Login")
public Object[][] sender(){
	Object[][] obj=new Object[2][2];
	obj[0][0]="admin01@gmail.com";
	obj[0][1]="admin01";
	obj[1][0]="admin01@gmail.com";
	obj[1][1]="Admin02";
	return obj;
}

}
