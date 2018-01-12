package instanceex;

class ReferenceParamEx2 {

	public static void main(String[] args) {
		int [ ] x = {10};
		
		System.out.println("main():x="+x[0]); //	10;
		
		change(x);// 메서드 
		System.out.println("바꾼뒤");
		System.out.println("main():x="+x[0]);

	}
	static void change(int [] x) {
		x[0]=1000;
		System.out.println("change() : x ="+x[0]);
	}

}
