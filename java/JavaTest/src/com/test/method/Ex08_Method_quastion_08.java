package com.test.method;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ex08_Method_quastion_08 {

	public static void main(String[] args) throws Exception{
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("역의 개수 : ");
		int yeck = Integer.parseInt(reader.readLine());
		
		System.out.print("환승역의 횟수 : ");
		int hwan = Integer.parseInt(reader.readLine());
		
		
		int result = getTime(yeck, hwan);
		
		System.out.printf("총 소요 시간은 %d입니다.", result);
		
	}
	
	public static int getTime(int yeck, int hwan) throws Exception{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("시간대(1. 평상:3 2.출근:4, 3.퇴근:5 : ");
		String timeWork = reader.readLine(); 
		
		int time = (2 * yeck) + (Integer.parseInt(timeWork) * hwan);
		
		return time;
		
		
	}
	
	
}
