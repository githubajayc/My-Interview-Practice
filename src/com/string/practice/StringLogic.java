package com.string.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringLogic {

	public static void main(String[] args) {
	
// Program 1 : O/P = INVITE
		String s = "Welcome Infosys Invite";
		
		String[] tokens = s.split(" ");
		
		for(String token : tokens) {
			
			if(token.equals("Invite")) {
				System.out.println(token.toUpperCase());   //INVITE
				break;
			}
		}
	
// Program 2 : Output : elppaegnaro
		
		String s1 = "apple";
		String s2 = "orange";
		
		String rev1 = "";
		String rev2 = "";
		
		for(int i=s1.length()-1; i>=0; i--) {
			rev1 = rev1 + s1.charAt(i);     // + operator for concatenation
		}

		for(int i=s2.length()-1; i>=0; i--) {
			rev2 += s2.charAt(i);     // + operator for concatenation
		}
		
		String result = rev1 + rev2;
		System.out.println(result);  //elppaegnaro
		
//Count the number of words
		
		
        String s3 = "this this is is done by me";
        String[] words = s3.split(" ");
        System.out.println(words.length);   //7

//Program to append number with each element of a list
        
        List<String> list = new ArrayList<>();
        
        list.add("apple");
        list.add("banana");
        list.add("orange");
        
        int num = 123;
        
        for(int i=0; i<list.size(); i++) {
        	list.set(i, list.get(i)+num);
        }
        System.out.println(list);    //[apple123, banana123, orange123]
        
        
//WAP to identify string with more than specified length , replace that with constant/number      
        
        String s4 = "hello hi how ajay mobile ultraPro apple but good";
        
        String[] token = s4.split(" ");
        
        for(int i=0; i<token.length-1; i++) {
        	String replacement = "000";
        	if(token[i].length() > 4) {
        		token[i] = replacement;
        	}
        }
        System.out.println(Arrays.toString(token));   //[000, hi, how, ajay, 000, 000, 000, but, good]
        
        
        
        
        
        
	}
	

}
