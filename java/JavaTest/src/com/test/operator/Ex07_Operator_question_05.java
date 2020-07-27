package com.test.operator;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ex07_Operator_question_05 {

	public static void main(String[] args) throws Exception {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		//요구사항] 사용자의 한달 수입을 입력받아 세후 금액을 출력하시오.
		//입력] 한달 수입 금액 (원) : 1000000
		
		System.out.print("한달 수입 금액 (원) : ");
		int m = Integer.parseInt(reader.readLine());
		
		double p = 3.3 * 0.01;
		double s = m * p;
		
		System.out.printf("세후 금액(원) : %,.0f원\n", m - s);
		System.out.printf("세금(원) : %,.0f원", s);
		
			
				
		
	}
}
