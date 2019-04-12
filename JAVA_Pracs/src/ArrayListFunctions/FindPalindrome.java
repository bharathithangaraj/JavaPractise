package ArrayListFunctions;
/**
bharathi.thangaraj
 */
public class FindPalindrome {

	
	public static void main(String[] args) {
		
		int module; int sum=0; int divide;
		int temp;
		int findNo = 101011;
		
		temp = findNo;
		
		while(findNo > 0) {
			
			module = findNo%10;
			 sum  = (sum *10)+module;
			 findNo = findNo/10;
		}
		
		if(temp == sum) {
			System.out.println(" its a palindrome");
		} else {
			System.out.println(" its not a  palindrome");
		}
	}
		

}
