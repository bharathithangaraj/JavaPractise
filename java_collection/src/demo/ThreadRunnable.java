package demo;

class Runner implements Runnable {

	
	public void run() {
		for(int i=0; i< 10; i++) {
			System.out.println("Hello  "+i);
			System.out.println(Thread.currentThread().getName());
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}

public class ThreadRunnable {

	public static void main(String[] args) throws InterruptedException {
		Thread t1 = new Thread(new Runner(),"Thread1");
		
		
		Thread t2 = new Thread(new Runner(),"Thread2");
		
		t1.start();
		t2.start();
		t1.setPriority(Thread.MIN_PRIORITY);
		t2.setPriority(Thread.MAX_PRIORITY);
		//t2.start();
		t1.join();
		t2.join();
		
		System.out.println(t1.isAlive());
	}

}
