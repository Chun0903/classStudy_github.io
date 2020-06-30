package com.test.error;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ex05_Input_use {

	public static void main(String[] args) throws Exception {
		
		BufferedReader reader 
		= new BufferedReader(new InputStreamReader(System.in)); //도구가 활성화되지 않았다.
		
		System.out.print("첫번째 숫자: ");
		String num1 = reader.readLine(); //숫자는 String X, int
		
		System.out.print("두번째 숫자: ");
		String num2 = reader.readLine();
		
		int realNum1 = Integer.parseInt(num1);  //int변환이 아니라 Integer.parseInt
		int realNum2 = Integer.parseInt(num2);
		
		System.out.printf("%,d + %,d = %,d\n"
								, realNum1
								, realNum2
								, realNum1 + realNum2);
				
		
		
	}
	
}













