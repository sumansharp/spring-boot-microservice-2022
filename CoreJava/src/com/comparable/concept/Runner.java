package com.comparable.concept;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Runner {

	public static void main(String[] args) {

		List<Laptop> lap=new ArrayList<>();
		lap.add(new Laptop("Apple", 64, 10000));
		lap.add(new Laptop("Compaq", 24, 9000));
		lap.add(new Laptop("Acer", 12, 7000));
		
		Collections.sort(lap);
		
		for(int i=0; i<lap.size(); i++) {
			System.out.println(lap.get(i));
		}
		
		System.out.println("********************************");
		
		for(Laptop l :lap) {
			System.out.println(l);
		}

	}

}
