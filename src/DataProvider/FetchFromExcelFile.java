package DataProvider;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class FetchFromExcelFile {
@Test
public void data() throws EncryptedDocumentException, IOException {
	File file=new File("E:\\manul\\automation.xlsx");
	FileInputStream fis=new FileInputStream(file);//Conection b/w file to eclipse
	Workbook wb = WorkbookFactory.create(fis);//fatch karta hai 
	Sheet sheet = wb.getSheet("sheet1");
	int row=sheet.getPhysicalNumberOfRows();
	int colom=sheet.getRow(0).getPhysicalNumberOfCells();
	for(int i=0;i<row;i++) {
		for(int j=0;j<colom;j++) {
			String data = sheet.getRow(i).getCell(j).toString();
			System.out.println(data);
		}
	}
}
}
