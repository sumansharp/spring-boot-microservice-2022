package com.javalambda.javabrains3;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.javalambda.javabrains.Person;

public class CollectionIterationExample {

	public static void main(String[] args) {
		List<Person> people= Arrays.asList(
				new Person("Suman","Kumar", 43),
				new Person("Ravi","Kumar", 38),
				new Person("jyoti","sinha", 35),
				new Person("Swadhay","roy", 10),
				new Person("Jayant","Kumar", 42)
				
				);
		
		Collections.sort(people, Comparator.comparing(Person::getLastName)); //Method Reference -Person::getLastName
		//people.forEach(System.out::println);
		 //or
		people.forEach(p->System.out.println(p));
		//or if want to put conditions
		System.out.println("***************************");
		people.forEach(p->{
			if(p.getFirstName().startsWith("S")) {
				System.out.println(p);
			}
		});
	}

}
