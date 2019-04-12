package demo;

import java.util.LinkedList;
import java.util.Random;

public class InterThreadCommunication {
	
	static volatile LinkedList<Integer> list = new LinkedList<Integer>();
	private static final int LIMIT = 10;
	private static Object lock = new Object();
	
	
	private static void produce() throws InterruptedException {
		int count =0;
		 
		while(true) {
			
			synchronized (lock) {
				Thread.sleep(2000);
				while(list.size() == LIMIT) {
					System.out.println("producer wait");
					lock.wait();
				}
				list.add(count++);
				if(list.size() == LIMIT) {
					System.out.println("notify P");
					lock.notifyAll();
				}
				
			}
			
			
		}
		
	}
	
	private static void consume() throws InterruptedException {
		Random random = new Random();
		while(true) {
			synchronized (lock) {
				Thread.sleep(1000);
				while(list.size() == 0){
					System.out.println("wait C");
					lock.wait();
				}
				System.out.println("list size is :"+list.size());
				list.clear();
				
				//System.out.println("; removed value is :"+value);
				lock.notifyAll();
			}
			
			
			Thread.sleep(random.nextInt(1000));
		}
		
	}
	
	

	public static void main(String[] args) {
		
		Thread t1= new Thread(new Runnable() {
			
			public void run() {
				try {
					produce();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		
		Thread t2 = new Thread(new Runnable() {
			
			public void run() {
				try {
					consume();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
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
		System.out.println(t1.isAlive());
		

	}

}
