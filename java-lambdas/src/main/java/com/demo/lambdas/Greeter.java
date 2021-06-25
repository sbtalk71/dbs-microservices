package com.demo.lambdas;

import java.util.function.Supplier;

public class Greeter {

	public void printGreeting(Supplier<String> ms) {
		System.out.println(ms.get());
	}
}
