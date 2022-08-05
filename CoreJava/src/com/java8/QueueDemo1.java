package com.java8;

import java.util.LinkedList;
import java.util.PriorityQueue;

public class QueueDemo1 {

	public static void main(String[] args) {
		
		PriorityQueue q1= new PriorityQueue();
		//LinkedList q1= new LinkedList();
		
		q1.add("A");
		q1.add("B");
		q1.add("A");
		q1.add("C");
		q1.offer("D");
		//q1.add(12);  // PriorityQueue not allow Hetrogenous data. it'll throw ClassCastException
		
		System.out.println(q1);
	//Return element
		//System.out.println(q1.element()); //java.util.NoSuchElementException
		System.out.println(q1.peek()); //It'll return null if no element is available in head
		
	//Return and remove
		//System.out.println(q1.remove()+ " has been removed");
		//System.out.println(q1.remove("C")+ " has been removed");
		System.out.println(q1.poll() + " has been removed");
		System.out.println(q1);
		

	}

}
