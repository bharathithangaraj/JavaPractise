package Operators;

public class UpDownCasting {

	
	public static void main(String[] args) {
		
		UpDownCasting up = new UpDownCasting();
		Object obj = up;
		System.out.println(obj.getClass());
		UpDownCasting up1 = (UpDownCasting)obj;

	}

}
