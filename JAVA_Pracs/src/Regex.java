import java.util.regex.Pattern;

/**
bharathi.thangaraj
 */
public class Regex {

	
	public static void main(String[] args) {
		
		//bharathigragaraj@gmail.com
		
		String regex = "\\D+@\\D+.\\D";
		
		String test = "asddasdgmail.com";
		System.out.println(test.matches(regex));

	}

}
