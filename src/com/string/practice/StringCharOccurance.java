package com.string.practice;

import java.util.HashMap;
import java.util.Map;

// i/p : HELLO            o/p : H-1  E-1  L-2  O-1

public class StringCharOccurance {

	public static void main(String[] args) {
		
		String str = "HELLO HIO";           //take a string
		
        Map<Character,Integer> map = new HashMap<>();
        
        for(int i = 0; i < str.length(); i++) {
        	
        	char ch = str.charAt(i);
        	
        	if(map.containsKey(ch)) {
        		map.put(ch, map.get(ch) + 1);
        	}else {
        		map.put(ch, 1);
        	}
        }
        System.out.println(map);
	}
	

}
