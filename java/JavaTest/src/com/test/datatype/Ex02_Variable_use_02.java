package com.test.datatype;

public class Ex02_Variable_use_02 {

	public static void main(String[] args) {
		
		//자바 자료형 8개 + 변수 만들기
		
		//1. byte : -128 ~ 127
		byte b1;
		b1 = 10; //Type mismatch: cannot convert from int to byte
		System.out.println(b1);
		
		
		//2. short : -32768 ~ 32767
		short s1;
		s1 = 10;
		System.out.println(s1);
		
		//3. int : -21억 ~ 21억
		int n1;
		n1 = 10;
		System.out.println(n1);
		
		//4. long : -922경 ~ 922경
		long l1;
		l1 = 100000000000L; //The literal 10000000000 of type int is out of range 
						   // 정수표시는 4byte를 잡고 시작하기 때문에 범위를 넘어갔다.
						   // +L =long의 약자를 쓰면 정상작동
		System.out.println(l1);
		
		
		//데이터 -> 상수, 리터럴(Literal) 
		System.out.println(10);
		System.out.println(10);
		System.out.println(10);
		System.out.println(10);
		
		
		//실수 
		//1. float
		float f1;
		f1 = 3.14F; //Type mismatch: cannot convert from double to float
				    //실수형 상수는 double로 잡힌다.
				    //+F =float의 약자를 쓰면 정상작동
		f1 = 1.2345678912345679123456798F;
		System.out.println(f1);
		
		
		//2. double
		double d1;
		d1 = 6.28;
		d1 = 1.2345678901234567890123456789;
		
		System.out.println(d1);
		
		
		
		//문자형
		//1. char
		char c1;
		c1 = 'A'; //문자 리터럴, '데이터' = 정상작동
		System.out.println(c1);
		
		c1 = '가';
		System.out.println(c1);

		c1 = '1';
		System.out.println(c1);
		
		
		//논리형
		//1. boolean
		boolean flag;
		flag = true; //true, false : 논리 상수, boolean literal
		flag = false;
		
		System.out.println(flag);
		
		
		//자바 자료형
		//1. 기본형 : byte, short, int, long, float, double, boolean, char
		//2. 참조형
		
		//문자열, String
		// - 참조형
		
		//문자, char
		
		//'홀길동' -> 변수 저장
		char name1 = '홍';
		char name2 = '길';
		char name3 = '동';
		
		System.out.println(name1);
		System.out.println(name2);
		System.out.println(name3);
		
		//문자들의 열을 저장하는 자료형 -> 문자열(String)
		String name;
		name = "홍길동"; //문자열 상수, String Literal
		System.out.println(name);
		
		name = "홍";
	
		
		
		/*
		 *영문식 표현
		 * ~(tild), !, @, #, $, %, ^(xor), &, *(all(wildcard), asterisk),
		 * -(minusm dash, horizontal-bar), :, ;, |(pipe, vertical-bar), /, \, ', ", `, , .
		 * 
		 * 괄호
		 * () 
		 * []
		 * {}
		 * <>
		 * 
		 * 
		 * A > B (크다, 초과) A grater than B
		 * A >= B 
		 * A < B (작다, 미만)
		 * A <= B
		 * 
		 * 
		 * 나이 > 20 
		 * 		  
		 * 
		 */
		
		
		
		
		
	}
	
	
}
