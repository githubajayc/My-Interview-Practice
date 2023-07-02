package com.java8.practice;

import java.util.ArrayList;
import java.util.function.Predicate;

public class PredicateWithArrayList {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		list.add(2);
		list.add(5);
		list.add(7);
		list.add(8);
		list.add(6);
		
		Predicate<Integer> isEven = n -> n%2==0;
		
		for(Integer num : list) {
			if(isEven.test(num)) {
				System.out.println(num);
			}
		}
		

	}

}
