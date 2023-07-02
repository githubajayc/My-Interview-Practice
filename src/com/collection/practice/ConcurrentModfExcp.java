package com.collection.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ConcurrentModfExcp {

	public static void main(String[] args) {
        
		List<String> list = new ArrayList<String>(Arrays.asList("a","b","c"));
		
	//	list.add("d");   //this will not give ConcurrentModificationException bcz before iterator
		
		Iterator<String> it = list.iterator();
		
	//	list.add("d");   //this gives ConcurrentModificationException
		
		while(it.hasNext()) {
			if((it.next()).equals("a")) {
				it.remove();
			}
		}
        System.out.println(list);    //[b, c]
	}

}
