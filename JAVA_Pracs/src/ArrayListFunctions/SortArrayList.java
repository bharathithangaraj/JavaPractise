package ArrayListFunctions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


class Employee {
	String firstName, lastName;
	public Employee(String firstName , String lastName) {
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
	
	public String toString() {
		return "first :"+this.firstName+ ": last :"+this.lastName;
	}
	
	
}

class MyComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		
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
		else 
			return 0;
		
	}
	
}

class Students implements Comparable<Students> {
	String name;
	
	public Students(String name) {
		this.name = name;
	}

	@Override
	public int compareTo(Students s1) {
		
		 return this.name.compareTo(s1.name);
	}
	
	public String toString() {
		return "name :"+name; 
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}

public class SortArrayList {

	public static void main(String[] args) {
		
		Employee emp1 = new Employee("bharathi" , "thangaraj");
		Employee emp2 = new Employee("michael" , "jackson");
		Employee emp3 = new Employee("justin" , "timberkle");
		Employee emp4 = new Employee("justin" , "bieber");
		
		ArrayList<Employee> list1= new ArrayList<Employee>();
		Collections.addAll(list1, emp1, emp2,emp3,emp4);
		
		Collections.sort(list1, new MyComparator());
		
		System.out.println(list1.toString());
		
		Collections.sort(list1, new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				
				if(o1.getFirstName().compareTo(o2.getFirstName()) > 0) {
					
					return -1;
				}
				if(o1.getFirstName().compareTo(o2.getFirstName()) < 0) {
					
					return 1;
				}
				if(o1.getLastName().compareTo(o2.getLastName()) > 0) {
					
					return -1;
				}
				if(o1.getLastName().compareTo(o2.getLastName()) < 0) {
					
					return 1;
				}	
				else 
					return 0;
			}
			
			
		});
		
		System.out.println(list1.toString());
		
		List<Students> list2 = new ArrayList<Students>();
		
		Students s1 = new Students("bharathi");
		Students s2 = new Students("Usher");
		Students s3 = new Students("michael");
		Students s4 = new Students("zoho");
		Collections.addAll(list2, s1, s2,s3,s4);
		
		Collections.sort(list2);
		
		System.out.println(list2);

	}

}
