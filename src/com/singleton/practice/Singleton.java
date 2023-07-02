package com.singleton.practice;

import java.io.Serializable;

final public class Singleton implements Serializable,Cloneable{

	private static Singleton s = null;
	
	private Singleton()  {
		 
	 }
	 
	 {                              //Instance Initializer Block 
		 if(s != null) {
			 
				throw new RuntimeException("Object Already Exist");
		 }
	 }
	 
	 public static Singleton getInstance() {
		 
		 synchronized(Singleton.class){
			 if(s == null) {
				return s = new Singleton();
		   }
		}
		 return s;
	 }
	 
	 
	 Object readResolve() {   // to Protect from Deserialization
		 return s;
	 }
	 
	 
	 @Override
	 protected Object clone() throws CloneNotSupportedException {     
			
			return s;            //if cloneing happens then return existing object "s"
	 }
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
}
