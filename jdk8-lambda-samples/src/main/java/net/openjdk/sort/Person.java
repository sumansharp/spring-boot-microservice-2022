package net.openjdk.sort;

public class Person {
		  
		      String firstName;
		      String lastName;
			public String getFirstName() {
				return firstName;
			}
			public String getLastName() {
				return lastName;
			}
			public Person(String firstName, String lastName) {
				super();
				this.firstName = firstName;
				this.lastName = lastName;
			}
			@Override
			public String toString() {
				return "Person [firstName=" + firstName + ", lastName=" + lastName + "]";
			}
		      
		     
		 }
