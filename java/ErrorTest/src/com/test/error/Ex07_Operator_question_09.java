package com.test.error;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ex07_Operator_question_09 {

	public static void main(String[] args) throws Exception {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("영문자 입력 : ");
		int c = reader.read();
		
		System.out.printf("입력한 문자 '%c'는 %s입니다.", c, c >= 'a' || c <= 'z' ? "소문자" : c >= 'A' || c <= 'Z' ? "대문자" : "?");
		
		//공식 = a ? b : c ? d :e
		
	}
	
}








