package com.test.string;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ex14_String_quastion_001 {

	public static void main(String[] args) throws Exception{
		//요구사항.001
		//입력- 문장 입력 : 안녕하세요. 홍길동입니다.
		//출력- 역순 결과: .다니입동길홍 .요세하녕안
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String input = reader.readLine();
		
		for(int i= input.length()-1; i>=0; i--) {
			System.out.print(input.charAt(i));
		}
		
		
		
	}
	
	
}
