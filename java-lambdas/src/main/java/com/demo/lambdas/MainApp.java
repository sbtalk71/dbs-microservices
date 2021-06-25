package com.demo.lambdas;

import java.util.Comparator;

public class MainApp {

	public static void main(String[] args) {

		Greeter greeter = new Greeter();
		// greeter.printGreeting(new GoodMorning());

		/*
		 * greeter.printGreeting(new MessageService() {
		 * 
		 * @Override public String getGreetMessage() { // TODO Auto-generated method
		 * stub return "Good Evening"; } });
		 */
		greeter.printGreeting(() -> "Good night");

		greeter.printGreeting(() -> "Good day");

		Comparator<String> comp = (s1, s2) -> s1.compareTo(s2);

		new Thread(() -> System.out.println("i was from thread " + Thread.currentThread().getName())).start();
		;

	}

}

class GoodMorning implements MessageService {

	@Override
	public String getGreetMessage() {
		// TODO Auto-generated method stub
		return "Good Morning";
	}

}