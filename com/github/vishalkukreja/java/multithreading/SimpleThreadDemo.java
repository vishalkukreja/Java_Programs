package com.github.vishalkukreja.java.multithreading;

public class SimpleThreadDemo {

	public static void main(String[] args) {
		ThreadTask task1 = new ThreadTask();
		task1.start();

		ThreadTask task2 = new ThreadTask();
		task2.start();
	}
}

class ThreadTask extends Thread {
	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.println("Sequence # " + i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}