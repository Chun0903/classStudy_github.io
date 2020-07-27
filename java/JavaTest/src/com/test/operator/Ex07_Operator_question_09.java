package com.test.operator;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ex07_Operator_question_09 {


	public static void main(String[] args) throws Exception {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		//요구사항] 영문자 1개를 입력받아서 그 문자가 대문자인지 소문자인지 구분하시오.
		//입력] 영문자 입력 : a
		//		영문자 입력 : E
		

		System.out.print("영문자 입력 : ");
		int a = reader.read();

		System.out.printf("입력한 문자 '%c'는 %s입니다.\n", a, a >= 'a' && a <= 'z' ? "소문자" : a >= 'A' && a <= 'Z' ? "대문자" : "?");
		

		
		
		
		
		
	}

}
