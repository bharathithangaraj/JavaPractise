package demo;

import java.util.Scanner;

class Runner3 extends Thread {

	private volatile boolean running = true;
	private volatile int l = 0;
	public void run() {
		for(int i=0; i< 10; i++) {
			try {
				Thread.sleep(1000);
				System.out.println(Thread.currentThread().getName());
				System.out.println("long happens before :"+l);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			l= l+10;
		}
		
	}
	
	/*public void shutdown(){
		System.out.println("calling");
		running = false;
	}*/
	
	public void shutdown(){
		System.out.println("long valu is :"+l);
	}
	
	
}

public class VolatileRunner {

	public static void main(String[] args) {
		
		Runner3 runner = new Runner3();
		
		
		Runner3 runner2 = new Runner3();
		runner.start();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		runner2.start();
		
		try {
			runner.join();
			
			
			runner2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
		
		/*System.out.println("test ::::::::::");
		Scanner scanner = new Scanner(System.in);
		scanner.nextLine();
		
		runner.shutdown();*/
		

	}

}
