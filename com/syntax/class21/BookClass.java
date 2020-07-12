package com.syntax.class21;

public class BookClass {

	 String name;
	String author;
	
	BookClass(){
		System.out.println("This a good book");
	}	
		
	BookClass(String names, String authors){
	this();
	this.name = names;
	this.author = authors;
}
	public void display() {
		System.out.println("The name of the book is "+name+ " and the author is "+ author);
	}
	
	public static void main(String[] args) {
		
	BookClass obj = new BookClass("The End", "Damo Stoney");
	obj.display();
	
}

//		//this is the right way to do it
//	String bookName, bookAuthor;
//	int bookPages;
//	public BookClass() {
//		System.out.println("You should read More!");
//	}
//	public BookClass(String bookName, String bookAuthor, int bookPages) {
//		this();
//		this.bookName = bookName;
//		this.bookAuthor = bookAuthor;
//		this.bookPages = bookPages;
//	}
//	public void display() {
//		System.out.println("Try to read " + " " + bookName + " " + " written by " + bookAuthor + ". It takes only " + bookPages + " page and your hooked.");
//	}
//	public static void main(String[] args) {
//		BookClass obj = new BookClass("The End", "Damo Stoney", 1);
//		obj.display();
//	}
	
}