package instanceex;


public class Test4 {

	public static void main(String[] args) {
		
		int [ ] ball = new int[9];
		unique3(ball);
		
	}
	static int unique3(int ball[]) {
		
		

	for(int u=0;u<=1;u++) {	
		for(int i=0;i<ball.length;i++) 
			ball[i]  = i+1;
		
		int temp = 0;
		int j = 0;
		
		for(int i=0;i<6;i++) {
			j=(int)(Math.random()*9);
			temp = ball[i];
			ball[i] = ball[j];
			ball[j] = temp;
			
		}

			for(int i =1;i<=3;i++) {
				System.out.print(ball[i+1]); 
			}
			System.out.println();
	}
	return 0;
	}
}


