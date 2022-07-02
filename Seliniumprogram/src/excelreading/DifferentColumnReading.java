package excelreading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DifferentColumnReading {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
	File myfiles = new File("K:\\ExcelRedingProject.xlsx");
		
		Workbook book = WorkbookFactory.create(myfiles);
		Sheet mysheet = book.getSheet("Sheet3");
		
		int totalRowCount = mysheet.getLastRowNum();
		int lastRowNum = totalRowCount;
		System.out.println(lastRowNum);
		
		for(int i=0;i<=totalRowCount;i++)
		{
		String value = mysheet.getRow(i).getCell(0).getStringCellValue();
		System.out.print(value+" ");
		
		double value1 = mysheet.getRow(i).getCell(1).getNumericCellValue();
		System.out.print(value1+" ");
		
		boolean value2 = mysheet.getRow(i).getCell(2).getBooleanCellValue();
		System.out.println(value2+" ");
		}
		
		
		
		
		
		
	}

}
