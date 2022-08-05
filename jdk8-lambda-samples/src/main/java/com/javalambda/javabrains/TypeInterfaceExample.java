package com.javalambda.javabrains;

public class TypeInterfaceExample {
	public static void printLambda(AddLambda addlambda, int i, int j) {
		System.out.println("Cooming from printLambda funtion: "+addlambda.getAddition(i,j));
	}

	public static void main(String[] args) {
		StringLengthLambda myLambda = (s) -> s.length();
		System.out.println("Length of String 'Hello world': "+myLambda.getLength("Hello Lambda"));
		
		AddLambda addingNumber = (i,j) -> i+j;
		int k = addingNumber.getAddition(10, 20);
		System.out.println("Additon Value: "+(k+20));
		
		TypeInterfaceExample.printLambda(((i,j) -> i-j),45,33 );
		
	}
	
	interface StringLengthLambda{
		int getLength(String st);
		
	}
	
	interface AddLambda{
		int getAddition(int i, int j);
		
	}

}
