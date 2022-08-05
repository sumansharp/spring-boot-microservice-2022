package com.Athelete;

import java.util.List;
import java.util.concurrent.CompletionService;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorCompletionService;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Event {

	private String name;

	private int distance;

	private List<Athlete> athelets;

	public Event(String name, int distance, List<Athlete> athelets) {
		this.name = name;
		this.distance = distance;
		this.athelets = athelets;
	}

	public void startRace() {
		ExecutorService executor = Executors.newFixedThreadPool(10);
		CompletionService<String> completionService = new ExecutorCompletionService<String>(
				executor);
		for (Athlete athelet : athelets) {
			completionService.submit(athelet);
		}

		executor.shutdown();

		for (int rank = 0; rank < athelets.size(); rank++) {
			Future<String> completedAthele;
			try {
				completedAthele = completionService.take();
				System.out.format("Rank :: %d   Name %s \n", (rank + 1),
						completedAthele.get());
			} catch (InterruptedException e1) {
			} catch (ExecutionException e) {
			}
		}

	}

	public void displayResults() {

	}
}