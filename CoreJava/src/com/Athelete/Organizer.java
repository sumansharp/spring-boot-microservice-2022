package com.Athelete;

import java.util.ArrayList;
import java.util.List;


public class Organizer{
	
	public static void main(String args[]){
		
		List<Athlete> athletes = new ArrayList<Athlete>();
		athletes.add( new Athlete("Durga"));
		athletes.add( new Athlete("Lavanya"));
		athletes.add( new Athlete("Pinky"));
		athletes.add( new Athlete("Suman"));
		
		Event event = new Event("100 Meter Run", 100, athletes);
		event.startRace();
		
	}
}
