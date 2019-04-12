package Collections;

import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

class Bclass {
	String firstName, lastName;
	
	
	public Bclass(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
}

public class LinkedHashSetExp {

	
	public static void main(String[] args) {
		
		Set<Bclass> set1 = new LinkedHashSet<Bclass>();
		
		Bclass b1 = new Bclass("bharathi","thangaraj");
		Bclass b2 = new Bclass("michael","jackson");
		Bclass b3 = new Bclass("prabu","deva");
		
		Collections.addAll(set1, b1,b2,b3);
		
		for(Bclass b: set1) {
			
			System.out.println(b.firstName +" : "+b.lastName);
		}
		
		
		

	}

}
