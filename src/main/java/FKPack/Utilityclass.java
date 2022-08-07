package FKPack;

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


public class Utilityclass 
{

	public static String testdeta(int rowindex,int colindex) throws EncryptedDocumentException, IOException
	{
		FileInputStream f=new FileInputStream("C:\\Users\\Anita\\eclipse-workspace\\FLIP_KART\\TestData\\excelsheet1.xlsx");
		Sheet s=WorkbookFactory.create(f).getSheet("sheet5");
		String value=s.getRow(rowindex).getCell(colindex).getStringCellValue();
		return value;
	}
	
	public static String getpfdata(String key) throws IOException
	{
		FileInputStream f1=new FileInputStream("C:\\Users\\Anita\\eclipse-workspace\\FLIP_KART\\propertyfile.properties");
		Properties p=new Properties();
		p.load(f1);
		String value=p.getProperty(key);
		return value;
		
	}
	
	public static void capturescreenshot(WebDriver driver,int tcid) throws IOException
	{
	File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	File dest=new File("C:\\Users\\Anita\\eclipse-workspace\\FLIP_KART\\screenshot\\FKScreenshot\\testcase"+tcid+".jpg");
	FileHandler.copy(src, dest);
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
