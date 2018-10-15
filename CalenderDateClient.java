import java.util.ArrayList;
import java.util.Collections;

public class CalenderDateClient {

	public static void main(String[] args) {
		
		ArrayList<CalendarDate> dates = new ArrayList<CalendarDate>();
		dates.add(new CalendarDate(2010,02,15));
		dates.add(new CalendarDate(1977,10,22));
		dates.add(new CalendarDate(2010,01,22));
		dates.add(new CalendarDate(1985,4,15));
		dates.add(new CalendarDate(1999,7,29));
		System.out.println(dates);
		
		Collections.sort(dates);
		System.out.println(dates);
		
	}

}
