package excelreading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadingWholeSheet {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		 
		File myfiles = new File("K:\\\\ExcelRedingProject.xlsx");
		Sheet mysheet = WorkbookFactory.create(myfiles).getSheet("Sheet1");
		   
		   int lastRowNum = mysheet.getLastRowNum();
		   int totalRowCount = lastRowNum;
		   System.out.println(totalRowCount);
		   
		   
		   int lastCellNum = mysheet.getRow(0).getLastCellNum();
		   int totalCellCount = lastCellNum-1;
	       System.out.println(totalCellCount);
			
			for(int i=0;i<=totalRowCount;i++)
			{
				for(int j=0;j<=totalCellCount;j++) 
				{
				String value = mysheet.getRow(i).getCell(j).getStringCellValue();
				System.out.print(value+" | ");
				}
				System.out.println();
			}
			

	}

}
