package instanceex;

class Dataa{
	int value;
}
class Data2{
	int value;
	Data2(int x){
		value = x;
	}
}
public class ConstructorTest {
	public static void main(String[] args) {
		Dataa d1 = new Dataa();
//		Data2 d2 = new Data2(); // �̰Ž� ������ ���� 
		// data1 �� �ڵ� ����
		// data2 �� �����ڰ� �߰� �Ǿ��ֱ⿡ 
		Data2 d2 = new Data2(10);
		
		System.out.println(d1);
		System.out.println(d2);
	}
}
