class Runner extends Thread {

	@Override
	public void run() {
		
		for(int i=0; i< 10; i++) {
			System.out.println("Hello  "+i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
			
	}
	
}
public class ThreadMain1 {

	public static void main(String[] args) {
		Thread t1 = new Runner();
		t1.start();
		Thread t2 = new Runner();
		t2.start();
		
		try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
