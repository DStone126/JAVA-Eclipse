package com.syntax.class33;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class XReadingDemo {

	public static void main(String[] args)throws IOException {
		
	
	
	String xLPath = System.getProperty("user.dir")+"/testdata/SampleData.xlsx";
	
	FileInputStream fis = new FileInputStream(xLPath);
	
	Workbook workBook = new XSSFWorkbook(fis);
	
	Sheet sheet = workBook.getSheet("Sheet5");
	
	Row row1 = sheet.getRow(0);
	
	Cell row1Cell3 = row1.getCell(2);
	
	String value = row1Cell3.toString();
	System.out.println(value);
	
	Row row2 = sheet.getRow(1);
	
	String valueOfAnotherCell = row2.getCell(0).toString();;
	System.out.println(valueOfAnotherCell);
	
	
	
	
	
	
	
	
	
	
}
}