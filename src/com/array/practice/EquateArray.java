package com.array.practice;

public class EquateArray {

	public static void main(String[] args) {
		
		int[] arr1 = {1,2,3};
		int[] arr2 = {1,2,4};
		
		boolean isEqual = true;
		
		if(arr1.length != arr2.length) {
			isEqual = false;
		}else {
			for(int i=0; i<arr1.length; i++) {
				
				if(arr1[i] != arr2[i]) {
					isEqual = false;
					break;
				}
			}
		}
		
		if(isEqual==true){
			System.out.println("Arrays are equal");
		}else {
			System.out.println("Arrays are not equal");
		}

	}

}
