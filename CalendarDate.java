public class CalendarDate implements Comparable<CalendarDate>{

	private int year;
	private int month;
	private int day;
	
	public CalendarDate(int year, int month, int day) {
		this.year = year;
		this.month = month;
		this.day = day;
	}
	
	//Getters
	public int getYear() {
	return year;	
	}
	
	public int getMonth() {
		return month;
	}
	
	public int getDay() {
		return day;
	}
	
	//Setters
	public void setYear(int newYear) {
		year = newYear;
	}
	
	public void setMonth(int newMonth) {
		month = newMonth;
	}
	
	public void setDay(int newDay) {
		day = newDay;
	}
	
	//toString
	public String toString() {
		return "" + year + "-" + month + "-" + day + "";
	}

	public int compareTo(CalendarDate o) {
		if (year < o.getYear()) {
			return -1;
		} else if (year > o.getYear()) {
			return 1;
		} else {
			if (month < o.getMonth()) {
				return -1;
			} else if (month > o.getMonth()) {
				return 1;
			} else {
				if (day < o.getDay()) {
					return -1;
				} else if (day > o.getDay()) {
					return 1;
				} else {
					return 0;
				}
			}
		}
	}
}
