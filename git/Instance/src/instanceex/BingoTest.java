//package instanceex;
//
//class BingoTest {
//	
//	 @Test
//	 void test19() {
//	 System.out.println("�밢��");
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
//	 System.out.println("�밢��2");
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
//	 System.out.println("ù��°");
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
//	 System.out.println("�ι�°");
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
//	 System.out.println("����°");
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
//	 System.out.println("�׹�°");
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
//	 System.out.println("ù��°");
//	 int[][] board = { { 0, 1, 0, 0, 0 },
//	 { 0, 1, 1, 1, 1 },
//	 { 0, 1, 1, 1, 1 },
//	 { 0, 1, 1, 1, 1 },
//	 { 0, 1, 1, 1, 1 } };
//	 assertTrue(bingoCheck(board) == 1);
//	 }
//	@Test
//	void test8() {
//		System.out.println("x��°");
//		int[][] board = { { 0, 0, 0, 0, 0 }, 
//							{ 0, 1, 1, 1, 1 }, 
//							{ 0, 1, 0, 1, 1 }, 
//							{ 0, 1, 1, 0, 1 },
//							{ 0, 1, 1, 1, 0 } };
//		assertTrue(bingoCheck(board) == 1);
//	}
//
//	static int bingoCheck(int[][] board) {
//		int cnt = 0;// ù��°
//		int cnt1 = 0; // �ι�°
//		int cnt2 = 0;// �¹�°
//		int cnt3 = 0; // �׹�°
//		int cnt4 = 0; // �׹�°
//		
//		int acnt = 0;// ù��°
//		int acnt1 = 0; // �ι�°
//		int acnt2 = 0;// �¹�°
//		int acnt3 = 0; // �׹�°
//		int acnt4 = 0; // �׹�°
//		
//		int bcnt = 0;// ù��°
//		int bcnt1 = 0; // �ι�°
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
//		// // System.out.println(cnt+"����");
//		//// if(i+j==5) { //�밢
//		//// System.out.println("1");
//		////
//		//// cnt1 += 1;
//		//// }
//		//// if(i==j) { //�ݴ�밢
//		//// System.out.println("2");
//		//// cnt2 +=1;
//		// }
//		//
//		//
//		// }
//		for (int j = 0; j < 5; j++) { // ��
//			for (int i = 0; i < 5; i++) {
//
//				if (i == 0) { // ù��°
//					
//					if (board[i][j] == 0) // ������
//
//						for (int k = 0; k < 5; k++)
//							if (j == k && i >= 0) {// 1
//								cnt++;
//								// System.out.println("1");
//							}
//				
//				}
//				if (i == 1) {//�ι�°
//
//					if (board[i][j] == 0) // ������
//
//						for (int k = 0; k < 5; k++)
//							if (j == k && i >= 0) {// 1
//								cnt1++;
//								// System.out.println("1");
//							}
//				}
//				if (i == 2) {//����°
//
//					if (board[i][j] == 0) // ������
//
//						for (int k = 0; k < 5; k++)
//							if (j == k && i >= 0) {// 1
//								cnt2++;
//
//							}
//				}
//				if (i == 3) {//�׹�°
//
//					if (board[i][j] == 0) // ������
//
//						for (int k = 0; k < 5; k++)
//							if (j == k && i >= 0) {// 1
//								cnt3++;
//								// System.out.println("1");
//							}
//				}
//				if (i == 4) {//�ٹ�°
//
//					if (board[i][j] == 0) // ������
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
//		//���κ���
//		for (int j = 0; j < 5; j++) { // ��
//			for (int i = 0; i < 5; i++) {
//
//				if (j == 0) { // ù��°
//					
//					if (board[i][j] == 0) // ������
//
//						for (int k = 0; k < 5; k++)
//							if (i == k && i >= 0) {// 1
//								acnt++;
//								// System.out.println("1");
//							}
//				}
//				if (j == 1) {//�ι�°
//
//					if (board[i][j] == 0) // ������
//
//						for (int k = 0; k < 5; k++)
//							if (i == k && i >= 0) {// 1
//								acnt1++;
//								// System.out.println("1");
//							}
//				}
//				if (j == 2) {//����°
//
//					if (board[i][j] == 0) // ������
//
//						for (int k = 0; k < 5; k++)
//							if (i == k && i >= 0) {// 1
//								acnt2++;
//								// System.out.println("1");
//							}
//				}
//				if (j == 3) {//�׹�°
//
//					if (board[i][j] == 0) // ������
//
//						for (int k = 0; k < 5; k++)
//							if (i == k && i >= 0) {// 1
//								acnt3++;
//								// System.out.println("1");
//							}
//				}
//				if (j == 4) {//�ٹ�°
//
//					if (board[i][j] == 0) // ������
//
//						for (int k = 0; k < 5; k++)
//							if (i == k && i >= 0) {// 1
//								acnt4++;
//								// System.out.println("1");
//							}
//				}
//			}
//		}
//		//�밢�� �����
//		for (int j = 0; j < 5; j++) { // ��
//			for (int i = 0; i < 5; i++) {
//
//				if (i == j) { // ù��°
//					
//					if (board[i][j] == 0) // ������
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
//		//�밢�� �»���
//		for (int j = 0; j < 5; j++) { // ��
//			for (int i = 0; i < 5; i++) {
//
//				if (i + j==4) { // ù��°
//					
//					if (board[i][j] == 0) // ������
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
////			System.out.println("1����");
////		} else if (cnt >= 10 & cnt < 15) {
////			System.out.println("2����");
////		} else if (cnt >= 15 & cnt < 20) {
////			System.out.println("3����");
////		} else if (cnt >= 20 & cnt < 25) {
////			System.out.println("4����");
////		}
//		int sum =0;
//		int zum=0;
//		int kum =0;
//	//	System.out.println("cnt"+cnt+"��"+cnt1+"��"+cnt2+"��"+cnt3+"��"+cnt4);
//	//	System.out.println("acnt"+acnt+"��"+acnt1+"��"+acnt2+"��"+acnt3+"��"+acnt4);
//		
//		//���� ����
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
//		//���� 
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
//		// �밢�� ���� 
//		if(bcnt%5==0 && bcnt>0) {
//			kum+=1;
//		}		
//		if(bcnt1%5==0 && bcnt1>0) {
//			kum+=1;
//		}
//		
//		System.out.println("���κ���"+sum+"���κ���"+zum+"�밢��"+kum);
//		System.out.println("���� �� -����:"+(sum+zum+kum));
//		System.out.println();
//		System.out.println();
//		return 0;
//	}
//}
