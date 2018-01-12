package lamda;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;
import java.util.stream.Stream;

public class CollectorEx1 {  // collector �����ϱ�   
	public static void main(String[] args) {
		String [ ] strArr = {"aaa","bbb","ccc"}; // 
		Stream<String> strStream = Stream.of(strArr);
		
		String result = strStream.collect(new ConcatCollector());
		
		System.out.println(Arrays.toString(strArr));  // �迭 �о���� 
		System.out.println("result="+result);  // ��� ���ε� 
	}

}
class ConcatCollector implements Collector<String, StringBuilder,String>{

	@Override
	public Supplier<StringBuilder> supplier() {  // ������ ���� 
		
		return () -> new StringBuilder();    
		
	}

	@Override
	public BiConsumer<StringBuilder, String> accumulator() {
		return (sb,s)-> sb.append(s);  // ���� ������ 
		//return StringBuilder::new;
	}

	@Override
	public Function<StringBuilder, String> finisher() {
		return sb-> sb.toString()	;    // ����
		//return null;
	}
	
	@Override
	public BinaryOperator<StringBuilder> combiner() {
		return(sb,sb2)-> sb.append(sb2);
		//return null;   // ���� ��ġ�� 
	}



	@Override
	public Set<Characteristics> characteristics() {
		return Collections.emptySet();  // �� ��Ƽ� �ϱ� 
	}
	
}
