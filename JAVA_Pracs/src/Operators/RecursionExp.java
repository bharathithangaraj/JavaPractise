package Operators;

public class RecursionExp {
	
	static int factorial(int n) {
		
		if(n == 1){
			return 1;
		}	
		else 
		{
			return (n*factorial(n-1));
		}
			
		
		
	}

	
	public static void main(String[] args) {
		int o = factorial(5);
		
		System.out.println(o);

	}

}
