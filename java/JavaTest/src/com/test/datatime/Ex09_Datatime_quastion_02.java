package com.test.datatime;

import java.util.Calendar;

public class Ex09_Datatime_quastion_02 {

	public static void main(String[] args) {
		
		nowTime();
	}
	
	public static void nowTime() {
		Calendar brirth100 = Calendar.getInstance();
		brirth100.add(Calendar.DATE, 100);
		
		Calendar brirtFirst = Calendar.getInstance();
		brirtFirst.add(Calendar.DATE, 365);
		
		System.out.printf("백일 : %tF\n첫돌 : %tF",brirth100, brirtFirst);
	}
	
	
}
