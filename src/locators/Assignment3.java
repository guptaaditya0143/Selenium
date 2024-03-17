package locators;

import org.openqa.selenium.By;

import Basic.BaseClass;

public class Assignment3 extends BaseClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String given_url="https://demowebshop.tricentis.com/";
		chromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		String current_url=driver.getCurrentUrl();
		if(given_url.equalsIgnoreCase(current_url))
		{
			System.out.println("I m in web PAge");
			driver.findElement(By.xpath("//a[contains(text(),'Digital')]")).click();
			String page_url="https://demowebshop.tricentis.com/digital-downloads";
			if(page_url.equalsIgnoreCase(current_url))
			{
				System.out.println("I am in digital download page");
			}
			else
			{
				System.out.println("I am not in digital page");
			}
			
		}
		else
		{
			System.out.println("I am not in Dws page");
		}
		
		
		
		

	}

}
