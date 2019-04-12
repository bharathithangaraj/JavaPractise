package ArrayListFunctions;
/**
bharathi.thangaraj
 */
public class ReverserVowels {
	static String reverse= "bharathi";
	static String regex = "aeiouAEIOU";

	public static void main(String[] args) {



		char[] ch = reverse.toCharArray();
		int lowIndex = 0;
		int highIndex = reverse.length()-1;

		doReverse(ch, lowIndex, highIndex);


	}

	static void doReverse(char[] ch, int lowIndex,int highIndex) {

		while(lowIndex < highIndex) {

			if(!regex.contains(String.valueOf(reverse.charAt(lowIndex)))) {

				lowIndex++;
				continue;
			}

			if(!regex.contains(String.valueOf(reverse.charAt(highIndex)))) {

				highIndex --;
				continue;

			}


			swapElements(ch,lowIndex,highIndex);
			lowIndex++;
			highIndex--;


		}

		System.out.println(String.valueOf(ch));

	}

	static void swapElements(char[] ch, int lowIndex, int highIndex) {

		int temp = ch[lowIndex];
		ch[lowIndex] = ch[highIndex];
		ch[highIndex] = ch[lowIndex];

	}

}
