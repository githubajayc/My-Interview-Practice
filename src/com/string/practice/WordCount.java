package com.string.practice;

import java.util.HashMap;

public class WordCount {
// Input : "this this is is done by me"
// Output: this-2, Is-2, Done-1, by-1, me-1

	public static void main(String[] args) {
		
		String str =  "this this is is done by me";
		HashMap<String,Integer> map = new HashMap<>();
		
		String[] words = str.split(" ");
		
		for(String token : words) {
			
			if(map.containsKey(token)) {
				map.put(token, map.get(token)+1);
			}else {
				map.put(token, 1);
			}
		}
		System.out.println(map);  //{by=1, this=2, me=1, is=2, done=1}

	}

}
