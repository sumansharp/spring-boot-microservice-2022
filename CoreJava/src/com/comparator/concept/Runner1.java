package com.comparator.concept;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Runner1 {

	public static void main(String[] args) {

		List<Laptop1> lap=new ArrayList<>();
		lap.add(new Laptop1("Apple", 64, 10000));
		lap.add(new Laptop1("Compaq", 24, 9000));
		lap.add(new Laptop1("Acer", 12, 7000));
		
		Comparator<Laptop1> comp = new Comparator<Laptop1>() {
			public int compare(Laptop1 l1, Laptop1 l2) {
				
				if(l1.getRam() > l2.getRam()) {
					return 1;
				}else {
					return -1;
				}
			}
		};
		
		Collections.sort(lap, comp);
		
		for(int i=0; i<lap.size(); i++) {
			System.out.println(lap.get(i));
		}
		
		System.out.println("********************************");
		
		for(Laptop1 l :lap) {
			System.out.println(l);
		}

	}

}
