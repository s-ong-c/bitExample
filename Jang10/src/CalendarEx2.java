import java.util.Calendar;

public class CalendarEx2 {
	public static void main(String[] args) {
		
		
		final String[] DAY_OF_WEEK= {"","��","��","ȭ","��","��","��","��"};
		
		Calendar date1 = Calendar.getInstance();
		Calendar date2 = Calendar.getInstance();
		
		date1.set(2017, 6,22);
		System.out.println(toString(date1)+"��"+DAY_OF_WEEK[date1.get(Calendar.DAY_OF_WEEK)]+"�����̴�");
		
		System.out.println(toString(date2)+"��"+DAY_OF_WEEK[date2.get(Calendar.DAY_OF_WEEK)]+"�����̴�");
		
		long difference =
					(date2.getTimeInMillis() -date1.getTimeInMillis());
		
		System.out.println(difference/1000+"�ʰ� ������");
		
		System.out.println(difference/(60*60*24*1000));
		
	}

	public static String toString(Calendar date) {
		
		return date.get(Calendar.YEAR)+"��"+(date.get(Calendar.MONTH)+1)+"��"+date.get(Calendar.DATE)+"��";
	}
	
}