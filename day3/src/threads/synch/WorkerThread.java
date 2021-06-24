package threads.synch;

public class WorkerThread implements Runnable {

	Resource r;
	String message;

	public WorkerThread(Resource r, String message) {
		this.r = r;
		this.message = message;
	}

	@Override
	public void run(){
		synchronized(r) {
			r.print(message);
	
		}

	}

}
