package com.syntax.class28;

public class Task5 {


	public interface WebDriver {
		
		void open();
		void close();
		String getTitle();  }
	
	interface TakesScreenshot{
		void getScreenShot();	
	
	}
	interface RemoteWebDriver extends WebDriver{
		void navigate();
	}
	class ChromeDriver implements RemoteWebDriver,WebDriver{
		
		String title;
		ChromeDriver(String title){
			this.title=title;
		
		}
		public void open() {
			System.out.println("We can open Chrome Driver.");	
		}
		public void close() {
			System.out.println("We can close Chrome Driver.");		
		}
		public String getTitle() {
			return this.title;
		} 
		public void getScreenShot() {
			System.out.println("We can take a screenshot of Chrome Driver.");
		}
		public void navigate() {
			System.out.println("We can navigate to Chrome Driver.");	
		}	
	}
	class FileFireFox implements RemoteWebDriver,WebDriver{
		
		String title;
		FileFireFox(String title){
			this.title=title;
		
		}
		public void open() {
			System.out.println("We can open File FireFox.");	
		}
		public void close() {
			System.out.println("We can close File FireFox.");		
		}
		public String getTitle() {
			return this.title;
		} 
		public void getScreenShot() {
			System.out.println("We can take a screenshot of File FireFox.");
		}
		public void navigate() {
			System.out.println("We can navigate to File FireFox.");	
		}	
	}
	class SafariDriver implements RemoteWebDriver,WebDriver{
		
		String title;
		SafariDriver(String title){
			this.title=title;
		
		}
		public void open() {
			System.out.println("We can open Safari Driver.");	
		}
		public void close() {
			System.out.println("We can close SafariDriver.");		
		}
		public String getTitle() {
			return this.title;
		} 
		public void getScreenShot() {
			System.out.println("We can take a screenshot of Safari Driver.");
		}
		public void navigate() {
			System.out.println("We can navigate to Safari Driver.");		
		}
	}
public static void main(String[] args) {
	
	WebDriver[] o = { new ChromeDriver("Chrome Driver"), new FileFireFox("File FireFox"),
			new SafariDriver("Safari Driver") };
	
	for (WebDriver obj : o) {
		
		obj.close();
		obj.open();
		obj.getTitle();
		
	}

}
}


