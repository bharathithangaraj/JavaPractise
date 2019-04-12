package demo;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class Runner1 implements Runnable{
	private int id;
	private volatile int count;
	Runner1 (int id){
		this.id= id;
	}
	
	void doWork(){
		for(int i=0; i< 1000; i++){
			count++;
		}
	}

	@Override
	public void run() {
		
		System.out.println("Starting :"+id);
		
		
		try {
			Thread.sleep(5000);
			doWork();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("completed :"+id);
		System.out.println("count :"+count);
		
	}
	
}

public class ThreadPoolExp {

	public static void main(String[] args) {
		
		ExecutorService executor = Executors.newFixedThreadPool(3);
		
		for(int i=0; i< 10; i++) {
			executor.submit(new Runner1(i));
		}
		
		executor.shutdown();
		
		try {
			executor.awaitTermination(1, TimeUnit.DAYS);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("shutdown ...");
		

	}

}
