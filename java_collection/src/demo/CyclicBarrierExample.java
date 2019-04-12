package demo;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

class BarrierRunnable implements Runnable {
	CyclicBarrier barrier1;
	CyclicBarrier barrier2;
	
	public BarrierRunnable(CyclicBarrier barrier1 , CyclicBarrier barrier2 ) {
		this.barrier1 = barrier1;
		this.barrier2 = barrier2;
	}
	
	@Override
	public void run() {
		for(;;) {
		try {
			
			Thread.sleep(1000);
			 System.out.println(Thread.currentThread().getName() +
                     " waiting at barrier 1");
			this.barrier1.await();
			System.out.println(Thread.currentThread().getName() +
                    " waiting at barrier 2");
			Thread.sleep(1000);
			this.barrier2.await();
			this.barrier1.reset();
			this.barrier2.reset();
			System.out.println(Thread.currentThread().getName() +
                    " done!");
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (BrokenBarrierException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	} 
	}
}

public class CyclicBarrierExample {

	public static void main(String[] args) {
		Runnable runner1=   new Runnable() {
			public void run() {
				System.out.println("barrier 1 action executed");
			}
		};
		
		Runnable runner2=   new Runnable() {
			public void run() {
				System.out.println("barrier 1 action executed");
			}
		};
		
		CyclicBarrier barrier1 = new CyclicBarrier(2, runner1);
		CyclicBarrier barrier2 = new CyclicBarrier(2, runner2);
		
		BarrierRunnable runnable1 = new BarrierRunnable(barrier1, barrier2);
		BarrierRunnable runnable2 = new BarrierRunnable(barrier1, barrier2);
		
		new Thread(runnable1).start();
		new Thread(runnable2).start();

	}

}


