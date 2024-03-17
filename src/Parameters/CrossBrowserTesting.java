package Parameters;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class CrossBrowserTesting {
	WebDriver driver;

@Parameters("browser")
@Test
public void dws(String durl)
{
	if(durl.equalsIgnoreCase("chrome")) {
		driver=new ChromeDriver();
	}
	else if(durl.equalsIgnoreCase("edge")) {
		driver=new EdgeDriver();
	}
	else
	{
		driver=new FirefoxDriver();
	}
}
}
