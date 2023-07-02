package com.string.practice;

public class StringVsStringBuild {

	public static void main(String[] args) {
		
		int n = 10000;
		String s = "";
		long startTime = System.currentTimeMillis();
		
		for(int i=0; i<n; i++) {
			s = s+ n;
		}
		
		long endTime = System.currentTimeMillis();
		System.out.println("Total time taken in String : " + (endTime-startTime) + "ms");   //432ms
		
		StringBuilder sb = new StringBuilder();
		long startTime2 = System.currentTimeMillis();
		for(int i=0; i<n; i++) {
			sb.append(n);
		}
		long endTime2 = System.currentTimeMillis();
		System.out.println("Total time taken in StringBuilder : " + (endTime2-startTime2) + "ms");  //1ms

		System.out.println(s);
	}

}
