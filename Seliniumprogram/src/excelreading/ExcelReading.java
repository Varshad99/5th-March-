package excelreading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelReading {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		
		File Myfile = new File("K:\\ExcelRedingProject.xlsx");
		
		String name = WorkbookFactory.create(Myfile).getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
		System.out.println(name);
		String name1 = WorkbookFactory.create(Myfile).getSheet("Sheet1").getRow(0).getCell(1).getStringCellValue();
		System.out.println(name1);
		
		double name2 = WorkbookFactory.create(Myfile).getSheet("Sheet1").getRow(1).getCell(0).getNumericCellValue();
		System.out.println(name2);
		double name3 = WorkbookFactory.create(Myfile).getSheet("Sheet1").getRow(1).getCell(1).getNumericCellValue();
		System.out.println(name3);
		
		boolean name4 = WorkbookFactory.create(Myfile).getSheet("Sheet1").getRow(2).getCell(0).getBooleanCellValue();
		System.out.println(name4);
		boolean name5 = WorkbookFactory.create(Myfile).getSheet("Sheet1").getRow(2).getCell(1).getBooleanCellValue();
		System.out.println(name5);
		
	}

}
