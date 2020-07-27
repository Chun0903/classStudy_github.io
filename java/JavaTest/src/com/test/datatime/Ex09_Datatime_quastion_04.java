package com.test.datatime;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Calendar;

public class Ex09_Datatime_quastion_04 {

	public static void main(String[] args) throws IOException {
		
		nowTime();
	}
	
	public static void nowTime() throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("남자 이름 : ");
		String man = reader.readLine();
		System.out.print("여자 이름 : ");
		String wom = reader.readLine();
		System.out.print("만난날(년) : ");
		int year = Integer.parseInt(reader.readLine());
		System.out.print("만난날(월) : ");
		int mount = Integer.parseInt(reader.readLine());
		System.out.print("만난날(일) : ");
		int day = Integer.parseInt(reader.readLine());
		
		Calendar now = Calendar.getInstance();
		now.set(year, mount, day);
		
		Calendar now100 = Calendar.getInstance();
		now100.add(Calendar.DATE, 100);
		Calendar now200 = Calendar.getInstance();
		now200.add(Calendar.DATE, 200);
		Calendar now300 = Calendar.getInstance();
		now300.add(Calendar.DATE, 300);
		Calendar now500 = Calendar.getInstance();
		now500.add(Calendar.DATE, 500);
		Calendar now1000 = Calendar.getInstance();
		now1000.add(Calendar.DATE, 1000);
		
		System.out.printf("'%s'과(와) '%s'의 기념일\n"
				+ "100일 : %tF\n"
				+ "200일 :%tF\n"
				+ "300일 :%tF\n"
				+ "500일 :%tF\n"
				+ "1000일 :%tF\n"
				,man, wom, now100, now200, now300, now500, now1000);
		
		
		
		
		
	}
	
	
}
