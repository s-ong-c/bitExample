package instanceex;

import java.util.Arrays;
import java.util.Random;

public class Test5_5 {

	static int strike = 0; // ���� ���� ����
	static int ball = 0; // ���� ���� ����

	public static void main(String[] args) {

		int a[] = new int[] { 1, 2, 3 };
		int b[] = new int[] { 6, 8, 3 }; // �������� �Է¹޴� ���� ������ �迭 ����

//		Random ra = new Random();
//
//		while (a[0] == 0) {
//			a[0] = ra.nextInt(10);
//		}
//		while (a[0] == a[1] || a[1] == 0) {
//			a[1] = ra.nextInt(10);
//		}
//		while (a[0] == a[2] || a[1] == a[2] || a[2] == 0) {
//			a[2] = ra.nextInt(10);
//		}
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
		while (strike < 3) {

			for (int i = 0; i < b.length; i++) {

				while (b[i] >= 10 || b[i] == 0) {
				}
			}
			for (int i = 0; i < 3; i++) { // strike, ball ���� üũ
				for (int j = 0; j < 3; j++) {
					if (a[i] == b[j]) {
						if (i == j) {
							strike += 1;
						} else {
							ball += 1;
						} // strike, ball �� ����
					}
				}
			}
		//	System.out.println(ra.nextInt(10));
			if (strike == 0 && ball == 0) {
				System.out.println("\n�ƿ�!\n");
			} else if (strike == 3) { // ������ ���
				System.out.print("\n3��Ʈ����ũ ");
				System.exit(0);
			} else {
				System.out.println("\n" + strike + " Strike" + ", " + ball + " Ball\n");
				strike = 0;
				ball = 0;
				System.exit(0);
			}
		}
	}
}
