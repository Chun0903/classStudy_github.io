package com.test.if_;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ex10_if_quastion_08 {
	public static void main(String[] args) throws Exception{
		
		m1();
	}
	public static void m1() throws Exception{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("년도 입력 : ");
		int year = Integer.parseInt(reader.readLine());

		String result;
		
		if(year %4 != 0) {
			result = "평년";
		}else if(year %100 != 0) {
			result = "윤년";
		}else if(year %400 == 0) {
			result = "윤년";
		}else {
			result = "평년";
		}
		System.out.printf("%d년은 '%s'입니다.", year, result);
	}

}
