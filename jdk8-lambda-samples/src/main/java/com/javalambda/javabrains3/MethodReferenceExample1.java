package com.javalambda.javabrains3;

public class MethodReferenceExample1 {

	public static void main(String[] args) {
		//Thread t= new Thread(()->printMessage());
		// we can use Method Reference instead doing above 
		Thread t=new Thread(MethodReferenceExample1::printMessage);
		
		t.start();

	}
	
	public static void printMessage() {
		System.out.println("Hello");
	}

}
