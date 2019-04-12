package Coolection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.Vector;
import java.util.concurrent.CopyOnWriteArrayList;

public class IteratorExp {

	public static void main(String[] args) {
		Map map = new HashMap();
		
		map.put("1","test1");
		map.put("2","test2");
		map.put("3","test3");
		map.put("4","test4");
		map.put("5","test5");
		map.put("1","test6");
		map.put(null, "test7");
		
	/*	TreeMap<String, String> treemap = new TreeMap<String, String>(map);
		
		Set set = treemap.entrySet();
		System.out.println(set);*/
		
		
		System.out.println(map.get(null));
		
		Vector v = new Vector<String>();
		v.add("test");
		v.add(null);
		v.add(null);
		v.add("test");
		
		Iterator enu = v.iterator();
		while(enu.hasNext()) {
			System.out.println(enu.next());
		}
		
		/*Iterator it = map.entrySet().iterator();
		
		while(it.hasNext()){
			Map.Entry keyValPair = (Map.Entry) it.next();
			System.out.println("Key :"+keyValPair.getKey() +" Value :"+keyValPair.getValue());
		}*/
		
		
		Map<String, String> sortvalMap = sortedByVal(map);
		System.out.println(sortvalMap);
		
		for(Iterator itr = sortvalMap.entrySet().iterator(); itr.hasNext();) {
			Map.Entry<String, String> entry = (Map.Entry)itr.next();
			System.out.println("Sort Key :"+entry.getKey() + " SortedVal :"+entry.getValue());
		}
		
		
		/*List list  = new ArrayList();
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		list.add("5");
		list.add("6");
		//list.add(new Integer(7));
		list.add("8");
		//System.out.println(list);
		try {
		for(ListIterator<String> litr = list.listIterator(); litr.hasNext(); ) {
			System.out.println(litr.next());
			list.add("10");
		} }
		catch(Exception ew) {
			ew.printStackTrace();
		}
		System.out.println(list);
		
		CopyOnWriteArrayList<String> copyArr = new CopyOnWriteArrayList<String>();
		copyArr.add("1");
		copyArr.add("2");
		copyArr.add("3");
		copyArr.add("4");
		copyArr.add("5");
		copyArr.add("6");
		System.out.println(copyArr);
		
		for(ListIterator<String> itr = copyArr.listIterator(); itr.hasNext();) {
			System.out.println(itr.next());
			copyArr.add("10");
			
		}
		System.out.println(copyArr);*/
		
		
		
		
		
	}
	
	
	private static Map sortedByVal(Map map) {
		
		List list  = new LinkedList(map.entrySet());
		
		Collections.sort(list, new Comparator(){
			public int compare(Object o1, Object o2) {
				/*return ((Comparable) ((Map.Entry(o1)).getValue()).compareTo((Map.Entry(o2)).getValue()) )*/
						 return ((Comparable) ((Map.Entry) (o1)).getValue()) .compareTo(((Map.Entry) (o2)).getValue());
				
			}
		});
		
		HashMap<String, String> sortMap = new LinkedHashMap<String, String>();
		Iterator itr1 = list.iterator();
		
		
		for(Iterator itr = list.iterator(); itr.hasNext(); ) {
			Map.Entry<String, String> entry = (Entry<String, String>) itr.next();
			sortMap.put(entry.getKey() , entry.getValue());
		}
		
		return sortMap;
	}
	
	
	

}
