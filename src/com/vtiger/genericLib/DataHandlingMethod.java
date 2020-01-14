package com.vtiger.genericLib;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DataHandlingMethod {
	
	public String FetchExcelFileData(String File, String sheet , int row, int col) throws EncryptedDocumentException, IOException {
		
		FileInputStream file = new FileInputStream("./src/com/vtiger/data/"+File+".xlsx");			
		Workbook book = WorkbookFactory.create(file);			
		String value = book.getSheet(sheet).getRow(row).getCell(col).getStringCellValue();			
		return value;			
	}
	
	public int FetchNumbericExcelFileData(String File, String sheet , int row, int col) throws EncryptedDocumentException, IOException {
		
		FileInputStream file = new FileInputStream("./src/com/vtiger/data/"+File+".xlsx");			
		Workbook book = WorkbookFactory.create(file);			
		int value = (int) book.getSheet(sheet).getRow(row).getCell(col).getNumericCellValue();			
		return value;			
	}
	
	public void setDataToExcelFile(String Message, String File, String sheet , int row, int col ) throws EncryptedDocumentException, IOException {
		FileInputStream file = new FileInputStream("./src/com/vtiger/data/"+File+".xlsx");
		Workbook book = WorkbookFactory.create(file);
		book.getSheet(sheet).getRow(row).getCell(col).setCellValue(Message);
		FileOutputStream file1 = new FileOutputStream("./src/com/vtiger/data/"+File+".xlsx");
		book.write(file1);
		
	}
	
	public String FetchPropertyFileData(String key) throws IOException {			
		FileInputStream file = new FileInputStream("./src/com/vtiger/data/CommanData.properties");
		Properties pro = new Properties();
		pro.load(file);
		String value = pro.getProperty(key);
		return value;			
	}
}
