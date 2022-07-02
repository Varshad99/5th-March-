package excelreading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class ExcelReading1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		File myfiles = new File("K:\\ExcelRedingProject.xlsx");
		
		Workbook book = WorkbookFactory.create(myfiles);
		Sheet sheet = book.getSheet("Sheet1");
		Row row = sheet.getRow(0);
		Cell cell = row.getCell(1);
		CellType type = cell.getCellType();
		System.out.println(type);
		String value = cell.getStringCellValue();
		System.out.println(value);
		
		
	}

}
