import java.util.ArrayList;
import java.util.Iterator;

public class ListIteratorEx2 {
	public static void main(String[] args) {
		ArrayList original= new ArrayList(0);
		ArrayList copy1 = new ArrayList(1);
		ArrayList copy2 = new ArrayList(2);
		
		for(int i =0;i<10;i++)  
			original.add(i);
		
		Iterator it = original.iterator();
		
		while(it.hasNext()) 
			copy1.add(it.next());  //copy1�� ��������
			
		
		System.out.println("=Original���� copy1�� ���� (copy=");
		System.out.println("original:"+original);
		System.out.println("cop1:"+copy1);
		System.out.println();
		
		it = original.iterator();  // ������ �ȵǹǷ� �ٽ� ���;����� �Ѵ�. 
		
		while(it.hasNext()) {
			copy2.add(it.next());  //copy2�� ������;
			it.remove();  // ���� �� ���� 
		}
		it = copy1.iterator();  // ������ �ȵǹǷ� �ٽ� ���;����� �Ѵ�. 
		
		while(it.hasNext()) {
			copy2.add(it.next());  //copy2�� ������;
			it.remove();  // ���� �� ���� 
		}
		System.out.println("=Original���� copy2�� �̵�");
		System.out.println("Original=>"+original);
		System.out.println("copy1:"+copy1);
		System.out.println(copy2);
		}
}
