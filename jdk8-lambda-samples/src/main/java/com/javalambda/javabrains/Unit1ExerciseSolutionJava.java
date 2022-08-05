package com.javalambda.javabrains;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;


public class Unit1ExerciseSolutionJava {

	public static void main(String[] args) {
		List<Person> people= Arrays.asList(
				new Person("Suman","Kumar", 43),
				new Person("Ravi","Kumar", 38),
				new Person("jyoti","sinha", 35),
				new Person("Swadhay","roy", 10),
				new Person("Jayant","Kumar", 42)
				
				);
		Collections.sort(people, Comparator.comparing(Person::getLastName).reversed());
		//Collections.sort(people, (Person o1, Person o2)->o1.getLastName().compareTo(o2.getLastName())); 
		 
		//people.forEach(System.out::println);
		 //or
		 printOnCondition(people, (p)->true);
		 System.out.println("**********************************");
		 
		 printOnCondition(people, (p)->p.getFirstName().startsWith("S"));

	}
	
	static void printOnCondition(List<Person> people, Predicate<Person> condition) {
		for(Person p:people) {
		if(condition.test(p)) {
			System.out.println(p);
		}
		}
		
		
	}

}
