package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomationFillRegisterForm {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Register.html");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Aadi");
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Gupta");
		driver.findElement(By.xpath("//textarea[@ng-model='Adress']"))
				.sendKeys("village-Susari,Post-Masona,Plocie-Station-Shanjhauli,Bihar");
		driver.findElement(By.xpath("//input[@ng-model='EmailAdress']")).sendKeys("AAdiGupta@gmail.com");
		driver.findElement(By.xpath("//input[@ng-model='Phone']")).sendKeys("8010117130");
		driver.findElement(By.xpath("//input[@ng-model='radiovalue']")).click();
		// driver.findElement(By.xpath("//input[@ng-model='radiovalue']")).click();
		// driver.findElement(By.id("checkbox1")).click();
		driver.findElement(By.id("msdd")).click();
		driver.findElement(By.xpath(" //a[text()='Arabic']")).click();
		driver.findElement(By.xpath(" //a[text()='Bulgarian']")).click();
		driver.findElement(By.xpath(" //a[text()='Catalan']")).click();
		driver.findElement(By.id("checkbox1")).click();
		driver.findElement(By.id("Skills")).click();
		driver.findElement(By.xpath("//option[text()='Software']")).click();
		driver.findElement(By.xpath("//input[@ng-model='radiovalue']")).click();
		driver.findElement(By.xpath("//span[@dir='ltr']")).click();
		driver.findElement(By.xpath("//li[text()='India']")).click();
		driver.findElement(By.id("yearbox")).sendKeys("2003");
		driver.findElement(By.xpath("//select[@ng-model='monthbox']")).sendKeys("june");
		driver.findElement(By.id("daybox")).sendKeys("1");
		driver.findElement(By.xpath("//input[@ng-model='Password']")).sendKeys("Aadi@123");
		driver.findElement(By.xpath("//input[@ng-model='CPassword']")).sendKeys("Aadi@123");
		WebElement submit = driver.findElement(By.id("submitbtn"));
		if (submit.isEnabled()) {
			System.out.println("Button is enabled");
			System.out.println("thanks Aaditya");
		}
	

	}

}
