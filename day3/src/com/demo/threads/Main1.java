package com.demo.threads;

public class Main1 {

	public static void main(String[] args) throws Exception{
	
		DemoThread t1= new DemoThread();
		DemoThread t2= new DemoThread();
		
		t2.start();
		
		t1.start();
		
		t2.join();
		t1.join();
		
		System.out.println(Thread.currentThread().getName()+" exits...");
	}

}
