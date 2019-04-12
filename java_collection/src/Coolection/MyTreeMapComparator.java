package Coolection;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeMap;

public class MyTreeMapComparator {
    
    /**
     * @param a
     */
    public static void main(String a[]){
        //the treemap sorts by key
    	
    	TreeMap<Price,String> map = new TreeMap<Price, String>(new MyComp());
     
    	
    	 map.put(new Price("sri", "first"), "bha");
		 map.put(new Price("de1", "second"), "valuej2");
		 map.put(new Price("sri", "third"), "value3");
		 map.put(new Price("de", "third"), "value4");
		 map.put(new Price("sri", "fourth"), "value4");
        System.out.println(map);
       
    }
    
    
    
}
 
class MyComp implements Comparator<Price>{
 
    @Override
    public int compare(Price p1, Price p2) {
    	//System.out.println(str1);
        return p1.getItem().compareTo(p1.getItem());
    }
     
}


class Price {
	
	String item;
	String price;
	
	Price (String item, String price) {
		this.item= item;
		this.price = price;
	}
	
	/*public int hashCode() {
		int hashCode = 0;
		hashCode = item.hashCode();
		hashCode += price.hashCode();
		
		return hashCode;
	}*/
	
	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	/*public boolean equals(Object obj) {
		//System.out.println("Object equals coming");
		if(obj instanceof Price) {
			Price pp = (Price)obj;
			//System.out.print("equals item :"+pp.item);
			//System.out.println(": equals price :"+pp.price);
			return (pp.item == this.item && pp.price.equals(this.price));
		}
		else {
			return false;
		}
		
	}*/
	
	 public String getItem() {
	        return item;
	    }
	    public void setItem(String item) {
	        this.item = item;
	    }

	
	public String toString() {
		String test = "item :"+item + " price "+price;
		//System.out.println("toString method :"+test);
		return item+":"+price ;
	}
}
