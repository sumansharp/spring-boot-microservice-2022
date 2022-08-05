package com.java8;

import java.util.HashMap;
import java.util.Hashtable;

public class HashTableDemo {

	public static void main(String[] args) {

		//Hashtable ht=new Hashtable(); //Capacity 11 and load factor 0.75
		
		//Hashtable ht=new Hashtable(20);//we can create object with some capacity
		//Hashtable ht=new Hashtable(20, 0.95);//Capacity : 20, Load Factor: 95%
		
		Hashtable <Integer, String> ht= new <Integer, String> Hashtable();

		ht.put(101, "Suman");
		ht.put(102, "Rupesh");
		ht.put(103, "David");
		ht.put(104, "Ravi");
		ht.put(105, "Merry");
		//ht.put("Amit", 102);
		
		System.out.println(ht);

	}

}
