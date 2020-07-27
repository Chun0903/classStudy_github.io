package com.test.if_;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Calendar;

public class Ex10_if_quastion_09 {
	public static void main(String[] args) throws Exception{
		
		m1();
	}
	public static void m1() throws Exception{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("년 : ");
		int year = Integer.parseInt(reader.readLine());
		System.out.print("월 : ");
		int month = Integer.parseInt(reader.readLine());
		System.out.print("일 : ");
		int day = Integer.parseInt(reader.readLine());
		
//		System.out.println(c1.get(Calendar.DAY_OF_WEEK));	//요일(일: 1 ~ 토: 7)
//		System.out.printf("%tA\n", c1); //요일(로케일)
		
		Calendar today = Calendar.getInstance(); 
		today.set(Calendar.YEAR, year);
		today.set(Calendar.MONTH, month -1);
		today.set(Calendar.DATE, day);
		
		if(today.get(Calendar.DAY_OF_WEEK) == 1 && today.get(Calendar.DAY_OF_WEEK) == 7) {
			String holly = "휴일";
			System.out.printf("입력하신 날짜는 '%s'입니다.\n결과가 없습니다.",holly);
		}else if(today.get(Calendar.DAY_OF_WEEK) == 2) {
			String holly = "평일";
			today.add(Calendar.DATE, 5);
			System.out.printf("입력하신 날짜는 '%s'입니다."
					+ "\n해당 주의 토요일로 이동합니다."
					+ "\n이동한 날짜는 '%tF입니다.'",holly, today);
		}else if(today.get(Calendar.DAY_OF_WEEK) == 3) {
			String holly = "평일";
			today.add(Calendar.DATE, 4);
			System.out.printf("입력하신 날짜는 '%s'입니다."
					+ "\n해당 주의 토요일로 이동합니다."
					+ "\n이동한 날짜는 '%tF입니다.'",holly, today);
		}else if(today.get(Calendar.DAY_OF_WEEK) == 4) {
			String holly = "평일";
			today.add(Calendar.DATE, 3);
			System.out.printf("입력하신 날짜는 '%s'입니다."
					+ "\n해당 주의 토요일로 이동합니다."
					+ "\n이동한 날짜는 '%tF입니다.'",holly, today);
		}else if(today.get(Calendar.DAY_OF_WEEK) == 5) {
			String holly = "평일";
			today.add(Calendar.DATE, 2);
			System.out.printf("입력하신 날짜는 '%s'입니다."
					+ "\n해당 주의 토요일로 이동합니다."
					+ "\n이동한 날짜는 '%tF입니다.'",holly, today);
		}else if(today.get(Calendar.DAY_OF_WEEK) == 6) {
			String holly = "평일";
			today.add(Calendar.DATE, 1);
			System.out.printf("입력하신 날짜는 '%s'입니다."
					+ "\n해당 주의 토요일로 이동합니다."
					+ "\n이동한 날짜는 '%tF"
					+ "입니다.'",holly, today);
		}else {
			
		}
	}

}
