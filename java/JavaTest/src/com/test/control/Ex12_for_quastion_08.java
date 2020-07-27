package com.test.control;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ex12_for_quastion_08 {
	
	public static void main(String[] args)  throws Exception{
		
		m1();
	}
	public static void m1() throws Exception{
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int input =Integer.parseInt(reader.readLine());
		
		int sum = 0;
		
		for (int i=1; ;i++) {
			if (sum > input){				
				break;
			}
			System.out.printf("%d +",i);
			sum += i; 
		}
		System.out.printf("\b\b= %d\n",sum);
		

			
			
			
		}
		

}
