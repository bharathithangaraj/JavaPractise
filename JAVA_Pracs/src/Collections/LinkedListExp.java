package Collections;

import java.io.ObjectInputStream.GetField;
import java.util.Collections;
import java.util.Comparator;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExp {

	
	public static void main(String[] args) {
		
		Deque<String> list1 = new LinkedList<String>();
		
		Collections.addAll(list1, "sdfsdfsd","test2","test3","test1","test4");
		System.out.println(list1);
		
		
		System.out.println(list1.getFirst());
		
		List<String> list2 = new LinkedList<String>(list1);
		//list2.add(5, "dsfsdfsd");
		
		List<String> list3 = new LinkedList<String>();
		list3.add("bharathi");
		list3.add("test1");
		list3.add("test3");
		
		list3.retainAll(list2);
		System.out.println("position :"+list3.get(1));;
		
		
		Iterator<String> iter = list3.iterator();
		
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		Collections.sort(list2, new Comparator<String>() {
			
			public int compare(String o1, String o2)  {
				return o1.compareTo(o2);
			}
		});
		System.out.println(list2);
 
	}

}
