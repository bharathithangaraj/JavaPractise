package ArrayListFunctions;
/**
bharathi.thangaraj
 */
public class FindPossiblePalindrome {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		printPalindromes("abcbaaabbaa");
		
		/*String test ="abcd";
		char[] ch = test.toCharArray();
		System.out.println(ch.length);
		for(int i=0;i<=ch.length-1; i++) {
			System.out.println(" "+ch[i]);
		}*/

	}

	public static void printPalindromes(String str) {
		
		if(str == null || str.length()<=3) {
			return;
		}
		for(int i=1;i<=str.length()-1; i++) {
			
			for(int j=i-1,k=i+1; j>=0 && k<str.length(); j--,k++) {
				
				if(str.charAt(j) == str.charAt(k)) {
					
					if(k-j+1 >= 3) {
						System.out.println(str.substring(j,k+1)+ " : start index :"+j + " : end : "+k);
					}
					
					
				} else
					break;
				
			}
			
		}
		
		
		 for (int i=1; i<str.length()-1; i++) {
			  for (int j=i,k=i+1; j>=0 && k<str.length(); j--,k++) {
				  if (str.charAt(j) == str.charAt(k)) {
					if(k-j+1 >=  3){
						System.out.println(str.substring(j, k+1)+ "  : start index :"+j+ "  : end :"+k);
					} 
				} else 
					break;
				
			}
		}
		
		 for (int i=1; i<str.length()-1; i++) {
	            for (int j=i,k=i+1; j>=0 && k<str.length(); j--,k++) {
	                if (str.charAt(j) == str.charAt(k)) {
	                    if (k-j+1 >= 3)
	                        System.out.println(str.substring(j, k+1) + " with index " +j+ " and "+k);
	                }
	                else
	                    break;
	            }
	        }
		
	}
    
    
}
