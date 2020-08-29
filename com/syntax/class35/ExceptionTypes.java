package com.syntax.class35;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionTypes {
public static void main(String[] args) throws FileNotFoundException {
	
	
	//Thread.sleep(2000);

	String xlFilePath = System.getProperty("user.dir")+"/testdata/SampleData.xlsx";
	
	FileInputStream fis = new FileInputStream(xlFilePath);

}
}
