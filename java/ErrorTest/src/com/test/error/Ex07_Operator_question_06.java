package com.test.error;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ex07_Operator_question_06 {

	public static void main(String[] args) throws Exception {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("문자 입력 : ");
		int input = reader.read();
		int c = input;
		
		System.out.printf("소문자 '%c'의 대문자는 '%c'입니다.\n", c, c - 32);
		
	}
	
}








