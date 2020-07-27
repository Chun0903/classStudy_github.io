package com.test.array;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Ex15_Array_quastion_008 {
	public static void main(String[] args) throws Exception{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		//요구사항008.
		//배열에 요소를 삽입하시오.
		//입력 -  삽입 위치 : 2
		//값 - 100;
		//출력 - 원본 : [5, 6, 1, 3, 2, 0, 0, 0, 0, 0]
		//		 결과 : [5, 6, 100, 3, 2, 0, 0, 0, 0, 0] 
		//조건 - 배열의 시작 길이 : 10
		//	   -  난수 대입
		
		
		
		
		
		
		ex01();
	}
	private static void ex01() {
		
		//배열 삽입(우측 시프트 -> Right Shift)
		String[] color = {"빨깅","노랑","파랑","검정","하양","초록","보라"};
		
		System.out.println(Arrays.toString(color));
		
		String newColor = "주황";
		int insertIndex = 2;
		
		//기존의 요소들을 우츨으로 옮긴다 -> 빈방 발생-> 새 요소를 삽입
		for (int i=color.length-2; i>= insertIndex ; i--) {  //************
			
			color[i+1] =color[i]; //-> Shift
			System.out.println(Arrays.toString(color));
			
		}
		
		color[insertIndex] = newColor; //삽입
		System.out.println(Arrays.toString(color));
		
	}

}
