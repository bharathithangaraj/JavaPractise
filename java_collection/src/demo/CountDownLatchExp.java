package demo;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class Processor implements Runnable {
	
	private CountDownLatch latch;
	
	Processor(CountDownLatch latch){
		this.latch = latch;
		
	}

	public void run() {
		System.out.println("Starting ..");
		
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("latch gonna down ....");
		this.latch.countDown();
	}
	
}

public class CountDownLatchExp {

	public static void main(String[] args) {
		
		Runnable runner1 =  new Runnable() {
			public void run() {
				System.out.println("count executed");
			}
		};
		
		CountDownLatch latch = new CountDownLatch(3);
		//new Thread(new Processor(latch)).start();
		
		ExecutorService executor = Executors.newFixedThreadPool(3);
		
		for(int i=0; i<3; i++) {
			executor.submit(new Processor(latch));
		}
		
		System.out.println("all are submitted");
		
		try {
			latch.await(1, TimeUnit.DAYS);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("all threads are finished ..");
		
		

	}

}
