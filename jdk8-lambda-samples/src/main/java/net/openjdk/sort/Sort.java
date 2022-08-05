package net.openjdk.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;



public class Sort {

	public static void main(String[] args) {
		List<Person> personList= new ArrayList<>();
		personList.add(new Person("Abhina","Agarwal"));
		personList.add(new Person("Sumalata","Pappu"));
		personList.add(new Person("Radha","Yatipatti"));
		personList.add(new Person("Suman","Kumar"));
		
//		Collections.sort(personList, new Comparator<Person>() {
//			     @Override
//			     public int compare(Person p1, Person p2) {
//			          int n = p1.getLastName().compareTo(p2.getLastName());
//			          if (n == 0) {
//			              return p1.getFirstName().compareTo(p2.getFirstName());
//			          }
//			          return n;
//			      }
//			 });
		//or
		//comparing on descending first name
		personList.sort(Comparator.comparing(Person::getFirstName).reversed());
		personList.forEach(System.out::println);
		
		System.out.println("**************************");
		
		personList.sort(Comparator.comparing(Person::getFirstName)
		.thenComparing(Person::getLastName));
		personList.forEach(System.out::println);
		

	}

}
