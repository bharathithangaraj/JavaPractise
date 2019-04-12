package StringExamples;

import java.util.ArrayList;
import java.util.List;

/**
bharathi.thangaraj
 */
public class StringManipulate2 {


	public static void main(String[] args) {

		manipulate("abcdefghijklmnopqrstuvwxyz",3);

	}

	static void manipulate(String str, int split) {

		str = "1"+str;
		
		char[] charArr = str.trim().toCharArray();
		String strConcat = "";
		List<String> list1 = new ArrayList<String>();
		
		for(int count=0; count<charArr.length; count++) {
			if(count ==0){
				continue;
			}
			
			strConcat +=charArr[count];
			if(count%split == 0 && count != 0){
				list1.add(strConcat);
				strConcat ="";
			}
		}
		System.out.println(list1);

		

	}

}
