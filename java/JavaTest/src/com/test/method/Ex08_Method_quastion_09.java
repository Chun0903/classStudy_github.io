package com.test.method;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ex08_Method_quastion_09 {

	public static void main(String[] args)throws Exception {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("맑은 날 : ");
		int good = Integer.parseInt(reader.readLine());
		System.out.print("흐린 날 : ");
		int bad = Integer.parseInt(reader.readLine());
		
		int result = gatApple(good, bad);
		
		System.out.printf("사과가 총 %d개 열렸습니다.", result);

	}
	public static int gatApple(int good, int bad) {
		
		int result=  ((good * 5 + bad * 2) - 100) / 10;
		
		return result;
		
	}
	
	
	
}
