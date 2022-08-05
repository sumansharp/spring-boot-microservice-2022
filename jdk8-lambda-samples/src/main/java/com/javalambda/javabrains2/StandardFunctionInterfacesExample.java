package com.javalambda.javabrains2;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

import com.javalambda.javabrains.Person;


public class StandardFunctionInterfacesExample {

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
		performContionally(people, p->true, p-> System.out.println(p));
		 System.out.println("**********************************");
		 
		 performContionally(people, p->p.getFirstName().startsWith("S"), p-> System.out.println(p));

	}
	
	static void performContionally(List<Person> people, Predicate<Person> condition, Consumer<Person> consumer) {
		for(Person p:people) {
		if(condition.test(p)) {
			consumer.accept(p);
		}
		}
		
		
	}

}
