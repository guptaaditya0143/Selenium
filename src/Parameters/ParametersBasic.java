package Parameters;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametersBasic {
@Parameters({"url","url2"})
@Test
public void dws1(String durl,String durl2) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.navigate().to(durl);
	driver.get(durl2);
	driver.quit();
}
@Parameters("url")
@Test
public void dws2(String durl) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.navigate().to(durl);
	driver.quit();
}
@Parameters("url")
@Test
public void dws3(String durl) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.navigate().to(durl);
	driver.quit();
}
@Parameters("url")
@Test
public void dws4(String durl) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.navigate().to(durl);
	driver.quit();
}
@Parameters("url")
@Test
public void dws5(String durl) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.navigate().to(durl);
	driver.quit();
}

}
