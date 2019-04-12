package Coolection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;


public class Treemaptest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Map<NameSort,String> map = new TreeMap<NameSort, String>(new NameSort());/*new Comparator<NameSort>() {

			@Override
			public int compare(NameSort o1, NameSort o2) {
				// TODO Auto-generated method stub
				return o1.getFirstName().compareTo(o2.getFirstName());
			}
		});*/
	
		map.put(new NameSort("abc","test0"), "1");
		//map.put(new NameSort("test","test1"), "1");
		
		map.put(new NameSort("abc","test2"), "1");
		map.put(new NameSort("sri","test0"), "1");
		map.put(new NameSort("sri","test8"), "1");
		map.put(new NameSort("sri","test4"), "1");
		map.put(new NameSort("sri","test2"), "1");
		
		map.put(new NameSort("rrr","test"), "1");
		
		map.put(new NameSort("rrr","test0"), "1");
		/*map.put(new NameSort("rrr","test"), "1");*/
		System.out.println(map);
		
	}

}

class NameSort implements Comparator<NameSort> {
	
	String firstName;
	String lastname;
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	
	public NameSort(String firstName, String lastname) {
		this.firstName = firstName;
		this.lastname = lastname;
		
	}
	
	public NameSort(){
		
	}
	
	public int hashCode() {
		
		int hashCode = 0;
		hashCode = firstName.hashCode();
		hashCode += lastname.hashCode();
		System.out.println("hashCode"+hashCode);
		return hashCode;
		
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof NameSort) {
			NameSort n1 = (NameSort)obj;
			return n1.firstName.equals(this.firstName) && n1.lastname.equals(this.lastname);
		}
		return false;
	}
	
	@Override
	public String toString() {
		return firstName +":"+lastname;
	}
	@Override
	public int compare(NameSort o1, NameSort o2) {
		// TODO Auto-generated method stub
		if(o1.getFirstName().compareTo(o2.getFirstName())>0 || o1.getLastname().compareTo(o2.getLastname())>0)
		{
			System.out.println(o1.getFirstName().compareTo(o2.getFirstName()));
			System.out.println(o1.getLastname().compareTo(o2.getLastname()));
			System.out.println("1 ::"+o1.getFirstName()+":"+o2.getFirstName());
			System.out.println("1 ::"+o1.getLastname()+":"+o2.getLastname());
			return 1;
		}
			
		else if(o1.getFirstName().compareTo(o2.getFirstName())<0 || o1.getLastname().compareTo(o2.getLastname())<0)
		{
			System.out.println(o1.getFirstName().compareTo(o2.getFirstName()));
			System.out.println(o1.getLastname().compareTo(o2.getLastname()));
			System.out.println("2 ::"+o1.getFirstName()+":"+o2.getFirstName());
			System.out.println("2 ::"+o1.getLastname()+":"+o2.getLastname());
			return -1;
		}
			
		else
		{
			System.out.println("3 ::"+o1.getFirstName()+":"+o2.getFirstName());
			System.out.println("3 ::"+o1.getLastname()+":"+o2.getLastname());
			return 0;
		}
			
	}
	
}



