package Operators;
/**
bharathi.thangaraj
 */

class SubClassExp extends InheritanceExp{
	
	public void test() {
		test = "bharati got changed";
		finalMethod();
		
	}
	
	
	
	public void subMethod() {
		test = "ttttttt";
	}
	
}

public class InheritanceExp {
	String test = "bharathi";
	int i = 0;
	
	protected void test() {
		System.out.println(test);
	}
	
	public int test1() {
		return i;
	}
	public final void finalMethod() {
		System.out.println("final method called");
	}
	
	public static void staticMethod (){
		
	}
	
	public static void main(String[] args) {
		/*SubClassExp superCl = new SubClassExp();
		
		
		
		
		superCl.test();
		System.out.println(superCl.test);*/
		InheritanceExp superExp = new SubClassExp();
		SubClassExp subExp = (SubClassExp)superExp;
		
		Object obj = subExp;
		
		
		subExp.subMethod();
		System.out.println(subExp.test);
		

	}

}
