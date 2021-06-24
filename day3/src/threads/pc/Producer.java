package threads.pc;

public class Producer implements Runnable {

	private Q q;
	int i = 0;

	public Producer(Q q) {
		this.q = q;
	}

	@Override
	public void run() {
		try {
			while (true) {
				q.put(i++);
				Thread.sleep(300);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
