package com.github.vishalkukreja.java.functionalprogramming.example;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;

public class BankTransfer {
	public static void main(String[] args) {
		AccountFactory accountFactory = BankAccount::new;
		BankAccount studentAccount = accountFactory.getBankAccount(101, 50000, "Vishu");
		BankAccount collegeAccount = accountFactory.getBankAccount(102, 100000, "ABC_CoE");
		
		BiPredicate<Double, Double> bp1 = (balance, amount) -> balance> amount;
		BiConsumer<String, Double> bcPrint = (a,b) -> System.out.println(a+b);
		BiConsumer<BankAccount, BankAccount> bcPrint1 = (student, college) -> System.out.println("Balance of Student:" + studentAccount.getBalance() + " - College account :"+ collegeAccount.getBalance()); 
		ExecutorService services = Executors.newFixedThreadPool(10);
		Thread t1 = new Thread(() -> {
			System.out.println(Thread.currentThread().getName() + " says... Executing transfer...");
			double amount = 1000;
			try {
				if(!bp1.test(studentAccount.getBalance(), amount)) {
					bcPrint.accept(Thread.currentThread().getName() + "says, insufficient balance..", amount);
					return;
				}
				while(!studentAccount.transfer(collegeAccount, amount)) {
					TimeUnit.MILLISECONDS.sleep(100);
					continue;
				}
			} catch(Exception e) {
				e.printStackTrace();
			}
			bcPrint.accept(Thread.currentThread().getName() + "says.. transfer successful. Balance: ", collegeAccount.getBalance());
		});
		for(int i=0; i<20;i++) {
			services.submit(t1);
		}
		services.shutdown();
		try {
			while(!services.awaitTermination(24L, TimeUnit.HOURS)) {
				System.out.println("WAITING FOR TERMINATION!!!");
			}
		} catch (Exception e2) {
			e2.printStackTrace();
			// TODO: handle exception
		}
		bcPrint1.accept(studentAccount, collegeAccount);
		
	}
}
