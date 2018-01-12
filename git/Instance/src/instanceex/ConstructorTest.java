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
//		Data2 d2 = new Data2(); // 이거슨 오류가 난다 
		// data1 은 자동 생성
		// data2 는 생성자가 추가 되었있기에 
		Data2 d2 = new Data2(10);
		
		System.out.println(d1);
		System.out.println(d2);
	}
}
