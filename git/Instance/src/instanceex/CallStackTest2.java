package instanceex;

class CallStackTest2 {

	public static void main(String[] args) {
		System.out.println("main(String[] args)가 시작되었음");
		firstMethod();
		System.out.println("main(String[] args)가 끝났음");
	}
	static void firstMethod() {
		System.out.println("firstMethod(); 시작되었음");
		secondMethod();
		System.out.println("firstMethod(); 끝났음");
	}
	static void secondMethod() {
		System.out.println("secondMethod() 시작");
		System.out.println("secondMethod() 끝");
	}
}
