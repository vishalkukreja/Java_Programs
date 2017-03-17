package com.github.vishalkukreja.java.multithreading;

public class SimpleRunnableDemo {

	public static void main(String[] args) {
		Thread thr1 = new Thread(new RunnableTask());
		thr1.start();

		Thread thr2 = new Thread(new RunnableTask());
		thr2.start();
	}
}

class RunnableTask implements Runnable {

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