package com.test.control;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ex12_For_use_01 {
	
	public static void main(String[] args) throws Exception{
//		m1();
//		m2();
		m3();
//		m4();
//		m5();
	}
	public static void m5() {
		
		//제어문(반복문) + break + continue
		//1. break 
		// - 자신이 속한 제어문을 탈출한다(if문 제외)
		//2. continue
		// - 자신이 속한 제어무의 처음으로 돌아간다.(if문 제외)
		
		for (int i =1; i<=10; i++) {
			if(i == 5) {
				//break;
				continue;
			}
			System.out.println(i);
		}
		
		//선생님 + 학생 상담(30명)
		for (int i=1; i<=30; i++) {
			
			//흐름제어
//			if (i == 15) {
//				break;
//			}
			if (i == 15 || 1 == 17 || i == 25) { //15번 학생 결석
			continue;
			}
			
			System.out.printf("선생님이 %d번 학생을 상담 중..\n",i);
		}
		
	}
	public static void m4() throws Exception{
		
		//요구사항] 사용자에게 숫자를 10개를 입력받아 그 수들의 합을 구하시오.
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		int sum = 0; //누적 변수
		
		for (int i =1; i<=10; i++) {
			System.out.print("숫자 : ");
			int num = Integer.parseInt(reader.readLine());
			
			sum += num;
		}
		
		System.out.println(sum);
		
	}
	public static void m3() {
		
		//Loop -> 누적
		//1 ~ 10까지의 합을 구하시오.
		//1 + 2 + 3 + 4 + ... + 9 + 10 =55
		
		//무언가의 누적값을 구해야한다.
		//1. 누적값을 저장할 변수를 만든다. 누적변수
		int sum = 0;
		
		//2. 누적시킬 수들의 열을 반복문을 통해 만든다. -> 수열 생성
		//1, 2, 3, 4, 5, ..., 9, 10
		for (int i=0; i<=100; i++) {
			System.out.println(i);
			sum += i;
		}
		System.out.println(sum);
		
	}
	public static void m2() {
		
		int a = 10; //지역변수(m2)
		
		if (a > 0) {
			int b = 20; //지역변수 (if)
		}

		for (int i=1; i<=5; i++) { //지역변수(for) ******
			
			int c = 30; //지역변수(for)
		}
	}
	public static void m1() {
		
		//구구단 출력
		// - 5단
		// 5 x 1 = 5
		// 5 x 2 = 10
		// ...
		// 5 x 9 = 45
		
		int dan = 3;
		
		for (int i=1; i<=9; i++) {
			
			System.out.printf("%s x %d = %2d\n",dan, i, dan * i);
		}
		
	}

}
