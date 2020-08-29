package com.syntax.class34;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReadReview {
 
	public static void main(String[] args) throws IOException {
		
		String xlFilesPath = System.getProperty("user.dir")+ "/Users/dstone/eclipse-workspace/JavaBasic/testdata/SampleData.xlsx";
		
		FileInputStream fis = new FileInputStream(xlFilesPath);
		
		 XSSFWorkbook wBook = new  XSSFWorkbook(fis);
		 
		 Sheet sheet = wBook.getSheet("Sheet5");
		 
		 Row row2 = sheet.getRow(1);
		 
		 String cellV = sheet.getRow(1).getCell(3).toString(); 
		 System.out.println(cellV);
	}
}
