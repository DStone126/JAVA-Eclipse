package com.syntax.class34;

import java.util.*;

public class Shyt {

	class Main {
		  
		  public  void main(String[] args) {
			
		
		    
		    List<Map<String,Object>> dataList = new ArrayList<Map<String,Object>>();
		    
		    Map<String,Object> appleMap = new HashMap<String,Object>();
		    
		    appleMap.put("Items", "Apple");
		    appleMap.put("Price", 21.99);
		    appleMap.put("Quantity", 10);
		    
		    dataList.add(appleMap);
		    
		    Map<String,Object> orangeMap = new HashMap<String,Object>();
		    
		    appleMap.put("Items", "Orange");
		    appleMap.put("Price", 21.99);
		    appleMap.put("Quantity", 10);
		    
		    dataList.add(orangeMap);
		   
		   double purchaseTotalPrice = 0;
		    
		    for(Map<String,Object> map:dataList){
		      String items = map.get("Items").toString();
		      double price = Double.parseDouble(map.get("Price").toString());
		      double quantity = Double.parseDouble(map.get("Quantity").toString());
		      double lineTotal = price * quantity;
		      
		      System.out.println("Items: "+ items +" Price: "+ price +" Quantity: "+ quantity +" SubTotal: "+ lineTotal);
		      purchaseTotalPrice += lineTotal;
		   
		      System.out.println("Your Purchase total : "+ purchaseTotalPrice);
		     }
		  }
		}
	}

