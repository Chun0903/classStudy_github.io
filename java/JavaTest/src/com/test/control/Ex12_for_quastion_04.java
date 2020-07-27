package com.test.control;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ex12_for_quastion_04 {
	
	public static void main(String[] args) throws Exception{
		
		m1();
	}
	public static void m1() throws Exception{
		//숫자 10개를 입력받아 짜굿의 합과 홀수의 합을 각각 출력하시오
		
		//5. 누적변수 (짝수용, 홀수용)
		//3. 반복문 실행(for)
		//1. BufferedReader 만든다
		//2. 숫자를 입력한다.
		//6. 짝수인지? 홀수인지?
		//7. 짝수면 > 짝수용 누적 변수에 누적
		//	 홀수면 > 홀수용 누적 변수에 누적
		//4. }
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); //1.
		
		int oddSum = 0; 
		int evenSum = 0;
		
		for (int i=0; i<10; i++) {//3.
		System.out.print("숫자 : "); //1.
		int num = Integer.parseInt(reader.readLine());
		
		if (num % 2 == 0) {
			evenSum +=num; //8.
		} else {
			oddSum += num; //8.
		}
		}System.out.printf("짝수의 합 : %d\n 홀수의 합 : %d", evenSum, oddSum);
		
		
		
		
	}

}
