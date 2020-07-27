package com.test.operator;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ex07_Operator_question_10 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
 
	//요구사항] 섭씨 온도를 입력받아서 화씨 온도로 변환하시오.
	//입력] 섭씨 (℃) : 29
		
	System.out.print("섭씨 (℃) : ");
	double a = Integer.parseInt(reader.readLine());
	
	double f = a * 1.8 + 32;
	
	System.out.printf("섭씨 %.0f℃는 화씨 %.1f°F입니다.", a, f);
	


	}
			
	
}
