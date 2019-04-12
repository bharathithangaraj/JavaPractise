import java.util.ArrayList;
import java.util.List;

/**
bharathi.thangaraj
 */
public class Test {
	
	public static void main(String args[]) {
		
		int arr[] = {2, 2, 2, 4, 4, 8, 8, 8, 8, 7, 7};
		
		List<Integer> list = new ArrayList<Integer>();
		
		Integer val  = 0;
		int j = 0;
		for(int i=0; i<arr.length; i++) {
			
		//	Integer val = arr[i];
			
			if(val != arr[i]) {
				
				if( j != 0) {
					
					list.add(j);
					list.add(val);
				}
				j=0;
				
				val = arr[i];
				
				
				j++;
			}  else {
				j++;
			}
			
			if(i == arr.length-1) {
				list.add(j);
				list.add(val);
			}
		}
		//new File("test");
		System.out.println(list);
	}

}
