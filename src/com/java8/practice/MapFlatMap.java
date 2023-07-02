package com.java8.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapFlatMap {

	public static void main(String[] args) {
		List<Institute> instituteList = new ArrayList<>();
        
		instituteList.add(new Institute("IIM", Arrays.asList("Bangalore", "Ahmedabad", "Kozhikode", "Lucknow")));
		instituteList.add(new Institute("IIT", Arrays.asList("Delhi", "Mumbai", "Kharagpur")));
		instituteList.add(new Institute("NIFT", Arrays.asList("Hyderabad", "Mumbai", "Patna", "Bangalore")));

		List<String> list = instituteList.stream().map(Institute::getInstitue).collect(Collectors.toList());
		System.out.println(list);
		
		List<String> locations = instituteList.stream().flatMap(institute -> institute.getCities().stream()).collect(Collectors.toList());
		System.out.println(locations);
	}

}
