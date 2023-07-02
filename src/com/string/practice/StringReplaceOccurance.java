package com.string.practice;

/* Replace charatcter with its Occurance 
 * 
 *   i/p : OPENTEXT
 *   o/p : OPEN1EX2             */
 

public class StringReplaceOccurance {

	public static void main(String[] args) {
		
		String str = "opentext";
		
		char charToReplace = 't';
		
		//First check character available or not
		if(str.indexOf(charToReplace) == -1) {
			System.out.println("Character not present");
			System.exit(0);
		}
		
		int count = 1;
		
		for(int i = 0; i < str.length(); i++) {
			
			char ch = str.charAt(i);
			
			if(ch == charToReplace) {
				str = str.replaceFirst(String.valueOf(charToReplace), String.valueOf(count));
				count ++;
			}
		}
		System.out.println(str);
		
		

	}

}
