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
			copy1.add(it.next());  //copy1에 가져오기
			
		
		System.out.println("=Original에서 copy1로 복사 (copy=");
		System.out.println("original:"+original);
		System.out.println("cop1:"+copy1);
		System.out.println();
		
		it = original.iterator();  // 재사용이 안되므로 다시 얻어와야지만 한다. 
		
		while(it.hasNext()) {
			copy2.add(it.next());  //copy2에 가져옥;
			it.remove();  // 원래 것 제거 
		}
		it = copy1.iterator();  // 재사용이 안되므로 다시 얻어와야지만 한다. 
		
		while(it.hasNext()) {
			copy2.add(it.next());  //copy2에 가져옥;
			it.remove();  // 원래 것 제거 
		}
		System.out.println("=Original에서 copy2로 이동");
		System.out.println("Original=>"+original);
		System.out.println("copy1:"+copy1);
		System.out.println(copy2);
		}
}
