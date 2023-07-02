 package com.collection.practice;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapToArrayList {

	public static void main(String[] args) {
		
		HashMap<String,String> map = new HashMap<>();
		
		map.put("John Kevin", "Average"); 
        
		map.put("Rakesh Sharma", "Good"); 
         
		map.put("Prachi D", "Very Good"); 
         
		map.put("Ivan Jose", "Very Bad"); 
         
		map.put("Smith Jacob", "Very Good"); 
         
		map.put("Anjali N", "Bad"); 
		
// Keys of map to list
		
		Set<String> keys =map.keySet();
		
		ArrayList<String> keyList = new ArrayList<>(keys);
		System.out.println("Keys of Map in list : " + keyList);
		
// Values of map to list
		
		Collection<String> values = map.values();
		
		ArrayList<String> valueList = new ArrayList<>(values);
		System.out.println("Values of map to list : " + valueList);
		
// Key-Value of map to list
		
		Set<Entry<String,String>> keyValues = map.entrySet();
		
		ArrayList<Entry<String,String>> keyValueList = new ArrayList<>(keyValues);
		System.out.println("Key-Values of map to list : " + keyValueList);
		
		
		
		
		
		
		
		
  
	}

}
