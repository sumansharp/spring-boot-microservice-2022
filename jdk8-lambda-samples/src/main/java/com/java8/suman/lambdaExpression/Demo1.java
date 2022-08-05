package com.java8.suman.lambdaExpression;

@FunctionalInterface
interface Cab{
	public void bookCab(String src, String dest);
}
public class Demo1 {

	public static void main(String[] args) {
		Cab cab= (source, destination)-> System.out.println("Cab is booked from Source location: "+source+" to Destination: "+destination);
		cab.bookCab("Heyderabad","Mumbai");
	}

}
