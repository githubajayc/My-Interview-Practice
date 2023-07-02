package com.array.practice;

import java.util.stream.Stream;

public class ArrayAccess {

	public static void main(String[] args) {
	  
		String [] str = {"Ajay", "Abhi", "Tushar"};
		
//Traverse Array by using : for Loop
		
		for(int i = 0; i < str.length; i++) {
			System.out.println(str[i]);
		}
		
//Traverse Array by using : for Loop
		
		for(String s : str) {
			System.out.println(s);
		}
		
//Traverse Array by using : for Loop
		
		Stream.of(str).forEach(s -> System.out.println(s));

	
	
//Traverse in Reverse Order
	
	for(int i = str.length-1 ; i >= 0; i--) {
		System.out.println(str[i]);
	}

}
}
