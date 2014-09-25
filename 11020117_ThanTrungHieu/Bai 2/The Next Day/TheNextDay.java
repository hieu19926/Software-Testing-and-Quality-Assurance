package test;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TheNextDay {
	public TheNextDay() {
		// TODO Auto-generated constructor stub
	}
	public String nextDay(String ddMMYYYY){
		DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
	    java.util.Date date1 = new Date();
		try {
			date1 = df.parse(ddMMYYYY);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    Calendar cal1 = Calendar.getInstance();
	    cal1.setTime(date1);
	    cal1.add(Calendar.DATE, 1);
	    System.out.println(df.format(cal1.getTime()));
	    return df.format(cal1.getTime());
	}
}
