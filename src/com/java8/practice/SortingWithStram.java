package com.java8.practice;

import java.util.ArrayList;

public class SortingWithStram {

	public static void main(String[] args) {
		
ArrayList<Integer> list = new ArrayList<Integer>();
		
		list.add(2);
		list.add(5);
		list.add(7);
		list.add(8);
		list.add(6);
		
		//Ascending Order
		list.stream().sorted().forEach(System.out::println); 
		
		//Descending Order
		list.stream().sorted((a,b) -> b.compareTo(a)).forEach(System.out::println);

	}

}
