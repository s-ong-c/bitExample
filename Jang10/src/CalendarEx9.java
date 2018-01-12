public class CalendarEx9 {
	public static void main(String[] args) {
		System.out.println(getDayOfWeek(2014,5,31));

	}
	public static int[ ] endOfMonth= {31,28,31,30,31,30,
			31,31,30,31,30,31};

	public static boolean isLeapYear(int year) {
		// TODO Auto-generated method stub
		return false;
	}
	public static int getDayOfWeek(int year, int month, int day) {

		return 0;
	}
	public static String convertDayToDate(int day) {
		int year=1;
		int month=0;
		
		
		while(true) {
			int aYear = isLeapYear(year)? 366:365;
			if(day >aYear) {
				day-= aYear;
				year++;
			}else {
				break;
				
			}
			
		}
		while(true) {
			int endDay = endOfMonth[month];

			if(isLeapYear(year) &&month==1)endDay++;
			if(day >endDay) {
				day-= endDay;
				month++;
			}else {
				break;
				
			}
			
		}

		return year+"-"+(month+1)+"-"+day;
	}


}