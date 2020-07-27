package com.test.operator;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ex07_Operator_question_03 {

	public static void main(String[] args) throws Exception {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		//요구사항] 사각형의 너비와 높이를 입력받아 넓이롸 둘레를 출력하시오.
		//입력] 너비(cm) : 20
		//		높이(cm) : 10
		
		System.out.print(" 너비 : ");
		int a = Integer.parseInt(reader.readLine());
		
		System.out.print(" 높이 : ");
		int b = Integer.parseInt(reader.readLine());
		
		int insertc = a * b;
		int insertd = a * 2 + b * 2;
		
		
		System.out.printf("사각형의 넓이는 %dcm² 입니다.\n", insertc);
		System.out.printf("사각형의 둘레는 %dcm 입니다.", insertd);
		
		 
		
	}
}
