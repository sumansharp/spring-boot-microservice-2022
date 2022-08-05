package com.Athelete;

import java.util.Random;
import java.util.concurrent.Callable;

public class Athlete implements Callable<String>{
	
	Athlete(String name){
		this.name = name;
	}

	private static Random randomInt = new Random();
	public String name;
	
	@Override
	public String call() {
		try {
			int time = randomInt.nextInt(10) ;
			System.out.println(time);
			Thread.currentThread().sleep( time * 1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return name;
	}

}