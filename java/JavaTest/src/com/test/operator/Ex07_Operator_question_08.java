package com.test.operator;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ex07_Operator_question_08 {

	public static void main(String[] args) throws Exception {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		//요구사항] 2020년 4월 1일은 수요일이다. 2020년 4월 중 한 날짜를 입력받아서
		//			무슨요일인지 출력하시오.
		//입력] 날짜 입력 : 20
		
		System.out.print("날짜 입력 : ");
		int a = Integer.parseInt(reader.readLine());
		
		int leave = a % 7;
		String dat = leave % 7 == 1 ? "수" : leave % 7 == 2 ? "목" : leave % 7 == 3 ? "금" :
					 leave % 7 == 4 ? "토" : leave % 7 == 5 ? "일" :leave % 7 == 6 ? "월" : 
					 leave % 7 == 3 ? "화" : "";
		
		System.out.printf("입력하신 2020년 4월 %d일은 '%s요일'입니다.", a, dat);
		

		 
		
		
		
		
	}
	
	
	
}
