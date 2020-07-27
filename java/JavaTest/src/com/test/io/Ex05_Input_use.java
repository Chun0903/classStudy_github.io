package com.test.io;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ex05_Input_use {

	public static void main(String[] args) throws Exception {
		
		BufferedReader reader 
		= new BufferedReader(new InputStreamReader(System.in));
		
		//요구사항] 태어난 년도를 입력받아 나이를 출력하시오.
		//입력] 태어난 년도 (ex 1995) : 1995
		//출력] 당신은 26세입니다.
		
		//System.out.print("태어난 년도: ");
		
		//String year = reader.readLine();
		
		//2020 - year
		//2020 - "1995";
		//2020 - "자바코딩"
		
		//문자열 -> int
		//int year2 = Integer.parseInt("1995");
		
		//System.out.printf("당신은 %d세입니다.\n", 2020 - year2);

		//"10" -> 10
		//"문자열" -> int : Integer.parseInt("문자열")
		//"문자열" -> byte : byte.parseInt
		//"문자열" -> short : short.parseInt
		//"문자열" -> long : long.parseInt
		//"문자열" -> float : floart.parseInt
		//"문자열" -> double : double.parseInt
		//"문자열" -> boolean : boolean.parseInt
		
		//요구사항] 숫자 2개 입력받아서 + 연산과정과 결과를 출력하시오.
		//입력] 첫번째 숫자 : 5
		//		두번째 숫자 : 3
		//출력] 5+3 = 8
		
		//System.out.print("첫번째 숫자: ");
		//String num1 = reader.readLine(); //5 -> "5"
		//
		//System.out.print("두번째 숫자: ");
		//String num2 = reader.readLine(); 
		//		
		//int realNum1 = Integer.parseInt(num1);
		//int realNum2 = Integer.parseInt(num2);
		//		
		//System.out.printf("%d + %d = %d\n"
		//							, realNum1
		//							, realNum2
		//							, realNum1 + realNum2);
		
		
		
		//클래스. 메소드("")
		//Byte.parseByte("")
		//Intenger.parsenInt("")
		
		//유틸 클래스, 래퍼 클래스
		//byte -> Byte
		//short -> Short
		
		//byte: 128 ~127
		//long: -? ~ ?
		System.out.println(Long.MIN_VALUE);
		System.out.println(Long.MAX_VALUE);
		System.out.println(Byte.MIN_VALUE);
		System.out.println(Byte.MAX_VALUE);
		
		


		
	
		
				
		
		
	}
	
}
