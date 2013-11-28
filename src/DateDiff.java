import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


public class DateDiff {
	
	public Integer getDateDifference(String d1, String d2) throws ParseException  {
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		
		 Date date1 = df.parse(d1);
	        Date date2 =  df.parse(d2);
	        Calendar cal1 = Calendar.getInstance();
	        Calendar cal2 = Calendar.getInstance();
	        cal1.setTime(date1);
	        cal2.setTime(date2);
	 
	        int numberOfDays = 0;
	        while (cal1.before(cal2)) {
	            numberOfDays++;
	            cal1.add(Calendar.DATE,1);
	        }
	    
		
		return numberOfDays;
	}

}
