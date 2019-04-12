package StringExamples;

import java.util.ArrayList;
import java.util.List;

/**
bharathi.thangaraj
 */
public class StringManipulate {

	
	public static void main(String[] args) {
	
		manipulate("abcdefghijklmnopqrstuvwxyz",3);
	}
	
	static void manipulate(String str, int i) {
		
		
			String cutOFF = str.substring(0, i);
			str = str.replaceAll(cutOFF, "");
			List<String> list = new ArrayList<String>();
			
			list.add(cutOFF);
			
			if(str.length() >= i) {
				manipulate(str,i);
			}
		
		
		System.out.println(list);
		
	}

}
