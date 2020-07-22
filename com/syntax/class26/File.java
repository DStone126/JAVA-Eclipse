package com.syntax.class26;

public abstract class File {

	public abstract void open() ;
	
	public void edit() {
		System.out.println("Is to add or fix something in a file");
	}
	public void close() {
		System.out.println("To close browser or file");
	}
}
class JavaFile extends File{
	public void open() {
		System.out.println("To open Java file we need notepad ++");
	}
}
class WordFile extends File{
	public void open() {
		System.out.println("To open doc file we need Microsoftword to be installed");
	}
}
class PdfFile extends File{
	public void open() {
		System.out.println("To open pdf file we need to install sublime");
	}
}