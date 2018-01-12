	package io;
	
	import java.io.ByteArrayInputStream;
	import java.io.ByteArrayOutputStream;
	import java.io.IOException;
	import java.util.Arrays;
	
	public class IOEx4 {
		public static void main(String[] args) {
			byte[ ] inSrc = {0,1,2,3,4,5,6,7,8,9};
			byte[ ] outSrc = null;
			byte[ ] temp = new byte[4];  //4개
			
			ByteArrayInputStream input =  null;
			ByteArrayOutputStream output = null;
			
			input = new ByteArrayInputStream(inSrc);
			output =new ByteArrayOutputStream();
			
			try {
				
				while(input.available()>0) {// 반환 할수 있는게 있다면 
					int len = input.read(temp);
					output.write(temp,0,len);}  // len 개 만큼 쓰자 0번째 부터 
			
			} catch (IOException e) {}
		
			outSrc = output.toByteArray();
			
			System.out.println("Input Source"+Arrays.toString(inSrc));
			System.out.println("temp"+Arrays.toString(temp));
			System.out.println("output Source"+Arrays.toString(outSrc));
		
		
		}
	}
