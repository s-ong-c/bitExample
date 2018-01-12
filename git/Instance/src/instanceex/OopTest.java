package instanceex;

import java.util.Arrays;

public class OopTest {

	public static void main(String[] args) {
		int [] arr = new int[10];
		for(int i=0;i<arr.length;i++) {
			arr[i] = i;
		}
		//System.out.println();
		System.out.println(Arrays.toString(shuffle(arr))+"����");
		System.out.println(Arrays.toString(sort(new int [] {1,5,5,5,3,3,2,6,6,2,2}))+"����");
	//	System.out.println(Arrays.toString(distinct(new int [] {1,5,5,5,3,3,2,6,6,2,2}))+"���");
		//System.out.println(Arrays.toString(sort(arr)));
		
	}

	static int[] shuffle(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			int x = (int) (Math.random() * arr.length);

			int tmp = arr[i];
			arr[i] = arr[x];
			
			arr[x] = tmp;
		}
		return arr;
	}

	static int[] distinct(int[] arr) {
		int[] tmpArr = new int[arr.length];

		for (int i = 0; i < arr.length; i++) {
			tmpArr[arr[i]]++;
		}
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(tmpArr) + "����");

		for (int i = 0; i < tmpArr.length; i++) {
			if (tmpArr[i] > 0)
				System.out.println(i + "�ߺ�����");
		}

		return arr;
	}

	static int[] sort(int[] arr) {
		int[] tmpArr = new int[arr.length];

//		for (int i = 0; i < arr.length; i++) {
//			tmpArr[arr[i]]++;
//		}
//		System.out.println(Arrays.toString(arr));
//		System.out.println(Arrays.toString(tmpArr));

		for (int i = 0; i < tmpArr.length; i++) {
			for (int j = 1; j < arr.length - 1; j++)
				if (arr[j] > arr[j + 1]) {

					int tmp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = tmp;

				}
		}
		System.out.println(Arrays.toString(arr) + "����");
		System.out.println(Arrays.toString(tmpArr) + "����");

		return arr;

	}

	static int max(int[] arr) {

		int max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
		}
		System.out.println(Arrays.toString(arr));
		// ctrl + shift +o

		return max;
	}
}
