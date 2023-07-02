package com.string.practice;

import java.util.LinkedHashSet;
import java.util.Set;

//Remove Duplicate Characters
// Input : Programming
// Output : Progamin

/* 4 Approaches : 1. Java 8
                  2. indexOf()
                  3. Character Array
                  4. Set interface Method   */

public class RemoveDuplicate {

	public static void main(String[] args) {
		
		String str = "Programming";
		
//1st Approach : using Java 8
		
		StringBuilder sb1 =  new StringBuilder();
		
		str.chars().distinct().forEach(c -> sb1.append((char)c));
		
		System.out.println("using Java8-StringBuilder Approach : " + sb1);            // o/p : Progamin
		
		
//Approach 2 : using indexOf()
		
		StringBuilder sb2 = new StringBuilder();
		
		for(int i = 0; i < str.length(); i++) {
			
			char ch = str.charAt(i);      //charAt(): it returns each letter in string one by one  
			
			int index = str.indexOf(ch, i+1);    //indexOf() : it checks the occurence of each letter given by charAt() & returns -1 if letter not repeated
			
			
			if(index == -1) {
				sb2.append(ch);
			}
		}
		System.out.println("Using indexOf() : " + sb2);      // o/p : Poraming
		
		
//Approach 3 : using Character Array
		
		char[] arr = str.toCharArray();    //first converting string to character array
		
		StringBuilder sb3 = new StringBuilder();
		
		for (int i = 0; i < arr.length; i++) {
			
			boolean repeated = false;
			
			for (int j = i+1; j < arr.length; j++) {    //in i we get first letter then comparing it with remaining letters(taken in j)
				
				if(arr[i] == arr[j]) {
					repeated = true;
					break;
				}
			}
			
			if(!repeated) {
				sb3.append(arr[i]);
			}
		}
		System.out.println("Using Character Array : " + sb3);
		
		
//Approach 4 : using Set Interface (it does not allow duplicate)
		
		StringBuilder sb4 = new StringBuilder();
		
		Set<Character> set = new LinkedHashSet<>();
		
		for(int i = 0; i< str.length(); i++) {
			
			set.add(str.charAt(i));  //here set will not allow duplicate
		}
		
		for(Character c : set) {    //taking set data into Character c
			
			sb4.append(c);          //appending c to sb4 object
		}
		
		System.out.println("Using Set : " + sb4);
		
		
		

	}

}
