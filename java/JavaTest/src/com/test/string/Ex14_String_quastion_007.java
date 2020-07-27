package com.test.string;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ex14_String_quastion_007 {

	public static void main(String[] args) throws Exception{
		//요구사항.007
		//영어 단어를 1개 입력받아 아래와 같이 출력하시오.
		//입력 - 단어 : StudentName
		//출력 - 결과 : Student Name 
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("단어 : ");
		String input = reader.readLine();
		int i;
		for(i=1; ;i++) {
			if((input.substring(i,i+1)).equals("A") || 
					(input.substring(i,i+1)).equals("B") ||
					(input.substring(i,i+1)).equals("C") ||
					(input.substring(i,i+1)).equals("D") ||
					(input.substring(i,i+1)).equals("E") ||
					(input.substring(i,i+1)).equals("F") ||
					(input.substring(i,i+1)).equals("G") ||
					(input.substring(i,i+1)).equals("H") ||
					(input.substring(i,i+1)).equals("I") ||
					(input.substring(i,i+1)).equals("J") ||
					(input.substring(i,i+1)).equals("K") ||
					(input.substring(i,i+1)).equals("L") ||
					(input.substring(i,i+1)).equals("M") ||
					(input.substring(i,i+1)).equals("N") ||
					(input.substring(i,i+1)).equals("O") ||
					(input.substring(i,i+1)).equals("P") ||
					(input.substring(i,i+1)).equals("Q") ||
					(input.substring(i,i+1)).equals("R") ||
					(input.substring(i,i+1)).equals("S") ||
					(input.substring(i,i+1)).equals("T") ||
					(input.substring(i,i+1)).equals("U") ||
					(input.substring(i,i+1)).equals("V") ||
					(input.substring(i,i+1)).equals("W") ||
					(input.substring(i,i+1)).equals("X") ||
					(input.substring(i,i+1)).equals("Y") ||
					(input.substring(i,i+1)).equals("Z")) {
				break;
			} else {
			}
		} 
		
		String a = input.substring(0,i);
		String b = input.substring(i);
		System.out.printf("결과 : %s %s",a,b);
		
	
	}
	
	
}
