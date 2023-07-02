package com.string.practice;

public class DuplicateWord {

	public static void main(String[] args) {
		
//Find Duplicate word from given string
		
		String s = "hello ajay but ajay is fine hello";
		
		String[] tokens = s.split(" ");
		
		for(int i=0; i <tokens.length; i++) {
			
			int count=1;
			
			for(int j=i+1; j<tokens.length; j++) {
				
				if(tokens[i].equals(tokens[j])) {
					count++;
				}
			}
			
			if(count>1) {
				System.out.println(tokens[i]);   //hello ajay
			}
		}

	}

}
