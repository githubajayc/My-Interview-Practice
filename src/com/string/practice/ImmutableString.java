package com.string.practice;

public class ImmutableString {

	public static void main(String[] args) {
// Prove String is Immutable
		
		String s1 = "JAVA";
		s1.concat("STAR");
		System.out.println(s1);       //JAVA
		String s2 = s1.concat("STAR");
		System.out.println(s2);       //JAVASTAR
		
		StringBuffer sb1 = new StringBuffer("SONY");
		sb1.append("LIVE");
		System.out.println(sb1);     //SONYLIVE
		
		String s3 = "SONYLIVE";
		System.out.println(s3.equals(sb1));  //false

	}

}
