package threads;

public class RunnableMain {

	public static void main(String[] args) throws Exception{
		
		Thread t=new Thread(new Worker());
		t.setPriority(10);
		t.setName("Raju");
		t.start();
		
		Thread t2=new Thread(new Worker());
		t2.setName("Rita");
		t2.setPriority(6);
		t2.start();
		
		Thread t3=new Thread(()->{
			try {
				for(int i=0;i<20;i++) {
					System.out.println(Thread.currentThread().getName()+" : Task "+i);
					Thread.sleep(2000);
				}
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
			
		});

		t3.start();
		t.join();
		t2.join();
		t3.join();
	}

}
