package instanceex;

import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("--���� �Է��غ���");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		palin(num);
			System.out.println();
		}
	static boolean palin(int num){
		
		  
		int tmp=num;
		int result =0; // 
		
		
		while(tmp !=0) {
			
			result= result *10 +tmp %10;
			tmp /=10;
			System.out.println(num);
			System.out.println(tmp);
			System.out.println(result+"��������Ʈ");
			}
			
			if(num ==result) {
				System.out.println("ȸ��");
			}else {
				System.out.println("�ƴ�");
			}
					
		return true;	

	
	
	}
}
