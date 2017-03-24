package com.github.vishalkukreja.java.multithreading;

import java.util.Scanner;

public class WaitNotifyProcessor {

	public void produce() throws InterruptedException {
		synchronized (this) {
			System.out.println("Producer thread running ....");
			wait();
			System.out.println("Resumed.");
		}

	}

	public void consume() throws InterruptedException {
		synchronized (this) {
			Scanner scanner = new Scanner(System.in);
			Thread.sleep(2000);
			synchronized (this) {
				System.out.println("Waiting for return key.");
				scanner.nextLine();
				System.out.println("Return key pressed.");
				notify();
				System.out.println("Consumption done.");
				scanner.close();
			}
		}
	}

}
