package com.array.practice;

import java.util.Arrays;

public class ArraySort {

	public static void main(String[] args) {
		
		int [] a = {4,2,1,3,8,5,6};
		
		System.out.println("Array before sort :" + Arrays.toString(a));
		
		for(int i = 0; i < a.length; i++) {
			
			for(int j = i+1; j < a.length; j++) {
				
				if(a[i] > a[j]) {            //sorting in Ascending order
					
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		 
		System.out.println("Array After Sort :" + Arrays.toString(a));
		 
	}

}
