package demo;

import java.util.Random;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class DeadLockProcessor {
	
	private Lock lock1 = new ReentrantLock();
	private Lock lock2 = new ReentrantLock();
	
	private Account acc1 = new Account();
	private Account acc2 = new Account();
	
	private void acquiredLoc(Lock firstLock, Lock secondLock) throws InterruptedException {
		while(true) {
			boolean getFirstLock = false;
			boolean getSecondLock = false;
			try {
				getFirstLock = firstLock.tryLock();
				getSecondLock = secondLock.tryLock();
			} finally {
				if(getFirstLock && getSecondLock) {
					return;
				}
				if(getFirstLock) {
					firstLock.unlock();
				}
				if(getSecondLock) {
					secondLock.unlock();
				}
			}
			Thread.sleep(1);
			
		}
		
	}
	
	public void firstThread() throws InterruptedException{
		Random random = new Random();
		for(int i=0; i< 10000; i++) {
			acquiredLoc(lock1, lock2);
			try {
				Account.transfer(acc1, acc2, random.nextInt(100));
			} finally {
				lock1.unlock();
				lock2.unlock();
			}
			
		}
		
	}
	
	public void secondThread() throws InterruptedException{
		Random random = new Random();
		for(int i=0; i< 10000; i++) {
			
			acquiredLoc(lock2, lock1);
			try {
				Account.transfer(acc2, acc1, random.nextInt(100));
			} finally {
				lock1.unlock();
				lock2.unlock();
			}
		}
	}
	
	public void finished() {
		System.out.println("getBalance acc1 :"+acc1.getBalance());
		System.out.println("getBalance acc2 :"+acc2.getBalance());
		System.out.println("total acc2 :"+(acc2.getBalance()+acc1.getBalance()));
	}
	
}

class Account {
	private int balance = 10000;
	
	public void deposit(int amount) {
		balance += amount;
	}
	
	public void withdraw(int amount) {
		balance -= amount;
	}
	
	public int getBalance() {
		return balance;
	}
	
	public static void transfer(Account acc1, Account acc2, int amount) {
		acc1.deposit(amount);
		acc2.withdraw(amount);
	}
}

public class DeadLockExp {

	public static void main(String[] args) {
		final DeadLockProcessor de = new DeadLockProcessor();
		Thread t1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				try {
					de.firstThread();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		
		Thread t2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				try {
					de.secondThread();
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
		
		de.finished();
		

	}

}
