package com.collection.practice;

import java.util.Scanner;
import java.util.TreeMap;

public class Demo_TreeMap {

	public static void main(String[] args) {
		
		TreeMap<Integer,String> map = new TreeMap<>();
		
		map.put(3, "Ajay");
		map.put(6, "Abhi");
		map.put(4, "Vicky");
		map.put(8, "Ram");
		map.put(2, "Shubh");

//Iterating TreeMap
		
		//Advance For Loop
		for(Integer i : map.keySet()) {
			System.out.println("Key : " +  i + " Value : " + map.get(i));
		}
		
		//Directly
		TreeMap<Integer,String> map2 = new TreeMap<>(map);  //copying TreeMap
        System.out.println(map2);
        
//Get Smallest & Largest Key with its Value
        System.out.println("Smallest Key : " + map.firstEntry());
        System.out.println("Largest Key : " + map.lastEntry());
  
//Print first Entry and remove it
        System.out.println("First Key : " + map.pollFirstEntry());
        System.out.println("TreeMap after removing First Key : " + map);
        
//Search Value By Key
        
        Scanner s = new Scanner(System.in);
        System.out.println("Avaialable keys Are : 2-3-4-6-8");
        System.out.println("Enter Any Key Available : ");
        int key = s.nextInt();
        System.out.println("Value for Entered Key : " + map.get(key));
        

        
        
        
        
        
        
	}

}
