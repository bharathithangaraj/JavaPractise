package RandomNoGenerations;

import java.util.Random;

/**
bharathi.thangaraj
 */
public class RandomNo {

	public static void main(String[] args) {
		
		Random random = new Random(2);
		int count = 0;
		
		while(true) {
			count ++;
			int i = random.nextInt(5);
			System.out.println("i is :"+i);
			if(i ==0) {
				break;
			}
			
		}
		System.out.println("count is :"+count);
		System.out.println(Math.random());

	}

}
