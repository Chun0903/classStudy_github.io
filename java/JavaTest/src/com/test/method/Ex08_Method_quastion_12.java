package com.test.method;

public class Ex08_Method_quastion_12 {
	
	public static void main(String[] args) {
		
		int count = positive(10);
		count = positive(10, 20);
		count = positive(10, 20, -30);
		count = positive(10, 20, -30, 40);
		count = positive(10, 20, -30, 40, 50);
		System.out.printf("양수 : %d개", count);
		
	}
	public static int positive(int a) {
		int a1 = a > 0 ? +1 : +0;
		return a1;
	}
	public static int positive(int a, int b) {
		int a1 = a > 0 ? +1 : +0;
		int b1 = b > 0 ? +1 : +0;
		return a1 + b1;
	}
	public static int positive(int a, int b, int c) {
		int a1 = a > 0 ? +1 : +0;
		int b1 = b > 0 ? +1 : +0;
		int c1 = c > 0 ? +1 : +0;
		return a1 + b1 +c1;
	}
	public static int positive(int a, int b, int c, int d) {
		int a1 = a > 0 ? +1 : +0;
		int b1 = b > 0 ? +1 : +0;
		int c1 = c > 0 ? +1 : +0;
		int d1 = d > 0 ? +1 : +0;
		return a1 + b1 +c1 +d1;
	}
	public static int positive(int a, int b, int c, int d, int e) {
		int a1 = a > 0 ? +1 : +0;
		int b1 = b > 0 ? +1 : +0;
		int c1 = c > 0 ? +1 : +0;
		int d1 = d > 0 ? +1 : +0;
		int e1 = e > 0 ? +1 : +0;
		return a1 + b1 +c1 +d1 +e1;
	}

}
