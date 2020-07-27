package com.test.control;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ex12_for_quastion_14 {
	
	public static void main(String[] args) throws Exception{
		
		m1();
	}
	public static void m1() throws Exception{
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		boolean loop = true;
		
		for (;loop;) {
				System.out.println("=======================");
				System.out.println("자판기");
				System.out.println("=======================");
				System.out.printf("1. %s\t\t: %d원\n","콜라",700);
				System.out.printf("2. %s\t:% d원\n","사이다",600);
				System.out.printf("3. %s\t:% d원\n","비타500",500);
				System.out.println("-----------------------");
				System.out.print("금액 투입(원): ");
				int input = Integer.parseInt(reader.readLine());
				System.out.println("-----------------------");
				System.out.print("음료 선택(번호): ");
				String drink = reader.readLine();
				
				
				if(drink.equals("1")) {
					//쓰기
					kok(input);
					pause();
				}else if(drink.equals("2")) {
					//읽기
					sprit(input);
					pause();
				}else if(drink.equals("3")) {
					//읽기
					bita(input);
					pause();
				}else {
					//종료
					loop = false;
				}//if
						
			}
		
	}
	private static void bita(int input) {
		System.out.println("+비타500을 제공합니다");
		int other = input - 500;
		System.out.printf("+잔돈 %d원을 제공합니다.\n",other);
		
	}
	private static void sprit(int input) {
		System.out.println("+사이다를 제공합니다");
		int other = input - 600;
		System.out.printf("+잔돈 %d원을 제공합니다.\n",other);
		
	}
	private static void kok(int input) {
		System.out.println("+콜라를 제공합니다");
		int other = input - 700;
		System.out.printf("+잔돈 %d원을 제공합니다.\n",other);
		
	}
	private static void pause() throws Exception{
		System.out.println();
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("계속하시려면 엔터를 입력하세요");
		reader.readLine();
		
	}

}
