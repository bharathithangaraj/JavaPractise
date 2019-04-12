package Operators;


class CloneClass implements Cloneable {
	
	int i = 9;
	
	public Object clone() throws CloneNotSupportedException{
		
		return super.clone();
	}
	
}

public class CloneableExp {

	
	public static void main(String[] args) {
		
		CloneClass c1 = new CloneClass();
		
		try {
			CloneClass c2 = (CloneClass)c1.clone();
			System.out.println(c2.i);
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
