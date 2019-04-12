package Coolection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;
 
public class MyTMCompUserDefine1 {
 
    public static void main(String a[]){
        //By using name comparator (String comparison)
        HashMap<Empl,String> tm = new HashMap<Empl, String>();
        tm.put(new Empl("Ram","seetha"), "RAM");
        tm.put(new Empl("Ram","sunny"), "JOHN");
        tm.put(new Empl("John","parva"), "CRISH");
        tm.put(new Empl("Ram","mia"), "TOM");
        Set<Empl> keys = tm.keySet();
        for(Empl key:keys){
            System.out.println(key+" ==> "+tm.get(key));
        }

        
        Map<String, String> sortvalMap = sortedByVal(tm);
        System.out.println(sortvalMap);
        
        LinkedList<Empl> list = new LinkedList<Empl>();
        
		for(Iterator itr = sortvalMap.entrySet().iterator(); itr.hasNext();) {
			Map.Entry<Empl, String> entry = (Map.Entry)itr.next();
			list.add(entry.getKey());
			System.out.println("Sort Key :"+entry.getKey() + " SortedVal :"+entry.getValue());
		}
		
		System.out.println(list);
		
		/*Collections.sort(list, new Comparator<Empl>() {
			 public int compare(Empl e1, Empl e2) {
				 return e1.getName().compareTo(e2.getName());
		        }
		});*/
		
		Collections.sort(list, new Comparator<Empl>() {
			 public int compare(Empl e1, Empl e2) {
				 return e1.getSecName().compareTo(e2.getSecName());
		        }
		});
		
		Collections.sort(list, new Comparator<Empl>() {
			 public int compare(Empl e1, Empl e2) {
				 return e1.getName().compareTo(e2.getName());
		        }
		});
		
		System.out.println(list);
       
        System.out.println("===================================");
        //By using salary comparator (int comparison)
        /*TreeMap<Empl,String> trmap = new TreeMap<Empl, String>(new MySalaryComp());
        trmap.put(new Empl("Ram",3000), "RAM");
        trmap.put(new Empl("John",6000), "JOHN");
        trmap.put(new Empl("Crish",2000), "CRISH");
        trmap.put(new Empl("Tom",2400), "TOM");
        Set<Empl> ks = trmap.keySet();
        for(Empl key:ks){
           // System.out.println(key+" ==> "+trmap.get(key));
        }*/
    }
    
private static Map sortedByVal(Map map) {
		
		List list  = new LinkedList(map.entrySet());
		
		Collections.sort(list, new Comparator(){
			public int compare(Object o1, Object o2) {
				/*return ((Comparable) ((Map.Entry(o1)).getValue()).compareTo((Map.Entry(o2)).getValue()) )*/
						 return ((Comparable) ((Map.Entry) (o1)).getKey()) .compareTo(((Map.Entry) (o2)).getKey());
				
			}
		});
		
		HashMap<Empl, String> sortMap = new LinkedHashMap<Empl, String>();
		Iterator itr1 = list.iterator();
		
		
		for(Iterator itr = list.iterator(); itr.hasNext(); ) {
			Map.Entry<Empl, String> entry = (Entry<Empl, String>) itr.next();
			sortMap.put(entry.getKey() , entry.getValue());
		}
		
		return sortMap;
	}
}
 
/*class MyNameComp implements Comparator<Empl>{
 
    @Override
    public int compare(Empl e1, Empl e2) {
        return e1.getName().compareTo(e2.getName());
    }
}
 
class MySalaryComp implements Comparator<Empl>{
 
    @Override
    public int compare(Empl e1, Empl e2) {
        if(e1.getSalary() > e2.getSalary()){
            return 1;
        } else {
            return -1;
        }
    }
}*/
 
class Empl{
     
    private String name;
    private String secName;
     
    public Empl(String n, String s){
        this.name = n;
        this.secName = s;
    }
    
    public int hashCode() {
	int hashCode = 0;
	hashCode = secName.hashCode();
	hashCode += name.hashCode();
	
	return hashCode;
    }
    
    public boolean equals(Object obj) {
		//System.out.println("Object equals coming");
		if(obj instanceof Price) {
			Empl pp = (Empl)obj;
			//System.out.print("equals item :"+pp.item);
			//System.out.println(": equals price :"+pp.price);
			return (pp.name.equals(this.name) && pp.secName.equals(this.secName));
		}
		else {
			return false;
		}
		
	}
     
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    
    public String getSecName() {
		return secName;
	}

	public void setSecName(String secName) {
		this.secName = secName;
	}

	public String toString(){
        return this.name+":"+this.secName;
    }
}
