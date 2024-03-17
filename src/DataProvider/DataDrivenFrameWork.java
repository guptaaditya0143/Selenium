package DataProvider;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.hssf.usermodel.HSSFWorkbookFactory;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataDrivenFrameWork {
@Test(dataProvider = "Login")
public void login(String Email,String Pass) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get("https://demowebshop.tricentis.com/login");
	driver.findElement(By.id("Email")).sendKeys(Email);
	driver.findElement(By.id("Password")).sendKeys(Pass);
	driver.findElement(By.id("RememberMe")).click();
	driver.findElement(By.xpath("//input[@value='Log in']")).click();
	driver.close();
}
@DataProvider(name="Login")
public Object[][] sender() throws EncryptedDocumentException, IOException{
	File file=new File("E:\\manul\\automation.xlsx");
	FileInputStream fis=new FileInputStream(file);
	//Workbook wb=new WorkbookFactory.create(fis);
	Workbook wb = WorkbookFactory.create(fis);
	Sheet sheet=wb.getSheet("sheet1");
	int row=sheet.getPhysicalNumberOfRows();
	int colom=sheet.getRow(0).getPhysicalNumberOfCells();
	Object[][] obj=new Object[row][colom];
	for(int i=0;i<row;i++) {
		for(int j=0;j<colom;j++) {
			obj[i][j]=sheet.getRow(i).getCell(j).toString();
		}
	}
	return obj;
}
}
