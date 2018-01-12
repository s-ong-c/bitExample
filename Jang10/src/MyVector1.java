import java.util.Arrays;

class MyVector{
	Object [ ] objArr;  //1번
	int size;
	MyVector(int capacity) { // 생성자에 기본생성자 
		objArr =new Object[capacity];  //2번
	}
	MyVector() {
		this(16);//(capacity=16) 
	}
	boolean isEmpty() {return size==0;}// 객체가 비었는지 확인하는   //3번
	int size() {return size;} //배열 사이즈 
	int capacity() {return objArr.length;}//총길이

	boolean add(Object obj) { // 객체를 추가하는 메서드   //4번

		//	System.out.println(objArr.length+"총배열크기");
		//	System.out.println(size+"실제크기");
		if(objArr.length<=size) {
			System.out.println("용량이 작아서 늘렸어!!");
			//	System.out.println();	
			Object [ ] tmp = new Object[objArr.length*2];
			System.arraycopy(objArr, 0, tmp, 0, objArr.length);
			objArr=tmp ;

		}
		//	System.out.println("애야");
		objArr[size++]=obj;

		return true;
	}


	public Object get(int index) {  // 객체를 반환하는   //5번
		
		if(index<0 || index>objArr.length ) {
			throw new IllegalArgumentException("숫자가 틀린것 같지 아니하니");

		}
		//		System.out.println("1");
		//		try {
		//			if(index<0 || index>objArr.length ) {
		//				
		//				System.out.println("범위가 이상한데");
		//			}
		//		} catch (Exception e) {
		//		}
		return objArr[index];
	}

	int indexOf(Object obj) { // 지정된 위치 찾기   7번
		//	System.out.println(obj.equals(objArr[1].toString())); //2
		//		System.out.println(obj);
		//		System.out.println(obj.toString());
		//		System.out.println(objArr[0].);
		for(int i =0;i<size;i++) {
			//System.out.println(obj.toString());
			//	System.out.println(objArr[i].equals(obj));
			///	System.out.println(objArr[0]==obj);
			if(objArr[i].equals(obj)) { //배열 객체 를 비교 
				//위치 반
				//System.out.println(i);
				return (int) obj;
			}
		}
		System.out.println(objArr[6]+"무었이"+obj);
		return -1;}//q-7 
	boolean remove(Object obj) {  //obj 로 받아서 그 자리 배열객체   8번
		int rem;
		//System.out.println(indexOf(obj));
		if(indexOf(obj)==-1){
			throw new IllegalArgumentException("숫자가 틀린것 같지 아니하니");
			//System.out.println("숫자를 잘못입력한듯");
		}else {
			//	System.out.println("ss");
			rem=  indexOf(obj);
			//System.out.println(rem);
			objArr[rem]=null;
			System.arraycopy(objArr,rem+1, objArr,rem ,size-rem);
			objArr[size-1]=null;
			size--;
			//		if((int)obj !=rem) {
			//	
			//			System.out.println("오류");
			//		}
		}
		rem=0; // 초기
		return true;
	}
	@Override
	//toString
	public String toString() {  //6번
		return "MyVector [objArr=" + Arrays.toString(objArr) + ", size=" + size + "]"+"남은자리수"+(capacity()-size);}
}
public class MyVector1 {
	public static void main(String[] args) {
		MyVector m = new MyVector();
		//	MyVector m = new MyVector(10);
		//	MyVector m = new MyVector(20);
		//  MyVector m = new MyVector(30);
		//	MyVector m = new MyVector(40);
		System.out.println("객체는 비었는가?"+m.isEmpty()); // 객체가 비었나 확인 
		System.out.println("배열의 크기:"+m.capacity());
		//System.out.println("경고-배열 총크기보다 많이 담지 마시오");
		m.add(1);
		m.add(2);m.add(3);m.add(4);m.add(5);
		m.add(6);
		m.add("a");
		m.add("b");m.add("c");m.add("d");m.add("e");
		//		m.add("a");
		//		m.add("a");
		//		m.add("a");
		System.out.println("ss"+m.objArr.length);
		System.out.println(m.size);
		//System.out.println(m.capacity()+1+"sss");
		System.out.println(m.add("b")+"여기");
		m.add("a");
		m.add("a");
		m.add("b");
		m.add("a");//m.add("c");//m.add("d");m.add("e");
		//				m.add("a");
		//	m.add("a");
	//	for(int i =0;i<m.size;i++) {
//			System.out.println("get"+"-"+"-"+m.get(i));
	//	}
		//m.get(-1); //get 오류 
		//	System.out.println(m.get(4));
		System.out.println("현재실제크기길이"+m.size());
		System.out.println("toString확인:"+m.toString());
		System.out.println();
		//	System.out.println(m.remove(40)+"에러");
		System.out.println("toString확인:"+m.toString());
//		System.out.println("삭제되니"+m.remove(6));
		System.out.println("toString확인:"+m.toString());
//		System.out.println("삭제되니"+m.remove(6));
		System.out.println("toString확인:"+m.toString());
//		System.out.println(m.objArr.length*2);
//				m.add("d");
//				m.add("d");
		System.out.println("toString확인:"+m.toString());
	//	m.add("a");
		System.out.println("toString확인:"+m.toString());
//		m.add("a");
//		//System.out.println("ss"+m.objArr.length);
//		//System.out.println(m.size);
//		System.out.println("toString확인:"+m.toString());
//		m.add("a");
//		System.out.println("toString확인:"+m.toString());
//		//System.out.println("삭제되니"+m.remove(4));
		//System.out.println("삭제되니"+m.remove(2));
			//System.out.println(m.get(10));
	//		m.remove(4);
	//		System.out.println("toString확인:"+m.toString());
//			m.remove(7);
	}
}


//class MyVector {
//	Object [ ] objArr;
//	int size;// size 변수를 추가
//	MyVector(int capacity) {
//		objArr =new Object[capacity];
//	}
//	MyVector() {
//		this(16);
//	}
//	boolean isEmpty() {return size==0;}
//	int size() {return size;} //배열 사이즈 
//	int capacity() {return objArr.length;}
//
//
//	void add(Object obj) { // 객체넣기
//
//		objArr[size++]=obj; //4
//	}
//
//	Object get(int index) {  // 사이즈 반환 
//		if(index<0|| index>objArr.length ) {
//			System.out.println("xx");
//		}
//
//		return objArr[index];
//	}
//	int indexOf(Object obj) { // 지정된 위치 찾기 
//		//System.out.println(obj+"들어올ㄴ");
//	//	System.out.println(objArr[0]);
//		for(int i =0;i<size;i++) {
//			//System.out.println(objArr[i]+"asd루룰");
//		//	System.out.println(obj);
//			//System.out.println(obj.equals(objArr[i]));
//			if((int)obj==i) { 
//				//오류인게 obj 숫자 -==== objArr[i] ==== 숫자 (자리번호가 아니라는거지) 
//				
//			//	System.out.println(obj+"여기 들어와라");
//				
//			//System.out.println(ind+"qwe");
//				//System.out.println("조건에 만족하니");
//			//	System.out.println(objArr[i]+"asd");
//			//	System.out.println(i);
//				return i;
//				
//			}
//		}
//
//
//		return -1;}//q-7 
//
//
//
//	boolean remove(Object obj) {  // 위치 제거
//		//System.out.println(indexOf(obj)+"여기는");
//		//System.out.println(obj+"aa");
//		//System.out.println(objArr[indexOf(obj)]);
//		//indexOf(obj);  // 변수에넣자 그자리그자리 
//		//System.out.println(indexOf(obj));
//		int qs;
//		 qs= (int) indexOf(obj);
//		 objArr[qs]=null;
//		 System.arraycopy(objArr,qs+1, objArr,qs , qs);
//		 objArr[size-1]=null;
//		 size--;
//		 
//		 
//		 qs=0;
//
//		return true;
//
//
//	}
//	@Override
//
//	public String toString() {
//		return "MyVector [objArr=" + Arrays.toString(objArr) + ", size=" + size + "]";
//	}
//
//}
//public class MyVector1{
//	public static void main(String[] args) {
//		MyVector mv = new MyVector();
//		System.out.println(mv.isEmpty());
//		mv.capacity();
//		mv.get(10);
//
//		mv.add(1);
//		mv.add(2);
//		mv.add(3);
//		mv.add(4);
//		mv.add(5);
//		System.out.println(mv.toString());
//		mv.add(5);
//		mv.add(1);
//		mv.add(2);
//		mv.add(3);
//		mv.add(4);
//		mv.add(5);
//		mv.add(6);
//
//		System.out.println(	mv.capacity());
////		-System.out.println("객체배열의크기"+mv.size);
//		System.out.println(mv.toString());
////		System.out.println(	"총크기"+mv.capacity());
//		///mv.remove(1);
//		System.out.println(mv.size);
//		System.out.println(mv.toString());
//		//System.out.println("삭제"+mv.remove(11));
//		//System.out.println(mv.size);
//		//mv.remove(10); //
//		mv.remove(2); //
//		
//		System.out.println(mv.toString()+"2");
//		mv.remove(3); //
//		//mv.remove(4); //
//		System.out.println(mv.toString());
//	}
//
//
//
//}
