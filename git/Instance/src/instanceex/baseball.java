package instanceex;

import static org.junit.Assert.assertTrue;

class baseball {

	@Test
	void test() {
		System.out.println("1��°");
		int b[] = {1,2,3};
		assertTrue(checkBase(b)==3);
		System.out.println();
	}
	
	@Test
	void test1() {
		System.out.println();
		System.out.println("2��°");
	  int b[] = {4,5,6};
		assertTrue(checkBase(b)==0);
	//	System.out.println("����");
	}
	@Test
	void test2() {
	//	System.out.println("1");
		System.out.println("2��°");
		int b[] = {2,3,1};
		assertTrue(checkBase(b)==3);
	}
	@Test
	void test3() {
		System.out.println("3��°");
		int b[] = {6,7,8};
		assertTrue(checkBase(b)==3);
	}
	@Test
	void test4() {
		System.out.println("4��°");
		int b[] = {7,2,3};
		assertTrue(checkBase(b)==3);
	}
	void test5() {
		System.out.println("5��°");
		int b[] = {4,1,9};
		assertTrue(checkBase(b)==3);
	}
	
		
	
	static	int checkBase(int b[]) {	
		
		int a[] = { 1, 2, 3 };
	
		int strike=0;
		int ball=0;
		
//		while (strike < 3) {
//
//			for (int i = 0; i < b.length; i++) {
//
//				while (b[i] >= 10 || b[i] == 0) {
//				}
//			}
			for (int i = 0; i < 3; i++) { // strike, ball ���� üũ
				for (int j = 0; j < 3; j++) {
					if (a[i] == b[j]) {
						if (i == j) {
							strike += 1;
						} else {
							ball += 1;
						} 
					}
				}
			}
			if (strike == 0 && ball == 0) {
				System.out.println("\n�ƿ�!\n");
			} else if (strike == 3) { // ������ ���
				System.out.println("\n3��Ʈ����ũ ");
				
			
			} else {
				System.out.println("\n" + strike + " Strike" + ", " + ball + " Ball\n");
				strike = 0;
				ball = 0;
				
			}
		
	
		return strike;

	}
}
