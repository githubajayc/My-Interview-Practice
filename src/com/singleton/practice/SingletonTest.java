package com.singleton.practice;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;

public class SingletonTest {

	public static void main(String[] args) throws Exception, Exception {
		
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		
		System.out.println("s1" + s1.hashCode());  //2018699554
		System.out.println("s2" + s2.hashCode());  //2018699554
		
//Breaking by Reflection API
		
		Constructor<Singleton> s3 = Singleton.class.getDeclaredConstructor();
		s3.setAccessible(true);
		Singleton s4 = s3.newInstance();
		
		System.out.println("s4" + s4.hashCode());  //java.lang.Exception: Object Already Exist
		
		
//Breaking with Serialization and Deserialization
		
		ObjectOutputStream  oos = new ObjectOutputStream(new FileOutputStream("abc.txt"));
		oos.writeObject(s1);
		oos.close();
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("abc.txt"));
		Singleton s5 =(Singleton)ois.readObject();
		System.out.println("s5" + s5.hashCode());       //after implementing readResolve() >>  2018699554
		ois.close();
		
//Breaking with Cloning
		
		Singleton s6 = (Singleton)s1.clone();
		System.out.println("s1" + s1.hashCode());
		System.out.println("s6" + s6.hashCode());
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
