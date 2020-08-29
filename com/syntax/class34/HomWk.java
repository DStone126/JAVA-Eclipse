package com.syntax.class34;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class HomWk {

public static String url = "http://166.62.36.207/humanresources/symfony/web/index.php/auth/login";
	
	public static void main(String[] args) throws IOException {	
String hw = System.getProperty("user.dir")+ "testData2/HW.xlsx";

FileInputStream fis = new FileInputStream(hw);

Workbook wbook = new XSSFWorkbook(fis);

Sheet sheet = wbook.getSheet("HomeWork");

int rows = sheet.getPhysicalNumberOfRows();
int cols = sheet.getRow(0).getPhysicalNumberOfCells();

List<Map<String, String>> xlList = new ArrayList<>();

for(int r = 1; r < rows; r++) {
	
	Map<String, String> map = new LinkedHashMap<>();
	
	for(int c = 0; c < cols; c++) {
		
		String key = sheet.getRow(0).getCell(c).toString();
		
		String value = sheet.getRow(r).getCell(c).toString();
		map.put(key, value);
		
	}
xlList.add(map);

}
System.out.println(xlList);
for(Map<String, String> littleMap:xlList) {
System.out.println(littleMap);

}
























}

}
