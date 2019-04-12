package PrintF;

public class PrintVsPrintF {

	
	public static void main(String[] args) {
		
		String str = "java printf";
		System.out.println(" printed "+str);
		System.out.printf("test %s", str);
		
		/*%c - char
		%d - decimal
		%e - exponential floating point no
		%f - float
		%i - integer
		%o - octael no
		%s - string
		%x - hexa deciaml
		%% - print percentsign*/
		
		 double value=12.539344;
		 System.out.printf("test %.3f", value);
		 
		 Integer integer = 10;
		 
		 System.out.printf(" %3d", integer);
		
		

	}

}
