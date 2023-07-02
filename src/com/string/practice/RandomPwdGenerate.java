package com.string.practice;

import java.util.Random;

public class RandomPwdGenerate {

	public static void main(String[] args) {
        String text = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
		
		StringBuilder sb = new StringBuilder();
		
		Random random = new Random();
		
		int pwdLength = 6;
		
		for(int i=1; i <= pwdLength; i++) {  //loop will run for 6 times 
			
			int index = random.nextInt(text.length());  //this will give some random index number from length of text
			sb.append(text.charAt(index));
		}
		
		System.out.println(sb);

	}

}
