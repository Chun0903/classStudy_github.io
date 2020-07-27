package com.test.if_;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Calendar;

public class Ex10_if_quastion_07 {
	public static void main(String[] args) throws Exception{
		
		m1();
		m2();
	}
	public static void m1() throws Exception{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("[들어온 시간]");
		System.out.print("시 : ");
		int timeH = Integer.parseInt(reader.readLine());
		System.out.print("분 : ");
		int timeM = Integer.parseInt(reader.readLine());
		System.out.println("[나간 시간]");
		System.out.print("시 : ");
		int timeH2 = Integer.parseInt(reader.readLine());
		System.out.print("분 : ");
		int timeM2 = Integer.parseInt(reader.readLine());
		
		int doing = (timeH2 * 60 + timeM2) - (timeH * 60 + timeM); 
		
		if(doing <= 30) {
			int won = 0;
			System.out.printf("주차요금은 %,d원입니다.",won);
		} else if(doing >30){
			int won = (doing -30) / 10 * 2000; 
			System.out.printf("주차요금은 %,d원입니다.",won);
		}
		
		
	}
	public static void m2() throws Exception{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("[들어온 시간]");
		System.out.print("시 : ");
		int timeH = Integer.parseInt(reader.readLine());
		System.out.print("분 : ");
		int timeM = Integer.parseInt(reader.readLine());
		System.out.println("[나간 시간]");
		System.out.print("시 : ");
		int timeH2 = Integer.parseInt(reader.readLine());
		System.out.print("분 : ");
		int timeM2 = Integer.parseInt(reader.readLine());
		
		
		Calendar in = Calendar.getInstance();
		in.set(0, 0, 0, timeH, timeM);
		long inTime = in.getTimeInMillis();
		Calendar out = Calendar.getInstance();
		out.set(0, 0, 0, timeH2, timeM2);
		long outTime = out.getTimeInMillis();
		
		int doing = (int) ((outTime - inTime) / 1000 / 60/ 60);
		
		if(doing <= 30) {
			int won = 0;
			System.out.printf("주차요금은 %,d원입니다.",won);
		} else if(doing >30){
			int won = (doing -30) / 10 * 2000; 
			System.out.printf("주차요금은 %,d원입니다.",won);
		}
	}

}
