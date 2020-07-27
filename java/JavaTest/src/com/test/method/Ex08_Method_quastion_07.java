package com.test.method;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ex08_Method_quastion_07 {
	public static void main(String[] args) throws Exception{
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("국어 : ");
		int kr = Integer.parseInt(reader.readLine());
		System.out.print("영어 : ");
		int eg = Integer.parseInt(reader.readLine());
		System.out.print("수학 : ");
		int ma = Integer.parseInt(reader.readLine());
		
		String result = test(kr, eg, ma);
		
		System.out.printf("%s입니다.",result);
		
	}
	public static String test(int kr, int en, int ma) {
		
		boolean koarak = kr > 40 && en> 40 && ma>40;
		String result = (kr + en + ma) / 3 >= 60 && koarak? "합격" : "불합격"; 
		
		return result;
		
	}
	
	
	
}
