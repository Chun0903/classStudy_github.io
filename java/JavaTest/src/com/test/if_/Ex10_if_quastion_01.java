package com.test.if_;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ex10_if_quastion_01 {
	public static void main(String[] args) throws Exception{
		
		m1();
	}
	public static void m1() throws Exception{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("첫번째 숫자 : ");
		int num1 = Integer.parseInt(reader.readLine());
		System.out.print("두번째 숫자 : ");
		int num2 = Integer.parseInt(reader.readLine());
		
		if(num1 > num2) {
			System.out.printf("큰수는 %d이고, 작은수는 %d입니다.\n"
					+ "입력한 두 숫자는 %d가 차이납니다."
					,num1,num2
					,num1 - num2);
		}else {
			System.out.printf("큰수는 %d이고, 작은수는 %d입니다.\n"
					+ "입력한 두 숫자는 %d가 차이납니다."
					,num2,num1
					,num2 - num1);
		}
		
		
	}

}
