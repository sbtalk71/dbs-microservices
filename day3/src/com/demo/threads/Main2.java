package com.demo.threads;

public class Main2 {

	public static void main(String[] args) throws Exception{
	
		Thread t1=new Thread(new Worker());
		Thread t2=new Thread(new Worker());
		Thread t3=new Thread(new Worker());
		
		t2.start();
		t3.start();
		t1.start();
		
		t2.join();
		t1.join();
		t3.join();
		
		System.out.println(Thread.currentThread().getName()+" exits...");
	}

}
