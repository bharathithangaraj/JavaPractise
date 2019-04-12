package demo;

class Singleton{
	private static volatile Singleton _instance = null;
	
	private Singleton() {
		
	} 
	
	/*public  static Singleton getInstance(){
		System.out.println("1:::"+Thread.currentThread().getName());
		synchronized (Singleton.class) {
			if(_instance == null) {
				System.out.println(Thread.currentThread().getName());
				_instance = new Singleton();
			}
			return _instance;
		}
		
	}*/
	
	public static Singleton getInstance() {
		
		System.out.println("1:::"+Thread.currentThread().getName());

		if(_instance == null) {
			synchronized (Singleton.class)  {
				
				System.out.println( "2 :::"+Thread.currentThread().getName());
				if(_instance == null) {
					System.out.println("3 :::"+Thread.currentThread().getName());
				_instance = new Singleton();
				}
			}
		}
		
		return _instance;
	}
}

public class VolatileSingleton {

	public static void main(String[] args) throws InterruptedException {
		
		Thread  t1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				Singleton.getInstance();
			}
		});
		
		
		Thread  t2 = new Thread(new Runnable() {
			
			public void run() {
				Singleton.getInstance();
			}
		});
		Thread  t3 = new Thread(new Runnable() {
			
			public void run() {
				Singleton.getInstance();
			}
		});

		Thread  t4 = new Thread(new Runnable() {
	
	public void run() {
		Singleton.getInstance();
	}
		});
		Thread  t5 = new Thread(new Runnable() {
	
	public void run() {
		Singleton.getInstance();
	}
});

		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		
		t1.join();
		t2.join();
		t3.join();
		t4.join();
		t5.join();

	}

}
