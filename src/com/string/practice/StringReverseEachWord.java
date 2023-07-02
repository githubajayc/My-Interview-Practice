package com.string.practice;

// i/p : java code          o/p : avaj edoc

public class StringReverseEachWord {

	public static void main(String[] args) {
		
		String inputString = "Java Concept Of The Day";
		
		String[] words = inputString.split(" "); //this gives array of words
        
        String reverseString = "";
        System.out.println(words.length);   // 5
         
        for (int i = 0; i < words.length; i++){
        	
            String word = words[i];
             
            String reverseWord = "";
             
            for (int j = word.length()-1; j >= 0; j--) 
            {
                reverseWord = reverseWord + word.charAt(j);
            }
             
            reverseString = reverseString + reverseWord + " ";
        }
         
        System.out.println(inputString);
         
        System.out.println(reverseString);
		
		

	}

}
