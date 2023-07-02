package com.array.practice;

public class ArrayMinMax {

	public static void main(String[] args) {
		
		int [] a = {10,8,6,2,14};
		
		
//Finding Max element in array
		
		int max = a[0];
		
		for(int i = 0; i < a.length; i++) {
			
			if(max < a[i]) {
				max = a[i];
			}
		}
        System.out.println("Maximum element of Array : " + max);
        
//Finding Min element in array
        
        int min = a[0];
        
        for(int aa : a) {           //using for each loop
        	if(min > aa) {
        		min = aa;
        	}
        }
        System.out.println("Minimum element in Array : " + min);
	}

}
