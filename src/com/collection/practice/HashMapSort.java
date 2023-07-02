package com.collection.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class HashMapSort {

	public static void main(String[] args) {
		
		HashMap<String,Integer> map = new HashMap<>();
		
		map.put("Jyous", 87);
		map.put("Klusener", 82);
		map.put("Xiangh", 91);
		map.put("Lisa", 89);
		map.put("Narayan", 95);
		map.put("Arunkumar", 86);
		
// Normal Sorting - TreeMap w/o Comparator		
		Map<String,Integer> sortedMap = new TreeMap<>(map);
		
		System.out.println("HashMap before sorting : " + map);
		System.out.println("HashMap after sorting--Normal Sort : " + sortedMap);
		
//Reverse Sorting - TreeMap with Comparator
		
		Map<String,Integer> reverseSortedMap = new TreeMap<>(Collections.reverseOrder());
		reverseSortedMap.putAll(map);
		System.out.println("HashMap after sorting--Reverse Sort : " + reverseSortedMap);
		
		
// Sorting HashMap keys with customized comparator
		
		Map<String, Integer> sortedStudentMap = new TreeMap<>(new Comparator<String>() 
        {
            @Override
            public int compare(String o1, String o2)
            {                                           
                return o1.length() - o2.length();
            }                                   
        });
		
		sortedStudentMap.putAll(map);
        System.out.println("HashMap after sorting--Reverse Sort : " + sortedStudentMap);		
		
// Sorting by Java 8
        
        List<Entry<String, Integer>> sortedBy8Java = map.entrySet().stream().sorted(Entry.comparingByKey()).collect(Collectors.toList());
		
		System.out.println("Sorting by Java 8 : " + sortedBy8Java);
		
	 //Reverse Sort
		List<Entry<String, Integer>> reverseSortBy8Java = map.entrySet().stream().sorted(Collections.reverseOrder(Entry.comparingByKey())).collect(Collectors.toList());
		System.out.println("Reverse sort By Java 8 : " + reverseSortBy8Java);
		
//Sorting By Values
		
		ArrayList<Entry<String,Integer>> list = new ArrayList<>(map.entrySet());
		
		Collections.sort(list, new Comparator<Entry<String,Integer>>(){

			@Override
			public int compare(Entry<String, Integer> e1, Entry<String, Integer> e2) {
				
				return e1.getValue()-e2.getValue();
			}
			
			
		});
		System.out.println("Sort By Values : " + list);
		
		
		
		

	}

}
