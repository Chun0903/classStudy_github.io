package com.test.method;

public class Ex08_Method_quastion_11 {
	
	public static void main(String[] args) {
		
		position("홍길동");
		position("홍길동","유재석");
		position("홍길동","유재석","박명수");
		position("홍길동","유재석","박명수","정형돈");
		
	}
	public static void position(String a) {
		System.out.printf("사원 : %s\n", a);
	}
	
	public static void position(String a, String b) {
		System.out.printf("사원 : %s\n대리 : %s\n", a, b);
	}
	
	public static void position(String a, String b, String c) {
		System.out.printf("사원 : %s\n대리 : %s\n과장 : %s\n", a, b, c);
	}
	
	public static void position(String a, String b, String c, String d) {
		System.out.printf("사원 : %s\n대리 : %s\n과장 : %s\n부장 : %s\n", a, b, c, d);
	}
	

}
