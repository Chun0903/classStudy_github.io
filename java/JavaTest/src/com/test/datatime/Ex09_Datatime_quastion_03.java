package com.test.datatime;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Calendar;

public class Ex09_Datatime_quastion_03 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		nowTime();
	}
	
	public static void nowTime() throws NumberFormatException, IOException {
		Calendar now = Calendar.getInstance();
		
		Calendar birth = Calendar.getInstance();
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("태어난 년도 : ");
		int birthyear = Integer.parseInt(reader.readLine());
		birth.set(birthyear, 0, 0);
		
		long nowTick = now.getTimeInMillis();
		long birthTick = birth.getTimeInMillis();
		
		System.out.printf("나이: %,d세\n"
				, (nowTick - birthTick) / 1000 / 60 / 60 / 24 / 365);
		
	}
	
	
}
