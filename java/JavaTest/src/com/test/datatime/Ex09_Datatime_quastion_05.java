package com.test.datatime;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Calendar;

public class Ex09_Datatime_quastion_05 {

	public static void main(String[] args) throws IOException {
		
		nowTime();
		
	}
	
	public static void nowTime() throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("아빠 생일(년) : ");
		int yearDad = Integer.parseInt(reader.readLine());
		System.out.print("아빠 생일(월) : ");
		int mouthDad = Integer.parseInt(reader.readLine());
		System.out.print("아빠 생일(일) : ");
		int dayDad = Integer.parseInt(reader.readLine());
		System.out.print("딸 생일(년) : ");
		int yearMy = Integer.parseInt(reader.readLine());
		System.out.print("딸 생일(월) : ");
		int mouthMy = Integer.parseInt(reader.readLine());
		System.out.print("딸 생일(일) : ");
		int dayMy = Integer.parseInt(reader.readLine());
		
		
		Calendar now = Calendar.getInstance();
		Calendar birthDad = Calendar.getInstance();
		birthDad.set(yearDad, mouthDad, dayDad);
		long nowTick = now.getTimeInMillis();
		long birthTick = birthDad.getTimeInMillis();
		
		
		Calendar birthMy = Calendar.getInstance();
		birthDad.set(yearMy, mouthMy, dayMy);
		long nowTickMy = now.getTimeInMillis();
		long birthTickMy = birthMy.getTimeInMillis();
		
		System.out.printf("아빠는 딸보다 총 %,d일을 더 살았습니다.",
				((nowTick - birthTick) / 1000 / 60 / 60 / 24)
				- (nowTickMy - birthTickMy) / 1000 / 60 / 60 / 24);
		
		
		
		
	}
	
	
}
