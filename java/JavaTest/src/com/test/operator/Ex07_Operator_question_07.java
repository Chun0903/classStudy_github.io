package com.test.operator;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ex07_Operator_question_07 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		//요구사항] 숫자 2개를 입력받아서 둘 중 더 큰 숫자를 출력하시오.
		//입력] 첫번째 숫자 : 5
		//		두번째 숫자 : 3
		
		
		System.out.print("첫번째 숫자 : ");
		int a = Integer.parseInt(reader.readLine());
		
		System.out.print("두번째 숫자 : ");
		int b = Integer.parseInt(reader.readLine());
		 
		int result = a > b ? a : b; 
		
		System.out.printf("%d와(과) %d 중에 더 큰 숫자는 %d 입니다.", a, b
																	, result);
		
		
	}

}
