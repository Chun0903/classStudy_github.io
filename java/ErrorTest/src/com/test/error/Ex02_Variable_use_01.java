package com.test.error;


public class Ex02_Variable_use_01 {

	public static void main(String[] args) {
		
		int a;		
		a = 10;   	//';' X
		System.out.println(a);
		
		int b = 20;
		System.out.println(b);
		
		int c, d, e; //중간에 ';' 가 붙어있다.
		
		c = 30;
		d = 40;
		e = 50;
		
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		
		int f = 60, g = 70, h = 80;
		int i = 90, j; long k, l = 100;
		
		int m = 100; //a는 위에 중복
		System.out.println(a);
		
		//int m;// m 중복
		
		System.out.println(m);
		
		
	
		
	}
	
}










