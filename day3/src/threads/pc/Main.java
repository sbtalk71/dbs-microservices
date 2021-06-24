package threads.pc;

public class Main {

	public static void main(String[] args) throws Exception {
		Q q = new Q();
		//for(int i=0;i<100;i++) {
		Thread t1 = new Thread(new Consumer(q));
		Thread t2 = new Thread(new Producer(q));
		t1.start();
		t2.start();

	//	}

	}

}
