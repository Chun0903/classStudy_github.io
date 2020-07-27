package com.test.operator;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ex07_Operator_question_04 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		

	//요구사항] 자전거가 있다. 자전거의 바퀴는 지름이 26인치이다. 사용자가 페달을 밟은
	//			횟수를 입력하면 자전거가 총 몇 m를 달렸는지 출력하시오
	//입력] 사용자가 페달을 밟은 횟수 : 1000
		
		System.out.print("사용자가 페달을 밟은 횟수 : ");
		int n = Integer.parseInt(reader.readLine());
		
	int c = 26;
	int r = c / 2;
	double p = r * 2 *3.14d; 
	double g = p * 1; 				//기어비
	double pn = p * n *0.01 *g; 	//총 거리
	
	System.out.printf("사용자가 총 %,d회 페달을 밟아 자전거가 총 %.0fm를 달렸습니다."
									, n
									, pn);
	
	
	
	}
	
}
