import java.util.*;

public class exer005_date_time {
	public static void main(String args[]) {
		int mm, dd, yy;
		int hh, mn, ss;
		
		GregorianCalendar gc = new GregorianCalendar();
		
		mm = gc.get(Calendar.MONTH);
		dd = gc.get(Calendar.DAY_OF_MONTH);
		yy = gc.get(Calendar.YEAR);
		
		hh = gc.get(Calendar.HOUR);
		mn = gc.get(Calendar.MINUTE);
		ss = gc.get(Calendar.SECOND);
		
		System.out.println("Calendar Date is " + mm + "/" + dd + "/" + yy);
		System.out.println("Execute Time is " + hh + ":" + mn + ":" + ss);
	}
}
