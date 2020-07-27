package com.test.method;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ex08_Method_quastion_03 {

	public static void main(String[] args) throws Exception {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("첫번째 숫자 : ");
		int n1 = Integer.parseInt(reader.readLine());
		System.out.print("두번째 숫자 : ");
		int n2 = Integer.parseInt(reader.readLine());
		
		add(n1, n2);
		subtrat(n1, n2);
		multiply(n1, n2);
		divide(n1, n2);
		mod(n1, n2);
	}
	
	public static void add(int n1, int n2) {
		
		System.out.printf("%d + %d = %d\n", n1, n2, n1 + n2);
		
	}
	public static void subtrat(int n1, int n2) {
		
		System.out.printf("%d - %d = %d\n", n1, n2, n1 - n2);
		
	}
	public static void multiply(int n1, int n2) {
		
		System.out.printf("%d * %d = %d\n", n1, n2, n1 * n2);
		
	}
	public static void divide(int n1, int n2) {
		
		System.out.printf("%d / %d = %d\n", n1, n2, n1 / n2);
		
	}
	public static void mod(int n1, int n2) {
		
		System.out.printf("%d %% %d = %d\n", n1, n2, n1 % n2);
		
	}
	
	
}
