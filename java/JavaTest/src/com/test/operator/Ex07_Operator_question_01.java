package com.test.operator;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ex07_Operator_question_01 {

	public static void main(String[] args)  throws Exception {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		//요구사항] 태어난 년도를 입력받아 나이를 출력하시오.
		//입력] 태어난 연도 : 1990
		//출력] 나이 : 25세
		
		System.out.print("태어난 연도 : ");
		
		int year = Integer.parseInt(reader.readLine());
		
		int age = 2019 - year -1;
		
		System.out.printf("나이 : %d세", age);
		
		
		
		
		
	}
	
	
}
