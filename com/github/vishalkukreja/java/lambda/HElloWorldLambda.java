package com.github.vishalkukreja.java.lambda;

public class HElloWorldLambda {
	public static void main(String[] args) {
		HelloWorldInterface interfaceRef = () -> {
			return "Hello AI";
		};
		System.out.println(interfaceRef.sayHelloAI());
	}

}
