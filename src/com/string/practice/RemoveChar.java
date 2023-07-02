package com.string.practice;

//Remove Special Character from String
// Input : @#J%A^%VA&(S)T!A~!R
//Output : JAVASTAR

public class RemoveChar {

	public static void main(String[] args) {
		
		String s = "@#J%A^%VA&(S)T!A~!R";
		
		//Approach 1 : replaceAll()
		
		String plainString = s.replaceAll("[^a-zA-Z0-9]", "");
		
		System.out.println(plainString);
		
		
	}

}
