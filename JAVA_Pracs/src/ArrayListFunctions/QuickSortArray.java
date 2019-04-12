package ArrayListFunctions;
/**
bharathi.thangaraj
 */
public class QuickSortArray {

	private int array[];
	private int length;

	public static void main(String[] args) {
		QuickSortArray quicksort = new QuickSortArray();

		int[] inputarray = {1,2,3,8,5,6,7,4};

		System.out.println("Before sorting");
		for(int i:inputarray){
			System.out.print(i);
			System.out.print(" ");
		}

		quicksort.sortElements(inputarray);
		
		System.out.println("After sorting");
        for(int i:inputarray){
            System.out.print(i);
            System.out.print(" ");
        }
    

	}

	public void sortElements(int[] arrayValues) {

		if (arrayValues == null || arrayValues.length == 0) {
			return;
		}

		this.array = arrayValues;
		length = arrayValues.length;
		System.out.println("lenth is :"+length);
		doQuickSort(0,length-1);
		
		

	}

	private void doQuickSort(int min , int max) {
		int i = min;
		int j = max;

		int pivot = array[min+(max-min)/2];
		

		//now Divide the array into two arrays(actually we are maintaining single array only)

		while(i<=j) {

			while(array[i] < pivot) {
				i++;
			}
			while(array[j] > pivot) {
				j--;
			}
			
			if (i <= j) { 
				swapElements(i, j);
				i++;
				j--;

			}

		}
		
		// call quickSort() method recursively
        if (min < j){
         
         doQuickSort(min, j);
        }
        if (i < max){
         
         doQuickSort(i, max);
            
        }
	}
	
	private void swapElements(int i, int j) {

        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;

 }

}
