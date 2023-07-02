package com.array.practice;

public class MiddleElementArray {

	public static void main(String[] args) {
		
		//Odd number of elements
		
		int [] a = {2,6,4,7,8};  
		System.out.println(a.length);     //5
		
		int middleIndex = a.length/2;
		System.out.println(middleIndex);   //2
		
		System.out.println(a[middleIndex]);
		
		//Even number of elements
		
		int [] b = {4,6,5,8,9,3};
		
		if(b.length %2 == 0) {
			int middleLeftIndex = b.length/2-1;
			System.out.println("Two Middle Elements are : " + b[middleLeftIndex] + " & " + b[middleLeftIndex+1]);
		}else {
			int index = b.length/2;
			System.out.println(b[index]);
		}
		
		
	}

}
