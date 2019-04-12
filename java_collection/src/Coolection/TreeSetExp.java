package Coolection;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetExp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		TreeSet set = new TreeSet<>(new Comparator<Object>() {

			@Override
			public int compare(Object o1, Object o2) {
				
				Integer i1 = (Integer)o1;
				Integer i2 = (Integer)o2;
				
				return ((i1>i2)? 1 :(i1< i2? -1: 0));
				
			}
		});
		
		set.add(20);
		set.add(1);
		set.add(3);
		set.add(1);
		set.add(4);
		set.add(100);
		set.add(-1);
		
		System.out.println(set);
		

	}

}

