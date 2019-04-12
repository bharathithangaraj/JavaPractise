package demo;

import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ProducerConsumer {
	
	private static BlockingQueue<Integer> queue= new ArrayBlockingQueue<Integer>(10);

	public static void main(String[] args) {
		
		Thread t1 = new Thread(new Runnable() {
			
			public void run() {
				try {
					producer();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		});
		
		
		Thread t2 = new Thread(new Runnable() {
			
			public void run() {
				consumer();
				
			}
		});
		
		t1.start();
		t2.start();
		
		try {
			t1.isInterrupted();
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		

	}
	
	static void producer() throws InterruptedException {
		Random random = new Random();
		while(true) {
			Thread.sleep(100);
			try {
				queue.put(random.nextInt(100));
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	
	static void consumer() {
		Random random = new Random();
		while(true) {
			
			if(queue.size() ==10) {
				try {
					Integer  value =queue.take();
					System.out.println("queue size : "+queue.size()+"; queue value :"+value);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				
			}
			
		}
	}

}
