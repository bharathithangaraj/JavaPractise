package Operators;

import java.io.IOException;

class Sub extends OverRidingExp {
	
	public Sub(){
		System.out.println("sub");
	}
	
}


public class OverRidingExp {
	
	public OverRidingExp() {
		System.out.println("override");
	}
	
	
	public static void main(String[] args) {
		new OverRidingExp();
	}

}
