package com.test.error;

public class Ex06_Casting_use {
	
	public static void main(String[] args) {
		
		byte a = 10;
		byte b = 20;
		int c = 0; //byte +byte =int
		
		c = a + b; 
		
		System.out.printf("%d + %d = %d\n", a, b, c);
		
		
		int n1 = 1234567;
		int n2 = 654321;
		
		System.out.printf("%,d * %,d = %,d\n", n1, n2, n1 * n2);
		
		
	}

}












