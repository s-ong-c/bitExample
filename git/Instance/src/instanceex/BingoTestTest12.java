//package instanceex;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//import org.junit.jupiter.api.Test;
//
//class BingoTestTest12 {
//		
//		 @Test
//		 void test19() {
//		 System.out.println("�밢��");
//		 int[][] board = { { 0, 0, 0, 0, 0 },
//				 			{ 0 , 0, 0, 0,0 },
//				 			{ 1, 1, 0, 1, 1 },
//				 			{ 1, 1, 1, 0, 1 },
//				 			{ 1, 1, 1, 1, 0 } };
//		 assertTrue(bingoCheck(board) == 3);
//		 }
//		 
//		 @Test
//		 void test20() {
//		 System.out.println("�밢��2");
//		 int[][] board = { { 0, 0, 0, 0, 0 },
//				 			{ 0 , 0, 0, 0,0 },
//				 			{ 1, 1, 0, 1, 1 },
//				 			{ 1, 0, 1, 0, 1 },
//				 			{ 0, 1, 1, 1, 0 } };
//		 assertTrue(bingoCheck(board) == 4);
//		 }
//
//		 @Test
//		 void test() {
//		 System.out.println("ù��°");
//		 int[][] board = { { 0, 0, 0, 0, 0 },
//		 { 0, 1, 1, 1, 1 },
//		 { 1, 1, 1, 1, 1 },
//		 { 1, 1, 1, 1, 1 },
//		 { 1, 1, 1, 1, 1 } };
//		 assertTrue(bingoCheck(board) == 1);
//		 }
//		 @Test
//		 void test1() {
//		 System.out.println("�ι�°");
//		 int[][] board = { { 0, 0, 0, 0, 0 },
//		 { 0 , 0, 0, 0,0 },
//		 { 1, 1, 1, 1, 1 },
//		 { 1, 1, 1, 1, 1 },
//		 { 1, 1, 1, 1, 1 } };
//		 assertTrue(bingoCheck(board) == 2);
//		 }
//		 @Test
//		 void test2() {
//		 System.out.println("����°");
//		 int[][] board = { { 0, 0, 0, 0, 0 },
//				 			{ 0 , 0, 0, 0,0 },
//				 			{ 0, 0, 0, 0, 0 },
//				 			{ 1, 1, 1, 1, 1 },
//				 			{ 1, 1, 1, 1, 1 } };
//		 assertTrue(bingoCheck(board) == 3);
//		 }
//		 @Test
//		 void test3() {
//		 System.out.println("�׹�°");
//		 int[][] board = { { 0, 0, 0, 0, 0 },
//		 { 0 , 0, 0, 0,0 },
//		 { 0, 0, 0, 0, 0 },
//		 {0, 0, 0, 0, 0 },
//		 { 1, 1, 1, 1, 1 } };
//		 assertTrue(bingoCheck(board) == 4);
//		
//		 }
//		 @Test
//		 void test5() {
//		 System.out.println("ù��°");
//		 int[][] board = { { 0, 1, 0, 0, 0 },
//		 { 0, 1, 1, 1, 1 },
//		 { 0, 1, 1, 1, 1 },
//		 { 0, 1, 1, 1, 1 },
//		 { 0, 1, 1, 1, 1 } };
//		 assertTrue(bingoCheck(board) == 1);
//		 }
//		@Test
//		void test8() {
//			System.out.println("x��°");
//			int[][] board = { { 0, 0, 0, 0, 0 }, 
//								{ 0, 1, 1, 1, 1 }, 
//								{ 0, 1, 0, 1, 1 }, 
//								{ 0, 1, 1, 0, 1 },
//								{ 0, 1, 1, 1, 0 } };
//			assertTrue(bingoCheck(board) == 2);
//		}
//
//		static int bingoCheck(int[][] board) {
//			int cnt = 0;// ù��°
//			int bingo =0;
//
//				for (int i = 0; i < 5; i++) {
//					for (int j = 0; j < 5; j++) { // ��
//
//						
//						if (board[i][j] == 0) { // ������
//								 // ù��°
//										cnt++;
//										//System.out.println("����");
//									// System.out.println("1");
//									}
//						}
//						if(cnt==5) {
//							bingo++;
//						}
//						cnt =0;	
//					}
//				//����
//					for (int j = 0; j < 5; j++) { // ��
//						for (int i = 0; i < 5; i++) {
//						if (board[i][j] == 0) { // ������
//										cnt++;
//									}
//						}
//						if(cnt==5) {
//							bingo++;
//						}
//						cnt =0;	
//					}
//					
//					//�����밢
//						for (int i = 0; i < 5; i++) {
//							for (int j = 0; j < 5; j++) { // ��
//								if (board[i][j] == 0) { // ������
//									if(i==j)
//										cnt++;
//									}
//						}
//						if(cnt==5) {
//							bingo++;
//						}
//					}
//						//�޴밢
//						cnt =0; //�밢���ʱ�ȭ
//						for (int i = 0; i < 5; i++) {
//							for (int j = 0; j < 5; j++) { // ��
//								if (board[i][j] == 0) { // ������
//									if(i+j==4)
//										cnt++;
//									}
//						}
//						if(cnt==5) {
//							bingo++;
//						}
//					}
//				System.out.println(bingo);
//					
//				
//					
//		
//
//
//			return bingo;
//		}
//	}
