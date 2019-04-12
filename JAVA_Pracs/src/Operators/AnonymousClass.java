package Operators;

abstract class Test {
	public abstract void test ();
}

 class AnonymousClass {

	
	 
	public static void main(String[] args) {
	
		Test test = new Test(){
			public void test() {
				System.out.println("testtt");
			}
		};
		test.test();

	}

}
