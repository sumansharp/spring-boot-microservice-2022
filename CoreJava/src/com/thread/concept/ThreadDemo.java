package com.thread.concept;

class MyClass extends Thread{

	@Override
	public void run() {
		for(int i=0; i<10; i++) {
			System.out.println(Thread.currentThread().getId()+"Value:"+ i);
		}
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}

public class ThreadDemo {

	public static void main(String[] args) {
		MyClass myclass=new MyClass();
		myclass.start();
		
		MyClass myclass1=new MyClass();
		myclass1.start();

	}

}
