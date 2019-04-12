package ArrayListFunctions;
/**
bharathi.thangaraj
 */
public class PrintPattern1 {

	
	public static void main(String[] args) {
		
		printpattern1();
		
		printpattern2();
		
		printpattern3();

	}
	
	static void printpattern1(){
		

		int num = 15;
		int temp =1;
		
		for(int i=1;i<= num; i++) {
			  
			for(int k=i; k<num; k++){
				 System.out.print(" ");
			}
				
				 for(int j=1; j<=i; j++){
					 System.out.print("" +temp+ " ");
				     temp++;
				     if(temp > 15) {
				    	 break;
				     }
				 }
		
				
			
			 System.out.println();
			 if(temp>15){
			     break;
			  }
		}
		
		
	
		
	}
	
	
	static void printpattern2(){ 
		
		int first;
		int second ;
		
		for(first=0;first<=10; first++) {
			
			for(second=1; second<=first;second++) {
				System.out.print(second + " ");
			}
			System.out.println();
		}
		
	}
	
	static void printpattern3(){
		
		int first;
		int second ;
		
		for(first=1; first <=10; first++) {
			
			for(second=1; second<=10-first; second++) {
				System.out.print(second+" ");
			}
			System.out.println();
		}
		
	}

}
