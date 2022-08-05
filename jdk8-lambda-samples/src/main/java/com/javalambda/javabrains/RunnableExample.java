package com.javalambda.javabrains;

public class RunnableExample {

	public static void main(String[] args) {
		//Classic Example
		Thread myThread = new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println("Printed inside runnable!");
				
			}
			
		}); 
		myThread.run();
		
		//Lambda Expression Example
		Thread myLambdaThread= new Thread(()-> System.out.println("Printed from Lambda thread!"));
		
		myLambdaThread.run();

	}

}
