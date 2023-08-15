package com.github.vishalkukreja.java.lambda;

public class HelloWorldTraditional implements HelloWorldInterface{

	@Override
	public String sayHelloAI() {
		// TODO Auto-generated method stub
		return "World of AI";
	}
	
	public static void main(String[] args) {
		System.out.println(new HelloWorldTraditional().sayHelloAI());
	}

}
