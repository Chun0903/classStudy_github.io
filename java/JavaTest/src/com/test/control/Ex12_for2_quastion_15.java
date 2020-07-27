package com.test.control;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ex12_for2_quastion_15 {
	
	public static void main(String[] args) throws Exception{
		
		m1();
	}
	public static void m1() throws Exception{
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		boolean loop = true;
		int total = 100000;
		
		for (;loop;) {
				System.out.println("=======================");
				System.out.println("My Bank");
				System.out.println("=======================");
				System.out.printf("1. %s\n","계좌 입금");
				System.out.printf("2. %s\n","계좌 출금");
				System.out.printf("3. %s\n","잔액 조회");
				System.out.printf("4. %s\n","종료");
				System.out.println("-----------------------");
				System.out.print("선택(번호) : ");
				String num = reader.readLine();
				
				if(num.equals("1")) {
					total = in(total);
					pause();
				}else if(num.equals("2")) {
					total = out(total);
					pause();
				}else if(num.equals("3")) {
					look(total);
					pause();
				}else if(num.equals("4")){
					loop = false;
				}else {
					
				}
						
			}
		
	}
	private static void look(int total) {
		System.out.println("=======================");
		System.out.println("잔액 조회");
		System.out.println("=======================");
		System.out.printf("현재 잔액 : %,d원\n",total);

		
	}
	private static int out(int total) throws Exception{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("=======================");
		System.out.println("계좌 출금");
		System.out.println("=======================");
		System.out.print("계좌 비밀번호 :");
		int lock = Integer.parseInt(reader.readLine());
		
		int outMoney = 0;
	
		 if (lock == 1234) {
			 System.out.print("출금액 : ");
			 outMoney = Integer.parseInt(reader.readLine());
			 System.out.printf("%d원이 출금되었습니다.\n",outMoney);
		 } else {
			 System.out.println("비밀번호가 틀렸습니다.\n");
		 }
		 
		return total - outMoney;
		
	}
	private static int in(int total) throws Exception{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("=======================");
		System.out.println("계좌 입금");
		System.out.println("=======================");
		System.out.print("계좌 비밀번호 :");
		int lock = Integer.parseInt(reader.readLine());
		
		int inMoney = 0;
		
		 if (lock == 1234) {
			 System.out.print("입금액 : ");
			 inMoney = Integer.parseInt(reader.readLine());
			 System.out.printf("%d원이 입금되었습니다.\n",inMoney);
		 } else {
			 System.out.println("비밀번호가 틀렸습니다.\n");
		 }
		return total + inMoney;
		
	}
	private static void pause() throws Exception{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("계속하시려면 엔터를 입력하세요");
		reader.readLine();
		
	}

}
