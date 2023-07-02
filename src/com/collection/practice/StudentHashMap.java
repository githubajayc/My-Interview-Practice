package com.collection.practice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class StudentHashMap {

	public static void main(String[] args) {
//Here we store different 3 Student object in HashMap with same content & size of HashMap is 3	
		
		Student s1 = new Student(123, "Student1", 62);
		Student s2 = new Student(123, "Student1", 62);
		Student s3 = new Student(123, "Student1", 62);
		
		HashMap<Student,Integer> map = new HashMap<>();
		
		map.put(s1, 1);
		map.put(s2, 1);
		map.put(s3, 2);
		
		System.out.println(map);
		System.out.println(map.size()); //3
	
		System.out.println("Experiment with String Objects");
		String s4 = "Ajay";
		String s5 = "Ajay";
		String s6 = new String("Ajay");
		String s7 = new String("Ajay");
		
		HashMap<String,Integer> map2 = new HashMap<>();
         
		map2.put(s4, 4);
		map2.put(s5, 5);
		map2.put(s6, 6);
		map2.put(s7, 7);
		
		System.out.println(map2);         // {Ajay=7}
		
		System.out.println(map2.size());      // 1
		
		Iterator<Entry<String, Integer>> it = map2.entrySet().iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());   // Ajay=7
		}
		
		
		
		
		
		
	}

}
