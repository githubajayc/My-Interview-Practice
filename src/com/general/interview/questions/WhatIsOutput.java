package com.general.interview.questions;

public class WhatIsOutput {

	public static void main(String[] args) {
        int i1= 5;
        int i2= 5;
        int i6= 6;
        System.out.println(i1==i2);   //true
        System.out.println(i1==i6);   //false
        
        Integer i3 = 10;
        Integer i4 = 10;
        Integer i5 = 5;
        System.out.println(i3==i4);   //true
        System.out.println(i1==i5);   //true
        
//Output is : True (For both primitive and wrapper object)
	}

}
