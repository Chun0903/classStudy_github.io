package com.test.error2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ex12_For_use_01 {
	
	public static void main(String[] args) throws Exception {
		
		m1();
		m2();
		m3();
		
	}

	private static void m3() throws Exception {
		
		//사용자가 짝수를 입력하면 누적, 홀수를 입력하면 중단하시오. 횟수는 무제한입니다.
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		int sum = 0;
		int i;
		
		for (i=0;;i++) {
			
			System.out.print("숫자: ");
			int num = Integer.parseInt(reader.readLine());
			sum += i;
			if (num % 2 == 0) {
				sum = num;
			} else {
				break;
			}
			
		}
		
		System.out.printf("%d회 입력 결과: %,d\n", i, sum);		
		
	}

	private static void m2() {
		
		//1 ~ 10까지의 합을 구하시오.
		int sum = 0;
		
		for (int i=1; i<=10; i++) {
			System.out.println(i);
			sum += i;
		}
		
		System.out.println(sum);
		
		
	}

	private static void m1() {
		
		//구구단 출력
		// - 9단을 출력합니다.
		
		int dan = 9;
		
		for (int i=1; i<=9; i++) {
			
			System.out.printf("%d x %d = %2d\n"
								, dan, i, dan * i);
			
		}
		
	}

}






