package com.collection.practice;

import java.util.Comparator;

public class StudentPercentageComparator implements Comparator<Student>{

	@Override
	public int compare(Student s1, Student s2) {
		
		return s1.percentage - s2.percentage;
		//return s1.percentage - s2.percentage;  //for descending order
	}

}
