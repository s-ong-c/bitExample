//package instanceex;
//
//class BingoTest {
//	
//	 @Test
//	 void test19() {
//	 System.out.println("대각선");
//	 System.out.println();
//	 System.out.println();
//	 
//	 int[][] board = { 
//			 			{0,0,0,0,0},
//			 			{0 ,0,0,0,0},
//			 			{ 1, 1, 0, 1, 1 },
//			 			{ 1, 1, 1, 0, 1 },
//			 			{ 1, 1, 1, 1, 0 } };
//	 //assertTrue(bingoCheck(board) == 2);
//	 }
//	 
//	 @Test
//	 void test20() {
//	 System.out.println("대각선2");
//	 System.out.println();
//	 System.out.println();
//	 int[][] board = { { 0, 0, 0, 0, 0 },
//			 			{ 0 , 0, 0, 0,0 },
//			 			{ 1, 1, 0, 1, 1 },
//			 			{ 1, 0, 1, 0, 1 },
//			 			{ 0, 1, 1, 1, 0 } };
//	 assertTrue(bingoCheck(board) == 4);
//	 }
//
//	 @Test
//	 void test() {
//	 System.out.println("첫번째");
//	 System.out.println();
//	 System.out.println();
//	 int[][] board = { { 0, 0, 0, 0, 0 },
//	 { 0, 1, 1, 1, 1 },
//	 { 1, 1, 1, 1, 1 },
//	 { 1, 1, 1, 1, 1 },
//	 { 1, 1, 1, 1, 1 } };
//	 assertTrue(bingoCheck(board) == 1);
//	 }
//	 @Test
//	 void test1() {
//	 System.out.println("두번째");
//	 System.out.println();
//	 System.out.println();
//	 int[][] board = { { 0, 0, 0, 0, 0 },
//	 { 0 , 0, 0, 0,0 },
//	 { 1, 1, 1, 1, 1 },
//	 { 1, 1, 1, 1, 1 },
//	 { 1, 1, 1, 1, 1 } };
//	 assertTrue(bingoCheck(board) == 2);
//	 }
//	 @Test
//	 void test2() {
//	 System.out.println("세번째");
//	 System.out.println();
//	 System.out.println();
//	 int[][] board = { { 0, 0, 0, 0, 0 },
//			 			{ 0 , 0, 0, 0,0 },
//			 			{ 0, 0, 0, 0, 0 },
//			 			{ 1, 1, 1, 1, 1 },
//			 			{ 1, 1, 1, 1, 1 } };
//	 assertTrue(bingoCheck(board) == 1);
//	 }
//	 @Test
//	 void test3() {
//	 System.out.println("네번째");
//	 System.out.println();
//	 System.out.println();
//	 int[][] board = { { 0, 0, 0, 0, 0 },
//	 { 0 , 0, 0, 0,0 },
//	 { 0, 0, 0, 0, 0 },
//	 {0, 0, 0, 0, 0 },
//	 { 1, 1, 1, 1, 1 } };
//	 assertTrue(bingoCheck(board) == 1);
//	
//	 }
//	 @Test
//	 void test5() {
//	 System.out.println("첫번째");
//	 int[][] board = { { 0, 1, 0, 0, 0 },
//	 { 0, 1, 1, 1, 1 },
//	 { 0, 1, 1, 1, 1 },
//	 { 0, 1, 1, 1, 1 },
//	 { 0, 1, 1, 1, 1 } };
//	 assertTrue(bingoCheck(board) == 1);
//	 }
//	@Test
//	void test8() {
//		System.out.println("x번째");
//		int[][] board = { { 0, 0, 0, 0, 0 }, 
//							{ 0, 1, 1, 1, 1 }, 
//							{ 0, 1, 0, 1, 1 }, 
//							{ 0, 1, 1, 0, 1 },
//							{ 0, 1, 1, 1, 0 } };
//		assertTrue(bingoCheck(board) == 1);
//	}
//
//	static int bingoCheck(int[][] board) {
//		int cnt = 0;// 첫번째
//		int cnt1 = 0; // 두번째
//		int cnt2 = 0;// 셋번째
//		int cnt3 = 0; // 네번째
//		int cnt4 = 0; // 네번째
//		
//		int acnt = 0;// 첫번째
//		int acnt1 = 0; // 두번째
//		int acnt2 = 0;// 셋번째
//		int acnt3 = 0; // 네번째
//		int acnt4 = 0; // 네번째
//		
//		int bcnt = 0;// 첫번째
//		int bcnt1 = 0; // 두번째
//		
//
//		// for (int i = 0; i < 5; i++) {
//		//
//		// for (int j = 0; j < 5; j++) {
//		//
//		//
//		// if (board[i][j] == 0)
//		// for(int k=0;k<5;k++)
//		// if (i == k && j >= 0) {//1
//		// cnt++;
//		// // System.out.println("?");
//		// }
//		//
//		// // System.out.println(cnt+"갯수");
//		//// if(i+j==5) { //대각
//		//// System.out.println("1");
//		////
//		//// cnt1 += 1;
//		//// }
//		//// if(i==j) { //반대대각
//		//// System.out.println("2");
//		//// cnt2 +=1;
//		// }
//		//
//		//
//		// }
//		for (int j = 0; j < 5; j++) { // 가
//			for (int i = 0; i < 5; i++) {
//
//				if (i == 0) { // 첫번째
//					
//					if (board[i][j] == 0) // 맞은거
//
//						for (int k = 0; k < 5; k++)
//							if (j == k && i >= 0) {// 1
//								cnt++;
//								// System.out.println("1");
//							}
//				
//				}
//				if (i == 1) {//두번째
//
//					if (board[i][j] == 0) // 맞은거
//
//						for (int k = 0; k < 5; k++)
//							if (j == k && i >= 0) {// 1
//								cnt1++;
//								// System.out.println("1");
//							}
//				}
//				if (i == 2) {//세번째
//
//					if (board[i][j] == 0) // 맞은거
//
//						for (int k = 0; k < 5; k++)
//							if (j == k && i >= 0) {// 1
//								cnt2++;
//
//							}
//				}
//				if (i == 3) {//네번째
//
//					if (board[i][j] == 0) // 맞은거
//
//						for (int k = 0; k < 5; k++)
//							if (j == k && i >= 0) {// 1
//								cnt3++;
//								// System.out.println("1");
//							}
//				}
//				if (i == 4) {//다번째
//
//					if (board[i][j] == 0) // 맞은거
//
//						for (int k = 0; k < 5; k++)
//							if (j == k && i >= 0) {// 1
//								cnt4++;
//								// System.out.println("1");
//							}
//				}
//			}
//		
//		
//		}
//	//	System.out.println(cnt);
//		//세로빙고
//		for (int j = 0; j < 5; j++) { // 가
//			for (int i = 0; i < 5; i++) {
//
//				if (j == 0) { // 첫번째
//					
//					if (board[i][j] == 0) // 맞은거
//
//						for (int k = 0; k < 5; k++)
//							if (i == k && i >= 0) {// 1
//								acnt++;
//								// System.out.println("1");
//							}
//				}
//				if (j == 1) {//두번째
//
//					if (board[i][j] == 0) // 맞은거
//
//						for (int k = 0; k < 5; k++)
//							if (i == k && i >= 0) {// 1
//								acnt1++;
//								// System.out.println("1");
//							}
//				}
//				if (j == 2) {//세번째
//
//					if (board[i][j] == 0) // 맞은거
//
//						for (int k = 0; k < 5; k++)
//							if (i == k && i >= 0) {// 1
//								acnt2++;
//								// System.out.println("1");
//							}
//				}
//				if (j == 3) {//네번째
//
//					if (board[i][j] == 0) // 맞은거
//
//						for (int k = 0; k < 5; k++)
//							if (i == k && i >= 0) {// 1
//								acnt3++;
//								// System.out.println("1");
//							}
//				}
//				if (j == 4) {//다번째
//
//					if (board[i][j] == 0) // 맞은거
//
//						for (int k = 0; k < 5; k++)
//							if (i == k && i >= 0) {// 1
//								acnt4++;
//								// System.out.println("1");
//							}
//				}
//			}
//		}
//		//대각선 우상향
//		for (int j = 0; j < 5; j++) { // 가
//			for (int i = 0; i < 5; i++) {
//
//				if (i == j) { // 첫번째
//					
//					if (board[i][j] == 0) // 맞은거
//
//						for (int k = 0; k < 5; k++)
//							if (j == k && i >= 0) {// 1
//								bcnt++;
//								// System.out.println("1");
//							}
//				}
//		
//		
//			}
//		}
//		//대각선 좌상향
//		for (int j = 0; j < 5; j++) { // 가
//			for (int i = 0; i < 5; i++) {
//
//				if (i + j==4) { // 첫번째
//					
//					if (board[i][j] == 0) // 맞은거
//
//						for (int k = 0; k < 5; k++)
//							if (j == k && i >= 0) {// 1
//								bcnt1++;
//								// System.out.println("1");
//							}
//				}
//		
//		
//			}
//		}
////			System.out.println(bcnt+"z");
////		System.out.println("a" + cnt);
//
////		if (cnt >= 5 & cnt < 10) {
////			System.out.println("1빙고");
////		} else if (cnt >= 10 & cnt < 15) {
////			System.out.println("2빙고");
////		} else if (cnt >= 15 & cnt < 20) {
////			System.out.println("3빙고");
////		} else if (cnt >= 20 & cnt < 25) {
////			System.out.println("4빙고");
////		}
//		int sum =0;
//		int zum=0;
//		int kum =0;
//	//	System.out.println("cnt"+cnt+"숫"+cnt1+"셋"+cnt2+"네"+cnt3+"닷"+cnt4);
//	//	System.out.println("acnt"+acnt+"숫"+acnt1+"셋"+acnt2+"네"+acnt3+"닷"+acnt4);
//		
//		//가로 빙고
//		if(cnt%5==0 && cnt>0) {
//			sum+=1;
//		}
//		if(cnt1%5==0 && cnt1>0) {
//			sum+=1;
//		}
//		if(cnt2%5==0 && cnt2>0) {
//			sum+=1;
//		}
//		if(cnt3%5==0 && cnt3>0) {
//			sum+=1;
//		}		
//		if(cnt4%5==0 && cnt4>0) {
//			sum+=1;
//		}
//		
//		//세로 
//		if(acnt%5==0 && acnt>0) {
//			zum+=1;
//		}
//		if(acnt1%5==0 && acnt1>0) {
//			zum+=1;
//		}
//		if(acnt2%5==0 && acnt2>0) {
//			zum+=1;
//		}
//		if(acnt3%5==0 && acnt3>0) {
//			
//			zum+=1;
//		}		
//		if(acnt4%5==0 && acnt4>0) {
//			zum+=1;
//		}
//		// 대각선 갯수 
//		if(bcnt%5==0 && bcnt>0) {
//			kum+=1;
//		}		
//		if(bcnt1%5==0 && bcnt1>0) {
//			kum+=1;
//		}
//		
//		System.out.println("가로빙고"+sum+"세로빙고"+zum+"대각선"+kum);
//		System.out.println("따라서 총 -빙고:"+(sum+zum+kum));
//		System.out.println();
//		System.out.println();
//		return 0;
//	}
//}
