package Coolection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class CustomKeyMap {

	public static void main(String[] args) {
		 Map map = new HashMap<Price, String>();
		 map.put(new Price(10, "first"), "bha");
		 map.put(new Price(11, "second"), "valuej2");
		 map.put(new Price(12, "third"), "value3");
		 map.put(new Price(12, "third"), "value4");
		 map.put(new Price(13, "fourth"), "value4");
		 
		 for(Iterator<Price> iter = map.entrySet().iterator(); iter.hasNext();){
			 Map.Entry<Price, String> keySet = (Entry<Price, String>) iter.next();
			 System.out.println("iter key :"+keySet.getKey()+": value :"+keySet.getValue());
		 }
		 
		 
	 System.out.println(map.get(new Price(12, "third")));
		 
		/* for(Iterator<Price> itr = map.keySet().iterator(); itr.hasNext();) {
			
			 System.out.println(map.get(itr.next()));
		 }*/

	}

}

/*class Price {
	
	int item =0;
	String price;
	
	Price (int item, String price) {
		this.item= item;
		this.price = price;
	}
	
	public int hashCode() {
		int hashCode = 0;
		hashCode = item*20;
		hashCode += price.hashCode();
		
		return hashCode;
	}
	
	public boolean equals(Object obj) {
		System.out.println("Object equals coming");
		if(obj instanceof Price) {
			Price pp = (Price)obj;
			System.out.print("equals item :"+pp.item);
			System.out.println(": equals price :"+pp.price);
			return (pp.item == this.item && pp.price.equals(this.price));
		}
		else {
			return false;
		}
		
	}
	
	
	public String toString() {
		String test = "item :"+item + " price "+price;
		System.out.println("toString method :"+test);
		return "item :"+item + " price "+price ;
	}
}
*/