import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
bharathi.thangaraj
 */
public class TimeStamp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*long currentTimeinMillis = System.currentTimeMillis();
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
		
		Date resultdate = new Date(currentTimeinMillis);
		String date = sdf.format(resultdate);
		System.out.println(date);*/
		
		
		Date today = new Date();  

        Calendar calendar = Calendar.getInstance();  
        calendar.setTime(today);  

        calendar.add(Calendar.MONTH, 1);  
        calendar.set(Calendar.DAY_OF_MONTH, 1);  
        calendar.add(Calendar.DATE, -1);  

        Date lastDayOfMonth = calendar.getTime();  
        System.out.println(today.equals(today));

        DateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");  
        System.out.println("Today            : " + sdf.format(today));  
        System.out.println("Last Day of Month: " + sdf.format(lastDayOfMonth));  
	}

}
