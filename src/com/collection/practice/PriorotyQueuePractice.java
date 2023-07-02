package com.collection.practice;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorotyQueuePractice {

	public static void main(String[] args) {
		
		PriorityQueue<String> pq = new PriorityQueue<>();
		

		pq.add("Blue");
		pq.add("Red");
		pq.add("Green");
		pq.add("Yellow");
		pq.add("Violet");
		pq.add("White");
		pq.offer("Purple");
		
//Print PriorityQueue
		
		//Approach 1
		System.out.println("Approach 1 : " + pq);
		
		//Approach 2
		for(String s : pq) {
			System.out.println("Approach 2 : " + s);
		}

		//Approach 3
		Iterator<String> pqIt = pq.iterator();
		while(pqIt.hasNext()) {
			System.out.println("Approach 3 : " + pqIt.next());
		}
		
//Compare two PriorityQueue
		
		PriorityQueue<String> pq2 = new PriorityQueue<>();
		pq2.add("Orange");
		pq2.add("Red");
		pq2.add("Green");
		pq2.add("Yellow");
		pq2.add("Violet");
		
		for(String s1 : pq) {
			if(pq2.contains(s1)) {
				System.out.println(s1 + " Exists");
			}else {
				System.out.println(s1 + " Not Exists");
			}
		}
		
	}

}
