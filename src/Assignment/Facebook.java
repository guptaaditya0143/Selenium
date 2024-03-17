package Assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			String[] data= {"AAA","XXX","12345697","aaaxxx"};
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.google.com/search?q=fb&rlz=1C1ONGR_enIN1087IN1087&oq=fb&gs_lcrp=EgZjaHJvbWUyBggAEEUYOdIBCDIxOTJqMGo0qAIAsAIA&sourceid=chrome&ie=UTF-8");
			driver.findElement(By.xpath("//a[contains(text(),'Sign Up')]")).click();
			List<WebElement> g_values = driver.findElements(By.xpath("//a[contains(text(),'Sign Up')]"));
			int i=0;
			for (WebElement web : g_values) {
				web.sendKeys(data[i++]);
			}
			

	}

}
