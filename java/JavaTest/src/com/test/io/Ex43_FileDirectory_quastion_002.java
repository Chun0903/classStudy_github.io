package com.test.io;

import java.io.File;
import java.util.Scanner;

public class Ex43_FileDirectory_quastion_002 {
	
	public static void main(String[] args) {
		
		//폴더 선택: D:\\Class\\java\\JavaTest\\src\\com\\test\\array
		//파일 확장자 : java
		
		Scanner scan = new Scanner(System.in);
		
		String path = scan.nextLine();
				
		File file = new File(path);
		
//		Scanner inputFile = new Scanner(System.in);
		
		String nameReal = scan.nextLine();
//		String nameReal = input.next();
		
		scan.close();
		
		if(file.exists()) {
			
			File[] list = file.listFiles();
			
			for(File sub : list) {
			
			String name = sub.getName();
			int doc= name.lastIndexOf(".");
			String nameFile = name.substring(doc+1);
			
			if(nameFile == nameReal) {
				System.out.println(sub.getName());
			}
			
			}
			
			
			
		}else {
			System.out.println("파일 없음");
		}
		
		
	}

}
