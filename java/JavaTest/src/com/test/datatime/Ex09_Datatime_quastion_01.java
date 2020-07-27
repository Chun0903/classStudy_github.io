package com.test.datatime;

import java.util.Calendar;

public class Ex09_Datatime_quastion_01 {

	public static void main(String[] args) {
		
		nowTime();
		nowTime_AMPM();
	}
	
	public static void nowTime() {
		Calendar now = Calendar.getInstance();
		now.set(Calendar.HOUR, 10);
		now.set(Calendar.MINUTE, 30);
		now.set(Calendar.SECOND, 25);
		
		System.out.printf("현재 시간 : %d시 %d분 %d초\n"
				,now.get(Calendar.HOUR)
				,now.get(Calendar.MINUTE)
				,now.get(Calendar.SECOND));
		
	}
	public static void nowTime_AMPM() {
		Calendar now = Calendar.getInstance();
		now.set(Calendar.HOUR, 14);
		now.set(Calendar.HOUR_OF_DAY, 14);
		now.set(Calendar.MINUTE, 30);
		now.set(Calendar.SECOND, 25);
		
		System.out.printf("%d시 %d분 %d초 -> %s %d시 %d분 %d초"
				,now.get(Calendar.HOUR_OF_DAY)
				,now.get(Calendar.MINUTE)
				,now.get(Calendar.SECOND)
				,now.get(Calendar.AM_PM) == 0 ? "오전" : "오후"
				,now.get(Calendar.HOUR)
				,now.get(Calendar.MINUTE)
				,now.get(Calendar.SECOND));	
	
	
	}
	
}
