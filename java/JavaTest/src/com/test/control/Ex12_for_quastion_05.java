package com.test.control;


public class Ex12_for_quastion_05 {
	
	public static void main(String[] args) {
		
		m1();
	}
	public static void m1() {
		
		// 1+ 2+3+ 4+ 5+ 6+7+8+9+10 =55
		
		//2.누적 변수를 생성한다.
		//1.루프를 생성한다.(for x 10회 ** i 누적 변수 사용) {
		//3. 숫자를 출력한다 + 숫자(i)를 누적한다.
		//1. }
		//4. 누적값을 출력한다.
		
		int sum = 0;
		for (int i=1; i<=10; i++) {//1.
			System.out.printf("%d +",i);//3
			sum += i; //3.
		}
		System.out.printf("\b\b= %d\n",sum);
	}

}
