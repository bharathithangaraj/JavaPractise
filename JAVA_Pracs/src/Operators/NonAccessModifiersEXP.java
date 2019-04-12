package Operators;
/**
bharathi.thangaraj
 */

class Implement extends NonAccessModifiersEXP {
	
	public Implement() {
		super.test ="ttt";
	}
	
	
}

public class NonAccessModifiersEXP {

	public final int i = 0;
	
	protected static String test = "test";
	
	public static void main(String[] args) {
		NonAccessModifiersEXP non = new NonAccessModifiersEXP();
		Implement imp = new Implement();
		test = "bharathi";
		System.out.println(test);
		
	}

}
