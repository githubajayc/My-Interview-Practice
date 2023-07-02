package com.general.interview.questions;

public class WhatIsOutput_3 {

	public static void main(String[] args) {
		
		char ch = 'F';
		int m = ch;
		m=m+5;
		System.out.println(m + " " + ch);    //75  F
		
//*********************************************************/		
		
		int i = 1;
		int d = 5;
		do
		{
			d = d * 2;
			System.out.println(d);
			i++;
		}
		while (i <= 5);  //10 20 40 80 160
		
//*********************************************************/
		
		for(int k=5 ; k>=1 ;k--)
		{
		if(k%2 ==1)
		continue;
		System.out.print( k+ "");      
		}                             // 4 2 (bcz "Continue" : it skip that number which satisfy condition)
		
//*********************************************************/
		
		int n = 0;
        for (System.out.println("HI"); n < 1; n++)
        {
            System.out.println("HELLO GEEKS"); 
        }                            //HI HELLO GEEKS
        
//*********************************************************/       
//        for (int a = 0;; a++)
//        {
//            System.out.println("HELLO GEEKS");       //this code gives infinite o/p
//        }
	
	
//*********************************************************/       
//	
//        for (int i = 0; i < 1; System.out.println("WELCOME"))
//        {
//        System.out.println("GEEKS");                //this code gives infinite o/p
//        }
        
//*********************************************************/    
        
        
        
  }
}