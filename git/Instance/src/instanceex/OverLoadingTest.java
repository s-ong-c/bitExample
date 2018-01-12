package instanceex;

class OverLoadingTest {

	public static void main(String[] args) {
		
		MyMath3 m3 = new MyMath3();
		System.out.println("m3.add(3,3)-"+m3.add(3,3));
		System.out.println("m3.add(3L,3)-"+m3.add(3L, 3));
		System.out.println("m3.add(3,3L)-"+m3.add(3, 3L));
		System.out.println("m3.add(3L,3L)-"+m3.add(3L, 3L));
		
		int [] a = {100, 200, 300};
		System.out.println("mm.add(a) ��� : "+m3.add(a));
	}

}
class MyMath3{
	int add(int a, int b) {
		System.out.print("int(int a,int b)-");
		
		return a+b;
	}
	long add(int a, long b) {
		System.out.print("long add(int a,long b)-");
		return a+b;
	}
	long add(long a, int b) {
		System.out.print("long add(long a,int b)-");
		return a+b;
	}
	long add(long a, long b) {
		System.out.print("long add(long a,long b)-");
		return a+b;
	}
	int add(int[] a) {
		System.out.print("int add(int[] a)-");
		int result = 0;
		for(int i=0;i<a.length;i++) {
			result += a[i];
		}
		
		return result;
	}

}
