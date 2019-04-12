package ArrayListFunctions;

import java.util.Arrays;

/**
bharathi.thangaraj
 */
public class SelectionSortAlogorithm {


	public static void main(String[] args) {
		SelectionSortAlogorithm sort = new SelectionSortAlogorithm();
		int[] array = {44,22,5,67,98,23};

		for(int i =0; i< array.length; i++) {
			System.out.print(array[i]);
			System.out.print(" ");
		}

		array=	sort.sortFunction(array);
		System.out.println(Arrays.toString(array));
		for(int i =0; i< array.length; i++) {

			System.out.print(array[i]);
			System.out.print(" ");
		}


	}

	int[] sortFunction(int[] array) {

		for (int i = 0; i < array.length - 1; i++)
		{
			int index = i;

			for (int j = i + 1; j < array.length; j++) {
				if(array[j] < array[index]) {
					index = j;
				}
			}

			int minimunNumber = array[index];
			array[index] = array[i];
			array [i] = minimunNumber;


		}
		return array;
	}

}
