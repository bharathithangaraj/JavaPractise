package Operators;
/**
bharathi.thangaraj
 */
public class InitializerBlockExample {
	
	int i = 0;
	
	{
		for(int a=0; a<10; a++) {
			i = a;
		}
	}
	
	public InitializerBlockExample() {
		
	}
	
	public static void main(String args[]) {
		
		InitializerBlockExample init = new InitializerBlockExample();
		System.out.println(init.i);
		
	}
}
