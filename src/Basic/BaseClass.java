package Basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class BaseClass {
	public static WebDriver driver;
	
	public static void chromeDriver() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	}
	public static void edgeDriver() {
		driver=new EdgeDriver();
		driver.manage().window().maximize();
	}
	public static void firefoxDriver() {
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
	}
	public static void safariDriver() {
		driver=new SafariDriver();
		driver.manage().window().maximize();
	}
	
	public static void closeDriver() throws InterruptedException {
		Thread.sleep(3000);
		driver.close();
	}
	
	public static void quitDriver() throws InterruptedException {
		Thread.sleep(5000);
		driver.quit();
	}

}
