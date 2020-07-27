package com.test.method;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ex08_Method_quastion_02 {

	public static void main(String[] args) throws Exception {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("숫자 입력 : ");
		int a = Integer.parseInt(reader.readLine());
		digit(a);
		}

	public static void digit(int a) throws Exception {
		
		
		System.out.printf("%d -> %04d", a, a);
		
				
	}
}
