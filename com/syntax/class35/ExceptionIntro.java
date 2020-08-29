package com.syntax.class35;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionIntro {

	public static void main(String[] args) throws FileNotFoundException {
		
String xlFilePath = System.getProperty("user.dir")+"/testdata/SampleData.xlsx";
		
		//FileInputStream fis = new FileInputStream(xlFilePath);

int a = 10;
int b = 0;

//System.out.println(a/b);// will get ArthmeticException
//ArithmeticException aE = new ArithmeticException();
//throw aE;

int[] arr = {100,200};

//System.out.println(arr[2]);//will get ArrayIndexOutOfBoundsException
//ArrayIndexOutOfBoundsException aE = new ArrayIndexOutOfBoundsException();
//throw aE;

System.out.println("End of the code");


	}
}
