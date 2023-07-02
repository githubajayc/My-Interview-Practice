package com.array.practice;

import java.util.Arrays;

public class ArrayMerge {

	public static void main(String[] args) {
		
		int [] a = {1, 2, 3};     //length = 3
		
		int [] b = {4, 5, 6};      //length = 3
		
		int [] c = new int [a.length + b.length];    //length = 3+3 = 6
		
		for(int i = 0; i<a.length; i++) {
			
			c[i] = a[i];
		}
		//c[] = {1,2,3,0,0,0}
		
		for(int i = 0; i < b.length; i++) {
			
			c[i + a.length]= b[i];
		}
//traverse array
		//Arrays.toString()
		System.out.println(Arrays.toString(c));
		//for loop
		for(int d : c) {
			System.out.println(d);
		}
	}

}
