package ArrayListFunctions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
bharathi.thangaraj
 */
public class FindMissingNoArray {


	public static void main(String[] args) {
		int a[]= {1,75,100};
		findMissingNumber(a);

	}

	private static void findMissingNumber(int[] missedNumber){
		try {
			
			
			for(int i=0; i<missedNumber.length; i++) {
				
				int index=i;
				
				for(int j=1+i; j<missedNumber.length-i; j++) {
					if(missedNumber[j] < missedNumber[index]){
						index = j;
					}
					
				}
				int minimum = missedNumber[index];
				missedNumber [index] = missedNumber[i];
				missedNumber[i] = minimum;
			}
			System.out.println(Arrays.toString(missedNumber));
			System.out.println(missedNumber[missedNumber.length-1]);

			int bucketArray[] = new int[missedNumber[missedNumber.length-1]];
			System.out.println(" length :"+bucketArray.length);

			int count =missedNumber[0];
			System.out.println(count);
			int start = 0; 
			for(int i = missedNumber[0]; i<bucketArray.length; i++) {

				bucketArray[start++]= ++count;

			}
			System.out.println(Arrays.toString(bucketArray));
			
			List set = new ArrayList();

			aa:
				for(int i=0; i<bucketArray.length; i++) {

					bb:
						for(int j=0; j< missedNumber.length; j++) {

							if(bucketArray[i] == missedNumber[j]) {
								break bb;
							}

							if(bucketArray[i] != missedNumber[j]){
								if(j == missedNumber.length-1 ) {
									set.add(bucketArray[i]);
								}
							}

						}

				}

			System.out.println(set);

		}catch(Exception ex) {
			ex.printStackTrace();
		}
	}

}
