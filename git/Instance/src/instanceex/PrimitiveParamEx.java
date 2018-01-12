package instanceex;
class Data{int x;} // 기본 매개변수
class PrimitiveParamEx {

	public static void main(String[] args) {
		Data d = new Data();
		
		d.x = 10;//d 에대한 변수;
		System.out.println("main() : x="+d.x);
		
		change(d.x);
		System.out.println("바꾼뒤");
		System.out.println("main():x="+d.x);

	}
	static void change(int x) {
		x=1000;
		System.out.println("change() : x ="+x);
	}

}
