package com.test.control;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ex12_for_quastion_07 {
	
	public static void main(String[] args) throws Exception{
		
		m1();
	}
	public static void m1() throws Exception{
		
		
		boolean loop = true;
		
		for (;loop;) {
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("아래에 입력하세요.");
			String input1= reader.readLine();
			String input2= reader.readLine();
			String input3= reader.readLine();
			
			System.out.println(input1);
			System.out.println(input2);
			System.out.println(input3);
			
			if (input1.equals(input1) && input2.equals(input2) && input3.equals(input3)) {
				pause();
			} else if (input1.equals("")) {
				loop = false;
			} else {
			}
		}
		
	}
	private static void pause() throws Exception{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("프로그램을 종료합니다.");
		reader.readLine();
		
	}

}
