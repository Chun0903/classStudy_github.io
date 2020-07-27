package com.test.io;

import java.io.File;
import java.util.Scanner;

import com.test.object.Espresso;

public class Ex43_FileDirectory_quastion_003 {
	
	public static void main(String[] args) {
		
		//D:\Class\java\io\AAA\아무거나.txt
		//D:\Class\java\io\BBB\아무거나.txt"
		
		String path = "D:\\Class\\java\\io\\AAA\\아무거나.txt";
		
		File file = new File(path);
		
		if(file.exists()) {
			
			String path2  = "D:\\Class\\java\\io\\BBB\\아무거나.txt";
			File file2 = new File(path2);
			
			Scanner scan = new Scanner(System.in);
			String answer = scan.nextLine();
			scan.close();
			
			if(!file2.exists()) {
				file.renameTo(file2);
				System.out.println("파일이동을 실행합니다");
				
			}else if(file2.exists()) {

				System.out.println("같은 이름을 가지는 파일이 이미 존재합니다. 덮어쓸까요? (y/n)");
				
				if(answer.equals("y")) {
					
					file2.delete();
					file.renameTo(file2);
					System.out.println("y. 파일을 덮어썼습니다.");
					
				}else if(answer.equals("n")) {
					System.out.println("n.작업을 취소합니다.");
				}
				
			}
			
			
		}
		
		
	}

}
