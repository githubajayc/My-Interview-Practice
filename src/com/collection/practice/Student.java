package com.collection.practice;

import java.util.Objects;

public class Student implements Comparable<Student> {

    int id;
     
    String name;
    
    int percentage;
     
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



	public int getPercentage() {
		return percentage;
	}



	public void setPercentage(int percentage) {
		this.percentage = percentage;
	}



	
     
    public Student(int id, String name, int percentage)
    {
        this.id = id;
         
        this.name = name;
         
        this.percentage = percentage;
    }
     
   
     
    @Override
    public String toString()
    {
        return "{ID : "+id+", Name : "+name+", Percentage : "+percentage+"}";
    }



	@Override
	public int compareTo(Student s) {
		return this.id - s.id;
	}



	@Override
	public boolean equals(Object arg0) {
		// TODO Auto-generated method stub
		return super.equals(arg0);
	}



	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		//return super.hashCode();
		return Objects.hash(id, name, percentage);
	}
	
	
	
	
}
