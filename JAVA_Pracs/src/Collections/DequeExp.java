package Collections;

import java.util.ArrayDeque;

/**
bharathi.thangaraj
its a linear interface to supports elements insertation and removal from both end
 */
public class DequeExp {

	
	public static void main(String[] args) {
		
		ArrayDeque<String> arr = new ArrayDeque<String>();
		
		arr.add("test");
		arr.addFirst("first");
	//	arr.addLast(null); // not allow throw exception
		arr.pollFirst();
		arr.pollLast();
		System.out.println(arr);
		
		

	}

}
