package Coolection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Test {

	public static void main(String[] args) {
		List t = new ArrayList();
		t.add("test");
		t.add("test1");
		t.add(null); 
		//t.set(0, t.get(2));
		System.out.println(t.lastIndexOf("test1"));
		System.out.println(t);
		
		Set set = new LinkedHashSet();
		set.add("test");
		set.add("test");
		set.add("test1");
		set.add("test3");
		set.add(null);
		
		for(Iterator itr = set.iterator(); itr.hasNext();) {
			System.out.println(itr.next());
		}
		
		String[] test = new String[];
		 test[0] = "test";
		 test[1] = "rfwerwe";
		 test[3] = "";
		System.out.println(test[0]);
		
		for(int i =0; i< test.length; i++) {
			System.out.println(test[i]);
		}
		
		

	}

}
