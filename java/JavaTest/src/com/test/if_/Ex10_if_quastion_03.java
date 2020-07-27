package com.test.if_;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ex10_if_quastion_03 {
	public static void main(String[] args) throws Exception{
		
		m1();
	}
	public static void m1() throws Exception{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("첫번째 숫자 : ");
		int num1 = Integer.parseInt(reader.readLine());
		System.out.print("두번째 숫자 : ");
		int num2 = Integer.parseInt(reader.readLine());
		System.out.print("연산자 : ");
		String giho = reader.readLine();
		
		if(giho.equals("+")) {
			System.out.printf("%d + %d = %d",num1, num2 , num1 + num2);
		} else if(giho.equals("-")) {
			System.out.printf("%d - %d = %d",num1, num2 , num1 - num2);
		} else if(giho.equals("*")) {
			System.out.printf("%d * %d = %d",num1, num2 , num1 * num2);
		} else if(giho.equals("/")) {
			System.out.printf("%.1f * %.1f = %.1f",(double)num1, (double)num2 , (double)num1 / (double)num2);
		} else if(giho.equals("%")) {
			System.out.printf("%d %% %d = %d",num1, num2 , num1 % num2);
		} else {
		}
		
		
	}

}
