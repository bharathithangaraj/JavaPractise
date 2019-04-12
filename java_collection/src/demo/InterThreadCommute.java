package demo;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class InterThreadCommute {
	
	private static Queue<Integer> shareQ = new LinkedList<Integer>();

	public static void main(String[] args) {
		
		Thread  t1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				producer();
			}
		});
		
		Thread  t2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				consumer();
			}
		});
		
		t1.start();
		t2.start();
		
		Thread.interrupted();
		
		
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}
	
	
	private static void producer() {
		
		Random random = new Random();
		for(int i =0; i<10 ; i++) {
			synchronized (shareQ) {
				if(shareQ.size() >= 1) {
					try {
						shareQ.wait();
						//System.out.println(Thread.currentThread().isInterrupted());
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				shareQ.add(random.nextInt(100));
					shareQ.notifyAll();
				
				
			}
		}
		
	}
	
	private static void consumer() {
		
		
		while(true){
			synchronized (shareQ) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				if(shareQ.size() ==0) {
					try {
						shareQ.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				Integer value = shareQ.remove();
				System.out.println("remove value is :"+value);
				shareQ.notifyAll();

			}
		}
		
	}

}
