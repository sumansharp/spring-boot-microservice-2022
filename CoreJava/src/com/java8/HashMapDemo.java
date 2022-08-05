package com.java8;

import java.util.HashMap;

public class HashMapDemo {

	public static void main(String[] args) {

		//HashMap hm= new HashMap();
		HashMap <Integer, String> hm= new <Integer, String> HashMap();
		
		hm.put(104, "Ravi");
		hm.put(105, "Merry");
		hm.put(101, "Suman");
		hm.put(102, "Rupesh");
		hm.put(103, "David");
		
		//hm.put("Amit", 102);
		
		System.out.println(hm); //{101=Suman, 102=Rupesh, 103=David, 104=Ravi, 105=Merry}
		System.out.println(hm.get(102));
		hm.remove(103);
		System.out.println(hm);
		System.out.println(hm.containsKey(103));//false
		System.out.println(hm.containsValue("Manish"));//false
		System.out.println(hm.keySet());
		System.out.println(hm.values());
		System.out.println(hm.entrySet());
		for(int e:hm.keySet()) {
			
			System.out.println(hm.get(e));
		}
		
	}

}
