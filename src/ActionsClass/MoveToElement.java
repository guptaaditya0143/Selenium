package ActionsClass;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElement {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
		WebElement target = driver.findElement(By.xpath("//a[text()='Men']"));
		Thread.sleep(2000);
		new Actions(driver).moveToElement(target).build().perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@data-reactid=\"37\"]")).click();
		
	}

}
