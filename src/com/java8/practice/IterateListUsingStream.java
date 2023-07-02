package com.java8.practice;

import java.util.Arrays;
import java.util.List;

public class IterateListUsingStream {

	public static void main(String[] args) {
		 
		List<Integer> list = Arrays.asList(5,4,2,8,7);
		
		list.stream().forEach(n -> System.out.println(n));
        
		//Sorting of List
		
		System.out.println("List after sorting");
		list.stream().sorted().forEach(n -> System.out.println(n));     //Ascending Order
		
		System.out.println("Sorting in Descending Order");
		
		list.stream().sorted((a,b) -> b.compareTo(a)).forEach(System.out::println);
		
	}

}
