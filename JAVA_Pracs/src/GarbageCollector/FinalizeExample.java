package GarbageCollector;

class B {
	
	protected void finalize() throws Throwable{
		
		try {
			System.gc();
			System.out.println(" finalize method is coming");
		} catch(Throwable t) {
			System.out.println(" catching method is coming");
			throw t;
			
		} finally {
			System.out.println(" finalize method is coming");
			super.finalize();
		}
		
	}
}


public class FinalizeExample {

	
	public static void main(String[] args) {
		B obj = new B();
		
		try {
			obj.finalize();
			obj.finalize();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
