package com.syntax.class26;

public class PhoneTest {
public static void main(String[] args) {
	
//new Phone();CE: we cannot create  an object of abstract class

Phone iphone= new Iphone();
iphone.makeCall();
iphone.sendText();
iphone.navigate();
//iphone.takePictures();
iphone.playMusic();

Phone samsung= new Samsung();
samsung.makeCall();
samsung.sendText();
samsung.navigate();
//samsung.takePictures();
samsung.playMusic();
}
}
