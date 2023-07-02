package com.collection.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class StudentComparableSort {

	public static void main(String[] args) {
		//Creating an ArrayList of Student objects
        
        ArrayList<Student> listOfStudents = new ArrayList<Student>();
         
        //Adding students to listOfStudents
         
        listOfStudents.add(new Student(123, "Student1", 62));
         
        listOfStudents.add(new Student(231, "Student2", 81));
         
        listOfStudents.add(new Student(85, "Student3", 79));
         
        listOfStudents.add(new Student(478, "Student4", 94));
         
        listOfStudents.add(new Student(365, "Student5", 62));
         
        System.out.println("listOfStudents Before Sorting :");
         
        System.out.println(listOfStudents);
        
 //using comparable and sort()
        Collections.sort(listOfStudents);
        System.out.println("After sorting by Students ID : " + listOfStudents);
        
 //using custom comparator and sort()
        
        Collections.sort(listOfStudents, new StudentPercentageComparator());
        
        System.out.println("After sorting by percentage using custom compoarator : " + listOfStudents );
        
//Sorting with ID
        
        System.out.println("Sorting with ID");
        Collections.sort(listOfStudents,new Comparator<Student>() 
        {

			@Override
			public int compare(Student s3, Student s4) {
				
				return s3.id-s4.id;
			}
        	
        });
        System.out.println("Sort by Id : " + listOfStudents);

	}

}
