package com.syntax.class33;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadingPropertyFile {

	public static void main(String[] args) throws IOException {
	
	//1. identify path to the file you would like to read
	String filePath = "/config/Example.properties";
	
	//2.create an object of FileIntputStream class
	FileInputStream fis = new FileInputStream(filePath);
	
	//3. to work with property file we use Properties class in Java
	Properties prop = new Properties();
	prop.load(fis);
	
	String value1 = prop.getProperty("username");
	System.out.println(value1);
	
	String value2 = prop.getProperty("city");
	System.out.println(value2);
	
	String value3 = prop.getProperty("password");
	System.out.println(value3);
	
	String value4 = prop.getProperty("company");
	System.out.println(value4);
}
}
