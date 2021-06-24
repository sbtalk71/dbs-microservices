package com.demo.threads;

public class Worker implements Runnable{

	@Override
	public void run() {
		try {
			for (int i = 0; i < 20; i++) {
				System.out.println(Thread.currentThread().getName() + " : " + i);
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println(Thread.currentThread().getName()+" exits...");
	}
	
	
}
