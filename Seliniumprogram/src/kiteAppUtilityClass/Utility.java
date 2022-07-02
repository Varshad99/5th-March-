package kiteAppUtilityClass;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class Utility 
{
	
	
	public static String readDataFromExcel(int row, int cell) throws EncryptedDocumentException, IOException	
	{
		
		File myfile=new File("K:\\ExcelRedingProject.xlsx");
		Sheet mySheet = WorkbookFactory.create(myfile).getSheet("Sheet3");

		String myValue = mySheet.getRow(row).getCell(cell).getStringCellValue();
		return myValue;
		
		
		
	}
	
	public static void takeScreenShot(WebDriver driver) throws IOException
	
	{
		
		  File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			
		    String random =RandomString.make(5);
		
		    File destination = new File("K:\\Screenshot\\myscreenshot"+random+".png");
		
		    FileHandler.copy(source, destination);
		
	
	}

	
	

}
