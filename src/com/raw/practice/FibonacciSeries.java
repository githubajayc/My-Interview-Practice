package com.raw.practice;

public class FibonacciSeries {

	public static void main(String[] args) {
		

		int a = 0;
		int b = 1;
		
		System.out.println(a + " " + b);
		
		for(int i=2; i <=10; i++) {
			
			int num = a+b;
			System.out.print(num + " ");
			
			a=b;
			b=num;
		}

	}

}
