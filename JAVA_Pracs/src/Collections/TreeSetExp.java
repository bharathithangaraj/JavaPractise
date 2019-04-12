package Collections;

import java.util.Collections;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

/**
 * 
 * provide ascending order by default;
 * if you using customized object then you have give your own order by implement comparator or comparable interface
 *
 */

class Aclass{
	String firstName,  lastName;
	public Aclass(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	
	
	
}

class MyComparator implements Comparator<Aclass> {

	@Override
	public int compare(Aclass o1, Aclass o2) {
		
		if(o1.getFirstName().compareTo(o2.getFirstName()) > 0) {
			return 1;
			
		}
		if(o1.getFirstName().compareTo(o2.getFirstName()) < 0) {
			return -1;
			
		}
		if(o1.getLastName().compareTo(o2.getLastName()) > 0) {
			return 1;
			
		}
		if(o1.getLastName().compareTo(o2.getLastName()) < 0) {
			return -1;
			
		}	
		else {
			return 0;
		}
		
	}
	
}

public class TreeSetExp {

	
	public static void main(String[] args) {
		
		Set<Aclass> set1 = new TreeSet<Aclass>(new MyComparator());
		
		Aclass b1 = new Aclass("bharathi","thangaraj");
		Aclass b2 = new Aclass("michael","jackson");
		Aclass b3 = new Aclass("prabu","deva");
		
		set1.add(b1);
		set1.add(b2);
		set1.add(b3);
		
		for(Aclass b: set1) {
			
			System.out.println(b.firstName +" : "+b.lastName);
		}

	}

}
