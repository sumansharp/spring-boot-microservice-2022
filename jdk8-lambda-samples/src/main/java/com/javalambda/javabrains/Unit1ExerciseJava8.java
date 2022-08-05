package com.javalambda.javabrains;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class Unit1ExerciseJava8 {

	public static void main(String[] args) {
		List<Person> people= Arrays.asList(
				new Person("Suman","Kumar", 43),
				new Person("Ravi","Kumar", 38),
				new Person("jyoti","sinha", 35),
				new Person("Swadhay","roy", 10),
				new Person("Jayant","Kumar", 42)
				
				);
		
		
		//people.sort(Comparator.comparing(Person::getLastName));
		//or
		people.sort((p1,p2)-> p1.getLastName().compareTo(p2.getLastName()));
		
		
		//printAll(people);
		boolean x = true;
		printConditionally(people, p -> x);
		
		System.out.println("********************************");
		
		printConditionally(people,(p -> p.getFirstName().startsWith("S")));
		
	}
	
	static void printConditionally(List<Person> people, Predicate<Person> condition) {
		
		for(Person l: people) {
			if(condition.test(l)) {
				System.out.println(l);
			}

		}
	}	
	

//	private static void printAll(List<Person> people) {
//		people.forEach(System.out::println);
//		
//	}

}
//interface Conditions1{
//	boolean yourCondition(Person p);
//}
