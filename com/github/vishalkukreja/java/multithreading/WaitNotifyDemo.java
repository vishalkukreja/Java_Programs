package com.github.vishalkukreja.java.multithreading;

public class WaitNotifyDemo {

	public static void main(String[] args) throws InterruptedException {
		final WaitNotifyProcessor processor = new WaitNotifyProcessor();
		Thread thr1 = new Thread(new Runnable() {
			public void run() {
				try {
					processor.produce();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});

		Thread thr2 = new Thread(new Runnable() {

			public void run() {
				try {
					processor.consume();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});

		thr1.start();
		thr2.start();

		thr1.join();
		thr2.join();
	}
}
