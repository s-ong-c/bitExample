import java.util.Calendar;

public class CalendarEx2 {
	public static void main(String[] args) {
		
		
		final String[] DAY_OF_WEEK= {"","일","월","화","수","목","금","토"};
		
		Calendar date1 = Calendar.getInstance();
		Calendar date2 = Calendar.getInstance();
		
		date1.set(2017, 6,22);
		System.out.println(toString(date1)+"은"+DAY_OF_WEEK[date1.get(Calendar.DAY_OF_WEEK)]+"요일이다");
		
		System.out.println(toString(date2)+"은"+DAY_OF_WEEK[date2.get(Calendar.DAY_OF_WEEK)]+"요일이다");
		
		long difference =
					(date2.getTimeInMillis() -date1.getTimeInMillis());
		
		System.out.println(difference/1000+"초가 지났다");
		
		System.out.println(difference/(60*60*24*1000));
		
	}

	public static String toString(Calendar date) {
		
		return date.get(Calendar.YEAR)+"년"+(date.get(Calendar.MONTH)+1)+"월"+date.get(Calendar.DATE)+"일";
	}
	
}
