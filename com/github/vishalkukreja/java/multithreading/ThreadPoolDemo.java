package com.github.vishalkukreja.java.multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class Processor implements Runnable {
	private int id;

	public Processor(int id) {
		this.id = id;
	}

	public void run() {
		System.out.println("Starting: " + id);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Completed: " + id);
	}
}

public class ThreadPoolDemo {

	public static void main(String[] args) {
		ExecutorService execService = Executors.newFixedThreadPool(2);
		for (int i = 0; i < 5; i++) {
			execService.submit(new Processor(i));
		}
		execService.shutdown();
		System.out.println("All tasks submitted...");
		try {
			execService.awaitTermination(1, TimeUnit.HOURS);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("All tasks completed...");
	}
}
