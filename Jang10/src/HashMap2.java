import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMap2 {
	public static void main(String[] args) {
		HashMap map = new HashMap();

		map.put("김자바",new Integer(90));  // map은 중복을 허용하지 않아서 key값을 덮어쓴다 
		map.put("김자바",new Integer(100)); //  첫번째 줄과  value는 다르나 key값이 같기 때문에 
		map.put("이자바",new Integer(100));
		map.put("강자바",new Integer(80));
		map.put("안자바",new Integer(90));

		Set set =map.entrySet();
		Iterator it =set.iterator();		

		while(it.hasNext()) {
			Map.Entry e = (Map.Entry)it.next();
			System.out.println("이름:"+e.getKey()+",점수:"+e.getValue());
		}
		set= map.keySet();  // map에 담기
		System.out.println("참가자명단:"+set);

		Collection values = map.values();
		it = values.iterator();

		int total= 0;
		while(it.hasNext()) {  // 
			Integer i = (Integer)it.next();
			total += i.intValue();
		}

		System.out.println("총점:"+total);
		System.out.println("평균"+(float)total/set.size());
		System.out.println("최고점수 :"+Collections.max(values));
		System.out.println("최고점수 :"+Collections.min(values));
	}
}
