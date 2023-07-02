package com.string.practice;

public class StringPallindromeCheck {

	public static void main(String[] args) {
		
		String str = "madam";
		
		String reverse = "";
		
		for(int i = str.length()-1; i >=0; i--) {
			
			reverse += str.charAt(i);   // OR   reverse = reverse + str.charAt(i); 
		}
		
		if(reverse.equals(str)) {
			System.out.println("String is Pallindrome");
		}else {
			System.out.println("Stting is not Pallindrome");
		}
		
			
			
	}
}
