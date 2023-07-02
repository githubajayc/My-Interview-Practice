package com.java8.practice;

import java.util.Arrays;
import java.util.function.Predicate;

public class PrintEvenNumUsingStream {

	public static void main(String[] args) {
		int[] a = {2,5,6,8,9,4};
		
		//Print even Numbers and sort them
		Arrays.stream(a).filter(n -> n%2==0).sorted().forEach(System.out::println);
		
		Predicate<Integer> pred = (n -> n%2==0);
		for(Integer i : a) {
			if(pred.test(i)) {
				System.out.println("With Predicate : " + i);
			}
		}

	}

}
