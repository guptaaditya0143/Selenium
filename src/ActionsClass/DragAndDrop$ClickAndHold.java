package ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop$ClickAndHold {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		Actions act=new Actions(driver);
		Thread.sleep(2000);
		WebElement Box1 = driver.findElement(By.id("box1"));
		WebElement Box2 = driver.findElement(By.id("box2"));
		WebElement Box3 = driver.findElement(By.id("box3"));
		WebElement Box4 = driver.findElement(By.id("box4"));
		WebElement Box5 = driver.findElement(By.id("box5"));
		WebElement Box6 = driver.findElement(By.id("box6"));
		WebElement Box7 = driver.findElement(By.id("box7"));
		
		WebElement target1 = driver.findElement(By.xpath("//div[text()='Italy']"));
		WebElement target2 = driver.findElement(By.xpath("//div[text()='Spain']"));
		WebElement target3 = driver.findElement(By.xpath("//div[text()='Norway']"));
		WebElement target4 = driver.findElement(By.xpath("//div[text()='Denmark']"));
		WebElement target5 = driver.findElement(By.xpath("//div[text()='South Korea']"));
		WebElement target6 = driver.findElement(By.xpath("//div[text()='Sweden']"));
		WebElement target7 = driver.findElement(By.xpath("//div[text()='United States']"));
		 
		Thread.sleep(2000);
		act.dragAndDrop(Box6,target1).build().perform();
		//act.dragAndDrop(Box1, target7)

	}

}
