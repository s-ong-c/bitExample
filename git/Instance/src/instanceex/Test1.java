package instanceex;

import java.util.Arrays;

import javax.naming.spi.DirStateFactory.Result;

 class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int array[] =new int [] {100,60,70};  //배열로 받았을때 
		
		//mid(array);
	
		//int array[ ] = new int [] {};
		//int x,y,z;
		int result =mid(1,2,3);
	
		System.out.println(result); 
		System.out.println(mid(1,2,3));
		System.out.println(mid(4,5,6));
		//System.out.println(mid(6,9,3));
		System.out.println(mid(2,1,3));
		System.out.println(mid(10,20,30));
		System.out.println(mid(100,200,300));
	}

//static void mid(int array[]){
//	
//		
//		for(int i=0;i<array.length;i++) {
//			Arrays.sort(array);
//		}
//		System.out.println(array[array.length/2]);
//	}
	// 세 값중에서 
static 	int mid(int x,int y,int z) {
		
		
		
		if(x>z &&x<y) {
			
			return x;
		}
		else if(z>y && z<x) {
			return z;
		}
		else if(y>x && y<z) {
			return y;
		}else if(x<z && x>y) {
			return x;
		}
			
		
	return 0;
	}
 }
 
