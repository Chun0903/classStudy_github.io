package com.test.datatype;

public class Ex02_Variable_use_03 {

	public static void main(String[] args) {
		
		// '+' 연산자 = 두 숫자를 더해서 합을 내준다.
		// - 숫자 + 숫자 = 산술연산
		// - 문자열 + 문자여 = Concat(붙이기)
		// - 숫자 + 문자열 = Concat
		// - 문자열 + 숫자 = Concat
		
		//요구사항] 10, 20 -> '10 + 20 = 30' -> 출력 (연산과정, 결과 다)
		
		int a = 10;
		int b = 20;
		
		//연산자 우선순위, ()를 써주자!
		System.out.println(a + "+" + b + "=" + (a + b));
		
		
		//숫자 저장? -> 자료형?
		//1. 나이? -> byte
		//2. 몸무게? -> short
		//3. 주민등록번호앞자리 -> 950409 -> int
		
		int jumin;
		jumin = 950409; 
		System.out.println(jumin);
		
		jumin = 051003; //20995 0을 자릿수처리X ->8진수
		System.out.println(jumin);
		
		//숫자 데이터 -> 성격이 숫자가 아닌 것들
		// -> 더하기, 빼기, 곱하기, 나누기 하지 않을 숫자 -> 전부 문자열 취급

		String jumin2 = "950409";
		System.out.println(jumin2);
		
		jumin2 = "051003";
		System.out.println(jumin2);
				
		//자바에서의 기수법 표현 방식
		// - 잘 사용 안함
		//1. 10진수 표현
		//2. 8진수 표현
		//3. 16진수 표현
		//4. 2진수 표현(X)
		
		int num = 10; //숫자 상수 -> 10진수
		System.out.println(num);
		
		num = 010; //8진수(0~7) 앞에 '0'
		System.out.println(num);
		
		num = 0x10; //16진수 앞에 '0x'
		System.out.println(num);
		
		
		
	}
	

	
}
