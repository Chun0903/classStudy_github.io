package com.test.if_;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ex10_if_quastion_05 {
	public static void main(String[] args) throws Exception{
		
		m1();
	}
	public static void m1() throws Exception{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("문자 : ");
		String munja = reader.readLine();
		
//		a 97
//
//		z 122
//
//		A 65
//
//		Z 90
//		
		
		if(Integer.parseInt(munja) >= 97 && Integer.parseInt(munja) <=122) {
			System.out.printf("결과 : %s", Integer.parseInt(munja) - 32);
		} else if(Integer.parseInt(munja) >= 97 && Integer.parseInt(munja) <=122) {
			System.out.printf("결과 : %s", Integer.parseInt(munja) + 32);
		} else {
			
		}
		
		
	}

}
