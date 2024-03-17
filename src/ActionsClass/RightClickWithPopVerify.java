package ActionsClass;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickWithPopVerify {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		Actions act=new Actions(driver);
		Thread.sleep(2000);
		WebElement right_click = driver.findElement(By.xpath("//span[text()='right click me']"));
		act.moveToElement(right_click).contextClick().build().perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Paste']")).click();
		Thread.sleep(2000);
		try {
			right_click.click();
			System.out.println("My script unsuccessfull");
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("My script is successfull");
		}


	}

}
