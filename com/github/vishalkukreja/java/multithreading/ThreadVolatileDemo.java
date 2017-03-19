package com.github.vishalkukreja.java.multithreading;

import java.util.Scanner;

public class ThreadVolatileDemo {

	public static void main(String[] args) {
		Task task = new Task();
		System.out.println("Starting task...");
		
		try(Scanner sc = new Scanner(System.in)) {
			task.start();
			System.out.println("Press Enter key to stop.");			
			sc.nextLine();			
			task.stopTask();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

class Task extends Thread {
	private volatile boolean isRunning = true;

	public void run() {
		while (isRunning) {
			System.out.println("Task Running...");
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public void stopTask() {
		isRunning = false;
	}
}