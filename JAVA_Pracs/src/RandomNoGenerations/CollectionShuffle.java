package RandomNoGenerations;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
bharathi.thangaraj
 */
public class CollectionShuffle {

	
	public static void main(String[] args) {
		
		List list1 = new ArrayList();
		
		for(int i=0; i<10; i++) {
			list1.add(new Integer(i));
		}

		System.out.println(list1);
		Collections.shuffle(list1);
		
		Collections.shuffle(list1);
		System.out.println(list1);
		
		for (int i=0; i<4; i++) {
            System.out.println("Random Number= "+(list1.get(i)));
        }
		
	}

}
