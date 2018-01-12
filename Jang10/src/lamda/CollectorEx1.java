package lamda;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;
import java.util.stream.Stream;

public class CollectorEx1 {  // collector 구현하기   
	public static void main(String[] args) {
		String [ ] strArr = {"aaa","bbb","ccc"}; // 
		Stream<String> strStream = Stream.of(strArr);
		
		String result = strStream.collect(new ConcatCollector());
		
		System.out.println(Arrays.toString(strArr));  // 배열 읽어오기 
		System.out.println("result="+result);  // 결과 값인데 
	}

}
class ConcatCollector implements Collector<String, StringBuilder,String>{

	@Override
	public Supplier<StringBuilder> supplier() {  // 공간을 제공 
		
		return () -> new StringBuilder();    
		
	}

	@Override
	public BiConsumer<StringBuilder, String> accumulator() {
		return (sb,s)-> sb.append(s);  // 수집 모으기 
		//return StringBuilder::new;
	}

	@Override
	public Function<StringBuilder, String> finisher() {
		return sb-> sb.toString()	;    // 수행
		//return null;
	}
	
	@Override
	public BinaryOperator<StringBuilder> combiner() {
		return(sb,sb2)-> sb.append(sb2);
		//return null;   // 병렬 합치기 
	}



	@Override
	public Set<Characteristics> characteristics() {
		return Collections.emptySet();  // 다 모아서 하기 
	}
	
}
