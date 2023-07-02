package com.string.practice;

public class ReverseString {

	public static void main(String[] args) {
		
		//Input : Hello     Output : olleH
		
		/*4 Ways : 1. toCharArray()
		           2. charAt(int index)
		           3. StringBuffer.reverse()
		           4. StringBuilder.reverse()       */
		
		//1st way
		
		String s = "Hello";
		
		char[] ch = s.toCharArray();     //Converts this string to a new character array.
		
		for(int i = ch.length-1; i >= 0; i--) {
			System.out.print(ch[i]);
		}
		System.out.println("");
		
		//////////////////////////////////////////////////////////////////////////////////////////////////////
		
		//2nd Way
		
		for(int i = s.length()-1; i>=0; i-- ) {
			
			System.out.println(s.charAt(i));
		}
		System.out.println("");
		
		///////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		//3rd Way
		
		StringBuffer sb = new StringBuffer(s);    //First Converting our String into StringBuffer
		
		System.out.println(sb.reverse());
		System.out.println("");
		
		
		/////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		//4th Way
		
		StringBuilder sbl = new StringBuilder(s);
		
		System.out.println(sbl.reverse());
		

	}



}
