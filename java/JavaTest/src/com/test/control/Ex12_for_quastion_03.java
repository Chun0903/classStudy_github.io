package com.test.control;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ex12_for_quastion_03 {
	
	public static void main(String[] args) throws Exception{
		
		m1();
	}
	public static void m1() throws Exception{
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		

		int sum = 0;
		System.out.print("숫자 : ");
		int num = Integer.parseInt(reader.readLine());
		
		for (int i=1; i<=num; i++) {//1.
			System.out.printf("%d +",i);//3
			sum += i; //3.
		}
		System.out.printf("\b\b= %d\n",sum);
		
	}

}
