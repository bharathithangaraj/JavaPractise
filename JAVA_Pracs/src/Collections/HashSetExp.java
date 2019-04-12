package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Set;

public class HashSetExp {

	
	public static void main(String[] args) {
		
		Set<String> set1 = new HashSet<String>();
		
		
		//
		ArrayList<String> list1 = new ArrayList<String>();
		
		Collections.addAll(list1, "test1","test2","test3","test1");
		
		Set<String> set2 = new HashSet<>(list1);
		System.out.println(set2);
		Collections.addAll(set2, "sdlkfksdl","sdfsdfsd");
		System.out.println(set2);
		
		Set<String> set3 = new HashSet<>(1000000);
		
		set3.addAll(set2);
		set3.add(null);
		System.out.println(set3);
		
		Iterator ent = set3.iterator();
		
		while(ent.hasNext()) {
			System.out.println(ent.next());
		}

		for(String test : set3) {
			System.out.println(test);
		}
	}

}
