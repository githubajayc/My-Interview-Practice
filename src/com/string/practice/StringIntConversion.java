package com.string.practice;

public class StringIntConversion {

	public static void main(String[] args) {
	
//String to Integer
		
		String s1 = "100";
		String s2 = "100";
		
		System.out.println("String + String : " + s1 + s2);  //12344321
		
		int num1 = Integer.parseInt(s1);
		int num2 = Integer.parseInt(s2);
		 
		System.out.println("Addition after Integer.parsInt : " + num1 + num2);  //100100
		
		Integer num3 = Integer.valueOf(s1);
		Integer num4 = Integer.valueOf(s2);
		System.out.println("Addition after Integer.valueOf : " + num3 + num4);  //100100
		
		String str1 = String.valueOf(num1);
		String str2 = String.valueOf(num2);
		System.out.println("Addition of String.valueOf : "  + str1 + str2); //100100

	}

}
