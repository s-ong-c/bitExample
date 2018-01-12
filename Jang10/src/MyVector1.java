import java.util.Arrays;

class MyVector{
	Object [ ] objArr;  //1��
	int size;
	MyVector(int capacity) { // �����ڿ� �⺻������ 
		objArr =new Object[capacity];  //2��
	}
	MyVector() {
		this(16);//(capacity=16) 
	}
	boolean isEmpty() {return size==0;}// ��ü�� ������� Ȯ���ϴ�   //3��
	int size() {return size;} //�迭 ������ 
	int capacity() {return objArr.length;}//�ѱ���

	boolean add(Object obj) { // ��ü�� �߰��ϴ� �޼���   //4��

		//	System.out.println(objArr.length+"�ѹ迭ũ��");
		//	System.out.println(size+"����ũ��");
		if(objArr.length<=size) {
			System.out.println("�뷮�� �۾Ƽ� �÷Ⱦ�!!");
			//	System.out.println();	
			Object [ ] tmp = new Object[objArr.length*2];
			System.arraycopy(objArr, 0, tmp, 0, objArr.length);
			objArr=tmp ;

		}
		//	System.out.println("�־�");
		objArr[size++]=obj;

		return true;
	}


	public Object get(int index) {  // ��ü�� ��ȯ�ϴ�   //5��
		
		if(index<0 || index>objArr.length ) {
			throw new IllegalArgumentException("���ڰ� Ʋ���� ���� �ƴ��ϴ�");

		}
		//		System.out.println("1");
		//		try {
		//			if(index<0 || index>objArr.length ) {
		//				
		//				System.out.println("������ �̻��ѵ�");
		//			}
		//		} catch (Exception e) {
		//		}
		return objArr[index];
	}

	int indexOf(Object obj) { // ������ ��ġ ã��   7��
		//	System.out.println(obj.equals(objArr[1].toString())); //2
		//		System.out.println(obj);
		//		System.out.println(obj.toString());
		//		System.out.println(objArr[0].);
		for(int i =0;i<size;i++) {
			//System.out.println(obj.toString());
			//	System.out.println(objArr[i].equals(obj));
			///	System.out.println(objArr[0]==obj);
			if(objArr[i].equals(obj)) { //�迭 ��ü �� �� 
				//��ġ ��
				//System.out.println(i);
				return (int) obj;
			}
		}
		System.out.println(objArr[6]+"������"+obj);
		return -1;}//q-7 
	boolean remove(Object obj) {  //obj �� �޾Ƽ� �� �ڸ� �迭��ü   8��
		int rem;
		//System.out.println(indexOf(obj));
		if(indexOf(obj)==-1){
			throw new IllegalArgumentException("���ڰ� Ʋ���� ���� �ƴ��ϴ�");
			//System.out.println("���ڸ� �߸��Է��ѵ�");
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
			//			System.out.println("����");
			//		}
		}
		rem=0; // �ʱ�
		return true;
	}
	@Override
	//toString
	public String toString() {  //6��
		return "MyVector [objArr=" + Arrays.toString(objArr) + ", size=" + size + "]"+"�����ڸ���"+(capacity()-size);}
}
public class MyVector1 {
	public static void main(String[] args) {
		MyVector m = new MyVector();
		//	MyVector m = new MyVector(10);
		//	MyVector m = new MyVector(20);
		//  MyVector m = new MyVector(30);
		//	MyVector m = new MyVector(40);
		System.out.println("��ü�� ����°�?"+m.isEmpty()); // ��ü�� ����� Ȯ�� 
		System.out.println("�迭�� ũ��:"+m.capacity());
		//System.out.println("���-�迭 ��ũ�⺸�� ���� ���� ���ÿ�");
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
		System.out.println(m.add("b")+"����");
		m.add("a");
		m.add("a");
		m.add("b");
		m.add("a");//m.add("c");//m.add("d");m.add("e");
		//				m.add("a");
		//	m.add("a");
	//	for(int i =0;i<m.size;i++) {
//			System.out.println("get"+"-"+"-"+m.get(i));
	//	}
		//m.get(-1); //get ���� 
		//	System.out.println(m.get(4));
		System.out.println("�������ũ�����"+m.size());
		System.out.println("toStringȮ��:"+m.toString());
		System.out.println();
		//	System.out.println(m.remove(40)+"����");
		System.out.println("toStringȮ��:"+m.toString());
//		System.out.println("�����Ǵ�"+m.remove(6));
		System.out.println("toStringȮ��:"+m.toString());
//		System.out.println("�����Ǵ�"+m.remove(6));
		System.out.println("toStringȮ��:"+m.toString());
//		System.out.println(m.objArr.length*2);
//				m.add("d");
//				m.add("d");
		System.out.println("toStringȮ��:"+m.toString());
	//	m.add("a");
		System.out.println("toStringȮ��:"+m.toString());
//		m.add("a");
//		//System.out.println("ss"+m.objArr.length);
//		//System.out.println(m.size);
//		System.out.println("toStringȮ��:"+m.toString());
//		m.add("a");
//		System.out.println("toStringȮ��:"+m.toString());
//		//System.out.println("�����Ǵ�"+m.remove(4));
		//System.out.println("�����Ǵ�"+m.remove(2));
			//System.out.println(m.get(10));
	//		m.remove(4);
	//		System.out.println("toStringȮ��:"+m.toString());
//			m.remove(7);
	}
}


//class MyVector {
//	Object [ ] objArr;
//	int size;// size ������ �߰�
//	MyVector(int capacity) {
//		objArr =new Object[capacity];
//	}
//	MyVector() {
//		this(16);
//	}
//	boolean isEmpty() {return size==0;}
//	int size() {return size;} //�迭 ������ 
//	int capacity() {return objArr.length;}
//
//
//	void add(Object obj) { // ��ü�ֱ�
//
//		objArr[size++]=obj; //4
//	}
//
//	Object get(int index) {  // ������ ��ȯ 
//		if(index<0|| index>objArr.length ) {
//			System.out.println("xx");
//		}
//
//		return objArr[index];
//	}
//	int indexOf(Object obj) { // ������ ��ġ ã�� 
//		//System.out.println(obj+"���ä�");
//	//	System.out.println(objArr[0]);
//		for(int i =0;i<size;i++) {
//			//System.out.println(objArr[i]+"asd���");
//		//	System.out.println(obj);
//			//System.out.println(obj.equals(objArr[i]));
//			if((int)obj==i) { 
//				//�����ΰ� obj ���� -==== objArr[i] ==== ���� (�ڸ���ȣ�� �ƴ϶�°���) 
//				
//			//	System.out.println(obj+"���� ���Ͷ�");
//				
//			//System.out.println(ind+"qwe");
//				//System.out.println("���ǿ� �����ϴ�");
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
//	boolean remove(Object obj) {  // ��ġ ����
//		//System.out.println(indexOf(obj)+"�����");
//		//System.out.println(obj+"aa");
//		//System.out.println(objArr[indexOf(obj)]);
//		//indexOf(obj);  // ���������� ���ڸ����ڸ� 
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
////		-System.out.println("��ü�迭��ũ��"+mv.size);
//		System.out.println(mv.toString());
////		System.out.println(	"��ũ��"+mv.capacity());
//		///mv.remove(1);
//		System.out.println(mv.size);
//		System.out.println(mv.toString());
//		//System.out.println("����"+mv.remove(11));
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
