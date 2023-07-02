package com.factory_dp.practice;

public class FactoryTest {

	public  Shape getInstance(String type) {
		
		if(type.equalsIgnoreCase("CIRCLE")) {
			return new Circle();
		}else if(type.equalsIgnoreCase("RECTANGLE")) {
			return new Rectangle();
		}else {
			return null;
		}
	}
	
	public static void main(String[] args) {
		
		FactoryTest ft = new FactoryTest(); 
		Shape obj = ft.getInstance("CIRCLE");
		obj.draw();  // I am Circle(means Circle class draw() method called)
		
	}
}
