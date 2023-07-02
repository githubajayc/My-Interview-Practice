package com.java8.practice;

import java.util.Arrays;
import java.util.List;

public class StringListStreamOperations {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("Ajay","Abhi","Kailash","Ravi","Manoj","Ankit");
		
		//Print words staring with 'A' and convert them to upper case
		
	    list.stream().filter(s -> s.startsWith("A")).map(String::toUpperCase).forEach(System.out::println);
	}

}
