package instanceex;

 class MyMath{
	
	int k ,l;
	void info() {
		System.out.println("k="+k);
		System.out.println("l="+l);
	}
	int add(int k,int l) {
		int result =k+l;
		
		return result;
	}
	long add(long a, long b) {
		long result = a+b;
		return result;
		
	}
	long subtract(long a,long b) {
		return a-b;
	}
	long multiply(long a,long b) {
		return a*b;
	}
	double divide(double a, double b) {
		return a/b;
	}
	
}

class MyMathTest {

	public static void main(String[] args) {
		MyMath mm = new MyMath();
		long result1 =mm.add(5L, 3L);
		long result2 =mm.subtract(5L, 3L);
		long result3 =mm.multiply(5L, 3L);
		double result4 =mm.divide(5L, 3L);
		
		mm.k = 5;
		mm.l = 6;
		
		System.out.println("합"+result1);
		System.out.println("빼기"+result2);
		System.out.println("곱하기"+result3);
		System.out.println("나누기"+result4);
		mm.info();
		System.out.println("더하기:"+mm.add(5, 6));
	}

}
