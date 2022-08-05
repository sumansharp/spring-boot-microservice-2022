package org.concurrency.samples.Concurrency;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListrunner {

	public static void main(String[] args) {
		List<String> list= new CopyOnWriteArrayList<>();
		list.add("Ant");
		list.add("Bat");
		list.add("Cat");
		
		for(String element:list) {
			System.out.println(element);
		}
	}

}
