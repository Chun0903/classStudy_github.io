package com.test.string;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ex14_String_quastion_003 {

	public static void main(String[] args) throws Exception{
		//요구사항.003
		//숫자를 입력받아 각 자릿수의 수의 합을 구하시오.
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String input = reader.readLine();
		
		int sum =0;
		
		System.out.print("결과 : ");
		for(int i= 0; i<=input.length()-1; i++) {
			System.out.printf("%d +",Integer.parseInt(input.substring(i, i+1)));
			sum += Integer.parseInt(input.substring(i, i+1));
		}
		System.out.printf("\b\b= %d",sum);
		
	}
	
	
}
