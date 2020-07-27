package com.test.datatime;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Calendar;

public class Ex09_Datatime_quastion_06 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		nowTime();
	}
	
	public static void nowTime() throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("음식을 받기 원하는 시각");
		System.out.print("시 : ");
		int hour = Integer.parseInt(reader.readLine());
		System.out.print("분 : ");
		int minute = Integer.parseInt(reader.readLine());
	
		
		Calendar now = Calendar.getInstance();
		now.set(Calendar.HOUR_OF_DAY, hour);
		now.set(Calendar.MINUTE, minute);
		
				
		now.add(Calendar.MINUTE, -10);
		System.out.printf("짜장면 : %d시 %d분\n"
				, now.get(Calendar.HOUR_OF_DAY)
				, now.get(Calendar.MINUTE));

		now.add(Calendar.MINUTE, -8);
		System.out.printf("치킨 : %d시 %d분\n"
				, now.get(Calendar.HOUR_OF_DAY)
				, now.get(Calendar.MINUTE));
		
		now.add(Calendar.MINUTE, -7);
		System.out.printf("피자 : %d시 %d분\n"
				, now.get(Calendar.HOUR_OF_DAY)
				, now.get(Calendar.MINUTE));
		
		
		
	}
	
	
}
