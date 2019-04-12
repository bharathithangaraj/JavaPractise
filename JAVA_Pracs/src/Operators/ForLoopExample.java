package Operators;

import java.util.ArrayList;
import java.util.List;

/**
bharathi.thangaraj
 */
public class ForLoopExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		list.add("test0");
		list.add("test1");
		list.add("test2");
		list.add("test3");
		list.add("test4");
		
		aa:
		for(String test : list) {
			
			
				
			bb:
			for(String test1 : list) {
				if(test1.equals("test3"))
					break aa;
				System.out.println(test +" : "+test1);
			}
			
			
		}

	}

}
