package Programming.FinallyBloack;



public class FinallyAlways {
	
	public static Integer finallyExecuted() {
		
		Integer count =0;
		try {
		for(int i=0; i< 2; i++) {
			count ++;
		} 
		 return count;
		}
		finally {
			System.out.println("finally always executed");
		}
		
	}

	
	public static void main(String[] args) {
		
		int i = finallyExecuted();
		System.out.println(" i value is  :"+i);

	}

}
