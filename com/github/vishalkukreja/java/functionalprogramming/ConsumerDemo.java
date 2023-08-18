package com.github.vishalkukreja.java.functionalprogramming;

import java.util.function.Consumer;

public class ConsumerDemo {
	public static void main(String[] args) {
		Consumer<String> cons = (x)-> System.out.println("Length of " + x + " is:" + x.length());
				cons.accept("Vish");;
	}
}
