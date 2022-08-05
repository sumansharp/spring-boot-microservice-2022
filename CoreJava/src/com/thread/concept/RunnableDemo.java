package com.thread.concept;

class MyClass1 implements Runnable{

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

public class RunnableDemo {

	public static void main(String[] args) {
		Thread th = new Thread(new MyClass1());
		th.start();
		
		Thread th1 = new Thread(new MyClass1());
		th1.start();

	}

}
