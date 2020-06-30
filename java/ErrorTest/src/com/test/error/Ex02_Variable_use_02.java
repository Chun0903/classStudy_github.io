package com.test.error;

public class Ex02_Variable_use_02 {

	public static void main(String[] args) {
		
		short b1;
		b1 = 1000; //byte으 범위를 벗어남
		System.out.println(b1);
		
		short s1;
		s1 = 10;
		System.out.println(s1);
		
		int n1;
		n1 = 10;
		System.out.println(n1);
		
		long l1;
		l1 = 10000000000l; //long = 끝에 l을 붙여준다.
		System.out.println(l1);
		
		
		
		float f1;
		f1 = 3.14f; //float =  끝에 f를 붙여준다.
		System.out.println(f1);
		
		double d1;
		d1 = 6.28;
		System.out.println(d1);
		
		
		
		char c1;
		c1 = 'A'; //chat = ''
		System.out.println(c1);
		
		String s = "홍길동"; //한글자 이상 = String, ""
		System.out.println(s);
		
		
		String name;
		name = "홍길동"; //String =""
		System.out.println(name);
				
		
	}
	
}




















