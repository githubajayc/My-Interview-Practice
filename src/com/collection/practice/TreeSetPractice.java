package com.collection.practice;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.TreeSet;

// Write a Java program to add all the elements of a specified tree set to another tree set

public class TreeSetPractice {

	public static void main(String[] args) {
		
		TreeSet<String> tSet = new TreeSet<>();
		
		tSet.add("Blue");
		tSet.add("Red");
		tSet.add("Green");
		tSet.add("yellow");
		tSet.add("violet");
		tSet.add("White");
		System.out.println(tSet);  //[Blue, Green, Red, White, violet, yellow]
		
		TreeSet<String> tSet2 = new TreeSet<>(String.CASE_INSENSITIVE_ORDER);
		tSet2.addAll(tSet);
		System.out.println(tSet2);  //[Blue, Green, Red, violet, White, yellow]
		tSet2.add("Pink");
		tSet2.add("Black");

//TreeSet with Iterator
		
		Iterator<String> tSetIt = tSet2.iterator();
		
		while(tSetIt.hasNext()) {
			System.out.println(tSetIt.next());
		}

		TreeSet<String> tSetRev = new TreeSet<>(Collections.reverseOrder());
	
//Reverse the TreeSet
		
		tSetRev.addAll(tSet2);
		System.out.println(tSetRev);  //[yellow, violet, White, Red, Green, Blue]
		
		System.out.println(tSet2.first());  //Blue
		System.out.println(tSet2.last());   // yellow
	    System.out.println(tSet2.size());   //6
	    
//Remove the last element of a TreeSet
	   System.out.println(tSet2.pollLast());  //yellow
	    
//Compare two TreeSet
	    System.out.println("First TreeSet : " + tSet);
	    System.out.println("Second TreeSet : " + tSet2);
	    
	    for(String s : tSet2) {
	    	if(tSet.contains(s)) {
	    		System.out.println("Yes");
	    	}else {
	    		System.out.println("No");
	    	}
	    }
	    
// Write a program to get the element in a tree set which is strictly greater than or equal to the given element.
	    
	    TreeSet<Integer> tSet3 = new TreeSet<>(Arrays.asList(4,6,8,10,13,11,7));
	    
	    for(Integer i : tSet3) {
	    	if(i >= 11) {
	    		System.out.println(i);   // 11 13
	    	}
	    }
	    
	    //with methods
	    
	    System.out.println(tSet3.higher(11));  // 13
	    
	}

}
