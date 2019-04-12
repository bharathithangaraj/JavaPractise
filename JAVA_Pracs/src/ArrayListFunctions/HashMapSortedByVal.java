package ArrayListFunctions;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapSortedByVal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Map<String,String> map = new HashMap<String , String>();
		List<String> list1 = new ArrayList<String>();
		List<String> list2 = new ArrayList<String>();
		
		map.put("emp1", "234");
		map.put("emp2", "34");
		map.put("emp3", "234");
		map.put("emp4", "65");
		
		for(Entry<String, String> entry:map.entrySet()) {
			list1.add(entry.getKey());
			list2.add(entry.getValue());
			
		}
		
		Collections.sort(list2);
		//Collections.sort(list1);
		System.out.println(list2);
		
		Map<String,String> sortedMap = new LinkedHashMap<String, String>();
		
		Iterator<String> valueIt = list2.iterator();
		
		while(valueIt.hasNext()) {
			
			String value = valueIt.next();
			
			Iterator<String> keyIt = list1.iterator();
			
			while(keyIt.hasNext()) {
				
				String key = keyIt.next();
				
				String getVal = map.get(key);
				
				if(value.equals(getVal)) {
					
					sortedMap.put(key, value);
				}
				
			}
			
			
		}
		
		System.out.println(sortedMap);

	}

}

