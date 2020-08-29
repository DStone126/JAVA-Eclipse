package com.syntax.class35;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class TryCatchBlock {

	public static void main(String[] args) {
		
		String xlFilePath = System.getProperty("user.dir")+"/testdata/SampleData.xlsx";
		
		try {//code that might throw an exception
		FileInputStream fis = new FileInputStream(xlFilePath);
		
		
		}catch(FileNotFoundException fne) {//catching right exception
			System.out.println("I caught the exception");
		}
		
		
		
		System.out.println("----------------");
		
		int[] array = {10,20,30};
		
		try {
			
			System.out.println("i am begining of try block");
			System.out.println(array[3]);
			System.out.println("i am end of the try block");
		
		}catch(ArrayIndexOutOfBoundsException aiob) {
			
			System.out.println("i am begining of catch block");
			System.out.println("i caught ArrayIndexOutOfBoundsException");
			System.out.println("i am end of the catch block");
		}
		
		
		
		
		
		System.out.println("End of code");
	}
}
