package com.array.practice;

public class ArrayMissing {

	public static void main(String[] args) {
		
		int [] a = {2,4,1,5};
		
		for(int key = 1; key <=5; key++) {
			
			boolean isPresent = check(a,key);
			if(isPresent == false) {
				System.out.println("Missing Number is :" + key);
			break;
			}
		}
	}

	private static boolean check(int[] a, int key) {
		
		for(int i = 0; i < a.length; i++) {
			
			if(a[i] == key) {
				return true;
			}
		}
		return false;
	}

}
