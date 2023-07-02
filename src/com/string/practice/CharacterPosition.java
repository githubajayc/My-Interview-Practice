package com.string.practice;

//program to get the character at the given index within the string

/*Original String = Java Exercises!                                                                             
The character at position 0 is J                                                                              
The character at position 10 is i 	*/

public class CharacterPosition {

	public static void main(String[] args) {
		
		String input = "Java Exercises!";
		char[] inputArray = input.toCharArray();
		
		for(int i=0; i<inputArray.length; i++) {
			System.out.println("Charater at " + i + " Postion : " + inputArray[i]);
		}
		

	}

}
