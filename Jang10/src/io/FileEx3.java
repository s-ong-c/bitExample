package io;

import java.io.File;

public class FileEx3 {
	static int totoalFiles =0;
	static int totalDirs = 0;
	
	public static void main(String[] args) {
		if(args.length !=1) {
			System.out.println("USAGE: java FileEx3 Directory");
			System.exit(0);
		}
		File dir = new File(args[0]);
		
		if(!dir.exists() || !dir.isDirectory()) {
			
		}
		
	}

}
