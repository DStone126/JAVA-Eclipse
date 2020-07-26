package com.syntax.class26;

public class FileTest {

	public static void main(String[] args) {
		
		File[] files={new JavaFile(), new WordFile(), new PdfFile()};
		
		for(File file:files) {
			file.open();
		}
		
		File f = new JavaFile();
		f.close();
		f.edit();
		f.open();
		
		File w = new WordFile();
		w.close();
		w.edit();
		w.open();
		
		File p = new PdfFile();
		p.close();
		p.edit();
		p.open();
	}
}
