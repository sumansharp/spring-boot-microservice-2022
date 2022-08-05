package com.thread.concept;



public class ThreadJoin {
	
	private static int count=0;
	
	public static synchronized void inCount() {
		
		count++;
	}
	
	public static void main(String[] args) {
		
		Thread th1 = new Thread(new Runnable() {

			@Override
			public void run() {
				for(int i=0; i<10000; i++) {
					inCount();
				}
				
			}
			
		});
		
		Thread th2 = new Thread(new Runnable() {

			@Override
			public void run() {
				for(int i=0; i<10000; i++) {
					inCount();
				}
				
				
			}
			
		});
		
		th1.start();
		th2.start();
		
		try {
			th1.join();
			th2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Value: "+count);

	}

}
