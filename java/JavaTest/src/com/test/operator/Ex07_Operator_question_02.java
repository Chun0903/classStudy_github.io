
package com.test.operator;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ex07_Operator_question_02 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		//요구사항] 숫자 2개를 입력받아 아래의 연산과정과 연산 결과를 출력하시오.
		//입력] 첫번째 숫자: 5
		//		두번째 숫자: 3
		//조건] 천단위 표기
		//		나누기 결과 소수이하 1자리까지 
		
		System.out.print("첫번째 숫자 : ");
		int a = Integer.parseInt(reader.readLine());
		
		System.out.print("두번째 숫자 : ");
		int b = Integer.parseInt(reader.readLine());
		 
		System.out.printf("%d %s %d %s %,d\n", a, "+", b, "=", a + b);
		System.out.printf("%d %s %d %s %,d\n", a, "-", b, "=", a - b);
		System.out.printf("%d %s %d %s %,d\n", a, "*", b, "=", a * b);
		System.out.printf("%d %s %d %s %.1f\n", a, "/", b, "=", (float)a / (float)b);
		System.out.printf("%d %s %d %s %,d\n", a, "%", b, "=", a % b);

		
		
		
	}

}
