package Basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstToStart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*	String given_url="https://demowebshop.tricentis.com/";
		//open the browser
		WebDriver driver=new ChromeDriver();
		//maximize the browser
		driver.manage().window().maximize();
		//enter into the demowebshop
		driver.get("https://demowebshop.tricentis.com/");
		String current_url=driver.getCurrentUrl();
		if(given_url.equalsIgnoreCase(current_url))
		{
			System.out.println("I am in Dws website");
		}
		else
		{
			System.out.println("I am not in dws website");
		}
		
		driver.
		//close  the browser
		driver.close();*/
		/*----------------------------------*/
		String given_title="Men's Shoes. Nike IN";
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.nike.com/in/w/mens-shoes-nik1zy7ok");
		String current_title=driver.getTitle();
		if(given_title.equalsIgnoreCase(current_title))
		{
			System.out.println("title are same");
		}
		else
		{
			System.out.println("title are not same");
		}
		//close  the browser
		driver.close(); 
		
		/*WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.adidas.co.in/astoundrun-m/IQ8854.html");
		driver.close(); */
		
	/*	WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://redtape.com/men");
		driver.close(); */
		
			

	

	}

}
