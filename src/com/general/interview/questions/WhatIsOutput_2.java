package com.general.interview.questions;

public class WhatIsOutput_2 {

	public static void main(String[] args) {
		String a= "abc"; 
		String b="abc";
		String c= "efg";
	   
		System.out.println(a.equals(b)); //true
		System.out.println(a==b);        //true
		System.out.println(b==c);        //false
		
	       
//What is the Output
		
		String s = "Java"; 
	    s.concat("Programming"); 
	    System.out.println(s);       //Java


//String = "Infosys-Interview-invite";
//	    Output = INVITE
	    
	    String s1 = "Infosys-Interview-invite";
	    
	    String[] tokens = s1.split("-");
	    for(String s2 : tokens) {
	    	if("invite".equals(s2)) {
	    		System.out.println(s2.toUpperCase());    //INVITE
	    	}
	    }
// What is output
	    
	   System.out.println("Practice"+100+100); //Practice200
	   
       System.out.println(100+100+"Practice");  //200Practice
       
//What is Output
       
       final int i=10;
       int j=20;
      
       System.out.println(i + "" + j);   //1020

	}

}
