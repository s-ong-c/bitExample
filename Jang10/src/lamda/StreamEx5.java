package lamda;

import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamEx5 {
	public static void main(String[] args) {
		String [ ] strArr = {
				"Inheritance","Java"//,"Lamda","stream",
				//"OptionalDouble","IntStream","count","sum","zxa"		
		};
		Stream.of(strArr).forEach(System.out::println);
		
		boolean noEmptyStr = Stream.of(strArr).noneMatch(s->s.length()==0);
		Optional<String> sWord = Stream.of(strArr)
												.filter(s->s.charAt(0)=='J').findFirst();  // ���� s�� ���۵Ǵ� �� ã�ƶ� ù��°�� 
		
		
		System.out.println("noEmptyStr="+noEmptyStr);
		System.out.println("sWord="+sWord.get());  // 
		
		IntStream intStream1 = Stream.of(strArr).mapToInt(String::length);
		IntStream intStream2 = Stream.of(strArr).mapToInt(String::length);
		IntStream intStream3 = Stream.of(strArr).mapToInt(String::length);
		IntStream intStream4 = Stream.of(strArr).mapToInt(String::length);
		
		int count = intStream1.reduce(0, (a,b)->a+1);	 // count++
		int sum = intStream2.reduce(0, (a,b)->a+b);	 // 
										//�ʱⰪ , ���� 
		
		
		OptionalInt max = intStream3.reduce(Integer::max); // 
		OptionalInt min = intStream4.reduce(Integer::min);  // ���� ����
		
		System.out.println("count= "+count);
		System.out.println("sum="+sum);
		System.out.println("max="+max.getAsInt());
		System.out.println("min="+min.getAsInt());
	}
}
