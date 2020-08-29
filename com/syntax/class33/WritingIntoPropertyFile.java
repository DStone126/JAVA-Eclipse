package com.syntax.class33;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class WritingIntoPropertyFile {

	public static void main(String[] args) throws IOException {
	
		String file = "/config/Examples.properties";
		
		FileInputStream fis = new FileInputStream(file);
		
		Properties p = new Properties();
		
		p.load(fis);
		
		p.setProperty("street", "New Brook Drive");
		
		String newFile = "config/NewFile.properties";
		
		//to add strees new brook drive to file
		FileOutputStream fid = new FileOutputStream(file);
		
		p.store(fid, "Added additional key");
		
}
}
