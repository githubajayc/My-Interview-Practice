package com.string.practice;

import java.util.Arrays;

/*Sort a string in alphabetical order
    
     2 Ways : 1. w/o using sort()
              2. using sort()                            */


public class SortString {

	public static void main(String[] args) {
		
		String str = "rock";
		
//Approach 1 >> w/o using sort()
		
		char temp;
		
		char[] charArray = str.toCharArray();     //first convert string to character array
		
		for(int i = 0; i < charArray.length; i++) {
			
			for(int j = i+1; j < charArray.length; j++) {
				
				if( charArray[i] > charArray[j] ) {
			          temp = charArray[i];
			          charArray[i] = charArray[j];
			          charArray[j] = temp;
				}
			}
		}
		System.out.println(new String(charArray));
		System.out.println( Arrays.toString(charArray));  //[c, k, o, r]
		System.out.println(charArray);
	
		
// Approach 2 >> using Arrays.sort()
		
		String str1 = "java";
		
		char[] charArray2 = str1.toCharArray();
		
		Arrays.sort(charArray2);
		
		System.out.println(charArray2);
		
		
		
		

	}

}
