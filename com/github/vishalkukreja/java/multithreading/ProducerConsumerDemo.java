package com.github.vishalkukreja.java.multithreading;

import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ProducerConsumerDemo {

	private static BlockingQueue<Integer> queue = new ArrayBlockingQueue<Integer>(
			10);

	public static void main(String[] args) throws InterruptedException {
		Thread thr1 = new Thread(new Runnable() {

			public void run() {
				try {
					producer();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});

		Thread thr2 = new Thread(new Runnable() {

			public void run() {
				try {
					consumer();
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

	private static void producer() throws InterruptedException {
		Random rand = new Random();

		while (true) {
			queue.put(rand.nextInt(100));
		}
	}

	private static void consumer() throws InterruptedException {
		Random rand = new Random();
		while (true) {
			Thread.sleep(100);
			if (rand.nextInt(10) == 0) {
				Integer val = queue.take();
				System.out.println("Choosen value:" + val + " -- Queue size:" + queue.size());
			}
		}
	}
}
