package com.test.if_;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ex10_if_quastion_10 {
	public static void main(String[] args) throws Exception{
		
		m1();
	}
	public static void m1() throws Exception{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("근무 년수 : ");
		int year = Integer.parseInt(reader.readLine());
		String level = "";
		int years = 0;
		int yearm = 0;
		
		if(year >=1 && year <=4) {
			if(year == 1) {
				level = "초급";
				years = 5- year;
			}else if(year ==2) {
				level = "초급";
				years = 5 - year;
			}else if(year ==3) {
				level = "초급";
				years = 5- year;
			}else if(year ==4) {
				level = "초급";
				years = 5- year;
			}else {
				
			}
			System.out.printf("%d년차 %s 개발자입니다"
					+ "\n앞으로 %d년 더 근무를 하면 중급 개발자가 됩니다."
					,year, level, years);
		}
		if(year >=5 && year <=9) {
			if(year == 5) {
				level = "중급";
				yearm = year -5;
				years = 10- year;
			}else if(year ==6) {
				level = "중급";
				yearm = year -5;
				years = 10- year;
			}else if(year ==7) {
				level = "중급";
				yearm = year -5;
				years = 10- year;
			}else if(year ==8) {
				level = "중급";
				yearm = year -5;
				years = 10- year;
			}else if(year ==9) {
				level = "중급";
				yearm = year -5;
				years = 10- year;
			}else {
				
			}
			System.out.printf("%d년차 %s 개발자입니다"
					+ "\n당신은 %d년전까지 초급 개발자였습니다."
					+ "\n앞으로 %d년 더 근무를 하면 중급 개발자가 됩니다."
					,year, level, yearm, years);
		}
		if(year >= 10) {
			level = "고급";
			yearm = year -5;
			System.out.printf("%d년차 %s 개발자입니다"
					+ "\n당신은 %d년전까지 초급 개발자였습니다."
					,year, level ,yearm);
		}else {
		}
	

	}
}
	


