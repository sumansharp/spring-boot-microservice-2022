package com.javalambda.javabrains3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import com.javalambda.javabrains.Person;

public class StreamExample1 {

	public static void main(String[] args) {
		List<Person> people= Arrays.asList(
				new Person("Suman","Kumar", 43),
				new Person("Ravi","Kumar", 38),
				new Person("jyoti","sinha", 35),
				new Person("Swadhay","roy", 10),
				new Person("Jayant","Kumar", 42)
				
				);
		people.stream()
		.filter(p->p.getLastName().startsWith("K"))
		.forEach(p->System.out.println(p.getFirstName()));
		
		System.out.println("*********************************");
		
		//Stream<Person> stream=people.stream();
		
		long count= people.stream()
		.filter(p->p.getLastName().startsWith("K"))
		.count();
		
		System.out.println(count);
		
		
		

	}

}
