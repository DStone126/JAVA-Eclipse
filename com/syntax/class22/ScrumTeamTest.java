package com.syntax.class22;

public class ScrumTeamTest {
public static void main(String[] args) {
	
	ScrumTeam tt = new ScrumTeam();
	tt.work();
	tt.getPaid();
	tt.fullName = "DStone";
	tt.ceremonies = "Stand up";
	tt.salary = 120000;
	
	tt.attendsMeetings();
	tt.workOnBuildingSoftware();
	
	ScrumTeam tt1 = new ScrumTeam();
	tt1.work();
	tt1.getPaid();
	
	tt1.ceremonies = "breaking stuff";
	tt1.salary = 150000;
	
	tt1.attendsMeetings();
	tt1.workOnBuildingSoftware();
	
	//tt1.test();
	
	ScrumTeam tt11 = new ScrumTeam();
	tt11.work();
	tt11.getPaid();
	
	tt11.ceremonies = "Stand up";
	tt11.salary = 120000;
	
	tt11.attendsMeetings();
	tt11.workOnBuildingSoftware();
	
//	tt11.shieldsTeam();
//	tt11.doMeeting();

	ScrumTeam dd = new ScrumTeam();
	dd.work();
	dd.getPaid();
	
	dd.ceremonies = "Coding";
	dd.salary = 200000;
	
	dd.attendsMeetings();
	dd.workOnBuildingSoftware();
	
	//dd.code();

	ScrumTeam dd1 = new ScrumTeam();
	dd1.work();
	dd1.getPaid();
	
	dd1.ceremonies = "Info";
	dd1.salary = 190000;
	
	dd1.attendsMeetings();
	dd1.workOnBuildingSoftware();
	
	//dd1.gatherRequirements();
	
	ScrumTeam po = new ScrumTeam();
	po.work();
	po.getPaid();
	
	po.ceremonies = "Prioritize";
	po.salary = 200000;
	
	po.attendsMeetings();
	po.workOnBuildingSoftware();
	
//	po.communicate();
//	po.prioritize();
}
}
