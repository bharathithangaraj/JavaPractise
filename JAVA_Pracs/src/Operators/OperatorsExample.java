package Operators;
/**
bharathi.thangaraj
 */
public class OperatorsExample {
	
	
	public static void main(String args[]) {
		int x = 10;
		
		//Unary Operator Example 1
		System.out.println(x++);  
		System.out.println(++x);  
		System.out.println(x--);  
		System.out.println(--x);  
		
		//Unary Operator Example 2
		
		int a = 10;
		int b = 10;
		
		System.out.println(a++ + ++a);
		System.out.println(b++ + b++);
		
		/*for(int k=10; k>0; k--){
			System.out.println("K  :"+k);
		}*/
		
		
		/*int c = -99;
		System.out.println("C is :"+(~c));*/
		
		int d = 10;
		int e = 5;
		System.out.println("DE :"+(d%e));
		
		System.out.println(10*10/5+3-1*4/2);  
		
		//Shift Operator
		
		int s = 10;
		
		System.out.println(1<<30);
		
		
	}

}
