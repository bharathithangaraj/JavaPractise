package ArrayListFunctions;
/**
bharathi.thangaraj
 */
public class LetTryQuickSortAlgorithm {
	
	private int[] array;
	private int length ;

	
	public static void main(String[] args) {
		LetTryQuickSortAlgorithm quick = new LetTryQuickSortAlgorithm();
		
		int[] incompleteArr = {1,3,2,5,7,8,6,4};
		
		for(int i=0; i<incompleteArr.length; i++) {
			System.out.print(incompleteArr[i]);
			System.out.print(" ");
		}
		
		quick.letsSort(incompleteArr);
		for(int i=0; i<incompleteArr.length; i++) {
			System.out.print(incompleteArr[i]);
			System.out.print(" ");
		}
		
		
	}
	
	
	private void letsSort(int[] incompleteArr) {
		
		this.array = incompleteArr;
		int min = 0;
		int max = incompleteArr.length -1;
		doQuickSort(min,max);
		
	}
	
	private void doQuickSort(int lowIndex, int highIndex) {
		
		int i=lowIndex;
		int j = highIndex;
		
		int pivot = array[lowIndex+(highIndex-lowIndex)/2];
		
		System.out.println("pivot is ::"+pivot);
		
		while(i<=j) {
			
			while(array[i] < pivot) {
				i++;
			}
			while(array[j] > pivot) {
				j--;
			}
			
			if(i <= j) {
				swapElements(i,j);
				i++;
				j--;
			}
		
		}
		
		if( lowIndex < j) {
			doQuickSort(lowIndex,j);
		}
		if(i < highIndex) {
			doQuickSort(i, highIndex);
		}
		
		
	}
	
	private void swapElements(int i, int j) {
		
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
		
	}

}
