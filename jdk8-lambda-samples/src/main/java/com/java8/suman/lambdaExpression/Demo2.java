package com.java8.suman.lambdaExpression;

@FunctionalInterface
interface Cab1{
	public String bookCab(String src, String des);
}
public class Demo2 {

	public static void main(String[] args) {
		Cab1 cab=(src,des)->{
			System.out.println("Cab is booked from Source location: "+src+" to Destination: "+des);
			return("price is 5000 Rs.");
		};
		System.out.println(cab.bookCab("Delhi", "Chandigarh"));
		
		

	}

}
