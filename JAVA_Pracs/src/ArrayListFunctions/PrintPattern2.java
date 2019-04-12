package ArrayListFunctions;
/**
bharathi.thangaraj
 */
public class PrintPattern2 {


	public static void main(String[] args) {
		pattern2();
		patter1();
		

	}

	static void patter1() {

		int r,c1,c2;

		for(r=1; r<=10; r++) {

			for(c1=1; c1<r; c1++) {
				System.out.print(" ");
			}

			for(c2=1; c2<=10-r;c2++) {
				System.out.print(c2 +" ");
			}
			System.out.println("");
		}

	}
	
	static void pattern2() {
		
		int r,c1,c2;
		for(r=1; r<=10; r++) {
			
			for(c1=1; c1<10-r; c1++) {
				System.out.print(" ");
			}
			
			for(c2=1; c2<=r; c2++) {
				System.out.print(c2+" ");
			}
			
			System.out.println("");
		}
		
	}

}
