package com.test.method;

public class Ex08_Method_quastion_10 {
	
	public static void main(String[] args) {
		
	sum(10);
	sum(10, 20);
	sum(10, 20, 30);
	sum(10, 20, 30, 40);
	}

	public static void sum(int a) {
		
		System.out.println(a);
	}
	public static void sum(int a, int b) {
		
		System.out.printf("%d + %d = %d", a, b, a + b);
	}
	public static void sum(int a, int b, int c) {
		
		System.out.printf("%d + %d +%d = %d", a, b, c, a + b + c);
	}
	public static void sum(int a, int b, int c, int d) {
		
		System.out.printf("%d + %d +%d +%d = %d", a, b, c, d, a + b + c + d);
	}
}
