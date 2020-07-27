package com.test.method;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ex08_Method_quastion_06 {

	public static void main(String[] args) throws Exception{
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("숫자 : ");
		int a = Integer.parseInt(reader.readLine());
		String result = getNumber(a);
		System.out.printf("입력하신 숫자 '%d'는(은) %s입니다.", a, result);
		
		
	}
	public static String getNumber(int a) throws  Exception {
		String hol = a  %2 == 0 ? "짝수" : "홀수";
		return hol; 
		
	}
	
	
	
}
