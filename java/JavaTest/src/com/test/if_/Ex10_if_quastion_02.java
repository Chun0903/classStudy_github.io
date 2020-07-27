package com.test.if_;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ex10_if_quastion_02 {
	public static void main(String[] args) throws Exception{
		
		m1();
	}
	public static void m1() throws Exception{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("점수 : ");
		int num = Integer.parseInt(reader.readLine());
		
		String result = "";
		if(num>=0 && num <=100) {
			if(num>=90 && num<=100) {
				result = "A";
			}else if(num>=80 && num<=89) {
				result = "B";
			}else if(num>=70 && num<=79) {
				result = "C";
			}else if(num>=60 && num<=69) {
				result = "D";
			}else {
				result = "F";
			}
		}
		System.out.printf("입력한 %d점은 성적%s입니다.",num, result);
	}

}
