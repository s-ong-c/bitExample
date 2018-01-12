package instanceex;

import java.util.Scanner;

public class Test2 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("--숫자 입력해봐라");
		
		int	Num = sc.nextInt();
		resultSum(Num);
		System.out.println("더하기"+resultSum(Num));
	}
	static int resultSum(int digit) {
		
		int result =0; // 
		int sum = 0; // 초기화
		for(int i =0;digit>0;i++) {
			
			int x = digit%10; // 자리수 
			sum = sum+x;  // 더하기 
			digit = digit/10;// 1의 자리 
			if(digit<=0)  // 끝나면  확정
				result = sum;
			
			
		}
		 
		
		return result;
		
		
	
	}
}
