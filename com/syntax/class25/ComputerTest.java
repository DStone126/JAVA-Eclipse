package com.syntax.class25;

public class ComputerTest {
public static void main(String[] args) {
	

	
	Computer apple = new Apple("Apple","Annandale, Va");
	Computer lenovo = new Lenovo("Lenovo","Dallas",150);
	Computer hp = new Hp("Hp","Alexandria");
	Computer dell = new Dell("Dell","Arlington");

	Computer[] computers = {apple,lenovo,hp,dell};
	int size = computers.length;
	System.out.println(size);

	for(Computer c:computers) {
		System.out.println();
		c.brand();
		c.price();
		System.out.println("-----------");
	}
}
}