package ArrayListFunctions;

import java.util.ArrayList;
import java.util.List;

/**
bharathi.thangaraj
 */
public class TowerOfHanoi {

	
	public static void main(String[] args) {
		
		TowerOfHanoi towersOfHanoi = new TowerOfHanoi();
		
		towersOfHanoi.TOH(3, "A", "B", "C");

	}
	
	void TOH(int n, String start, String aux, String end) {
		
		if(n == 1) {
			System.out.println(start + " -> " + end);
		} else {
			TOH(n - 1, start, end, aux);
			System.out.println(start + " ----> " + end);
			 TOH(n - 1, aux, start, end);
		}
		
	}
	
	
	
	
	

}
