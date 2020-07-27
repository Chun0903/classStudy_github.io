package com.test.control;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ex12_for_quastion_12 {
	
	public static void main(String[] args) throws Exception{
		
		m1();
	}
	public static void m1() throws Exception{
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		
		String num = "";
		String sum = "";
		
		for(int i = 0; i <10; i++) {
			System.out.print("숫자 : ");
			num = reader.readLine();
			
			if(num.equals("1")) {
				sum += "일";
			}else if(num.equals("2")) {
				sum += "이";
			}else if(num.equals("3")) {
				sum += "삼";
			}else if(num.equals("4")) {
				sum += "사";
			}else if(num.equals("5")) {
				sum += "오";
			}else if(num.equals("6")) {
				sum += "육";
			}else if(num.equals("7")) {
				sum += "칠";
			}else if(num.equals("8")) {
				sum += "팔";
			}else if(num.equals("9")) {
				sum += "구";
			}else {
				break;
			} 
		} System.out.printf("%s : %s","결과",sum);
		


		
		
		
	}

}
