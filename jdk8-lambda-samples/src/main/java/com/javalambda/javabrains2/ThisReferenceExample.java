package com.javalambda.javabrains2;

public class ThisReferenceExample {

	public void doProcess(int i, Process p) {
		p.process(i);
		
	}
	public void execute() {
		doProcess(10, k -> System.out.println(this));
	}
	public static void main(String[] args) {
		ThisReferenceExample thisReferenceExample = new ThisReferenceExample();
		thisReferenceExample.doProcess(10, new Process() {

			@Override
			public void process(int i) {
				System.out.println(" Value of k is "+ i);
				System.out.println(this);
				
			}
			public String toString() {
				return "This is the anonymous inner class";
				
			}
			
		});
		
		
	//thisReferenceExample.doProcess(10, k -> System.out.println(this)); //"this" won't work
		thisReferenceExample.execute();
	
	}
}
