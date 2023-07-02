package com.string.practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

//Find first Non Repeated Character in a given String

public class StringFirstNonRepeatedChar {

	public static void main(String[] args) {
		
		 String str = "AACBDBE";
		
         System.out.println("Approach 1 : w/o using Collections");

         for(int i = 0; i < str.length(); i++) {
        	 
        	 boolean unique = true;
        	 
        	 for(int j = 0; j < str.length(); j++) {
        		 
        		 if(i !=j && str.charAt(i) == str.charAt(j)) {
        			 unique = false;
        			 break;
        		 }
        	 }
        	 
        	 if(unique) {
        		 System.out.println("First Non Repeated Character : " + str.charAt(i));
        		 break;
        	 }
         }

         

System.out.println("Approach 2 : using Collections");
		
/*In Collections we use Map(Key,Value)
First we take character from string & put it as a Key and its Value as 1

                                         */

           Map<Character,Integer> map = new HashMap<>(); 
           
           for(int i = 0; i < str.length(); i++) {        //Logic to prepare map with key as a Character & Value as a 1 & if key repeats then value +1
        	   
        	   char ch = str.charAt(i);
        	   
        	   if(map.containsKey(ch)) {
        		   map.put(ch, map.get(ch) + 1);
        	   }else {
        		   map.put(ch, 1);
        	   }
           }
           System.out.println(map);

//Now logic to get first non repeated character(first character whose value is 1)
           
           for(Entry<Character, Integer> entrySet : map.entrySet()) {
        	   
        	   if(entrySet.getValue() == 1) {
        		   System.out.println(entrySet.getKey());
        		   break;
        	   }
           }
           
           






	}

}
