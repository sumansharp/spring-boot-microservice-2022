package com.java8.interfaceExamples;

public interface FirstInterface {
	default void someMethod() {
		System.out.println("Printing from FirstInterface.someMethod()....");
	}
	 public int addition(int i, int j);
	

}
