package com.test.datatime;

import java.util.Calendar;
import java.util.Date;

public class Ex09_Datatime_basic {
	
	public static void main(String[] args) {
		
		//	시간, 시각 연산 종류
		// 	- 시각 + 시각 = X 기수법 정의X
		// 	- 시각 - 시각 = 시간
		// 	- 시간 + 시간 = 시간(단위: 초, 분, 시간) -> int 변수
		// 	- 시간 - 시간 = 시간						-> int 변수
		// 	- 시각 + 시간 = 시각
		// 	- 시각 - 시간 = 시각
		
		//날짜 + 시간 데이터
		//1. Date 클래스, JDK 1.0
		//2. Calendar 클래스, JDK 1.1
		//3. java.time 패키지 + 클래스, JDK 1.8
		
		//현재 시각 얻어오기
		
		//Tue Apr 14 12:36:47 KST 2020
		Date d1 = new Date(); //***
		System.out.println(d1);
		
		//java.util.GregorianCalendar[time=1586835407419,areFieldsSet=true,areAllFieldsSet=true,
		//lenient=true,zone=sun.util.calendar.ZoneInfo[id="Asia/Seoul",offset=32400000,dstSavings=0,
		//useDaylight=false,transitions=30,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,
		//ERA=1,YEAR=2020,MONTH=3,WEEK_OF_YEAR=16,WEEK_OF_MONTH=3,DAY_OF_MONTH=14,
		//DAY_OF_YEAR=105,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=2,AM_PM=1,HOUR=0,HOUR_OF_DAY=12,
		//MINUTE=36,SECOND=47,MILLISECOND=419,ZONE_OFFSET=32400000,DST_OFFSET=0]
		Calendar c1 = Calendar.getInstance(); //***
		System.out.println(c1);
		
		//캘린더내의 원하는 요소를 추출하기
		// - int get(int field)
		System.out.println(c1.get(1)); //년도
		System.out.println(c1.get(2)); //월
		System.out.println(c1.get(3)); 
		System.out.println(c1.get(4));
		System.out.println(c1.get(5));
		
		int year = 1;
		int month = 2;
		
		System.out.println(c1.get(year)); 
		System.out.println(c1.get(month)); 
		
		//캘린더 상수
		System.out.println(Calendar.YEAR);
		System.out.println(Calendar.MONTH);
		
		System.out.println(c1.get(Calendar.YEAR));
		System.out.println();
		
		//자바(C 언어 계열)는 순서를 샐 때 0부터 센다.
		// -> 서수를 0부터 시작 -> Zero-based Index
		System.out.println(c1.get(Calendar.YEAR)); 			//년도
		System.out.println(c1.get(Calendar.MONTH));			//월(0~11) -> 배열형식(0~)
		System.out.println(c1.get(Calendar.DATE));			//일
		System.out.println(c1.get(Calendar.HOUR));			//시	
		System.out.println(c1.get(Calendar.MINUTE));		//분
		System.out.println(c1.get(Calendar.SECOND));		//초
		System.out.println(c1.get(Calendar.MILLISECOND));	//밀리초
		System.out.println(c1.get(Calendar.HOUR_OF_DAY));	//시(24H)
		System.out.println(c1.get(Calendar.DAY_OF_WEEK));	//요일(일: 1 ~ 토: 7)
		System.out.println(c1.get(Calendar.AM_PM));			//오전(0), 오후(1)
		
		//오늘은 2020년 4월 14일 입니다. 지금 시간은 오후 2시 21분입니다.
		System.out.printf("오늘은 %d년 %d월 %d일 입니다. "
						   + "지금 시간은 %s %d시 %d분입니다.\n"
						   ,c1.get(Calendar.YEAR)
						   ,c1.get(Calendar.MONTH) +1
						   ,c1.get(Calendar.DATE )
						   ,c1.get(Calendar.AM_PM) == 0 ? "오전" : "오후"
						   ,c1.get(Calendar.HOUR)
						   ,c1.get(Calendar.MINUTE));
		
		//시간 출력하기 + printf() 메소드
		System.out.printf("%d-%02d-%02d\n"
							,c1.get(Calendar.YEAR)
							,c1.get(Calendar.MONTH) +1
							,c1.get(Calendar.DATE));
		
		System.out.printf("%tF\n",c1); 	//년월일
		System.out.printf("%tT\n", c1); //시간초
		System.out.printf("%tA\n", c1); //요일(로케일)
		System.out.printf("%tR\n", c1); //시간(초X)
		System.out.printf("%tr\n", c1); //오전오후
		
		
		
		
		
	}

}
