/**
bharathi.thangaraj
 */
public class CreatePalindormeString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String palidrome = "aaaaa";

		shortestPalindrome(palidrome);

	}
	
	public static String shortestPalindrome(String str) {
		
		int lowIndex = 0;
		int highIndex = str.length()-1;
		
		while(highIndex >=0) {
			
			if(str.charAt(lowIndex) == str.charAt(highIndex)) {
				lowIndex++;
			}
			highIndex--;
			
		}
		
		if(lowIndex == str.length()) 
			return str;
		
		String suffix = str.substring(lowIndex);
		String prefix = new StringBuilder(suffix).reverse().toString();
		String mid = str.substring(0,lowIndex);
		
		System.out.println(prefix+mid+suffix);
		return prefix+mid+suffix;
	     
	}

}
