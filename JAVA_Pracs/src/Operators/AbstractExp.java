package Operators;
/**
bharathi.thangaraj
 */
class AmstractImp extends AbstractExp {

	@Override
	public String test() {
		String oo ="dsjflksdfjlsdf";
		return oo;
		
	}
	
	public AmstractImp(){
		
	}
	
	
	
}

public abstract class AbstractExp {
	
	private String test = "rrr";
	
	public abstract String test () ;
	
	public String test1(){
		return "";
	}
	
	public static void main(String args[]) {
		AmstractImp amp = new AmstractImp();
		String tt = amp.test();
		System.out.println(tt);
	}

}
