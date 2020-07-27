package com.test.method;

public class Ex08_Method_use_03 {

	public static void main(String[] args) {
		
		//메소드 오버로딩
		
		//요구사항] 숫자(??) 2개 전달 -> 연산과정 + 결과 출력
		//1. int + int
		//2. double + double
		//3. String + String
		//4. byte + byte
		//5. String + int
		//6. 9개 자료형 -> 81
		
		add(10,20);
		add((int)0.14, (int)5.18); //int a = (int)3.14 -> 소수이하X
		add(0.14, 5.18); 
		add(null, null);
		
		//메소드 다양성
		drawLine();
		System.out.println("자바");
		drawLine('-');
		drawLine('+');
		drawLine('@', 10);
		drawLine('!', 5);
		
		
		//요구사항] 선긋기 메소드 구현
		
		
	}//main
	
	public static void drawLine() {
		System.out.println("======================================");
	}
	
	public static void drawLine(char c) {
		for (int i=0; i<30; i++) {
			System.out.print(c);
		}
		System.out.println();
	}//선모양
	
	public static void drawLine(char c, int length) {
		for (int i=0; i<length; i++) {
			System.out.print(c);
		}
		System.out.println();
	}//선수
	
	
	public static void add(int a, int b) {
		
		System.out.printf("%d + %d = %d\n", a, b, a + b);
	}
	
	public static void add(double a, double b) {
		
		System.out.printf("%.2f + %.2f = %.2f\n", a, b, a + b);
		
	}
		
		public static void add(String a, String b) {
			
			System.out.printf("%s + %s = %s\n", a, b, a + b);
	}
	
	
	
	
}//class
