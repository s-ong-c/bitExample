package instanceex;
import java.util.Random;
import java.util.Scanner;

public class Test5_2_1 {

		static int strike = 0; // ���� ���� ����
	    static int ball = 0; // ���� ���� ����
	    public static void main(String[] args) {
	    	int a[] = new int[] {1,2,3};
	    	int b[] = new int[] {1,2,3}; // �������� �Է¹޴� ���� ������ �迭 ����
	    	Random ra = new Random();  
	    	while(a[0] == 0) { a[0] = ra.nextInt(10); 
	    	}
	    	while(a[0] == a[1] || a[1] == 0) 
	    	{ 
	    		a[1] = ra.nextInt(10); 
	    	}
	    	while(a[0] == a[2] || a[1] == a[2] || a[2] == 0)
	    	{ 
	    		a[2] = ra.nextInt(10); 
	    	}
	    	  // 1~9������ ���� ���� a�迭�� ����
	    	   
	    	  // System.out.println(a[0] + ", " + a[1] + ", " + a[2] + "\n");
	    	  // ��ǻ�Ͱ� ���� �� ���
	  //  	Scanner s = new Scanner(System.in);
	    	
	    	while(strike < 3) { 
	    		
	    		for(int i = 0; i < b.length; i++) { // �ݺ������� �������� �� �Է� �ޱ�
//	    			System.out.print(i+1 + "��° ��(1~9) : ");
	//    			b[i] = s.nextInt();
	    			while (b[i] >= 10 || b[i] == 0) { // �Էµ� ���� ���� üũ
//	    				System.out.println("[����] 1~9 ������ ���ڸ��� �Է�!");
//	    				System.out.print(i+1 + "��° ��(1~9) : ");
//	    				b[i] = s.nextInt();
	    				}
	    			}
	    		
	    		for(int i = 0; i < 3; i++) { // strike, ball ���� üũ
	    			for(int j = 0; j < 3; j++) {
	    				if( a[i] == b[j] ) {
	    					if ( i == j ) 
	    					{ 
	    						strike += 1; 
	    						} else { 
	    							ball +=1; 
	    							} // strike, ball �� ����
	    					}
	    				}
	    			}
	    		if (strike == 0 && ball == 0) { // ��� Ʋ�� ���
	    			System.out.println("\n�ƿ�!\n");
	    			} else if(strike == 3) { // ������ ���
	    				System.out.print("\n3��Ʈ����ũ ");
	    				System.exit(0);
	    				} else { // �κ� ������ ���
	    					System.out.println("\n" + strike + " Strike" + ", " + ball + " Ball\n");
	    					strike = 0;
	    					ball = 0;
	    					}
	    		}
	    	}
	    

	}

