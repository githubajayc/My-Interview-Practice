package com.array.practice;

import java.util.Arrays;

public class ArraySecondHighest {

	public static void main(String[] args) {
		
		int [] a = {3,6,5,4};
		
		
		for(int i = 0; i < a.length; i++) {
			
			for(int j = i+1; j < a.length; j++) {
				
				if(a[i] > a[j]) {
					
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
		         }
			}
		}
		System.out.println(Arrays.toString(a));
		
		int secondHighest =a[a.length-2];
		System.out.println(secondHighest);

	}

}
