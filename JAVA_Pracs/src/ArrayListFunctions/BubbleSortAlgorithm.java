package ArrayListFunctions;

import java.util.Arrays;

/**
bharathi.thangaraj
 */
public class BubbleSortAlgorithm {

	
	public static void main(String[] args) {
		
		int[] arr = {1,5,3,6,7,10};
		int temp = 0;
		
		for(int i =0; i<arr.length; i++) {
			
			int  index = i;
			for(int j = i+1; j<arr.length-i; j++) {
				
				if(arr[index] > arr[j]) {
						index = j;
				}
				
				temp = arr[index];
				arr[index] = arr[i];
				arr[i] = temp;
			}
			
		}
		
		System.out.println(Arrays.toString(arr));

	}

}
