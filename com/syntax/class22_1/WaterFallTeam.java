package com.syntax.class22_1;

import com.syntax.class22.Employee;

public class WaterFallTeam extends Employee{

	public void doSlowWork() {
		
	}
public static void main(String[] args) {
	
	WaterFallTeam wt = new WaterFallTeam();
	WaterFallTeam.companyName = "Instagram";
	wt.fullName = "jon jon";//protected variable is access through inheritance
	
}
}
