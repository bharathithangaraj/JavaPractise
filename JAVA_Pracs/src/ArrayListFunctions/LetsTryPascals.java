package ArrayListFunctions;
/**
bharathi.thangaraj
 */
public class LetsTryPascals {

	
	public static void main(String[] args) {
		
		int num = 8;
		
		
		for(int i=0; i<8; i++) {
			
			System.out.format("%"+(num-i)*2+"s", "");
			int number = 1;
			for(int j=0; j<=i; j++) {
				
				System.out.format("%4d",number);
				number = number * (i-j)/(j+1);
			}
			System.out.println("");
			
		}

	}

}
