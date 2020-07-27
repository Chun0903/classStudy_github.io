package com.test.if_;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ex10_if_quastion_06 {
	public static void main(String[] args) throws Exception{
		
		int odd = 0;
		int even = 0;
		int num = 0;
		
		num = input();
		
		if(num == 1 ) {
			odd++;
		} else if (num ==2) {
			even++;
		}
		
		num = input();
		
		if(num == 1 ) {
			odd++;
		} else if (num ==2) {
			even++;
		}
		
		num = input();
		
		if(num == 1 ) {
			odd++;
		} else if (num ==2) {
			even++;
		}	
		
		num = input();
		
		if(num == 1 ) {
			odd++;
		} else if (num ==2) {
			even++;
		}		
		
		num = input();
		
		if(num == 1 ) {
			odd++;
		} else if (num ==2) {
			even++;
		}
		
		System.out.printf("짝수는 %d개 홀수는 %d개 입력했습니다.\n", even, odd);
		System.out.printf("홀수가 짝수보다 %d개 더 많습니다.\n",even - odd);
		
	}
	public static int input() throws Exception{
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("숫자 입력 : ");
		int num = Integer.parseInt(reader.readLine());
		
		if (num >=1 && num <=10) {
			if(num %2 ==1) {
				return 1;
			} else {
				return 2;
			}
		} else {
			return 0;
		}
		
	}

}
