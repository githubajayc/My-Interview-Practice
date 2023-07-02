package com.raw.practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Employee implements Serializable {
       int id;
       String name;
       int age;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
	public Employee(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
	
   public static void main(String[] args) throws FileNotFoundException, IOException, Exception {
	
	   Employee e1 = new Employee(123,"Ajay",28);
	   
	   ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("abc.txt"));
	   oos.writeObject(e1);
	   oos.close();
	   
	   ObjectInputStream ois =  new ObjectInputStream(new FileInputStream("abc.txt"));
	   Employee e2 = (Employee)ois.readObject();
	   System.out.println(e2);
	   
	   System.out.println(e1 == e2);   //false
}    
       
}
