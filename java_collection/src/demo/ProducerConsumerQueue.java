package demo;

import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

import javax.management.Query;



public class ProducerConsumerQueue {
	
	static BlockingQueue<Integer> queue = new ArrayBlockingQueue<Integer>(2);

	public static void main(String[] args) {
		
		Thread t1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				producer();
				
			}
		});
		
		Thread t2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				consumer();
				
			}
		});
		
		t1.start();
		t2.start();
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}
	
	
	private static void producer(){
		Random random = new Random();
		for(int i=0; i< 10; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			queue.add(random.nextInt(100));
		}
		
		
		
	}
	
	private static void consumer(){
		while(true) {
			
			if(queue.size() == 2){
				System.out.println(queue);
				Integer value = queue.remove();
				System.out.println("queue removed value is :"+value);
			}
			
			
		}
		
		
	}

}
