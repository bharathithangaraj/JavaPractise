package ArrayListFunctions;
/**
bharathi.thangaraj
 */
public class PrintPattern3 {


	public static void main(String[] args) {
		
		pattern1();
		pattern2();

	}
	
	static void pattern1() {
		
		//int numberOfStars = 10;
		
		for(int row=1; row<=10; row++) {
			
			for(int middle=row; middle<10; middle++) {
				System.out.print(" ");
			}
			
			for(int numberOfStars= 1; numberOfStars<=row; numberOfStars++) {
				System.out.print(" "+"*"+ " " );
			}
			System.out.println("");
			
		}
		
	}
	
	static void pattern2() {
		
		for(int row=1; row<=10; row ++){
			
			for(int middle=1; middle<=row;middle++) {
				System.out.print(" ");
			}
			
			for(int numberofStars = 0; numberofStars<=10-row; numberofStars++) {
				System.out.print(" "+"*"+" ");
			}
			System.out.println("");
		}
		
	}

}
