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
//		 System.out.println("대각선");
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
//		 System.out.println("대각선2");
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
//		 System.out.println("첫번째");
//		 int[][] board = { { 0, 0, 0, 0, 0 },
//		 { 0, 1, 1, 1, 1 },
//		 { 1, 1, 1, 1, 1 },
//		 { 1, 1, 1, 1, 1 },
//		 { 1, 1, 1, 1, 1 } };
//		 assertTrue(bingoCheck(board) == 1);
//		 }
//		 @Test
//		 void test1() {
//		 System.out.println("두번째");
//		 int[][] board = { { 0, 0, 0, 0, 0 },
//		 { 0 , 0, 0, 0,0 },
//		 { 1, 1, 1, 1, 1 },
//		 { 1, 1, 1, 1, 1 },
//		 { 1, 1, 1, 1, 1 } };
//		 assertTrue(bingoCheck(board) == 2);
//		 }
//		 @Test
//		 void test2() {
//		 System.out.println("세번째");
//		 int[][] board = { { 0, 0, 0, 0, 0 },
//				 			{ 0 , 0, 0, 0,0 },
//				 			{ 0, 0, 0, 0, 0 },
//				 			{ 1, 1, 1, 1, 1 },
//				 			{ 1, 1, 1, 1, 1 } };
//		 assertTrue(bingoCheck(board) == 3);
//		 }
//		 @Test
//		 void test3() {
//		 System.out.println("네번째");
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
//		 System.out.println("첫번째");
//		 int[][] board = { { 0, 1, 0, 0, 0 },
//		 { 0, 1, 1, 1, 1 },
//		 { 0, 1, 1, 1, 1 },
//		 { 0, 1, 1, 1, 1 },
//		 { 0, 1, 1, 1, 1 } };
//		 assertTrue(bingoCheck(board) == 1);
//		 }
//		@Test
//		void test8() {
//			System.out.println("x번째");
//			int[][] board = { { 0, 0, 0, 0, 0 }, 
//								{ 0, 1, 1, 1, 1 }, 
//								{ 0, 1, 0, 1, 1 }, 
//								{ 0, 1, 1, 0, 1 },
//								{ 0, 1, 1, 1, 0 } };
//			assertTrue(bingoCheck(board) == 2);
//		}
//
//		static int bingoCheck(int[][] board) {
//			int cnt = 0;// 첫번째
//			int bingo =0;
//
//				for (int i = 0; i < 5; i++) {
//					for (int j = 0; j < 5; j++) { // 가
//
//						
//						if (board[i][j] == 0) { // 맞은거
//								 // 첫번째
//										cnt++;
//										//System.out.println("오오");
//									// System.out.println("1");
//									}
//						}
//						if(cnt==5) {
//							bingo++;
//						}
//						cnt =0;	
//					}
//				//가로
//					for (int j = 0; j < 5; j++) { // 가
//						for (int i = 0; i < 5; i++) {
//						if (board[i][j] == 0) { // 맞은거
//										cnt++;
//									}
//						}
//						if(cnt==5) {
//							bingo++;
//						}
//						cnt =0;	
//					}
//					
//					//오른대각
//						for (int i = 0; i < 5; i++) {
//							for (int j = 0; j < 5; j++) { // 가
//								if (board[i][j] == 0) { // 맞은거
//									if(i==j)
//										cnt++;
//									}
//						}
//						if(cnt==5) {
//							bingo++;
//						}
//					}
//						//왼대각
//						cnt =0; //대각선초기화
//						for (int i = 0; i < 5; i++) {
//							for (int j = 0; j < 5; j++) { // 가
//								if (board[i][j] == 0) { // 맞은거
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
