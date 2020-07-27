package com.test.control;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ex12_for_quastion_15 {
	
	public static void main(String[] args) throws Exception{
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("9자리 숫자 입력 : ");
		int num= Integer.parseInt(reader.readLine());

		System.out.println((int)(num / Math.pow(10, 8)));
		
		
		
		
	}

}
