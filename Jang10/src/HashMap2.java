import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMap2 {
	public static void main(String[] args) {
		HashMap map = new HashMap();

		map.put("���ڹ�",new Integer(90));  // map�� �ߺ��� ������� �ʾƼ� key���� ����� 
		map.put("���ڹ�",new Integer(100)); //  ù��° �ٰ�  value�� �ٸ��� key���� ���� ������ 
		map.put("���ڹ�",new Integer(100));
		map.put("���ڹ�",new Integer(80));
		map.put("���ڹ�",new Integer(90));

		Set set =map.entrySet();
		Iterator it =set.iterator();		

		while(it.hasNext()) {
			Map.Entry e = (Map.Entry)it.next();
			System.out.println("�̸�:"+e.getKey()+",����:"+e.getValue());
		}
		set= map.keySet();  // map�� ���
		System.out.println("�����ڸ��:"+set);

		Collection values = map.values();
		it = values.iterator();

		int total= 0;
		while(it.hasNext()) {  // 
			Integer i = (Integer)it.next();
			total += i.intValue();
		}

		System.out.println("����:"+total);
		System.out.println("���"+(float)total/set.size());
		System.out.println("�ְ����� :"+Collections.max(values));
		System.out.println("�ְ����� :"+Collections.min(values));
	}
}
