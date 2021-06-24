package threads;

public class Main {

	public static void main(String[] args) throws Exception{
		System.out.println("Main Thread starts....");
		
		SampleThread t1=new SampleThread();
		t1.start();
		Thread.sleep(1000);
		
		SampleThread t2=new SampleThread();
		
		Thread.sleep(1000);
		System.out.println("a");
		System.out.println("a");
		System.out.println("a");
		System.out.println("a");
		t1.join();
		t2.start();
		t2.join();
		System.out.println("Main Thread exits....");

	}

}
