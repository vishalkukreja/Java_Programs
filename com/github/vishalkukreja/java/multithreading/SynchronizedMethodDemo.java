package com.github.vishalkukreja.java.multithreading;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class SynchronizedMethodDemo {

	private Random rand = new Random();

	private List<Integer> numList1 = new ArrayList<Integer>();
	private List<Integer> numList2 = new ArrayList<Integer>();

	public synchronized void levelOne() {
		try {
			Thread.sleep(1);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		numList1.add(rand.nextInt(50));
	}

	public synchronized void levelTwo() {
		try {
			Thread.sleep(1);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		numList2.add(rand.nextInt(50));
	}

	public void processLevels() {
		for (int i = 0; i < 1000; i++) {
			levelOne();
			levelTwo();
		}
	}

	public void mainProc() {
		System.out.println("Starting off levels...");
		long startTime = System.currentTimeMillis();
		Thread thr1 = new Thread(new Runnable() {
			public void run() {
				processLevels();
			}
		});
		thr1.start();
		
		Thread thr2 = new Thread(new Runnable() {
			public void run() {
				processLevels();
			}
		});
		thr2.start();
		
		try {
			thr1.join();
			thr2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		
		long endTime = System.currentTimeMillis();
		System.out.println("Total time:" + (endTime - startTime));
		System.out.println("List details : \n1) " + numList1.size() + "\n2)"
				+ numList2.size());
	}

	public static void main(String[] args) {
		new SynchronizedMethodDemo().mainProc();
	}
}
