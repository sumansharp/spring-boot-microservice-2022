package com.java8;

import java.util.TreeMap;

public class TreeMapConcept {

	public static void main(String[] args) {

		TreeMap<Integer, String> hm=new <Integer, String>TreeMap();
		
		hm.put(103, "David");
		hm.put(102, "Ravi");
		hm.put(105, "Merry");
		hm.put(101, "Suman");
		hm.put(104, "Rupesh");
		
		//hm.put("Amit", 102);
		
		hm.forEach((k,m)->System.out.println("Key: "+k+" Value: "+m));
		
		System.out.println("FirstKey: "+hm.firstKey());
		System.out.println("Last Key: "+hm.lastKey());
		

		
	}

}
