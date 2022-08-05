package com.java8.interfaceExamples;

public class InterfaceJava8Example {
	
	
	public static void main(String[] args) {
		
		InterfaceJava8Example test = new InterfaceJava8Example();
		 //test.someMethod();
		int a =10;
		int b = 15;
		 FirstInterface first=(i,j)-> i+j;
		 int k = first.addition(a,b);
		 System.out.println(k);
		 
		 first.someMethod();
	}

}
