package excelreading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelReading3 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		File myfiles = new File("K:\\ExcelRedingProject.xlsx");
		   //reading column
		Sheet mysheet = WorkbookFactory.create(myfiles).getSheet("Sheet1");
		   int lastRowNum = mysheet.getLastRowNum();
		   int totalRowCount = lastRowNum;
		   System.out.println(totalRowCount);
		   
		
			for(int i=0;i<=totalRowCount-1;i++)
			{
				String value = mysheet.getRow(i).getCell(0).getStringCellValue();
				System.out.println(value);
				
			}
			
			
	}

}
