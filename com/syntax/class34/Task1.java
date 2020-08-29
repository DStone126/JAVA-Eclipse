package com.syntax.class34;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Task1 {
public static void main(String[] args) throws IOException {
	
	String xlFilePath = System.getProperty("user.dir")+"testdata/Task1.xlsx";
	FileInputStream fis = new FileInputStream(xlFilePath);
	
	Workbook book = new XSSFWorkbook(fis);
	Sheet sheet = book.getSheet("Sheet1");
	
	sheet.createRow(2).createCell(0).setCellValue("Dms");
	sheet.getRow(2).createCell(1).setCellValue("Dms123");
	
	sheet.createRow(3).createCell(0).setCellValue("Ana");
	sheet.getRow(3).createCell(1).setCellValue("Ana123");

	FileOutputStream fos = new FileOutputStream(xlFilePath);
	
	book.write(fos);
	book.close();
	fos.close();


}
}
