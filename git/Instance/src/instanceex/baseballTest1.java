//package instanceex;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//import org.junit.jupiter.api.Test;
//
//class baseballTest1 {
//
//	@Test
//	void test() {
//		System.out.println("??");
//		int b[][] = { { 1, 1, 1, 1, 1 }, 
//						{ 1, 2, 3, 4, 5 }, 
//						{ 1, 2, 3, 4, 5 }, 
//						{ 1, 2, 3, 4, 5 },
//						{ 1, 2, 3, 4, 5 },
//											};
//		assertTrue(checkBingo(b) == 23);
//	}
//
//	@Test
//	void test2() {
//		int b[][] = {	 { 0, 0, 0, 0, 0 },
//						{ 1, 2, 3, 4, 5 }, 
//						{ 1, 2, 3, 4, 5 }, 
//						{ 1, 2, 3, 4, 5 }, 
//						{ 1, 2, 3, 4, 5 }, };
//		assertTrue(checkBingo(b) == 23);
//	}
//
//	static int checkBingo(int b[][]) {
//
//		int a[][] = {	 { 1, 1, 1, 1, 1 },
//						{ 1, 2, 3, 4, 5 }, 
//						{ 1, 2, 3, 4, 5 }, 
//						{ 1, 2, 3, 4, 5 },
//						{ 1, 2, 3, 4, 5 }, };
//					
//		
//		int strike = 0;
//		int ball = 0;
//
//		// while (strike < 3) {
//		//
//		// for (int i = 0; i < b.length; i++) {
//		//
//		// while (b[i] >= 10 || b[i] == 0) {
//		// }
//		// }
//		for (int i = 0; i < 5; i++) { // strike, ball ���� üũ
//			for (int j = 0; j < 5; j++) {
//				if (a[i][j] == b[j][i]) {
//					if (i == j) {
//						strike += 1;
//					} else {
//						ball += 1;
//					}
//				}
//			}
//		}
//		if (strike == 0 && ball == 0) {
//			System.out.println("\n�ƿ�!\n");
//		} else if (strike == 5) { // ������ ���
//			System.out.println("\n5���� ");
//
//		} else {
//			System.out.println("\n" + strike + "����" + ", \n");
//			strike = 0;
//			ball = 0;
//
//		}
//
//		return 1;
//
//	}
//
//}
