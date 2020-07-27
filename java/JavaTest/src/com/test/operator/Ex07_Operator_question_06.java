package com.test.operator;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ex07_Operator_question_06 {

	public static void main(String[] args) throws Exception {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		//요구사항] 영문 소문자를 1자 입력받은 후 대문자로 변환해서 출력하시오.
		//입력] 문자 입력 : a
		
		// a~ z: 97~ 122
		// A~ Z: 65~ 90		
		
		System.out.print("문자 입력 : ");
		int s = reader.read();
		
		int ss = (char)'a';
		int b = ss - 32;
		char breal = (char)b;
		System.out.printf("소문자 '%c'의 대문자는 '%c'입니다.", s ,breal);
		
	}
}

