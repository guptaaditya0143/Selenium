package locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GiftCardTextField {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] values= {"XYZ","xyz@gmail.com","ABC","abc@gmail.com"};
		String given_title="Demo Web Shop";
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		if(given_title.equalsIgnoreCase(driver.getTitle()))
		{
			System.out.println("title is matched ");
			driver.findElement(By.xpath("//a[contains(text(),'$25 Virtual Gift Card')]")).click();
			String given_gift="Demo Web Shop. $25 Virtual Gift Card";
			if(given_gift.equalsIgnoreCase(driver.getTitle()))
			{
				System.out.println("gift card title is matched");
				
				List<WebElement> g_value = driver.findElements(By.xpath("//div[@class='giftcard']/div/input"));
				int i=0;
				for (WebElement web : g_value) {
					web.sendKeys(values[i++]);
				}
				
				//driver.findElement(By.xpath("//div[@class='giftcard']/div[5]")).sendKeys("Its your gift card");
				WebElement price = driver.findElement(By.xpath("//div[@class='product-price']/span"));
				System.out.println(price.getText());
				WebElement qty = driver.findElement(By.xpath("//input[@class='qty-input']"));
				qty.clear();
				qty.sendKeys("5");
				
			}
			else
			{
				System.out.println("gift card title is not matched");
			}
		}
		else
		{
			System.out.println("title is not matched");
		}

	}

}
