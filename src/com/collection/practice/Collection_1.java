package com.collection.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class Collection_1 {

	public static void main(String[] args) {

//Program to iterate ArrayList
		ArrayList<Integer> al = new ArrayList<Integer>(Arrays.asList(3,17,6,9,7));  //Directly Adding with asList()
       
		// add elements to ArrayList object
//        al.add(3);
//        al.add(17);
//        al.add(6);
//        al.add(9);
//        al.add(7);
		
//directly
        System.out.println("Printing ArrayList Directly : " + al);
        
//using forEach loop
        for(Integer i : al) {
        	System.out.println(i);
        }
        
//Convert List to Array
        
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Pear");
        System.out.println("Directly printing ArrayList : " + fruits);
        
 // 1.using get()
        
        String str[] = new String[fruits.size()];
        
        for(int i=0; i < fruits.size(); i++) {
        	str[i] = fruits.get(i);
        }
        for(String s : str) {
        	System.out.println(s);
        }
        
 // 2.using toArray()
        
         String[] str2 = fruits.toArray(new String[fruits.size()]);
         for(String s2 : str2) {
        	 System.out.println(s2);
         }
        
//Iterate HashSet
  
         System.out.println("Iterating HashSet using Iterator");
         HashSet<String> set = new HashSet<String>();
         set.add("Pear");
         set.add("Apple");
         set.add("Orange");
         set.add("Papaya");
         set.add("Banana"); 
  //Directly printing
         System.out.println("Directly printing set : " + set);
    
  //using iterator
         Iterator<String> it = set.iterator();
         
         while(it.hasNext()) {
        	System.out.println( it.next());
         }
         
//Check Element exist or not
         if(set.contains("Pear")) {
        	 System.out.println("Pear Exists");
         }else {
        	 System.out.println("Not Exists");
         }
    
         
//Reverse ArrayList
         Collections.reverse(al);
         System.out.println("ArrayList after reversing : " + al);         
        
//Convert Arrays to List
         
         System.out.println("Converting Array to List");
         
         String[] s = {"abc", "def", "ghi", "jkl"};
         
  //using asList()
        ArrayList<String> list3 = new ArrayList<String>(Arrays.asList(s));
        System.out.println(list3);
        
  //using addAll()
        System.out.println("using addAll");
        ArrayList<String> list4 = new ArrayList<String>();
        Collections.addAll(list4, s);
        System.out.println(list4);
        
  //using add()
        System.out.println("Using add()");        
        for(int i=0; i < s.length; i++) {
        	list4.add(s[i]);
        }
        for(String str4 : list4) {
        	System.out.println(str4);
        }
        
   //using Java 8
        System.out.println("Using Java 8");
        List<String> list5 = Arrays.stream(s).collect(Collectors.toList());
        System.out.println(list5);
        
        
        
        
        
        
        

	}

}
