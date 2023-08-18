package com.github.vishalkukreja.java.lambda;

public class IncrementValueLambda {
	public static void main(String[] args) {
		IncrementValueInterface incrementRef = (n) -> n*5;
		
		System.out.println(incrementRef.increaseValue(2));
	}
}
