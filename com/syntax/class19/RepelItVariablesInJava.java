package com.syntax.class19;

public class RepelItVariablesInJava {

//static int number;

//	int year;
//	String schoolName;
//	int batchNumber;
//
//	void displayInfo(){
//	  System.out.println("I am a student of batch "
//	  + batchNumber +" studying at "+ schoolName +
//	  " in the year of "+ year);
//	}
//	   public static void main(String [] args){
//	     
//		 RepelItVariablesInJava mm = new RepelItVariablesInJava();
//	     mm.year = 2020;
//	     mm.schoolName = "Syntax";
//	     mm.batchNumber = 6;
//	     mm.displayInfo();
//	      }  
//	  //this is the right way to do it
//	   int batch;
//	   String schoolName;
//	   int year;
//	   
//	   public static void main(String[] args) {
//	     Main mm= new Main();
//	     mm.batch=6;
//	     mm.schoolName="Syntax";
//	     mm.year=2020;
//	     System.out.println("I am a student of batch "+mm.batch+" studying at "+mm.schoolName+" in the year of "+mm.year);
//	   }
//	   
//	    System.out.println("-----------------");
//
//	int num;
//	double nums;
//	char letter;
//
//	void displayInfo() {
//		System.out.println(num + " "+nums+ " "+ letter);
//	}
//	
//	public static void main(String [] args){
//
//		RepelItVariablesInJava mm = new RepelItVariablesInJava();
//	mm.num = 10;
//	mm.nums = 10.23;
//	mm.letter = 'a';
//	mm.displayInfo();
//	
//	RepelItVariablesInJava mm1 = new RepelItVariablesInJava();
//	mm1.num = 100;
//	mm1.nums = 100.23;
//	mm1.letter = 's';
//	mm1.displayInfo();
//	 
//	} 
//
//	//this is the right way to do it
//	 Main mm= new Main();
//     mm.intValue=10;
//     mm.doubleValue=10.23;
//     mm.charValue='a';
//     System.out.println(mm.intValue);
//     System.out.println(mm.doubleValue);
//     System.out.println(mm.charValue);
//     
//     Main mm1= new Main();
//     mm1.intValue=100;
//     mm1.doubleValue=100.23;
//     mm1.charValue='s';
//     System.out.println(mm1.intValue);
//     System.out.println(mm1.doubleValue);
//     System.out.println(mm1.charValue);
// }
//
//System.out.println("------------");
//
//	String country;
//	  String capital;
//	  int popSize;
//	  
//	  void displayInfo(){
//	    System.out.println("The capital of "+ country +" is "+ capital +" and population is "+ popSize);
//	  }
//
//	  public static void main(String [] args){
//	    
//		  RepelItVariablesInJava mm = new RepelItVariablesInJava();
//	    mm.country = "USA";
//	    mm.capital = "Washington DC";
//	    mm.popSize = 330000000;
//	    mm.displayInfo();
//	    
//	    RepelItVariablesInJava mm1 = new RepelItVariablesInJava();
//	    mm1.country = "Kazakhstan";
//	    mm1.capital = "Astana";
//	    mm1.popSize = 18500000;
//	    mm1.displayInfo();
//	   
//	  }
//
//	  System.out.println("---------------");
//
//	int iValue;
//	  String sValue;
//	  double dValue;
//	  boolean bValue;
//	  float fValue;
//	  
//	  public static void main(String[] args) {
//	    
//		  RepelItVariablesInJava vv= new RepelItVariablesInJava();
//	    System.out.println(vv.iValue);
//	    System.out.println(vv.sValue);
//	    System.out.println(vv.dValue);
//	    System.out.println(vv.bValue);
//	    System.out.println(vv.fValue);
//	 }
//	  
//		 System.out.println("---------------");
//		 
//	 String ss = "Welcome To Syntax Technologies";
//
//	   RepelItVariablesInJava(String ss) {
//		
//		this.ss = ss;
//	}
//	void display(){
//	    System.out.println("Welcome To Syntax Technologies");
//	  System.out.println(ss);
//	    
//	  }
//	  public static void main(String [] args){
//	  
//		  RepelItVariablesInJava mm = new RepelItVariablesInJava("Welcome To Syntax Technologies");
//	  mm.ss = "Welcome To Syntax Technologies";
//	  mm.display();
//System.out.println(mm.ss);
//	  }
//
////this is the right way to do it
//	  static String ss="Welcome To Syntax Technologies";
//	  
//	  public static void main(String[] args) {
//	  
//	    System.out.println(ss);
//	    System.out.println(Main.ss);
//	    
//	    Main mm= new Main();
//	    System.out.println(mm.ss);
//	  
//	  }
//
//	  System.out.println("-----------------");
//
//
//public static void main(String[] args) {
//	
//
//	int number=200;
//	
//	RepelItVariablesInJava mm = new RepelItVariablesInJava();
//	mm.number = 200;
//	
//	System.out.println(mm.number);
//	System.out.println(number);
//	
//	}
//	
//	System.out.println("---------------");
//	
//	 static int number;
//
//		public static void main(String[] args) {
//			RepelItVariablesInJava obj1 = new RepelItVariablesInJava();
//			number++;
//			//RepelItVariablesInJava obj2 = new RepelItVariablesInJava();
//			number++;
//			//RepelItVariablesInJava obj3 = new RepelItVariablesInJava();
//			number++;
//
//			System.out.println(number);
//		}
//		
//System.out.println("-----------------");
//	static String ii;
//	
//	public static void main(String[] args) {
//	
//	String ss = "Programming is amazing.";
//	System.out.println(ss);
//
//	    ii = "Java is awesome.";
//	System.out.println(ii);
//	
//	}
//
//		//this is the right way to do it 
//	 void displayMsg() {
//		    System.out.println("Programming is amazing.");
//		  }
//
//		  static  void showMsg(){
//		    System.out.println("Java is awesome.");
//		  }
//		  public static void main(String[] args) {
//		  
//		    Main mm= new Main();
//		    mm.displayMsg();
//		    showMsg();
//		  }
//	
//	System.out.println("---------------");
//
//	
//	//test case below (dont change):
//	public static void main(String[] args){
//	  String firstValue = mixString("12345","abcde"); 
//		System.out.println(firstValue); 
//		String secondValue = mixString("howdy","hello");
//		System.out.println(secondValue); 
//
//	}
//
//  static String mixString(String s1, String s2){
//	 String str = " ";
//	 int num = 0;
//	 
//	 if(s1.length() >= s2.length()){
//	   num = s1.length();
//	 }else
//	   num = s2.length();
//	
//	for(int i = 0; i < num; i++){
//	  if(i < s1.length()){
//	    str += s1.charAt(i);
//  }if( i < s2.length()){
//    str += s2.charAt(i);
//  }
//	}
//	return str;
//		 }
//	  
//
//		//this is right way 
//	static String mixString(String s1,String s2) {
//		String mixString="";
//		for (int i = 0; i < s1.length(); i++) {
//			mixString = mixString + s1.charAt(i) + s2.charAt(i);
//		}
//		return mixString;
//	}
//	//test case below (dont change):
//	public static void main(String[] args){
//	 	String firstValue = mixString("12345","abcde"); 
//		System.out.println(firstValue); 
//		String secondValue = mixString("howdy","hello");
//		System.out.println(secondValue); 
//	
//	}
//
//System.out.println("--------------------");
//
//	static String county, continent;
//
//void display() {
//	System.out.println(county + " located on "+ continent + " continent");
//}
//
//public static void main(String[] args) {
//	RepelItVariablesInJava obj = new RepelItVariablesInJava();
//obj.county = "Morocco";
//obj.continent = "Africa";
//obj.display();
//
//}
////this is the right way to do it
//static String country, continent;
//
//static void display() {
//	System.out.println(country+" located on "+continent+" continent");
//}
//
//public static void main(String[] args) {
//	
//	country="Morocco";
//	continent="Africa";
//	display();
//		
//}
//
//System.out.println("------------");
//
//	public static void main(String[] args) {
//		int[] a = {1,2,3,4,5};
//		mystery(a);
//		// should print out 10 1 30 2 50
//	}
//	
//	static void mystery(int[] array)	{
//		 for(int i = 0; i < array.length; i++){
//	   if(array[i] % 2 == 0 ){
//	     System.out.println(array[i] / 2 + " ");
//	   }else if(array[i] % 2 != 0){
//	    System.out.println(array[i] * 10 + " ");
//	   }
//		 }
//
//	}
//
//		//this is the right way to do it
//	public static void main(String[] args) {
//		int[] a = { 1, 2, 3, 4, 5 };
//		
//		mystery(a);
//		
//		// should print out 10 1 30 2 50
//	}
//
//	public static void mystery(int[] array) {
//		for (int num:array) {
//			if(num%2==0) {
//				System.out.print(num/2+" ");	
//			}else {
//				System.out.print(num*10+" ");
//			}
//		}
//	}
//
//System.out.println("-------------");
//
//	static String thirdLetter(String s){
//		  String str = "";
//		  for(int i = 0; i < s.length();i += 3){
//		    str += s.charAt(i);
//		  }
//	return str;
//		}
//
//		//test case below (dont change):
//		public static void main(String[] args){
//			System.out.println(thirdLetter("hello there")); //"hltr"
//			System.out.println(thirdLetter("technology")); //"thly"
//		
//}
//
//		//this is the right way
//		static String thirdLetter(String s) {
//
//			String newString = "";
//
//			for (int i = 0; i < s.length(); i += 3) {
//				newString += s.charAt(i);
//			}
//
//			return newString;
//		}
//
//		// test case below (dont change):
//		public static void main(String[] args) {
//			System.out.println(thirdLetter("hello there")); // "hltr"
//			System.out.println(thirdLetter("technology")); // "thly"
//		}
//
//System.out.println("----------------");
//
//	public static void main(String[] args) {
//		int[][] a = {
//			{1,2,3,4},
//			{4,5,6,7},
//			{1,3,5,7}
//		};
//		reduce10(a);
//		//print the elements from new array
//	
//		for(int i = 0; i < reduce10(a).length; i++) {
//		
//		for(int o = 0; o < reduce10(a)[i].length; o++) {
//			
//			System.out.print(reduce10(a)[i][o] + " ");
//		
//			System.out.println();
//		}
//	}
//	//create method reduce10 here
//	}
//	static int[][] reduce10(int[][] array){
//		
//		int [][] arr = new int[3][4];
//		
//		for(int i = 0; i < array.length;i++) {
//			
//			for(int o = 0; o < array[i].length; o++) {
//		
//				arr[i][o] = array[i][o] - 10;
//			}
//
//		}
//	return arr;
//}
//
//	//this is the right way to do it
//	public static void main(String[] args) {
//		int[][] a = { { 1, 2, 3, 4 }, { 4, 5, 6, 7 }, { 1, 3, 5, 7 } };
//		int[][] newArray = reduce10(a);
//		// print the Array
//		for (int[] array : newArray) {
//			for (int num : array) {
//				System.out.print(num + " ");
//			}
//			System.out.println();
//		}
//	}
//
//	static int[][] reduce10(int[][] nums) {
//
//		for (int i = 0; i < nums.length; i++) {
//			for (int j = 0; j < nums[i].length; j++) {
//
//				nums[i][j] = nums[i][j] - 10;
//			}
//		}
//
//		return nums;
//	}
//
//System.out.println("---------");
//	//this is the right way to do it 
//	static int countA(String s){
//		int sum=0;
//		  for(int i= 0;i<s.length();i++ ){
//		    if(s.charAt(i) == 'A'){
//		      sum++;
//		    }
//		    if(s.charAt(i) == 'a'){
//		      sum++;
//		    }
//		  }
//			return sum;
//		}
//		
//		//test case below (dont change):
//		public static void main(String[] args){
//			System.out.println(countA("aaA")); //3
//			System.out.println(countA("aaBBdf8k3AAadnklA")); //6
//	
//		}
//
//		 int number = 0;
//		  char a = 'a';
//		  char aA = 'A';
//		  for(int i = 0; i < s.length(); i++){
//		    if(s.charAt(i) == a || s.charAt(i) == aA){
//		      number++;
//		    }
//		  }
//		return number;	
//		}
//		
//		//test case below (dont change):
//		public static void main(String[] args){
//			System.out.println(countA("aaA")); //3
//			System.out.println(countA("aaBBdf8k3AAadnklA")); //6
//		}
//
//	System.out.println("---------");
//
//	public static String s = "obama";
//	static String s1 = "happy friday! i love weekends";
//	
//	public static	int countVowels(String s){
//		  
//		int countVowels = 0;
//		 
//		  for(int i = 0; i < s.length(); i++){
//			  char c = Character.toLowerCase(s.charAt(i));
//		  
//		if(s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u'){
//		
//		countVowels++;
//			}
//		}
//		return countVowels;
//}
//
//	//test case below (dont change):
//	public static void main(String[] args){
//		
//		System.out.println(countVowels("obama")); //3
//		System.out.println(countVowels("happy friday! i love weekends")); //9
//	}
//	
//		//this is the right way to do it
//	static int  countVowels(String s)
//	{
//		String count = s.replaceAll("[^aA,eE,iI,oO,uU]", "");
//		return count.length();
//	}
//	
//	//test case below (dont change):
//	public static void main(String[] args){
//		System.out.println(countVowels("obama")); //3
//		System.out.println(countVowels("happy friday! i love weekends")); //9
//	}
//
//System.out.println("--------------");
	
//	public static  String surround(String s, String search_term) {
//	 
//	 return s.replace(search_term, "(" + search_term  + ")");
//	
//}
//
//	//test case below (dont change):
//		public static void main(String[] args){
//			System.out.println(surround("abcabcabc","c")); //"ab(c)ab(c)ab(c)"
//			System.out.println(surround("technology","o")); //"techn(o)l(o)gy"
//		
//		}
//
//		// this is the right way to do it
//		static String surround (String s, String search_term){
//			
//			return s.replace(search_term, "("+search_term+")");
//
//		}
//		
//		//test case below (dont change):
//		public static void main(String[] args){
//			System.out.println(surround("abcabcabc","c")); //"ab(c)ab(c)ab(c)"
//			System.out.println(surround("technology","o")); //"techn(o)l(o)gy"
//		}
//
//System.out.println("--------------");
//
//	private void p(){
//		   System.out.println("This is Private Method");
//		 }
//		 void de(){
//		   System.out.println("This is Default Method");
//		}
//		  protected void pr(){
//		    System.out.println("This is Protected Method");
//		  }
//		public void pu(){
//		  System.out.println("This is Public Method");
//		}
//		  public static void main(String [] args){
//			  RepelItVariablesInJava mm = new RepelItVariablesInJava();
//		    mm.p();
//		    mm.de();
//		    mm.pr();
//		    mm.pu();
//		  }
//
//		  	//this is the right way
//		  private void m1(){
//			    System.out.println("This is Private Method");
//			  }
//			  void m2(){
//			    System.out.println("This is Default Method");
//			  }
//			  protected void m3(){
//			    System.out.println("This is Protected Method");
//			  }
//			  public void m4(){
//			    System.out.println("This is Public Method");
//			  }
//			  
//			  public static void main(String[] args) {
//			    Main mm= new Main();
//			    mm.m1();
//			    mm.m2();
//			    mm.m3();
//			    mm.m4();
//			  }
//
//			  System.out.println("-------------");
//
//	public String name,nameSchool;
//	private int number;
//	protected String city;
//
//	 void displayInfo(){
//	  System.out.println("My name is "+ name +" and I live in "+ city +". I study at "+ nameSchool +" in batch "+ number);
//	}
//	  
//	  public static void main(String [] args){
//		  RepelItVariablesInJava mm = new RepelItVariablesInJava();
//	    mm.name = "John";
//	    mm.city = "Miami";
//	    mm.nameSchool = "Syntax";
//	    mm.number = 6;
//	    
//	    mm.displayInfo();
//	    
//	  }
//	  
//	  //this is the right way to do it
//	  public String name;
//		protected String schoolName;
//		String city;
//		private int batchNum;
//
//
//		public void display() {
//			System.out.println("My name is "+name+" and I live in "+city+". I study at "+schoolName+" in batch "+batchNum);
//		}
//
//		public static void main(String[] args) {
//
//			Main mm = new Main();
//			mm.name="John";
//			mm.city="Miami";
//			mm.schoolName="Syntax";
//			mm.batchNum=6;
//			
//			mm.display();
//		}
//
//System.out.println("-------");
//
//	 static void d(){
//		    System.out.println("default");
//		  }
//		 protected static void pr(){
//		  System.out.println("protected");
//		}
//		public static void p(){
//		  System.out.println("public");
//		}
//		}
//		class Main {
//		public static void main(String[] args) {
//			RepelItVariablesInJava mm = new RepelItVariablesInJava();
//			RepelItVariablesInJava.d();
//			RepelItVariablesInJava.pr();
//			RepelItVariablesInJava.p();
//		}
//
//		//this is the right way
//		private static String privateAccess() {
//			String str = "private";
//			return str;
//		}
//
//		static String defaultAccess() {
//			String str = "default";
//			return str;
//		}
//
//		protected static String protectedAccess() {
//			String str = "protected";
//			return str;
//		}
//
//		public static String publicAccess() {
//			String str = "public";
//			return str;
//		}
//	}
//
//
//	class Main {
//	  public static void main(String[] args) {
//	    System.out.println(AnotherClass.defaultAccess());
//			System.out.println(AnotherClass.protectedAccess());
//			System.out.println(AnotherClass.publicAccess());
//	  }
//		
//System.out.println("-------------");
//
//	//this is the right way to do it
//	public static String alphabetical(String str) {
//
//		char previous = str.charAt(0);
//		char current;
//		String newString = "" + previous;
//
//		for (int i = 1; i < str.length(); i++) {
//			current = str.charAt(i);
//			if (current > previous) {
//				newString += str.charAt(i);
//			}
//			previous = current;
//		}
//		return newString;
//	}
//
//	public static void main(String[] args) {
//		System.out.println(alphabetical("hello"));
//		System.out.println(alphabetical("software")); 
//		System.out.println(alphabetical("language"));
//	
//	}
//
//System.out.println("-----------");
//
//	public static void main(String[] args) {
//		String[] arr = {"hey","yolo","hi","this is long"};
//		System.out.println(maxLength(arr));
//		//should print "this is long"
//	  }
//	
//	static String maxLength(String[] words) {
//		int word = 0;
//		int wordLength = words[0].length();
//		for (int i = 1; i < words.length; i++) {
//			if (words[i].length() > wordLength) {
//				word = i;
//				wordLength = words[i].length();
//			
//			}
//		}
//		return words[word];
//	}
//
//	System.out.println("--------");

	public static void main(String[] args) {
		int[] arr = {5,12,-3,7,3,22};
		System.out.println(maxValue(arr)); //should print 22
	}
	
	public static int maxValue(int[] n) {
		int max = n[0];
		for (int i = 0; i < n.length; i++) {
			if (max < n[i]) {
				max = n[i];
			}
		}
		return max;
	}

//System.out.println("-----------");


}