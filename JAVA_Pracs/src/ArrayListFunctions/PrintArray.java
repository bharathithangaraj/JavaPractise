package ArrayListFunctions;

import java.util.Arrays;

public class PrintArray {
	
	public static void main(String args[]){
		int[] arr = new int[10];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = i;
		}
		
		System.out.println(Arrays.toString(arr));
		
		 int[][] array = new int[][]{{1,2,3},{11,12,13},{4 ,5,6}};
		 
		 System.out.println(Arrays.deepToString(array));
	}

}
