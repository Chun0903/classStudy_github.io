package com.test.string;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ex14_String_quastion_009 {

	public static void main(String[] args) throws Exception{
		//요구사항.009
		//주민 등록 번호 유효성 검사를 하시오.
		//입력 - 주민등로건호 : 951220-1021547
		//출력 - 올바른(올바르지 않은) 주민등록번호입니다.
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("단어 : ");
		String jumin = reader.readLine();
		
		int digit13 = Integer.parseInt(jumin.substring(13));
		
		
        int digit1 = Integer.parseInt(jumin.substring(0, 1)) * 2;
        int digit2 = Integer.parseInt(jumin.substring(1, 2)) * 3;
        int digit3 = Integer.parseInt(jumin.substring(2, 3)) * 4;
        int digit4 = Integer.parseInt(jumin.substring(3, 4)) * 5;
        int digit5 = Integer.parseInt(jumin.substring(4, 5)) * 6;
        int digit6 = Integer.parseInt(jumin.substring(5, 6)) * 7;
 
        int digit7 = Integer.parseInt(jumin.substring(7, 8)) * 8;
        int digit8 = Integer.parseInt(jumin.substring(8, 9)) * 9;
        int digit9 = Integer.parseInt(jumin.substring(9, 10)) * 2;
        int digit10 = Integer.parseInt(jumin.substring(10, 11)) * 3;
        int digit11 = Integer.parseInt(jumin.substring(11, 12)) * 4;
        int digit12 = Integer.parseInt(jumin.substring(12, 13)) * 5;
        
        int addDigit = digit1 + digit2 + digit3 + digit4 + digit5 + digit6 
        		+ digit7 + digit8 + digit9 + digit10 + digit11 + digit12;
        
        int division = addDigit%11;
        
        int result = 11 - division;
        
		if(jumin.length()!=14) {
			System.out.println("올바르지 않은 주민등록번호입니다.");
		} else if(digit13 == result){
			System.out.println("올바른 주민등록번호입니다.");
		}
		
	
	}

	
	
}
