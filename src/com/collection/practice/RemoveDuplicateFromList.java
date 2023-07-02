package com.collection.practice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateFromList {

	public static void main(String[] args) {
//using Set
		
	  ArrayList<String> listWithDuplicates = new ArrayList<>();
	  
	  listWithDuplicates.add("JAVA");
	  
	  listWithDuplicates.add("J2EE");

	  listWithDuplicates.add("JSP");

	  listWithDuplicates.add("SERVLETS");

	  listWithDuplicates.add("JAVA");

	  listWithDuplicates.add("STRUTS");

	  listWithDuplicates.add("JSP");
	  
	  System.out.println("Before Removing Duplicates : " + listWithDuplicates);
	  
	  Set<String> set = new HashSet<>(listWithDuplicates);
	  
	  System.out.println("After Removing Duplicates with HashSet : " + set);
	  
	  LinkedHashSet<String> linkedSet = new LinkedHashSet<>(listWithDuplicates);
	  
	  System.out.println("After Removing Duplicates with LinkedHashSet : " + linkedSet);


	}

}
