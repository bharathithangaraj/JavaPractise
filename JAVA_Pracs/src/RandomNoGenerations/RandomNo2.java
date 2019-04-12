package RandomNoGenerations;

import java.util.Random;

/**
bharathi.thangaraj
 */
public class RandomNo2 {

	public static void main(String[] args) {
		
		int  min = 1;
		int max = 10;
		
		int range = max-min +1;
		Random rn = new Random();
		int randomNum = rn.nextInt(range)+min;
		System.out.println(randomNum);
		
		int randomNum2 = min+(int)(Math.random()*max);
		System.out.println(randomNum2);
		
		int math = 11+(int)(Math.random()*20);
		System.out.println(math);

	}

}
