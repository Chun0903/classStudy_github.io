package com.test.control;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ex12_for_quastion_13 {
	
	public static void main(String[] args) throws Exception{
		
		//요구사항.013]

		//컴퓨터가 1~ 10사이의 숫자 1개를 생각하면 사용자가 맞추는 프로그램을 구현하시오.
		
		m1();
	}
	public static void m1() throws Exception{
		
		double num = Math.random();
		System.out.println((int)(num * 10) + 1);
		int realNum = (int)(num * 10) + 1;
		System.out.println("컴퓨터가 1~10 사이의 숫자를 1개 생각했습니다.");
		System.out.println();
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int input = 0;
		int sum = 0;
		for (int i=1; ; i++) {
			System.out.print("숫자 : ");
			input = Integer.parseInt(reader.readLine());
			sum = i;
			if(input != realNum) {
				System.out.println("틀렸습니다.");
				System.out.println();
			} else if(input == realNum){
				System.out.println("맞췄습니다.");
				System.out.println();
				break;
			}
			
		}
		System.out.printf("컴퓨터가 생각한 숫자는 %d입니다.\n",realNum);
		System.out.printf("정답을 맞추는데 시도한 횟수는 %d회입니다.\n", sum);
		System.out.println("프로그램을 종료합니다.");
		
		
	}
}