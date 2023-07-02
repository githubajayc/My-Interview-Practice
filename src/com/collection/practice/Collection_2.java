package com.collection.practice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class Collection_2 {

	public static void main(String[] args) {
		
//Iterate HashMap using forEach loop
		System.out.println("Using for each loop");
		HashMap<String,String> map = new HashMap<>();
		map.put("Key1", "Value1");
	    map.put("Key2", "Value2");
	    map.put("Key3", "Value3");
	    map.put("Key4", "Value4");
	    
	    for(String s : map.keySet()) {
	    	System.out.println("Key : " + s + " value : " + map.get(s)) ;
	    }

//Using iterator
	    System.out.println("Using iterator");
	    Set<String> keys = map.keySet();
	    Iterator<String> it = keys.iterator();
	    while(it.hasNext()) {
	    	System.out.println(it.next());
	    }
	    
//get values
	    System.out.println("Values : ");
	   // Collection<String> values = map.values();
	    for(String value : map.values()) {
	    	System.out.println(value);
	    }
	

//get key & values
	
	    System.out.println("getting keys & values using entrySet()");
	    
	    Iterator<Entry<String,String>> itSet = map.entrySet().iterator();
	    while(itSet.hasNext()) {
	    	System.out.println(itSet.next());
	    }
	
	   
	
	
	
	}	
}
