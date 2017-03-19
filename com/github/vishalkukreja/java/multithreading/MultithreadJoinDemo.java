package com.github.vishalkukreja.java.multithreading;

public class MultithreadJoinDemo {

	private int pointsCount;

	public synchronized void increasePoints() {
		pointsCount++;
	}

	public static void main(String[] args) {
		MultithreadJoinDemo level = new MultithreadJoinDemo();
		level.countPoints();
	}

	public void countPoints() {
		final int POINTS = 1000;
		Thread thr1 = new Thread(new Runnable() {

			public void run() {
				for (int i = 1; i <= POINTS; i++) {
					increasePoints();
				}
			}
		});
		Thread thr2 = new Thread(new Runnable() {

			public void run() {
				for (int i = 1; i <= POINTS; i++) {
					increasePoints();
				}
			}
		});
		thr1.start();
		thr2.start();
		try {
			thr1.join();
			thr2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Total points: " + pointsCount);
	}
}
