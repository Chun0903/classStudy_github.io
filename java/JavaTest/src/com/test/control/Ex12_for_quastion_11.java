package com.test.control;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ex12_for_quastion_11 {
	
	//요구사항.011]

	//사용자가 입력한 범위의 숫자까지 369 게임의 결과를 출력하시오.

		public static void main(String[] args) throws Exception{
			m1();
		}
		public static void m1() throws Exception{
			
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			System.out.print("최대 숫자 : ");
			int num = Integer.parseInt(reader.readLine());	
			
			int sum = 0;
			
			for (int i =1; i<num; i++) {
				sum += 1;
				
				if((sum%10)-3==0 ||(sum%10)-6==0||(sum%10)-9==0) {
					System.out.printf("%s ","짝");
				}//1의 자리
				else if((sum/10)-3==0 ||(sum/10)-6==0||(sum/10)-9==0) {
					System.out.printf("%s ","짝");
				}else if((sum/100)-3==0 ||(sum/100)-6==0||(sum/100)-9==0) {
					System.out.printf("%s ","짝");
				}else {
					System.out.printf("%d ",sum);
				}
			}		
		}
	}
