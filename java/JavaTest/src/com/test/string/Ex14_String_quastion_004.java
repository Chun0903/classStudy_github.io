package com.test.string;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ex14_String_quastion_004 {

	public static void main(String[] args) throws Exception{
		
		//요구사항.004
		//파일명 10개를 입력받아 각 확장자 별로 총 개수를 출력하시오.
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int gifSum = 0;
		int jpgSum = 0;
		int pngSum = 0;
		int hwpSum = 0;
		int docSum = 0;
		
		for (int i=1; i<=10; i++) {
		
			System.out.print("파일명 : ");
			String filename = reader.readLine();
		if (filename.toLowerCase().endsWith(".gif")) {
			gifSum += 1;
		} else if (filename.toLowerCase().endsWith(".jpg")) {
			jpgSum +=1;
		} else if (filename.toLowerCase().endsWith(".png")) {
			pngSum +=1;
		} else if (filename.toLowerCase().endsWith(".hwp")) {
			hwpSum +=1;
		} else if (filename.toLowerCase().endsWith(".doc")) {
			docSum +=1;
		} else {
			
		}
		}
		System.out.printf("gif : %d개\n"
				+ "jpg : %d개\n"
				+ "png : %d개\n"
				+ "hwp : %d개\n"
				+ "doc: %d개\n"
				,gifSum, jpgSum, pngSum, hwpSum, docSum);
				
				
				
				
				

		
	}
	
	
}
