package com.java8.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StudentTest {

	public static void main(String[] args) {
		Student s1 = new Student("Ajay", 101, "History", 60.2);
		Student s2 = new Student("Abhi", 102, "Physics", 56.2);
		Student s3 = new Student("Ravi", 103, "History", 73.2);
		Student s4 = new Student("Naru", 104, "Physics", 34.2);
		
		List<Student> list = new ArrayList<>(Arrays.asList(s1,s2,s3,s4));
		
		Map<Boolean, List<Student>> studentAbove60 = list.stream().collect(Collectors.partitioningBy(student -> student.getPercentage() > 60));
		
		System.out.println(studentAbove60);
		
		//top 3 performing
		
		List<Student> top3Performer = list.stream().sorted(Comparator.comparingDouble(Student::getPercentage).reversed()).limit(3).collect(Collectors.toList());
	    System.out.println(top3Performer);
	    
	    Map<String, Double> namePercnt = list.stream().collect(Collectors.toMap(Student::getName, Student::getPercentage));
	    System.out.println(namePercnt);
	    
	    List<String> subjectsOffered = list.stream().map(Student::getSubject).distinct().collect(Collectors.toList());
	    
	    System.out.println(subjectsOffered);
	    
	    //highets lowest average marks
	    
	    DoubleSummaryStatistics percent = list.stream().collect(Collectors.summarizingDouble(Student::getPercentage));
	    System.out.println("Highest : " + percent.getMax());
	    System.out.println("lowest : " + percent.getMin());
	    System.out.println("Average : " + percent.getAverage());
	    
	    Long countOfStudents = list.stream().collect(Collectors.counting());
	    System.out.println(countOfStudents);
	    
	    Map<String, List<Student>> groupBySubjects = list.stream().collect(Collectors.groupingBy(Student::getSubject));
	    System.out.println(groupBySubjects);
	    
	    
	    
	    
	    
	    
	    
	}

}
