package com.string.practice;

public class StringInterning {

	public static void main(String[] args) {
		
		String str1 = "hello";
		String str2 = new String("hello");

		// Check if str1 and str2 are equal 
		System.out.println(str1==str2);   //false (== operator compares reference)

		// Intern the String object referenced by str2
		str2 = str2.intern();

		// Check if str1 and str2 are equal after interning str2
		System.out.println(str1==str2);    //true
		
		String s1 = "hello";
		String s2 = new String("hello");
		String s3 = s2.intern();
		
		System.out.println(s1==s2); //false
		System.out.println(s1==s3); //true 
		System.out.println(s2==s3);  //false
		
		System.out.println(s1.equals(s2));  //true 
		System.out.println(s1.equals(s3));  //true 
		System.out.println(s2.equals(s3));  //true

	}

}
