package threads.synch;

import threads.Worker;

public class Main {

	public static void main(String[] args) throws Exception {
		Resource res = new Resource();
		Thread t1 = new Thread(new WorkerThread(res, "Hello"));
		
		Thread t2 = new Thread(new WorkerThread(res, "Good"));
		Thread t3 = new Thread(new WorkerThread(res, "World"));

		t1.start();
		t2.start();
		t3.start();

		t1.join();
		t2.join();
		t3.join();
		System.out.println("Main exits..");
		
		

	}

}
