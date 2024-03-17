package Task;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CheckThepageByUsingWebElement {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String given_url="https://demowebshop.tricentis.com/";
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		String current_url=driver.getCurrentUrl();
		if(given_url.equalsIgnoreCase(current_url))
		{
			System.out.println("passssss");
			WebElement digital = driver.findElement(By.xpath("//a[contains(text(),'Digital downloads')]"));
			//digital.click();
			if(digital.isDisplayed())
			{
				System.out.println("you are in digital download page ");
				digital.click();
				WebElement sort = driver.findElement(By.id("products-orderby"));
				Select s_ref=new Select(sort);
				List<WebElement> product = s_ref.getOptions();
				int i=0;
				for (WebElement web : product) {
					//when stale  exception occur then we handle by using again write find element and select then we haandle this exception
					
					sort = driver.findElement(By.id("products-orderby"));
					s_ref=new Select(sort);
					s_ref.selectByIndex(i++);
					//web.click();
					Thread.sleep(1000);
				}
			
			}
			else
			{
				System.out.println("Fail");
			}
			
		}

	}

}
