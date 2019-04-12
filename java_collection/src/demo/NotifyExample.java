package demo;

public class NotifyExample {
	
	private static boolean go = false;
	static Object lock = new Object();

	public static void main(String[] args) {
		Runnable waitTask = new Runnable() {
			
			@Override
			public void run() {
				shouldGo();
			}
		};
		
		Runnable notifyTask = new Runnable() {
			
			@Override
			public void run() {
				go();
			}
		};
		
		Thread  t1 = new Thread(waitTask, "W1");
		Thread  t2 = new Thread(waitTask, "W2");
		Thread  t3 = new Thread(waitTask, "W3");
		
		Thread  t4 = new Thread(notifyTask, "W4");
		
		t1.start();
		t2.start();
		t3.start();
		
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		t4.start();
	}
	
	private static void shouldGo() {
		while(!go) {
			synchronized (lock) {
				try {
					System.out.println(Thread.currentThread().getName()+" Threads all are wait for notify");
					lock.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println(Thread.currentThread().getName()+" Threads are woken up");
				go = false;
			}
		}
	}
	
	private static void go() {
		while(go ==false) {
			synchronized (lock) {
				System.out.println(Thread.currentThread().getName()+" Thread notify wait thread");
				go= true;
				lock.notifyAll();
				
			}
		}
		
	}

}
