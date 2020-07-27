package com.test.control;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ex12_for_quastion_09 {

	public static void main(String[] args) throws Exception{
		//요구사항.009]
		//숫자를 N개 입력받아 아래와 같이 출력하시오.
		
		m1();
	}
	public static void m1() throws Exception{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int i, sum=0, num=0;
		String result = "";
		System.out.println("누적값");
		int N = Integer.parseInt(reader.readLine());
		
		for(i=1; i<=N; i++) {
		System.out.print("숫자 : ");
		num = Integer.parseInt(reader.readLine());	
		
		if(num%2 ==1) {
			sum -= num;
			result += "-" + num;
		}else {
			sum += num;
			result += "+" + num;
		}
		}
		System.out.printf("%s = %d",result, sum);
	}

}
