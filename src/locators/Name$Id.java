package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import zmq.io.coder.raw.RawDecoder;

public class Name$Id {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//open the broswer
		WebDriver driver =new ChromeDriver();
		//maximize
		driver.manage().window().maximize();
		//enter into the browser
		driver.get("https://demowebshop.tricentis.com/");
		//by using name() to write in search field
	//	driver.findElement(By.name("q")).sendKeys("laptop dell");
		//by using id() to  write in serach field
		driver.findElement(By.id("small-searchterms")).sendKeys("dell Laptop");
		Thread.sleep(5000);
		driver.close();

	}

}
