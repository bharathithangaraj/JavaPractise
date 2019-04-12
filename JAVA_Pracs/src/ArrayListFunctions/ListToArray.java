package ArrayListFunctions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListToArray {

	 
	
	public static void main(String[] args) {
		
		List<Integer> arrayList = new ArrayList<Integer>();
		Collections.addAll(arrayList, 1,3,4,5,6,7,8);
		
		Integer[] obj= arrayList.toArray(new Integer[arrayList.size()]);
		
		for(int arrObj = 0; arrObj<obj.length; arrObj++) {
			System.out.println(obj[arrObj]);
		}
		
		int arrConvert[] = new int[arrayList.size()];
		
		int count = 0;
		for(Integer arr : arrayList) {
			arrConvert[count++] = arr;
		}
		
		for(int i=0; i<arrConvert.length; i++) {
			System.out.println(arrConvert[i]);
		}
		

	}

}
