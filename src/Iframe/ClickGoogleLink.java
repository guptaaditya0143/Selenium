package Iframe;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickGoogleLink {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("file:///C:/Users/admin/AppData/Local/Microsoft/Windows/INetCache/IE/TE3LUZ4R/iframe[1].html");
		driver.findElement(By.xpath("//a[text()='Google']")).click();
	}
}
