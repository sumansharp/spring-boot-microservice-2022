package com.javalambda.javabrains2;

import java.util.function.BiConsumer;

public class ExceptionHandlingExamples {

	public static void main(String[] args) {
		int someNumbers[] = {1,2,3,4};
		int key =0;
//		process(someNumbers, key,(i,k)->{
//			try {
//			System.out.println(i/k);
//				}catch(ArithmeticException ex) {
//				System.out.println("Exception Happened!");
//			}});
		
//		//or
		process(someNumbers, key,wrapperLambda((i,k)->System.out.println(i/k)));
			
	}
	private static void process(int someNumbers[],int key, BiConsumer<Integer, Integer> consumer) {
		for(int i:someNumbers) {
				consumer.accept(i, key);
						
		}
	}
	private static BiConsumer<Integer, Integer> wrapperLambda(BiConsumer<Integer, Integer> consumer) {
		return (v,k)-> {
			try {
			System.out.println("Executing from Wrapper Lambda function!");
			consumer.accept(v, k);
			}catch(ArithmeticException ex) {
				System.out.println("Exception Happened!");
			}
		};
		
	}

}
