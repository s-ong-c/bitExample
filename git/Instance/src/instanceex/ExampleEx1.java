package instanceex;

import java.util.Arrays;

class ExampleEx1 {
	
	public static void main(String[] args) {
		int [] arr = new int [10];
		
		System.out.println("���");
		shuttleArr(arr);
		printArr(arr);
		System.out.println("����-��������");
		sortArr(arr);
		printArr(arr);
		
		System.out.println("�ߺ�����");
		distinct(arr);
		sortArr(arr);
		printArr(arr);
	}
	static void shuttleArr(int [] arr) {

		
			for(int i=0;i<arr.length;i++)
			
			arr[i] = (int)(Math.random()*arr.length)+1; // ���� ���� ��ȯ

			
	}
	static void printArr(int [] arr) {
		for(int i :arr) 
			System.out.println(i+1);
	}
	static void sortArr(int[] arr) {  // ����
		for(int i =1;i<arr.length-1;i++)
			for(int j=1;j<arr.length-1;j++)
				if(arr[j]>arr[j+1]) {
					
					int tmp =arr[j];
					arr[j]=arr[j+1];
					arr[j+1] = tmp;
				}
	}
	
static void distinct(int[] arr) {
	int[] tmpArr = new int[arr.length];

	for (int i = 0; i < arr.length; i++) {
		tmpArr[arr[i]]++;
	}
	System.out.println(Arrays.toString(arr));
	System.out.println(Arrays.toString(tmpArr) + " 0");

	for (int i = 0; i < tmpArr.length; i++) {
		if (tmpArr[i] > 0)
			System.out.println(i + "asd");
	}
}
//		for(int i =1;i<arr.length;i++) {
//			for(int j=1;j<i;j++) {
//					if(arr[i]==arr[j]) {
//						arr[i] = 0;
//						//continue; 
//				
//							
//						
//				}
//					continue;
//		}
//			
//	}
//}
}

//	static void distinct(int[] arr) {  // ����
//			for(int i =1;i<arr.length;i++) {
//				arr[i]= (int)(Math.random()*9)+1;
//				for(int j=0;j<i;j++) {
//						
//						if(arr[i]==arr[j]) {
//							i--;
//							
//						}
//					}
//			
//				}
//			}
//	static void distinct1(int[] arr) { 
//		for(int i =1;i<arr.length-1;i++) {
//			arr[i] = (int)(Math.random()*9);
//			for(int j=0;j<i;j++) {
//					if(arr[i]==arr[j]) {
//						i--;
//						continue;
//		
//						}
//					else {
//						if(arr[j]>arr[j+1]) {
//							int tmp =arr[j];
//							arr[j]=arr[j+1];
//							arr[j+1] = tmp;
//					}
//		
//				}
//	
//			}
//		
//		}
//	
//	}

	
		
	

