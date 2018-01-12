package instanceex;


public class Test5 {
	public static void main(String[] args) {
	int[] call = new int[] {1,2,3};
	int[] call1 = new int[] {1,2,3};
	int[] ball = new int[9];
	
	unique4(ball);
	check(call, call1);

	}

	static int unique4(int ball[]) {

		
			for (int i = 0; i < ball.length; i++)
				ball[i] = i + 1;

			int temp = 0;
			int j = 0;

			for (int i = 0; i < 6; i++) {
				j = (int) (Math.random() * 9);
				temp = ball[i];
				ball[i] = ball[j];
				ball[j] = temp;

			}

			for (int i = 1; i <= 3; i++) {
				System.out.print(ball[i + 1]);
			}
			System.out.println();
		
		return 0;
		}
	static int check(int [] call,int [] call1) {
		int result=0;
		int count= 0;
		
//		System.out.println(ball[0]);
//		System.out.println(ball[1]);
//		System.out.println(ball[2]);
		System.out.println(call[0]);
		System.out.println(call[1]);
		System.out.println(call[2]);
		System.out.println(call1[0]);
		System.out.println(call1[1]);
		System.out.println(call1[2]);

		if(call1[0]==call[0] && call1[1] == call[1] && call1[2]==call[2]) {
			System.out.println("3스트라이크");
		}
		else if(call1[0]==call[0] || call1[1] == call[1] || call1[2]==call[2]) {
			int strike = count+1;
			System.out.println(strike+"여기");
		
		
		}
		
		
		return result;
	

	}
}
