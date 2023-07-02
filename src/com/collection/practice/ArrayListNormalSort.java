package com.collection.practice;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListNormalSort {

	public static void main(String[] args) {
		
         ArrayList<String> list = new ArrayList<>();
          
         list.add("Virat");
          
         list.add("rohit");
          
         list.add("Shikar");
          
         list.add("ashwin");
          
         list.add("ravindra");
          
         list.add("Bhargav");
         
         System.out.println("ArrayList before sort : " + list);
         
//Adding Element at 3rd Position(2nd Index)
         list.add(2, "Dhoni");
         
         System.out.println("ArrayList after adding element : " + list);
         
         Collections.sort(list);  //[Virat, rohit, Shikar, ashwin, ravindra, Bhargav]
         
         System.out.println("ArrayList after normal sort : " + list); //[Bhargav, Shikar, Virat, ashwin, ravindra, rohit]
         
         //sorting with comparator
         
         Collections.sort(list, String.CASE_INSENSITIVE_ORDER);
         
         System.out.println("Sort after comparator : " + list); //[ashwin, Bhargav, ravindra, rohit, Shikar, Virat]
         
         Collections.reverse(list);
         System.out.println("Reverse of List : " + list); //[Virat, Shikar, rohit, ravindra, Bhargav, ashwin]
         
        
         
         
         
         
         
         
         
         
         
         
         
	}

}
