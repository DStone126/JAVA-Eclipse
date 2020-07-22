package com.syntax.class26;

public abstract class Phone {

	
		public void makeCall() {
			System.out.println("Phones makes call");
		}
		public void sendText() {
			System.out.println("Phones sends texts");
		}
		public abstract void navigate();
		
		//public abstract void takePictures();

		public abstract void playMusic();
}
class Samsung extends Phone{
	
		public  void navigate() {
			System.out.println("Samsung has installed gps");
		}
	
		public void takePictures() {
			System.out.println("Samsung takes picures in 10 mega pixels");
		}
		
		public void playMusic() {
			System.out.println("Samsung has good and loud speakers for music");
		}
		
}
class Iphone extends Phone{
	
	public void navigate() {
		System.out.println("Iphone has gps");
	}
	
	public void takePictures() {
		System.out.println("Iphone takes picures in 20 mega pixels");
	}
	
	public void playMusic() {
		System.out.println("Iphone has Itunes to play music");
	}

	
	
		
		
	
}