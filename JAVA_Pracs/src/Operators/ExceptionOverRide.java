package Operators;
/**
bharathi.thangaraj
 */
public class ExceptionOverRide extends Exception {

	
	public ExceptionOverRide() {
		super("testinggg");
	}
	
	public static void main(String[] args) {
		ExceptionOverRide exp = new ExceptionOverRide();
		System.out.println(exp.toString());

	}
	
	public String toString() {
		return "testinggg";
	}
	

}
