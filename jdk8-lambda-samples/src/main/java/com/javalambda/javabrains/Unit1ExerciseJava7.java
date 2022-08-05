package com.javalambda.javabrains;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Unit1ExerciseJava7 {
	public static void printAll(List<Person> people) {
		
		for(Person l:people) {
			System.out.println(l);
		}
	}
	public static void printConditionally(List<Person> people, Conditions condition) {
		for(Person p:people) {
			if(condition.yourCondition(p)) {
				System.out.println(p);
			}
			
		}
		
	}
	
	public static void main(String[] args) {
			List<Person> people= Arrays.asList(
					new Person("Suman","Kumar", 43),
					new Person("Ravi","Shaw", 38),
					new Person("jyoti","sinha", 35),
					new Person("Swadhay","roy", 10),
					new Person("Jayant","Chaurasia", 42)
					
					);
			Collections.sort(people, new Comparator<Person>() {

				@Override
				public int compare(Person o1, Person o2) {
					return o1.getLastName().compareTo(o2.getLastName());
					
				}
				
			});
			
			printAll(people);
			
			System.out.println("*******************************");
			
			printConditionally(people, new Conditions() {

				@Override
				public boolean yourCondition(Person p) {
					 if(p.getFirstName().startsWith("S")) {
						 return true;
					 }else {
						 return false;
					 }
					
				}
				
			});
			

	}

}

interface Conditions{
	boolean yourCondition(Person p);
}
