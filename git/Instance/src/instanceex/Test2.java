package instanceex;

import java.util.Scanner;

public class Test2 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("--���� �Է��غ���");
		
		int	Num = sc.nextInt();
		resultSum(Num);
		System.out.println("���ϱ�"+resultSum(Num));
	}
	static int resultSum(int digit) {
		
		int result =0; // 
		int sum = 0; // �ʱ�ȭ
		for(int i =0;digit>0;i++) {
			
			int x = digit%10; // �ڸ��� 
			sum = sum+x;  // ���ϱ� 
			digit = digit/10;// 1�� �ڸ� 
			if(digit<=0)  // ������  Ȯ��
				result = sum;
			
			
		}
		 
		
		return result;
		
		
	
	}
}
