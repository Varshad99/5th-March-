package excelreading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelReading2 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		File myfiles = new File("K:\\ExcelRedingProject.xlsx");
		

		//reading row
		
		
	   Sheet mysheet = WorkbookFactory.create(myfiles).getSheet("Sheet1");
	   int lastRowNum = mysheet.getLastRowNum();
	   int totalRowCount = lastRowNum;
	   System.out.println(totalRowCount);
	   
	   
	   int lastCellNum = mysheet.getRow(0).getLastCellNum();
	   int totalCellCount = lastCellNum-1;
       System.out.println(totalCellCount);
		
		for(int i=0;i<=totalCellCount;i++)
		{
			String value = mysheet.getRow(0).getCell(i).getStringCellValue();
			System.out.println(value);
		}
		
		
		
		
		
	}

}
