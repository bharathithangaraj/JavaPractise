package Coolection;

import java.util.Collection;
import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

public class CustomTreeMap {

	public static void main(String[] args) {
		TreeMap<Employee, String> map= new TreeMap<Employee, String>(new FirstName());
		map.put(new Employee("sri", "first"), "bha");
		 map.put(new Employee("de1", "second"), "valuej2");
		 map.put(new Employee("sri", "third"), "value3");
		 map.put(new Employee("de", "third"), "value4");
		 map.put(new Employee("sri", "fourth"), "value4");
		
		System.out.println(map);
		
		SortedMap sort = new SortedMap<Employee, String>() {

			@Override
			public int size() {
				// TODO Auto-generated method stub
				return 0;
			}

			@Override
			public boolean isEmpty() {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public boolean containsKey(Object key) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public boolean containsValue(Object value) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public String get(Object key) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public String put(Employee key, String value) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public String remove(Object key) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public void putAll(Map<? extends Employee, ? extends String> m) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void clear() {
				// TODO Auto-generated method stub
				
			}

			@Override
			public Comparator<? super Employee> comparator() {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public SortedMap<Employee, String> subMap(Employee fromKey,
					Employee toKey) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public SortedMap<Employee, String> headMap(Employee toKey) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public SortedMap<Employee, String> tailMap(Employee fromKey) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public Employee firstKey() {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public Employee lastKey() {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public Set<Employee> keySet() {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public Collection<String> values() {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public Set<java.util.Map.Entry<Employee, String>> entrySet() {
				// TODO Auto-generated method stub
				return null;
			}
		};
		
		//TreeMap<Employee, String> map1 = new TreeMap<Employee, String>(map);
		
		

	}

}

class FirstName implements Comparator<Employee> {
	@Override
    public int compare(Employee e1, Employee e2) {
    	//System.out.println(str1);
        return e1.getFirstname().compareTo(e2.getFirstname());
    }
	
}

class Employee {
	String firstname;
	String secName;
	
	public Employee(String firstname, String secName) {
		this.firstname = firstname;
		this.secName =  secName;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getSecName() {
		return secName;
	}
	public void setSecName(String secName) {
		this.secName = secName;
	}
	
	public int hashCode() {
		int hashCode = 0;
		
		hashCode = firstname.hashCode();
		hashCode += secName.hashCode();
		
		return hashCode;
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof Employee) {
			Employee em = (Employee)obj;

			return (em.firstname.equals(this.firstname) && em.secName.equals(this.secName));
			
		} else {
			 return false;
		}
	}
	
	
	public String toString() {
		return firstname+":"+secName;
	}
	
	
	
}
