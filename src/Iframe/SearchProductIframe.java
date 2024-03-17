package Iframe;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchProductIframe {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("file:///C:/Users/admin/AppData/Local/Microsoft/Windows/INetCache/IE/TE3LUZ4R/iframe[1].html");
		driver.switchTo().frame(0);
		driver.findElement(By.id("small-searchterms")).sendKeys("dell laptop");
		driver.findElement(By.xpath("//input[@value='Search']")).click();
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//a[text()='Google']")).click();
	}
}
