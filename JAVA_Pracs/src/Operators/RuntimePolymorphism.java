package Operators;

class RunTimeSub extends RuntimePolymorphism {
	String test ="";
	RunTimeSub() {
	super.test ="sdfsdf";
	}
}

public class RuntimePolymorphism {
	
	String test ="";
	
	public void run() {
		
	}

	public static void main(String[] args) {
		try {
		RuntimePolymorphism runTime = new RunTimeSub();
		runTime.run();
		}catch(Exception ex) {
			ex.printStackTrace();
		}
	}

}
