package POM_Classes;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class UtilityClass7 {

	public static String getTestFile(int rowIndex,int cellIndex) throws EncryptedDocumentException, IOException {
		FileInputStream file=new FileInputStream("F:\\facebook1.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet1");
		String value = sh.getRow(rowIndex).getCell(cellIndex).getStringCellValue();
		
		return value;
		
	}
	public static String getPropertyFile(String key) throws IOException {
		Properties obj=new Properties();
		FileInputStream file=new FileInputStream(System.getProperty("user.dir")+"\\facebook.properties7");
		obj.load(file);
		String value = obj.getProperty(key);
		return value;
		
	}
	public static void CaptureScreenshot(WebDriver driver,int TCID) throws IOException {
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\automation\\ABCD\\src\\test\\resources\\Screenshots_"+TCID+".png");
		FileHandler.copy(src,dest);
	}
}
