package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListExample {

	
	public static void main(String[] args) {
		
		List array1 = new ArrayList<>(); //empty array List
		Collections.addAll(array1, "dsfsdf","asdasdasda");
		
		array1.add("test1");
		array1.add("test2");
		array1.add("test3");
		
		List array2= new ArrayList<>(array1);
		
		array2.add("test4");
		System.out.println(array2);
	
		List array3 = new ArrayList<>(20);
		
		Collections.addAll(array3, "test1","test2","d");
		
		//array2.retainAll(array3);
		
		//array2.removeAll(array3);
		
		System.out.println(array2);
		
		
		Iterator itr = array2.iterator();
		
		while(itr.hasNext()) {
			
			String test = (String)itr.next();
			
			
			//itr.remove();
			
			
			
		}
		
		ListIterator listIter = array2.listIterator();
		
		while(listIter.hasNext()) {
			String test = (String)listIter.next();
			
			if(test.equals("test3")) {
				listIter.add("tttt");
			}
			// array2.add("sdsdfs"); --> concurrentmodification
			
		}
		
		for(int i=0; i< array2.size(); i++) {
			/*String test = (String)array2.get(i);
			if(test.equals("test3")) {
				System.out.println(" coming");
				array2.remove(i);
			}*/
			array2.remove(i);
		}
		
		System.out.println(array2);
		

	}

}
