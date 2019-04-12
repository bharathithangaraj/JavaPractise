package Operators;
/**
bharathi.thangaraj
 */

class SuperClassExp {
	
}

class SubClassExp1 extends SuperClassExp {
	
	public void test() {
		System.out.println("SubClassExp1");
	}
	
}

class SubclassExp2  extends SuperClassExp {
	
	public void test() {
		System.out.println("SubClassExp2");
	}
	
}


public class DownCastInstanceOf {
	
	public void invoke(SuperClassExp sub) {
		
		if(sub instanceof SubClassExp1) {
			SubClassExp1 sub1 = (SubClassExp1)sub;
			sub1.test();
		}
		
	}

	
	public static void main(String[] args) {
		
		SuperClassExp sup = new SubClassExp1();
		
		DownCastInstanceOf downCast = new DownCastInstanceOf();
		
		downCast.invoke(sup);
		

	}

}
