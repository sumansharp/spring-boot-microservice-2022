package com.javalambda.javabrains;


import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Unit1Exercise {

	public static void main(String[] args) {
		List<Person> people= Arrays.asList(
				new Person("Suman","Kumar", 43),
				new Person("Ravi","Kumar", 38),
				new Person("jyoti","sinha", 35),
				new Person("Swadhay","roy", 10),
				new Person("Jayant","Kumar", 42)
				
				);
		
		
		people.sort(Comparator.comparing(Person::getLastName));
		
		printAll(people);
		
		
		
		
		

	}

	private static void printAll(List<Person> people) {
		people.forEach(System.out::println);
		
	}

}
