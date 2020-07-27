package com.test.array;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Ex15_Array_quastion_009 {
	public static void main(String[] args) throws Exception{
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			//요구사항.009
			//배열에 요소를 삭제하시오.
			//입력 - 삭제 위치 : 2
			//출력 - 원본 : [5, 6, 1, 3, 2]
			//	     결과 - [5, 6, 3, 2, 0]
			//조건 - 배령의 시작 길이 : 5
			//	   - 난수 대입
			
		ex01();	
	}

	private static void ex01() {
		
		//배열 삭제
		String[] color = {"빨깅","노랑","파랑","검정","하양","초록","보라"};
				
		System.out.println(Arrays.toString(color));
		
		int deleteIndext = 2;
		
		for (int i = deleteIndext; i<color.length-1; i++) {
			
			color[i] = color[i+1];
			System.out.println(Arrays.toString(color));
			
		}
		
		color[color.length-1] ="";
		System.out.println(Arrays.toString(color));
		
	}
	

}
