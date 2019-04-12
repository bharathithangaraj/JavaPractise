package demo;

import java.util.Scanner;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class ReentrantProcess {
	
	private int count;
	private Lock lock = new ReentrantLock();
	private Condition cond = lock.newCondition();
	
	private void increment() {
		for(int i=0; i< 10000; i++) {
			count++;
		}
		
	}
	
	public void firstThread() throws InterruptedException {
		lock.lock();
		System.out.println("lock awaited :");
		cond.await();
		
		try {
			increment();
		} finally{
			lock.unlock();
		}
		
		
	}
	
	public void secondThread() throws InterruptedException{
		lock.lock();
		
		System.out.println("press any key :");
		
		new Scanner(System.in).nextLine();
		System.out.println("key pressed");
		
		cond.signal();
		
		
		try {
			increment();
		} finally{
			lock.unlock();
		}
		
	}
	
	public void shoutdown(){
		System.out.println("count is :"+count);
		
	}

	
}

public class ReenetrantLockExp {

	public static void main(String[] args) {
		final ReentrantProcess re = new ReentrantProcess();
		
		Thread t1 = new Thread(new Runnable() {
			
			public void run() {
				try {
					re.firstThread();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		
		Thread t2 = new Thread(new Runnable() {
			
			public void run() {
				try {
					re.secondThread();
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
		
		
		re.shoutdown();

	}

}
