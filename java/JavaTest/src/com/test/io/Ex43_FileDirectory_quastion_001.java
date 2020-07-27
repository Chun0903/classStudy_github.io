package com.test.io;

import java.io.File;
import java.util.Scanner;

public class Ex43_FileDirectory_quastion_001 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		String path = input.next();
//		String path = "D:\\class\\java\\file\\test.txt";
		File file = new File(path);
		
		if(file.exists()) {
			
			File[] list = file.listFiles();
			

				if(file.isFile()) {
					
					String name = file.getName();
					int doc= name.lastIndexOf(".");
					String namFile = name.substring(doc+1);
					
					System.out.printf("파일명 : %s\n",file.getName());
					System.out.printf("종류: %s 파일\n",namFile);
					System.out.printf("파일 크기 : %dKb",file.length() /1024);
				
			}
			
		}else {
			System.out.println("파일없음");
		}
		
	}

}
