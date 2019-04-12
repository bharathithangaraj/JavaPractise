package ArrayListFunctions;
/**
bharathi.thangaraj
 */
public class FindPalindromeString {

	
	public static void main(String[] args) {
		 String s = "srtitrs";
		 System.out.println(printPalindromes(s));
	}
	
	static boolean printPalindromes(String str) {
		
		char[] word = str.toCharArray();
		int lowIndex = 0;
		int highIndex = word.length-1;
		while(lowIndex<highIndex) {
			if(word[lowIndex] != word[highIndex]){
				return false;
			}
			lowIndex++;
			highIndex--;
		}
		return true;
		
		/*int arrlength = word.length-1;
		aa:
		for(int i=0; i<arrlength; i++) {
			
			bb:
			for(int j = arrlength-i; j>=arrlength-i; j--) {
				if(i == j)
					break aa;
				if(word[i] != word[j]) {
					return false;
				} 
			}
			
		}
		return true;*/
		
	}
	
	

}
