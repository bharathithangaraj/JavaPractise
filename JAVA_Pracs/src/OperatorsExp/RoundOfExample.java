package OperatorsExp;

import java.text.DecimalFormat;

public class RoundOfExample {
	
	static double d = 13.34343;
	
	static DecimalFormat df = new DecimalFormat("##.###");
	
	public static void main(String args[]) {
		System.out.println(df.format(d));
	}

}
